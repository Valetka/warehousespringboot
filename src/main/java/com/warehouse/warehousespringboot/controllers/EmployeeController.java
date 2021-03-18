package com.warehouse.warehousespringboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.warehouse.warehousespringboot.dao.EmployeeDao;
import com.warehouse.warehousespringboot.models.Employee;

@Controller
@RequestMapping("/manage/employees")
public class EmployeeController {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeController(EmployeeDao employeeDao) {

        this.employeeDao = employeeDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("employees", employeeDao.index());
        return "manage/employees/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeDao.show(id));
        return "manage/employees/show";
    }

    @GetMapping("/new")
    public String newEmployee(@ModelAttribute("employee") Employee employee) {

        return "manage/employees/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("employee") Employee employee,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "manage/employees/new";

        employeeDao.save(employee);
        return "redirect:manage/employees";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("employee", employeeDao.show(id));
        return "manage/employees/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("employee") Employee employee, BindingResult bindingResult,
                         @PathVariable("id") int id) {
        if (bindingResult.hasErrors())
            return "manage/employees/edit";

        employeeDao.update(id, employee);
        return "redirect:manage/employees";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        employeeDao.delete(id);
        return "redirect:manage/employees";
    }
}

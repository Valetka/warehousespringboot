package com.warehouse.warehousespringboot.dao;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.warehouse.warehousespringboot.models.Employee;

import java.util.List;

@Component
public class EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> index() {
        return jdbcTemplate.query("SELECT * FROM employees", new BeanPropertyRowMapper<>(Employee.class));
    }

    public Employee show(int id) {
        return jdbcTemplate.query("SELECT * FROM employees WHERE id=?", new BeanPropertyRowMapper<>(Employee.class), id)
                .stream().findAny().orElse(null);
    }

    public void save(Employee employee) {
        jdbcTemplate.update("INSERT INTO employees(name, surname, password, phone_number, position) VALUES(?, ?, ?, ?, ?)", employee.getName(), employee.getSurname(),
                employee.getPassword(), employee.getPhoneNumber(), employee.getPosition());
    }

    public void update(int id, Employee updatedEmployee) {
        jdbcTemplate.update("UPDATE employees SET name=?, surname=?, password=?, phone_number=?, position=?  WHERE id=?", updatedEmployee.getName(),
                updatedEmployee.getSurname(), updatedEmployee.getPassword(), updatedEmployee.getPhoneNumber(), updatedEmployee.getPosition(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM employees WHERE id=?", id);
    }
}

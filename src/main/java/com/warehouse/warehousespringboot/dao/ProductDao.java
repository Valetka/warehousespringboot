package com.warehouse.warehousespringboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.warehouse.warehousespringboot.models.Product;

import java.util.List;

@Component
public class ProductDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> index() {
        return jdbcTemplate.query("SELECT * FROM products", new BeanPropertyRowMapper<>(Product.class));
    }

    public Product show(int id) {
        return jdbcTemplate.query("SELECT * FROM products WHERE id=?", new BeanPropertyRowMapper<>(Product.class), id)
                .stream().findAny().orElse(null);
    }

    public void save(Product product) {
        jdbcTemplate.update("INSERT INTO products(name, commodity_group_id, free_balance, reserved, total_balance) VALUES(?, ?, ?, ?, ?)", product.getName(), product.getCommodityGroupId(),
                product.getFreeBalance(), product.getReserved(), product.getTotalBalance());
    }

    public void update(int id, Product updatedProduct) {
        jdbcTemplate.update("UPDATE products SET name=?, commodity_group_id=?, free_balance=?, reserved=?, total_balance=?  WHERE id=?", updatedProduct.getName(),
                updatedProduct.getCommodityGroupId(), updatedProduct.getFreeBalance(), updatedProduct.getReserved(), updatedProduct.getTotalBalance(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM products WHERE id=?", id);
    }
}

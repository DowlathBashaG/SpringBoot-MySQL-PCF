package io.dowlath.SpringBootMySQLPCF.service;

import io.dowlath.SpringBootMySQLPCF.entity.Product;

import java.util.List;

/**
 * @Author Dowlath
 * @create 7/17/2020 11:58 AM
 */
public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(long productId);

}

package io.dowlath.SpringBootMySQLPCF.controller;

import io.dowlath.SpringBootMySQLPCF.entity.Product;
import io.dowlath.SpringBootMySQLPCF.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Dowlath
 * @create 7/17/2020 11:56 AM
 */
@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getAllProducts(@PathVariable long productId) {
        return productService.getProductById(productId);
    }
}

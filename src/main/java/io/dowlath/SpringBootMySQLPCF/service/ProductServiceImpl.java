package io.dowlath.SpringBootMySQLPCF.service;

import io.dowlath.SpringBootMySQLPCF.entity.Product;
import io.dowlath.SpringBootMySQLPCF.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author Dowlath
 * @create 7/17/2020 12:55 PM
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.isPresent() ? product.get() : null;
    }


}

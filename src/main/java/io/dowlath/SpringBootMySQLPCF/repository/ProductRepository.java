package io.dowlath.SpringBootMySQLPCF.repository;

import io.dowlath.SpringBootMySQLPCF.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Dowlath
 * @create 7/17/2020 11:55 AM
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

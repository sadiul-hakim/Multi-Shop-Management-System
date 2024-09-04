package xyz.sadiulhakim.product_model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductModelRepo extends JpaRepository<ProductModel,Integer> {
    Optional<ProductModel> findByName(String name);
}

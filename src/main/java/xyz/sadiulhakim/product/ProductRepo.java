package xyz.sadiulhakim.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findAllByIdIn(List<Integer> ids);
}

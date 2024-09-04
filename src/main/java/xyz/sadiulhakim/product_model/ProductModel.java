package xyz.sadiulhakim.product_model;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.modelCategory.ModelCategory;
import xyz.sadiulhakim.product.Product;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "product_model")
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    @ManyToOne
    private ModelCategory category;
}

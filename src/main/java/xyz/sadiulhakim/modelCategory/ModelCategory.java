package xyz.sadiulhakim.modelCategory;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.product_model.ProductModel;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "model_category")
@AllArgsConstructor
@NoArgsConstructor
public class ModelCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ProductModel> models;
}

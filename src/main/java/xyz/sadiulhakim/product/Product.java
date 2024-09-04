package xyz.sadiulhakim.product;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.product_model.ProductModel;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private ProductModel model;
    private int numberOfProduct;
    private double pricePerPiece;
    private double discountPercentage;
}
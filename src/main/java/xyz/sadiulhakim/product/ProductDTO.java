package xyz.sadiulhakim.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String model;
    private int numberOfProduct;
    private double pricePerPiece;
    private double discountPercentage;
}

package xyz.sadiulhakim.trade;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.product.ProductDTO;
import xyz.sadiulhakim.product.converter.ProductDTOConverter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "trade")
@AllArgsConstructor
@NoArgsConstructor
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private TradeType tradeType;

    @Column(columnDefinition = "JSON")
    @Convert(converter = ProductDTOConverter.class)
    private ProductDTO productModel;
    private int totalPrice;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;
}

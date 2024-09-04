package xyz.sadiulhakim.shop;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.converter.IntegerListConverter;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "shop")
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp openTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp closeTime;
    private int capital;
    private int balance;

    @Column(columnDefinition = "JSON")
    @Convert(converter = IntegerListConverter.class)
    private List<Integer> productList;
}

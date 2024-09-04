package xyz.sadiulhakim.cost;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.costType.CostType;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "cost")
@AllArgsConstructor
@NoArgsConstructor
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private CostType type;
    private int amount;
    private String username;
    private int shop;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;
}

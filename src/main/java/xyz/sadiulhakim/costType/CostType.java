package xyz.sadiulhakim.costType;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.cost.Cost;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "cost_type")
@AllArgsConstructor
@NoArgsConstructor
public class CostType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "type")
    private List<Cost> costs;
}

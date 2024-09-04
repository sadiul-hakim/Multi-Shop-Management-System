package xyz.sadiulhakim.salary;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "salary")
@AllArgsConstructor
@NoArgsConstructor
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeeName;
    private int salary;
    private int bonus;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;
}

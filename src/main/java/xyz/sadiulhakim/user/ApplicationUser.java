package xyz.sadiulhakim.user;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.role.UserRole;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "application_user")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, length = 65)
    private String username;
    private String password;
    @Column(unique = true, length = 25)
    private String phone;
    private String address;
    // shop id
    private int salary;
    @ManyToOne
    private UserRole role;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp joiningDate = new Timestamp(System.currentTimeMillis());
}

package xyz.sadiulhakim.role;

import jakarta.persistence.*;
import lombok.*;
import xyz.sadiulhakim.user.ApplicationUser;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ApplicationUser> users = new ArrayList<>();
}

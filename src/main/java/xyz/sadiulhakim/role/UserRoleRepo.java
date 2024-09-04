package xyz.sadiulhakim.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepo extends JpaRepository<UserRole, Integer> {
    Optional<UserRole> findByName(String role);
}

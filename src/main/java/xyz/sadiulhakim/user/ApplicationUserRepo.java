package xyz.sadiulhakim.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationUserRepo extends JpaRepository<ApplicationUser, Integer> {
    Optional<ApplicationUser> findByUsername(String username);
}

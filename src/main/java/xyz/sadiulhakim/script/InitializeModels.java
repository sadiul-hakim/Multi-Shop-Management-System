package xyz.sadiulhakim.script;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.sadiulhakim.role.UserRole;
import xyz.sadiulhakim.role.UserRoleRepo;
import xyz.sadiulhakim.user.ApplicationUser;
import xyz.sadiulhakim.user.ApplicationUserRepo;

import java.util.ArrayList;

@Slf4j
@Component
@RestController
@RequestMapping("/initialize")
@RequiredArgsConstructor
public class InitializeModels {
    private final UserRoleRepo userRoleRepo;
    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserRepo applicationUserRepo;

    @GetMapping("/roles-and-owner")
    public ResponseEntity<?> run() {
        createRoles();
        createOwner();

        return ResponseEntity.ok("Done");
    }

    public void createRoles() {
        UserRole owner = new UserRole(0, "ROLE_OWNER", new ArrayList<>());
        UserRole seller = new UserRole(0, "ROLE_SELLER", new ArrayList<>());

        userRoleRepo.save(owner);
        userRoleRepo.save(seller);
        log.info("Done creating Roles");
    }

    public void createOwner() {
        UserRole role = userRoleRepo.findByName("ROLE_OWNER").orElse(null);
        assert role != null;

        ApplicationUser owner = new ApplicationUser();
        owner.setId(0);
        owner.setRole(role);
        owner.setPhone("01304802986");
        owner.setAddress("Modhupur, Kumarkhali, Kushtia");
        owner.setSalary(0);
        owner.setPassword(passwordEncoder.encode("hakim@123"));
        owner.setUsername("Sadiul Hakim");

        applicationUserRepo.save(owner);
        log.info("Done creating Owner");
    }
}

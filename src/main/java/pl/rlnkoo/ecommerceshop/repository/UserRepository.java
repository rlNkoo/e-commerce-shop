package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}

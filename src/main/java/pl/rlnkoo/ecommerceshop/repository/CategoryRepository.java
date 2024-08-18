package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
    boolean existsByName(String name);
}

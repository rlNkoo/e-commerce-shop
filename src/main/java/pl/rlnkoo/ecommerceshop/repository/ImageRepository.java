package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

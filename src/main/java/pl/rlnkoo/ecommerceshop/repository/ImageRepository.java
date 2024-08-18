package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.Image;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}

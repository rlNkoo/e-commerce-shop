package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}

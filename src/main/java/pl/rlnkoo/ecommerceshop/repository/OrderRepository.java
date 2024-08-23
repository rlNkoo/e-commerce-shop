package pl.rlnkoo.ecommerceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.ecommerceshop.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

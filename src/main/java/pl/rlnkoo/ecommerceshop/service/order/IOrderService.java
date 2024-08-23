package pl.rlnkoo.ecommerceshop.service.order;

import pl.rlnkoo.ecommerceshop.model.Order;

import java.util.List;

public interface IOrderService {

    Order placeOrder(Long userId);
    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}

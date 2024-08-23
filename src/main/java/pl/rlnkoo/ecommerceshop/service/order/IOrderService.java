package pl.rlnkoo.ecommerceshop.service.order;

import pl.rlnkoo.ecommerceshop.model.Order;

public interface IOrderService {

    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}

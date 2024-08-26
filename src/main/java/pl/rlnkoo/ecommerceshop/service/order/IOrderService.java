package pl.rlnkoo.ecommerceshop.service.order;

import pl.rlnkoo.ecommerceshop.dto.OrderDto;
import pl.rlnkoo.ecommerceshop.model.Order;

import java.util.List;

public interface IOrderService {

    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}

package pl.rlnkoo.ecommerceshop.service.cart;

import pl.rlnkoo.ecommerceshop.model.Cart;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Long initializeNewCart();
    Cart getCartByUserId(Long userId);
}

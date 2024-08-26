package pl.rlnkoo.ecommerceshop.service.cart;

import pl.rlnkoo.ecommerceshop.model.Cart;
import pl.rlnkoo.ecommerceshop.model.User;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart initializeNewCart(User user);
    Cart getCartByUserId(Long userId);
}

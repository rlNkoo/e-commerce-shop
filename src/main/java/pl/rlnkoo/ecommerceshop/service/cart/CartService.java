package pl.rlnkoo.ecommerceshop.service.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rlnkoo.ecommerceshop.exceptions.ResourceNotFoundException;
import pl.rlnkoo.ecommerceshop.model.Cart;
import pl.rlnkoo.ecommerceshop.repository.CartItemRepository;
import pl.rlnkoo.ecommerceshop.repository.CartRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
        BigDecimal totalAmount = cart.getTotalAmount();
        cart.setTotalAmount(totalAmount);
        return cartRepository.save(cart);
    }

    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getItems().clear();
        cartRepository.deleteById(id);
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount();
    }
}
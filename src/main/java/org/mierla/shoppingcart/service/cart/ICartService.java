package org.mierla.shoppingcart.service.cart;

import org.mierla.shoppingcart.model.Cart;
import org.mierla.shoppingcart.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}

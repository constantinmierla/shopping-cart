package org.mierla.shoppingcart.service.order;

import org.mierla.shoppingcart.dto.OrderDto;
import org.mierla.shoppingcart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}

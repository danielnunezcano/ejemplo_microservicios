package org.ejemplo.microservicios.core.service;
import java.util.List;

import org.ejemplo.microservicios.core.dto.OrderDto;

public interface OrdersService {
	public List<OrderDto> getOrders();
    public void addOrder(OrderDto orderDto);
    public OrderDto filterToFirstLetter(char letter);
}

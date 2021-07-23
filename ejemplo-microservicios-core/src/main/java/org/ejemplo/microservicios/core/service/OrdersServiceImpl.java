package org.ejemplo.microservicios.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.ejemplo.microservicios.core.dto.OrderDto;
import org.ejemplo.microservicios.core.mapper.OrderMapper;
import org.ejemplo.microservicios.data.repository.OrdersRepository;
import org.ejemplo.microservicios.model.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrdersServiceImpl implements OrdersService {

	private final OrdersRepository ordersRepository;

	@Override
	public List<OrderDto> getOrders() {
		return OrderMapper.INSTANCE.orderToOrderDtos(this.ordersRepository.findAll());
	}

	@Override
	public void addOrder(OrderDto orderDto) {
		Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
		this.ordersRepository.save(order);
	}

	@Override
	public OrderDto filterToFirstLetter(char letter) {
		List<OrderDto> response = OrderMapper.INSTANCE.orderToOrderDtos(this.ordersRepository.findAll());

		response = response.stream()
				.filter(p -> p.getDescription().toUpperCase().startsWith(String.valueOf(letter).toUpperCase()))
				.map(p -> toUpperCaseDescription(p))
				.collect(Collectors.toList());
		
		OrderDto orderMax = response.stream().max((p1, p2) -> (int) (p1.getPrice() - p2.getPrice())).get();
		
		return orderMax;
	}
	
	private OrderDto toUpperCaseDescription (OrderDto input) {
		
		input.setDescription(input.getDescription().toUpperCase());
		return input;
		
	}
}

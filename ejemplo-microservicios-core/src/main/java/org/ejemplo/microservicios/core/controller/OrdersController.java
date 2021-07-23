package org.ejemplo.microservicios.core.controller;

import java.util.List;

import org.ejemplo.microservicios.core.dto.OrderDto;
import org.ejemplo.microservicios.core.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrdersController {

	private final OrdersService ordersService;

	@GetMapping(value = "/get")
	public List<OrderDto> getOrders() {
		return this.ordersService.getOrders();
	}

	@PostMapping(value = "/create")
	public void addOrders(@RequestBody OrderDto orderDto) {
		this.ordersService.addOrder(orderDto);
	}

	@GetMapping(value = "/filterToFirstLetter/{letter}")
	public OrderDto filterToFirstLetter(@PathVariable char letter) {
		return this.ordersService.filterToFirstLetter(letter);
	}
}

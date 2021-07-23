package org.ejemplo.microservicios.core.mapper;

import java.util.List;

import org.ejemplo.microservicios.core.dto.OrderDto;
import org.ejemplo.microservicios.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
	
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

	OrderDto orderToOrderDto(Order request);
	
	List<OrderDto> orderToOrderDtos(List<Order> request);
	
	Order orderDtoToOrder(OrderDto request);

}

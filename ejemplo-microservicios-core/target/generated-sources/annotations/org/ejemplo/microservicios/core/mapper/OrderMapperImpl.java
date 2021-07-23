package org.ejemplo.microservicios.core.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.ejemplo.microservicios.core.dto.CountryDto;
import org.ejemplo.microservicios.core.dto.OrderDto;
import org.ejemplo.microservicios.model.entity.Country;
import org.ejemplo.microservicios.model.entity.Order;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-22T14:29:57+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto orderToOrderDto(Order request) {
        if ( request == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( request.getId() );
        orderDto.setDescription( request.getDescription() );
        orderDto.setPrice( request.getPrice() );
        orderDto.setCountry( countryToCountryDto( request.getCountry() ) );

        return orderDto;
    }

    @Override
    public List<OrderDto> orderToOrderDtos(List<Order> request) {
        if ( request == null ) {
            return null;
        }

        List<OrderDto> list = new ArrayList<OrderDto>( request.size() );
        for ( Order order : request ) {
            list.add( orderToOrderDto( order ) );
        }

        return list;
    }

    @Override
    public Order orderDtoToOrder(OrderDto request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( request.getId() );
        order.setDescription( request.getDescription() );
        order.setPrice( request.getPrice() );
        order.setCountry( countryDtoToCountry( request.getCountry() ) );

        return order;
    }

    protected CountryDto countryToCountryDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setIdCountry( country.getIdCountry() );
        countryDto.setName( country.getName() );

        return countryDto;
    }

    protected Country countryDtoToCountry(CountryDto countryDto) {
        if ( countryDto == null ) {
            return null;
        }

        Country country = new Country();

        country.setIdCountry( countryDto.getIdCountry() );
        country.setName( countryDto.getName() );

        return country;
    }
}

package org.ejemplo.microservicios.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {

	@JsonProperty("id")
    private Long id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price")
    private Double price;
    private CountryDto country;
}

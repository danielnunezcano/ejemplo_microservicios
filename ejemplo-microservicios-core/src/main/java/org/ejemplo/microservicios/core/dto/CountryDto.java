package org.ejemplo.microservicios.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDto {
	@JsonProperty("idCountry")
	private Long idCountry;
	@JsonProperty("name")
	private String name;
}

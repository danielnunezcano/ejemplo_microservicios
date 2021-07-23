package org.ejemplo.microservicios.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class CuentaDto {

	@JsonProperty("identifier")
	private Long identifier;
	@JsonProperty("client")
	private String client;
	@JsonProperty("type")
	private TypeAccount type;
	@JsonProperty("amount")
	private Double amount;
	
}

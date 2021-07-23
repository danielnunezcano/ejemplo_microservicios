package org.ejemplo.microservicios.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cuenta {
	@Id
	@Column(name = "identifier")
	private Long identifier;
	@Column(name = "client")
	private String client;
	@Column(name = "type")
	private String type;
	@Column(name = "amount")
	private Double amount;
}

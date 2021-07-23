package org.ejemplo.microservicios.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "country", schema = "orders")
@Getter
@Setter
public class Country {
	@Id
	@Column(name="id_country")
	private Long idCountry;
	@Column(name="name")
	private String name;
}

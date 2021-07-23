package org.ejemplo.microservicios.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders", schema = "orders")
@Getter
@Setter
public class Order {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @ManyToOne
    @JoinColumn(name="country")
    private Country country;
    
}

package org.ejemplo.microservicios.data.repository;

import javax.transaction.Transactional;

import org.ejemplo.microservicios.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OrdersRepository extends JpaRepository<Order, Long> {

}

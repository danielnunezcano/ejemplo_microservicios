package org.ejemplo.microservicios.data.repository;

import org.ejemplo.microservicios.model.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentasRepository extends JpaRepository<Cuenta, Long>{

}

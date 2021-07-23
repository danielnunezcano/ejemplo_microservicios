package org.ejemplo.microservicios.data.repository;

import javax.transaction.Transactional;

import org.ejemplo.microservicios.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CountryRepository extends JpaRepository<Country, Long> {

}

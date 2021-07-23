package org.ejemplo.microservicios.core.mapper;

import org.ejemplo.microservicios.core.dto.CountryDto;
import org.ejemplo.microservicios.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

	CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

	public CountryDto countryToCountryDto(Country request);

}

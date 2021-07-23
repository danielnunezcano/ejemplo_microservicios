package org.ejemplo.microservicios.core.mapper;

import javax.annotation.Generated;
import org.ejemplo.microservicios.core.dto.CountryDto;
import org.ejemplo.microservicios.model.entity.Country;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-22T14:29:57+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class CountryMapperImpl implements CountryMapper {

    @Override
    public CountryDto countryToCountryDto(Country request) {
        if ( request == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setIdCountry( request.getIdCountry() );
        countryDto.setName( request.getName() );

        return countryDto;
    }
}

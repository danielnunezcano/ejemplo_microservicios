package org.ejemplo.microservicios.core.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.ejemplo.microservicios.core.dto.CuentaDto;
import org.ejemplo.microservicios.model.entity.Cuenta;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-22T14:29:57+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class CuentaMapperImpl implements CuentaMapper {

    @Override
    public CuentaDto cuentaToCuentaDto(Cuenta request) {
        if ( request == null ) {
            return null;
        }

        CuentaDto cuentaDto = new CuentaDto();

        cuentaDto.setIdentifier( request.getIdentifier() );
        cuentaDto.setClient( request.getClient() );
        cuentaDto.setType( stringToTypeAccount( request.getType() ) );
        cuentaDto.setAmount( request.getAmount() );

        return cuentaDto;
    }

    @Override
    public List<CuentaDto> cuentaToCuentaDtos(List<Cuenta> request) {
        if ( request == null ) {
            return null;
        }

        List<CuentaDto> list = new ArrayList<CuentaDto>( request.size() );
        for ( Cuenta cuenta : request ) {
            list.add( cuentaToCuentaDto( cuenta ) );
        }

        return list;
    }

    @Override
    public Cuenta cuentaDtoToCueanta(CuentaDto request) {
        if ( request == null ) {
            return null;
        }

        Cuenta cuenta = new Cuenta();

        cuenta.setIdentifier( request.getIdentifier() );
        cuenta.setClient( request.getClient() );
        cuenta.setType( typeAccountToString( request.getType() ) );
        cuenta.setAmount( request.getAmount() );

        return cuenta;
    }
}

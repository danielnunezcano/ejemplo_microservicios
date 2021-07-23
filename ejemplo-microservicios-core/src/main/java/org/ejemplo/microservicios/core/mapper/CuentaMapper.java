package org.ejemplo.microservicios.core.mapper;

import java.util.List;

import org.ejemplo.microservicios.core.dto.CuentaDto;
import org.ejemplo.microservicios.core.dto.TypeAccount;
import org.ejemplo.microservicios.model.entity.Cuenta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CuentaMapper {

	CuentaMapper INSTANCE = Mappers.getMapper(CuentaMapper.class);

	default TypeAccount stringToTypeAccount(String type) {

		return TypeAccount.valueOf(type);

	}

	default String typeAccountToString(TypeAccount type) {
		return type.name();
	}

	public CuentaDto cuentaToCuentaDto(Cuenta request);

	public List<CuentaDto> cuentaToCuentaDtos(List<Cuenta> request);

	public Cuenta cuentaDtoToCueanta(CuentaDto request);

}

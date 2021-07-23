package org.ejemplo.microservicios.core.service;

import java.util.List;

import org.ejemplo.microservicios.core.dto.CuentaDto;
import org.ejemplo.microservicios.core.dto.TypeAccount;
import org.ejemplo.microservicios.core.mapper.CuentaMapper;
import org.ejemplo.microservicios.data.repository.CuentasRepository;
import org.ejemplo.microservicios.model.entity.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CuentasServiceImpl implements CuentasService {

	private final CuentasRepository cuentasRepository;

	@Override
	public void agregarCuenta(CuentaDto cuentaDto) {
		Cuenta cuenta = CuentaMapper.INSTANCE.cuentaDtoToCueanta(cuentaDto);
		this.cuentasRepository.save(cuenta);

	}

	@Override
	public List<CuentaDto> listarCuentas(TypeAccount type) {
		return CuentaMapper.INSTANCE.cuentaToCuentaDtos(this.cuentasRepository.findAll());
	}

}

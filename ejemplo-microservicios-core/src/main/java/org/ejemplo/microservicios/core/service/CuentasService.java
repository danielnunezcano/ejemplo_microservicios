package org.ejemplo.microservicios.core.service;

import java.util.List;

import org.ejemplo.microservicios.core.dto.CuentaDto;
import org.ejemplo.microservicios.core.dto.TypeAccount;

public interface CuentasService {
	public void agregarCuenta(CuentaDto cuentaDto);
	public List<CuentaDto> listarCuentas(TypeAccount type);
}

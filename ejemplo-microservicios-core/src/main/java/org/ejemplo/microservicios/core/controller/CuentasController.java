package org.ejemplo.microservicios.core.controller;

import java.util.List;

import org.ejemplo.microservicios.core.dto.CuentaDto;
import org.ejemplo.microservicios.core.dto.TypeAccount;
import org.ejemplo.microservicios.core.service.CuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cuentas")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CuentasController {
	
		private final CuentasService cuentasService;

		@PostMapping(value = "/create")
		public void agregarCuenta(@RequestBody CuentaDto cuentaDto) {
			this.cuentasService.agregarCuenta(cuentaDto);
		}
		
		@GetMapping(value = "/get/{type}")
		public List<CuentaDto> listarCuentas(@PathVariable TypeAccount type) {
			return this.cuentasService.listarCuentas(type);
		}

}

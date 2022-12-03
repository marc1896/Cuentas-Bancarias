package com.cuentas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuentas.domain.CuentaBancaria;
import com.cuentas.service.CuentaBancariaService;

@RestController
@RequestMapping("api/CuentasBancarias")
@CrossOrigin
public class CuentaBancariaController {

	@Autowired
	CuentaBancariaService cuentaService;

	// http://localhost:8080/api/CuentasBancarias/listar
	@GetMapping("listar")
	public List<CuentaBancaria> listar() {
		return cuentaService.listar();
	}

	// http://localhost:8080/api/CuentasBancarias/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody CuentaBancaria cuentaBancaria) {
		cuentaService.guardar(cuentaBancaria);
	}

	// http://localhost:8080/api/CuentasBancarias/editar
	@PostMapping("editar")
	public void editar(@RequestBody CuentaBancaria cuentaBancaria) {
		cuentaService.editar(cuentaBancaria);
	}

	// http://localhost:8080/api/CuentasBancarias/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody CuentaBancaria cuentaBancaria) {
		cuentaService.eliminar(cuentaBancaria);
	}

	// http://localhost:8080/api/CuentasBancarias/buscar
	@PostMapping("buscar")
	public CuentaBancaria buscar(@RequestBody CuentaBancaria cuentaBancaria) {
		return cuentaService.buscar(cuentaBancaria);
	}
}

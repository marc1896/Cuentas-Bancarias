package com.cuentas.service;

import java.util.List;

import com.cuentas.domain.CuentaBancaria;

public interface CuentaBancariaService {

	public List<CuentaBancaria> listar();
	
	public void guardar(CuentaBancaria cuentaBancaria);
	
	public void editar(CuentaBancaria cuentaBancaria);
	
	public void eliminar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(CuentaBancaria cuentaBancaria);
}

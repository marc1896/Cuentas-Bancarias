package com.cuentas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuentas.dao.CuentaBancariaDao;
import com.cuentas.domain.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService{

	@Autowired
	CuentaBancariaDao cuentaDao;

	@Override
	public List<CuentaBancaria> listar() {
		List<CuentaBancaria> listaFinal = new ArrayList<>();
		for (CuentaBancaria cuentaBancaria : cuentaDao.findAll()) {
			if (cuentaBancaria.isStatus() == true) {
				listaFinal.add(cuentaBancaria);
			}
		}
		return listaFinal;
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		cuentaBancaria.setStatus(true);
		cuentaDao.save(cuentaBancaria);
		
	}

	@Override
	public void editar(CuentaBancaria cuentaBancaria) {
		cuentaDao.save(cuentaBancaria);
	}

	@Override
	public void eliminar(CuentaBancaria cuentaBancaria) {
		CuentaBancaria cuentaTemporal = cuentaDao.findById(cuentaBancaria.getId()).orElse(null);
		if(cuentaTemporal != null) {
			cuentaTemporal.setStatus(false);
			cuentaDao.save(cuentaTemporal);
		}
	}

	@Override
	public CuentaBancaria buscar(CuentaBancaria cuentaBancaria) {
		return cuentaDao.findById(cuentaBancaria.getId()).orElse(null);
	}
}

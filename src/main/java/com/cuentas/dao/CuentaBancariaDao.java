package com.cuentas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cuentas.domain.CuentaBancaria;

public interface CuentaBancariaDao extends MongoRepository<CuentaBancaria, Integer>{

}

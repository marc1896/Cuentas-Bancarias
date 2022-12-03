package com.cuentas.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Cuentas")
public class CuentaBancaria {

	@Id
	int id;
	String nombreDeLaCuenta;
	String banco;
	String tipo;
	double monto;
	int idUsuario;
	boolean status;
	
	public CuentaBancaria() {
	}

	public CuentaBancaria(String nombreDeLaCuenta) {
		this.nombreDeLaCuenta = nombreDeLaCuenta;
	}

	public CuentaBancaria(int id, String nombreDeLaCuenta, String banco, String tipo, double monto, int idUsuario,
			boolean status) {
		this.id = id;
		this.nombreDeLaCuenta = nombreDeLaCuenta;
		this.banco = banco;
		this.tipo = tipo;
		this.monto = monto;
		this.idUsuario = idUsuario;
		this.status = status;
	}

	@Override
	public String toString() {
		return "CuentasBancarias [id=" + id + ", nombreDeLaCuenta=" + nombreDeLaCuenta + ", banco=" + banco + ", tipo="
				+ tipo + ", monto=" + monto + ", idUsuario=" + idUsuario + ", status=" + status + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreDeLaCuenta() {
		return nombreDeLaCuenta;
	}

	public void setNombreDeLaCuenta(String nombreDeLaCuenta) {
		this.nombreDeLaCuenta = nombreDeLaCuenta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

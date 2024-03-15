package com.kibernumacademy.example;

public class CuentaBancaria {

  private Double saldo;

  public Double obtenerSaldo() {
    return this.saldo;
  }

  public void ingresarSaldo(Double saldo) {
    // podria tener validaciones
    this.saldo = saldo;
  }

  
  
}


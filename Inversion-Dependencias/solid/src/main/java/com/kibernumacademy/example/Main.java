package com.kibernumacademy.example;

public class Main {
  public static void main(String[] args) {
    CuentaBancaria cb = new CuentaBancaria();
    
    cb.ingresarSaldo(1000.0);
    System.out.println(cb.obtenerSaldo());
    
  }
}

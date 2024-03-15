package com.kibernumacademy.noaplica;

public abstract class AbstractSale {

  protected double amount; // cantidad
  protected String customer; // el cliente
  protected double taxes; // impuestos

  public abstract void generate(); // poder generar la venta

  // calculo de impuestos
  public abstract void calculateTaxes();

}

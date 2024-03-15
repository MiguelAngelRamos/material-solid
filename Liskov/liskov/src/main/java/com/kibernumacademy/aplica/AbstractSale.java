package com.kibernumacademy.aplica;

public abstract class AbstractSale {

  protected double amount; // cantidad
  protected String customer; // el cliente
 
  public abstract void generate(); // poder generar la venta

}

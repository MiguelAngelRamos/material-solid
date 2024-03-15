package com.kibernumacademy.aplica;

public class ForeignSale extends AbstractSale {

  // No necesitamos impuestos
  public ForeignSale(double amount, String customer) {
    this.amount = amount;
    this.customer = customer;
  }

  @Override
  public void generate() {
    System.out.println("Se genera la venta");
  }
}

package com.kibernumacademy.noaplica;

public class Sale extends AbstractSale {

  public Sale(double amount, String customer, double taxes) {
    
    this.amount = amount;
    this.customer = customer;
    this.taxes = taxes;
  }

  @Override
  public void generate() {
   System.out.println("Se genera la venta");
  }

  @Override
  public void calculateTaxes() {
    System.out.println("Se calculan los impuestos");
  }
  
}

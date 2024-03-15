package com.kibernumacademy.aplica;

public class Sale extends SaleWithTaxes {

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

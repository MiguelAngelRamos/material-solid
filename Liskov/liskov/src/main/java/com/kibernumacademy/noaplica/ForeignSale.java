package com.kibernumacademy.noaplica;

public class ForeignSale extends AbstractSale {

  // No necesitamos impuestos
  public ForeignSale(double amount, String customer ) {
    this.amount = amount;
    this.customer = customer;
    this.taxes = 0;
  }

  @Override
  public void generate() {
    System.out.println("Se genera la venta");
  }

  @Override
  public void calculateTaxes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculateTaxes'");
  }
  
}

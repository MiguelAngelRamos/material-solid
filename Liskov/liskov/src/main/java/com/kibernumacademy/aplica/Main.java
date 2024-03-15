package com.kibernumacademy.aplica;

public class Main {
  public static void main(String[] args) {
    
    AbstractSale sale = new ForeignSale(200, "Sofia");
    sale.generate();

    SaleWithTaxes saleWithTaxes = new Sale(100, "Catalina", 0.14d);
    saleWithTaxes.calculateTaxes();
    saleWithTaxes.generate();

  }
}

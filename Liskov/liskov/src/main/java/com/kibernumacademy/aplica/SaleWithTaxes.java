package com.kibernumacademy.aplica;

public abstract class SaleWithTaxes extends AbstractSale {
  protected double taxes;
  public abstract void calculateTaxes();
}

package com.kibernumacademy.noaplica;

public class Main {
  public static void main(String[] args) {

    // Liskov
    AbstractSale sale = new Sale(100, "Sofia", 0.15d); 
    sale.calculateTaxes();
    sale.generate();

    // Si no es capaz de implemetar los metodos del padre no se cumple
    sale = new ForeignSale(2000,"Catalina");
    sale.calculateTaxes();
    sale.generate();


    // Liskov Substitution Principle (Principio de Sustitución de Liskov): Los objetos de un programa deberían ser reemplazables por instancias de sus subtipos sin alterar el correcto funcionamiento del programa. Esto se refiere a la importancia de la herencia y el polimorfismo en la programación orientada a objetos.

  }
}

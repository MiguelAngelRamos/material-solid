package com.kibernumacademy.aplica.modules;

import com.kibernumacademy.aplica.interfaces.INotifier;

public class EmailNotifier implements INotifier {

  @Override
  public void send(String message) {
    System.out.println("Enviando un email: " + message);
  }
}
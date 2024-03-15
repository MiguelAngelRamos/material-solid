package com.kibernumacademy.aplica.modules;

import com.kibernumacademy.aplica.interfaces.INotifier;

public class TwitterNotifier implements INotifier {

  @Override
  public void send(String message) {
    System.out.println("Enviando Twitter: " +  message);
  }
  
}

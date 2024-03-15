package com.kibernumacademy.aplica.modules;

import com.kibernumacademy.aplica.interfaces.INotifier;

public class WhatsAppNotifier implements INotifier{

  @Override
  public void send(String message) {
    System.out.println("Enviando WSP: " +  message);
  }

}

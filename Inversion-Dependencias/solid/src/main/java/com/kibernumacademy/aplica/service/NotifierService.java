package com.kibernumacademy.aplica.service;

import com.kibernumacademy.aplica.interfaces.INotifier;

public class NotifierService {
  
  private INotifier [] notifiers;

  public NotifierService(INotifier [] notifiers) {
    this.notifiers = notifiers;
  }

  public void notify(String message) {
   
    for(INotifier notifier: notifiers) {
        notifier.send(message);
    }
  }
}

// Open/Closed Principle (Principio de Abierto/Cerrado): Las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para extensión, pero cerradas para modificación. Esto sugiere que deberías poder agregar nuevas funcionalidades sin cambiar el código existente.

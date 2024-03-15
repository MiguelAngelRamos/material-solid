package com.kibernumacademy.aplica;

import com.kibernumacademy.aplica.interfaces.INotifier;
import com.kibernumacademy.aplica.modules.EmailNotifier;
import com.kibernumacademy.aplica.modules.TwitterNotifier;
import com.kibernumacademy.aplica.modules.WhatsAppNotifier;
import com.kibernumacademy.aplica.service.NotifierService;

public class Main {
  public static void main(String[] args) {
    INotifier [] notifiers = new INotifier[] {
      new EmailNotifier(),
      new WhatsAppNotifier(),
      new TwitterNotifier()
    };
    NotifierService notifierService = new NotifierService(notifiers);
    notifierService.notify("Aplicando el principio de Inversion de dependecias");
  }
}

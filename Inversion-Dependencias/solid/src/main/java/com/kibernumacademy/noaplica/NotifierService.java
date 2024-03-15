package com.kibernumacademy.noaplica;

public class NotifierService {
  
  private EmailNotifier emailNotifier;
  private WhatsAppNotifier whatsAppNotifier;

  public NotifierService() {
    this.emailNotifier = new EmailNotifier();
    this.whatsAppNotifier = new WhatsAppNotifier();
  }

  public void notify(String message) {
    this.emailNotifier.sendEmail(message);
    this.whatsAppNotifier.sendWsp(message);
  }
}

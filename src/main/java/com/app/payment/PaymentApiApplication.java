package com.app.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * paymentapiapplication.
 */
@SpringBootApplication
@EnableFeignClients
public class PaymentApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(PaymentApiApplication.class, args);
  }

}

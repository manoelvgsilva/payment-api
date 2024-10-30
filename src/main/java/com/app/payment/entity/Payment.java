package com.app.payment.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "payments")
public class Payment {

  @Id
  private ObjectId id;
  private String saleId;
  private String methodPayment;
  private LocalDate datePayment;
  private String payValue;

  public Payment() {}

  public Payment(ObjectId id, String saleId, String methodPayment,
                 LocalDate datePayment, String payValue) {
    this.id = id;
    this.saleId = saleId;
    this.methodPayment = methodPayment;
    this.datePayment = datePayment;
    this.payValue = payValue;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getSaleId() {
    return saleId;
  }

  public void setSaleId(String saleId) {
    this.saleId = saleId;
  }

  public String getMethodPayment() {
    return methodPayment;
  }

  public void setMethodPayment(String methodPayment) {
    this.methodPayment = methodPayment;
  }

  public LocalDate getDatePayment() {
    return datePayment;
  }

  public void setDatePayment(LocalDate datePayment) {
    this.datePayment = datePayment;
  }

  public String getPayValue() {
    return payValue;
  }

  public void setPayValue(String payValue) {
    this.payValue = payValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(id, payment.id)
        && Objects.equals(saleId, payment.saleId)
        && Objects.equals(methodPayment, payment.methodPayment)
        && Objects.equals(datePayment, payment.datePayment)
        && Objects.equals(payValue, payment.payValue);
  }
}

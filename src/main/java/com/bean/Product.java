package com.bean;

public class Product {

  private String name;
  private Integer quantity;
  private Double price;
  private Long productNumber;

  // Constructor, getters and setters
  public Product(String name, Integer quantity, Double price, Long productNumber) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.productNumber = productNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Long getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(Long productNumber) {
    this.productNumber = productNumber;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        ", productNumber=" + productNumber +
        '}';
  }
}
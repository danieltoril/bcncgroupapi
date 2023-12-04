package com.zara.testproject.dao;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Price {
  private @Id @GeneratedValue Long price_list;
  private Integer brand_id;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date start_date;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date end_date;
  private Integer product_id;
  private Integer priority;
  private Double price;
  private String curr;

  /**
   * @param price_list
   * @param brand_id
   * @param start_date
   * @param end_date
   * @param product_id
   * @param priority
   * @param price
   * @param curr
   */
  public Price(Integer brand_id, Date start_date, Date end_date, Integer product_id, Integer priority, Double price,
      String curr) {
    this.brand_id = brand_id;
    this.start_date = start_date;
    this.end_date = end_date;
    this.product_id = product_id;
    this.priority = priority;
    this.price = price;
    this.curr = curr;
  }

  public Price() {
  }

  public Long getPrice_list() {
    return price_list;
  }

  public void setPrice_list(Long price_list) {
    this.price_list = price_list;
  }

  public Integer getBrand_id() {
    return brand_id;
  }

  public void setBrand_id(Integer brand_id) {
    this.brand_id = brand_id;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

  public Integer getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Integer product_id) {
    this.product_id = product_id;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getCurr() {
    return curr;
  }

  public void setCurr(String curr) {
    this.curr = curr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand_id, curr, end_date, price, price_list, priority, product_id, start_date);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if ((obj == null) || (getClass() != obj.getClass()))
      return false;
    Price other = (Price) obj;
    return Objects.equals(brand_id, other.brand_id) && Objects.equals(curr, other.curr)
        && Objects.equals(end_date, other.end_date) && Objects.equals(price, other.price)
        && Objects.equals(price_list, other.price_list) && Objects.equals(priority, other.priority)
        && Objects.equals(product_id, other.product_id) && Objects.equals(start_date, other.start_date);
  }

  @Override
  public String toString() {
    return "Price [price_list=" + price_list + ", brand_id=" + brand_id + ", start_date=" + start_date + ", end_date="
        + end_date + ", product_id=" + product_id + ", priority=" + priority + ", price=" + price + ", curr=" + curr
        + "]";
  }

}

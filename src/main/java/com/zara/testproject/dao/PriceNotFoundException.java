package com.zara.testproject.dao;

class PriceNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  PriceNotFoundException(Integer product) {
    super("Could not find Price for product " + product);
  }
}

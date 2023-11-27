package com.zara.testproject.dao;

class PriceNotFoundException extends RuntimeException {

  PriceNotFoundException(Integer product) {
    super("Could not find Price for product " + product);
  }
}

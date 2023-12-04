package com.zara.testproject.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class PriceNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(PriceNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String priceNotFoundHandler(PriceNotFoundException ex) {
    return ex.getMessage();
  }
}

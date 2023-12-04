package com.zara.testproject.dao;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

  private final PriceRepository repository;

  PriceController(PriceRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/Prices")
  Price findQBE(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") Date applyDate,
      @RequestParam Integer productId, @RequestParam Integer brandId) {
    return repository.findPriceByDate(applyDate, productId, brandId);
  }
}

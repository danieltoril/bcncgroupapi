package com.zara.testproject;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zara.testproject.dao.Price;
import com.zara.testproject.dao.PriceRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(PriceRepository repository) {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
    return args -> {
      log.info("Preloading " + repository.save(new Price(1, formatter.parse("2020-06-14-00.00.00"),
          formatter.parse("2020-12-31-23.59.59"), 35455, 0, 35.50, "EUR")));
      log.info("Preloading " + repository.save(new Price(1, formatter.parse("2020-06-14-15.00.00"),
          formatter.parse("2020-06-14-18.30.00"), 35455, 1, 25.45, "EUR")));
      log.info("Preloading " + repository.save(new Price(1, formatter.parse("2020-06-15-00.00.00"),
          formatter.parse("2020-06-15-11.00.00"), 35455, 1, 30.50, "EUR")));
      log.info("Preloading " + repository.save(new Price(1, formatter.parse("2020-06-15-16.00.00"),
          formatter.parse("2020-12-31-23.59.59"), 35455, 1, 38.95, "EUR")));
    };
  }
}

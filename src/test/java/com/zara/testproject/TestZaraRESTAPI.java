package com.zara.testproject;

import java.net.URI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.zara.testproject.dao.Price;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestZaraRESTAPI {
  @LocalServerPort
  int randomServerPort;

  @Test
  public void test1() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = new URI(
        "http://localhost:" + randomServerPort + "/Prices?applyDate=2020-06-14-10.00.00&productId=35455&brandId=1");
    Price price = restTemplate.getForObject(uri, Price.class);
    Assertions.assertNotNull(price.getPrice_list());
    Assertions.assertEquals(price.getPrice_list(), 1);
    System.out.println("Test 1: " + price.toString());
  }

  @Test
  public void test2() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = new URI(
        "http://localhost:" + randomServerPort + "/Prices?applyDate=2020-06-14-16.00.00&productId=35455&brandId=1");
    Price price = restTemplate.getForObject(uri, Price.class);
    Assertions.assertNotNull(price.getPrice_list());
    Assertions.assertEquals(price.getPrice_list(), 2);
    System.out.println("Test 2: " + price.toString());
  }

  @Test
  public void test3() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = new URI(
        "http://localhost:" + randomServerPort + "/Prices?applyDate=2020-06-14-21.00.00&productId=35455&brandId=1");
    Price price = restTemplate.getForObject(uri, Price.class);
    Assertions.assertNotNull(price.getPrice_list());
    Assertions.assertEquals(price.getPrice_list(), 1);
    System.out.println("Test 3: " + price.toString());
  }

  @Test
  public void test4() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = new URI(
        "http://localhost:" + randomServerPort + "/Prices?applyDate=2020-06-15-10.00.00&productId=35455&brandId=1");
    Price price = restTemplate.getForObject(uri, Price.class);
    Assertions.assertNotNull(price.getPrice_list());
    Assertions.assertEquals(price.getPrice_list(), 3);
    System.out.println("Test 4: " + price.toString());
  }

  @Test
  public void test5() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = new URI(
        "http://localhost:" + randomServerPort + "/Prices?applyDate=2020-06-16-21.00.00&productId=35455&brandId=1");
    Price price = restTemplate.getForObject(uri, Price.class);
    Assertions.assertNotNull(price.getPrice_list());
    Assertions.assertEquals(price.getPrice_list(), 4);
    System.out.println("Test 5: " + price.toString());
  }

}

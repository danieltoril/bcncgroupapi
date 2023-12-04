package com.zara.testproject.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PriceRepository extends JpaRepository<Price, Long> {
  @Query("select p from Price p where p.brand_id=:brandId and p.product_id=:productId and p.start_date <= :applyDate and p.end_date>= :applyDate and p.priority=(SELECT MAX(p.priority) FROM Price p where p.brand_id=:brandId and p.product_id=:productId and p.start_date <= :applyDate and p.end_date>= :applyDate)")
  Price findPriceByDate(@Param("applyDate") Date applyDate, @Param("productId") Integer productId,
      @Param("brandId") Integer brandId);

}

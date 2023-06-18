package com.shop.shop.spring.dao;

import com.shop.shop.spring.models.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
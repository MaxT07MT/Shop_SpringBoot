package com.shop.shop.spring.servises;


import com.shop.shop.spring.dto.BucketDTO;
import com.shop.shop.spring.models.Bucket;
import com.shop.shop.spring.models.User;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketByUser(String name);
}

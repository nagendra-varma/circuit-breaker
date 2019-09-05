package com.imaginea.cb.circuitbreaker;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RatingServiceFallback implements RatingServiceClient {
    @Override
    public List<String> getRatings(String storeId) {
        return Collections.emptyList();
    }
}

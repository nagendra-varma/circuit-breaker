package com.imaginea.cb.circuitbreaker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingServiceClient ratingServiceClient;

    public List<String> getRatingsForStore(String storeId) {
        List<String> list = ratingServiceClient.getRatings(storeId);
//        logger.info("Ratings for store " + storeId + " are : " + list);
        return list;
    }

}

package com.imaginea.cb.circuitbreaker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "ratingService", url = "${feign.ratingService.url}", fallback = RatingServiceFallback.class)
public interface RatingServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ratings/{storeId}")
    List<String> getRatings(@PathVariable("storeId") String storeId);
}

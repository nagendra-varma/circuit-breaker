package com.imaginea.cb.circuitbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings-dashboard")
public class RatingServiceDashboard {

    @Autowired
    private RatingService ratingService;

    @GetMapping(value = "/{storeId}")
    public List<String> getRatingsForStore(@PathVariable("storeId") String storeId) {
        return ratingService.getRatingsForStore(storeId);
    }
}

package com.api.cataloginfo.service;

import com.api.cataloginfo.client.InfoServiceClient;
import com.api.cataloginfo.model.MovieInfo;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatalogService {

    private final InfoServiceClient client;

    public MovieInfo getRandomMovieInfo(){
        return client.getMovieFromInfoService(getRandomMovieId());
    }

    private String getRandomMovieId(){
        long lowerBound = 1;
        long upperBound = 550;
        return String.valueOf(RandomUtils.nextLong(lowerBound, upperBound));
    }
}

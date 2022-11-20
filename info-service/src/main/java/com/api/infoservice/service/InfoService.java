package com.api.infoservice.service;

import com.api.infoservice.client.TMDBClient;
import com.api.infoservice.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final TMDBClient tmdbClient;

    public Movie getMovieById(String id){
        return tmdbClient.getMovieFromTMDB(id);
    }
}

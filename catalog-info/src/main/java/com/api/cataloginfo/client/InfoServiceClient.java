package com.api.cataloginfo.client;

import com.api.cataloginfo.model.Movie;
import com.api.cataloginfo.model.MovieInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class InfoServiceClient {
    private final WebClient.Builder webClientBuilder;

    @Value("${info.url}")
    private String infoUrl;
    public MovieInfo getMovieFromInfoService(String movieId){
        Movie movie = webClientBuilder.build()
                .get()
                .uri(infoUrl + "/info/" + movieId)
                .retrieve()
                .bodyToMono(Movie.class)
                .block();

        return new MovieInfo()
                .setDescription(movie.getDescription())
                .setName(movie.getName())
                .setPortInfoService(movie.getPortInfoService());
    }
}

package com.api.infoservice.client;

import com.api.infoservice.model.Movie;
import com.api.infoservice.model.MovieSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class TMDBClient {

    @Value("${api.key}")
    private String apiKey;
    private final Environment environment;
    private final WebClient.Builder webClientBuilder;

    public Movie getMovieFromTMDB(String id) {
        MovieSummary movieSummary = webClientBuilder.build()
                .get()
                .uri("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey)
                .retrieve()
                .bodyToMono(MovieSummary.class)
                .block();

        return new Movie()
                .setMovieId(id)
                .setName(movieSummary.getTitle())
                .setDescription(movieSummary.getOverview())
                .setPortInfoService(environment.getProperty("local.server.port"));
    }
}

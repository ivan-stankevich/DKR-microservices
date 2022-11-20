package com.api.infoservice.controller;

import com.api.infoservice.model.Movie;
import com.api.infoservice.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoServiceController {

    private final InfoService service;

    @GetMapping("/{movieId}")
    public Movie getMovieNyId(@PathVariable("movieId") String movieId){
        return service.getMovieById(movieId);
    }
}

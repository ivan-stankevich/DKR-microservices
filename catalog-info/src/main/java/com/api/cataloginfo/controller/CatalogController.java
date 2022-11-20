package com.api.cataloginfo.controller;

import com.api.cataloginfo.model.MovieInfo;
import com.api.cataloginfo.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService service;

    @GetMapping
    public MovieInfo getRandomMovieInfo(){
        return service.getRandomMovieInfo();
    }
}

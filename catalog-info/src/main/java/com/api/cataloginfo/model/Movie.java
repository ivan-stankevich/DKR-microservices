package com.api.cataloginfo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Movie {
    private String movieId;
    private String name;
    private String description;
    private String portInfoService;
}

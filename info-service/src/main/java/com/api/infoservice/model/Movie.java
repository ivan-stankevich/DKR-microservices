package com.api.infoservice.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Movie {

    private String movieId;
    private String name;
    private String description;
    private String portInfoService;
}

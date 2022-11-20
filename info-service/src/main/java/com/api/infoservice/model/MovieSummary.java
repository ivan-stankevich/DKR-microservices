package com.api.infoservice.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}

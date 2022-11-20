package com.api.cataloginfo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Setter
@Getter
@Accessors(chain = true)
public class MovieInfo {
    private String name;
    private String description;
    private String portInfoService;
}

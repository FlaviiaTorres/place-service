package com.flaviatorres.placeservice.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(
    @NotBlank String name, 
    @NotBlank String state,
    @NotBlank String city,
    @NotBlank String slug
    ) {  
}  

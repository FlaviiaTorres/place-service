package com.flaviatorres.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
    String name, 
    String slug, 
    String city,
    String states,
    LocalDateTime created_at, 
    LocalDateTime updated_at) {  
}  

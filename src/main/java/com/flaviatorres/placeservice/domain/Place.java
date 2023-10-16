package com.flaviatorres.placeservice.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public record Place(
    Long id, 
    String name, 
    String slug, 
    String city,
    String states,
   @CreatedDate LocalDateTime created_at, 
   @LastModifiedDate LocalDateTime updated_at
) {
}
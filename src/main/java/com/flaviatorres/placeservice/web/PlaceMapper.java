package com.flaviatorres.placeservice.web;

import com.flaviatorres.placeservice.api.PlaceResponse;
import com.flaviatorres.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),
        place.city(),place.state(), place.createdAt(), place.updatedAt());
    }
    
}

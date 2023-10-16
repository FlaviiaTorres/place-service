package com.flaviatorres.placeservice.domain;

import com.flaviatorres.placeservice.api.PlaceRequest;
import com.github.slugify.Slugify;

import reactor.core.publisher.Mono;

public class PlaceService {

    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), 
        placeRequest.city(), placeRequest.states(), placeRequest.created_at(), placeRequest.updated_at());
        return placeRepository.save(place);
    }
    
}

package com.flaviatorres.placeservice;

import static org.mockito.Mockito.never;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.flaviatorres.placeservice.api.PlaceRequest;

import net.bytebuddy.agent.utility.nullability.AlwaysNull;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PlaceServiceApplicationTests {
	
	@Autowired
	WebTestClient webTestClient;

	@Test
	public void testCreatePlaceSucess(){
		var name = "Valid Name";
		var state = "Valid State";
		var city = "Valid City";
		var slug = "valid-Name";

		webTestClient
			.post()
			.uri("/places")
			.bodyValue( new PlaceRequest(name, state, city, slug)
			)
			.exchange()
			.expectBody()
			.jsonPath("name").isEqualTo(name)
			.jsonPath("state").isEqualTo(state)
			.jsonPath("city").isEqualTo(city)
			.jsonPath("slug").isEqualTo(slug)
			.jsonPath("createdAt").isNotEmpty()
			.jsonPath("updatedAt").isNotEmpty();
	}

	@Test
  public void testCreatePlaceFailure() {
    final String name = "";
    final String state = "";
    final String city = "";

    webTestClient
        .post()
        .uri("/places")
        .bodyValue(
            new PlaceRequest(name, city, state, city))
        .exchange()
        .expectStatus().isBadRequest();
  }

}

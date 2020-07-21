package com.doodle.poll.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PollControllerTest {

	@LocalServerPort
	protected int serverPort;

	@Autowired
	protected TestRestTemplate restTemplate;

	@Test
	public void shouldReturnResponse() {
		ResponseEntity<Object> response = restTemplate.exchange("http://localhost:" + serverPort + "/poll", HttpMethod.GET, null, Object.class);
		assertThat(response.getStatusCodeValue(), is(200));
	}

}

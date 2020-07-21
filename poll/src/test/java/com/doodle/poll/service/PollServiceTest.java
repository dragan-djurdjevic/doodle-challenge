package com.doodle.poll.service;

import java.util.List;

import com.doodle.poll.model.Poll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;

@ExtendWith(MockitoExtension.class)
public class PollServiceTest {

	@InjectMocks
	private PollServiceImpl pollService;

	@Test
	public void shouldReturnEmptyResult() {
		List<Poll> polls = pollService.getPolls();
		assertThat(polls, empty());
	}

}

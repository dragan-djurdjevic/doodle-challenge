package com.doodle.poll.service;

import java.util.Collections;
import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.repository.PollRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PollServiceTest {

	@Mock
	private PollRepository pollRepository;

	@InjectMocks
	private PollServiceImpl pollService;

	@Test
	public void shouldReturnEmptyResult() {
		when(pollRepository.findAll()).thenReturn(Collections.emptyList());
		List<Poll> polls = pollService.getPolls();
		assertThat(polls, empty());
	}

}

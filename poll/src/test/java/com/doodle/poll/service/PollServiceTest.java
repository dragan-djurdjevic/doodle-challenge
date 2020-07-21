package com.doodle.poll.service;

import java.util.Collections;
import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.repository.PollCriteriaRepository;
import com.doodle.poll.repository.PollRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PollServiceTest {

	@Mock
	private PollRepository pollRepository;

	@Mock
	private PollCriteriaRepository pollCriteriaRepository;

	@InjectMocks
	private PollServiceImpl pollService;

	@Test
	public void shouldReturnEmptyResult() {
		when(pollRepository.findAll()).thenReturn(Collections.emptyList());
		List<Poll> polls = pollService.getPolls();
		assertThat(polls, empty());
	}

	@Test
	private void shouldReturnListWithResults() {
		String title = "test title";
		Poll poll = new Poll();
		poll.setTitle(title);

		when(pollCriteriaRepository.searchPolls(anyString(), anyString(), anyLong())).thenReturn(Collections.singletonList(poll));

		List<Poll> polls = pollService.getPolls();
		assertThat(polls, hasSize(1));
		assertThat(polls.get(0).getTitle(), is(title));
	}

}

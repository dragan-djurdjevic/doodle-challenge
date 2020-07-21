package com.doodle.poll.service;

import java.util.Collections;
import java.util.List;

import com.doodle.poll.model.Poll;
import org.springframework.stereotype.Service;

@Service
public class PollServiceImpl implements PollService {

	@Override
	public List<Poll> getPolls() {
		return Collections.emptyList();
	}

}

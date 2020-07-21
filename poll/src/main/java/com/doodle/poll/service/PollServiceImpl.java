package com.doodle.poll.service;

import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.repository.PollsRepository;
import org.springframework.stereotype.Service;

@Service
public class PollServiceImpl implements PollService {

	private PollsRepository pollsRepository;

	public PollServiceImpl(PollsRepository pollsRepository) {
		this.pollsRepository = pollsRepository;
	}

	@Override
	public List<Poll> getPolls() {
		return pollsRepository.findAll();
	}

}

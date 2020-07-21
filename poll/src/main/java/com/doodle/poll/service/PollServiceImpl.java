package com.doodle.poll.service;

import java.time.LocalDate;
import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.repository.PollCriteriaRepository;
import com.doodle.poll.repository.PollRepository;
import com.doodle.poll.utils.DateUtils;
import org.springframework.stereotype.Service;

@Service
public class PollServiceImpl implements PollService {

	private PollRepository pollRepository;

	private PollCriteriaRepository pollCriteriaRepository;

	public PollServiceImpl(PollRepository pollRepository, PollCriteriaRepository pollCriteriaRepository) {
		this.pollRepository = pollRepository;
		this.pollCriteriaRepository = pollCriteriaRepository;
	}

	@Override
	public List<Poll> getPolls() {
		return pollRepository.findAll();
	}

	public List<Poll> searchPolls(String initiatorName, String title, LocalDate afterDate) {
		Long timestamp = DateUtils.toTimestamp(afterDate) * 1000;
		return pollCriteriaRepository.searchPolls(initiatorName, title, timestamp);
	}

}

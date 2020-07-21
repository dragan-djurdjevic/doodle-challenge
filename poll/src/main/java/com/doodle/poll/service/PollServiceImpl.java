package com.doodle.poll.service;

import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.repository.PollCriteriaRepository;
import com.doodle.poll.repository.PollRepository;
import org.apache.commons.lang3.StringUtils;
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

	public List<Poll> searchPolls(String title) {
		title = StringUtils.trimToNull(title);
		return pollCriteriaRepository.searchPolls(null, title, null);
	}

}

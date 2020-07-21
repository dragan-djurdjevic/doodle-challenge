package com.doodle.poll.repository;

import java.util.List;

import com.doodle.poll.model.Poll;

public interface PollCriteriaRepository {
	List<Poll> searchPolls(String initiatorName, String title, Long afterDate);
}

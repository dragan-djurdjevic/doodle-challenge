package com.doodle.poll.service;

import java.time.LocalDate;
import java.util.List;

import com.doodle.poll.model.Poll;

public interface PollService {
	List<Poll> getPolls();
	List<Poll> searchPolls(String initiatorName, String title, LocalDate afterDate);
}

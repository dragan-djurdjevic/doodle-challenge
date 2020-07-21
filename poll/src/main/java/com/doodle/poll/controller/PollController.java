package com.doodle.poll.controller;

import java.util.Collections;
import java.util.List;

import com.doodle.poll.model.Poll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poll")
public class PollController {

	@GetMapping
	public List<Poll> getPolls() {
		return Collections.emptyList();
	}

}

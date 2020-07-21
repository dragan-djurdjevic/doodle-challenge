package com.doodle.poll.controller;

import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.service.PollService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poll")
public class PollController {

	private PollService pollService;

	public PollController(PollService pollService) {
		this.pollService = pollService;
	}

	@GetMapping
	public List<Poll> searchPolls(@RequestParam(name = "title", defaultValue = "") String title) {
		return pollService.searchPolls(title);
	}

}

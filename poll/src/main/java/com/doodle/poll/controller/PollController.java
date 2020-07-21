package com.doodle.poll.controller;

import java.time.LocalDate;
import java.util.List;

import com.doodle.poll.model.Poll;
import com.doodle.poll.service.PollService;
import com.doodle.poll.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
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
	public List<Poll> searchPolls(
			@RequestParam(name = "initiatorName", defaultValue = "") String initiatorName,
			@RequestParam(name = "title", defaultValue = "") String title,
			@RequestParam(name = "afterDate", defaultValue = "") String afterDateStr
	) {
		initiatorName = StringUtils.trimToNull(initiatorName);
		title = StringUtils.trimToNull(title);
		afterDateStr = StringUtils.trimToNull(afterDateStr);
		LocalDate date = DateUtils.parseLocalDate(afterDateStr);

		return pollService.searchPolls(initiatorName, title, date);
	}

}

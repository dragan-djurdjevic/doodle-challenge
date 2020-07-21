package com.doodle.poll.model;

import org.springframework.data.annotation.Id;

public class Poll {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

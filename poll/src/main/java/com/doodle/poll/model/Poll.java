package com.doodle.poll.model;

import org.springframework.data.annotation.Id;

public class Poll {
	@Id
	private String id;
	private String title;
	private String initiated;
	private Initiator initiator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInitiated() {
		return initiated;
	}

	public void setInitiated(String initiated) {
		this.initiated = initiated;
	}

	public Initiator getInitiator() {
		return initiator;
	}

	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}
}

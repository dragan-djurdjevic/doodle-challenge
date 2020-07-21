package com.doodle.poll.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Participant {
	private long id;
	private String name;
	private List<Long> preferences;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Long> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<Long> preferences) {
		this.preferences = preferences;
	}
}

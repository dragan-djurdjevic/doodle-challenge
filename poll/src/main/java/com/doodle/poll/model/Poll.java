package com.doodle.poll.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Poll {
	@Id
	private String id;
	private String adminKey;
	private Long latestChange;
	private Long initiated;
	private Long participantsCount;
	private Long inviteesCount;
	private String type;
	private Long columnConstraint;
	private String preferencesType;
	private String state;
	private String locale;
	private String title;
	private Location location;
	private String description;
	private Initiator initiator;
	private List<Option> options;
	private String optionsHash;
	private List<Participant> participants;
	private List<Invitee> invitees;
	private Boolean multiDay;
	private Boolean dateText;
	private String device;
	private String levels;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminKey() {
		return adminKey;
	}

	public void setAdminKey(String adminKey) {
		this.adminKey = adminKey;
	}

	public Long getLatestChange() {
		return latestChange;
	}

	public void setLatestChange(Long latestChange) {
		this.latestChange = latestChange;
	}

	public Long getInitiated() {
		return initiated;
	}

	public void setInitiated(Long initiated) {
		this.initiated = initiated;
	}

	public Long getParticipantsCount() {
		return participantsCount;
	}

	public void setParticipantsCount(Long participantsCount) {
		this.participantsCount = participantsCount;
	}

	public Long getInviteesCount() {
		return inviteesCount;
	}

	public void setInviteesCount(Long inviteesCount) {
		this.inviteesCount = inviteesCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getColumnConstraint() {
		return columnConstraint;
	}

	public void setColumnConstraint(Long columnConstraint) {
		this.columnConstraint = columnConstraint;
	}

	public String getPreferencesType() {
		return preferencesType;
	}

	public void setPreferencesType(String preferencesType) {
		this.preferencesType = preferencesType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Initiator getInitiator() {
		return initiator;
	}

	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getOptionsHash() {
		return optionsHash;
	}

	public void setOptionsHash(String optionsHash) {
		this.optionsHash = optionsHash;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public List<Invitee> getInvitees() {
		return invitees;
	}

	public void setInvitees(List<Invitee> invitees) {
		this.invitees = invitees;
	}

	public Boolean getMultiDay() {
		return multiDay;
	}

	public void setMultiDay(Boolean multiDay) {
		this.multiDay = multiDay;
	}

	public Boolean getDateText() {
		return dateText;
	}

	public void setDateText(Boolean dateText) {
		this.dateText = dateText;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}
}

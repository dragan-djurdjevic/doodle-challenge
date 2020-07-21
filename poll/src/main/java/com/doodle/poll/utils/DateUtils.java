package com.doodle.poll.utils;

import java.time.LocalDate;
import java.time.ZoneId;

public class DateUtils {

	public static LocalDate parseLocalDate(String dateString) {
		if (dateString == null) {
			return null;
		}

		return LocalDate.parse(dateString);
	}

	public static Long toTimestampMiliseconds(LocalDate localDate) {
		if (localDate == null) {
			return null;
		}

		ZoneId zoneId = ZoneId.systemDefault();
		return localDate.atStartOfDay(zoneId).toEpochSecond() * 1000;
	}

}

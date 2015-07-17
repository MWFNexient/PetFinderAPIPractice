package com.nexient.practice;

import java.time.LocalTime;

public final class TimeOfDay {
	private final static LocalTime	EVENING	= LocalTime.of(17, 0);
	private final static LocalTime	NOON		= LocalTime.of(12, 0);

	public static String greeting() {
		String timeOfDay;
		if (LocalTime.now().isBefore(TimeOfDay.NOON)) {
			timeOfDay = "morning";
		} else if (LocalTime.now().isBefore(TimeOfDay.EVENING)) {
			timeOfDay = "afternoon";
		} else {
			timeOfDay = "evening";
		}
		return timeOfDay;
	}
}

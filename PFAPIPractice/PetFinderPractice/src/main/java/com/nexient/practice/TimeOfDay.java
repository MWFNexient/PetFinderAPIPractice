package com.nexient.practice;

import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public final class TimeOfDay {

	public static String greeting(final ZoneId tz) {
		final ZoneOffset zo = (ZoneOffset) tz.normalized();
		final OffsetTime EVENING = OffsetTime.of(17, 0, 0, 0, zo);
		final OffsetTime NOON = OffsetTime.of(12, 0, 0, 0, zo);
		final OffsetTime ot = OffsetTime.now(zo);
		String timeOfDay;
		if (ot.isBefore(NOON)) {
			timeOfDay = "morning";
		} else if (ot.isBefore(EVENING)) {
			timeOfDay = "afternoon";
		} else {
			timeOfDay = "evening";
		}
		return timeOfDay;
	}
}

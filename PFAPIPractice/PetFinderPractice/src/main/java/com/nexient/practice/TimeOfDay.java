package com.nexient.practice;

import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public final class TimeOfDay {
	/**
	 * Returns a simple morning, afternoon, or evening<br/>
	 * Currently only return english greeting.
	 * 
	 * @param tz
	 *             The ZoneId to construct the greeting for
	 * @return Simple one word greeting.
	 */
	public static String greeting(final ZoneId tz) {
		// TODO Build in localization
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

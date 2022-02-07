package by.epam.railway_station.entity;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;

	public Time(int hour, int minute) {
		if (hour > 0 & hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
		if (minute >= 0 & minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > 0 & hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 & minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]";
	}

	
	
}

package by.epam.railway_station.entity;

import java.util.Arrays;

public class TrainList {
	private Train[] trains = { new Train("minsk-gomel", 24, new Time(18, 24)),
			new Train("minsk-grodno", 25, new Time(13, 24)),
			new Train("minsk-brest", 26, new Time(15, 45)),
			new Train("minsk-gomel", 27, new Time(12, 24)),
			new Train("minsk-pinsk", 4, new Time(5, 24))};

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trains);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainList other = (TrainList) obj;
		return Arrays.equals(trains, other.trains);
	}

	@Override
	public String toString() {
		return "TrainList [trains=" + Arrays.toString(trains) + "]";
	}

}

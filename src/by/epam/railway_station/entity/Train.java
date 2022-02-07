package by.epam.railway_station.entity;

import java.util.Objects;

public class Train {
	private String destination;
	private int trainNumber;
	private Time departureTime;

	public Train() {
		
	}

	public Train(String destination, int trainNumber, Time departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& trainNumber == other.trainNumber;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", trainNumber=" + trainNumber + ", departureTime=" + departureTime
				+ "]"+"\r";
	}

}

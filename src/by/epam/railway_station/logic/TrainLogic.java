package by.epam.railway_station.logic;

import java.util.Scanner;
import by.epam.railway_station.entity.Train;
import by.epam.railway_station.entity.TrainList;

public class TrainLogic {

	public int enterFromConsole(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();
		return x;
	}

	// sort trains by number(bubble sort)
	public void sortingTrainNumbers(TrainList trainlist) {
		for (int i = 0; i < trainlist.getTrains().length - 1; i++) {
			for (int j = trainlist.getTrains().length - 1; j > 0; j--) {
				if (trainlist.getTrains()[j - 1].getTrainNumber() > trainlist.getTrains()[j].getTrainNumber()) {
					Train temp = trainlist.getTrains()[j - 1];
					trainlist.getTrains()[j - 1] = trainlist.getTrains()[j];
					trainlist.getTrains()[j] = temp;
				}
			}
		}
	}

	// search train by number.
	public Train trainNumberInput(TrainList trains, int trainNumber) {
		Train train = new Train();
		for (int i = 0; i < trains.getTrains().length; i++) {
			if (trains.getTrains()[i].getTrainNumber() == trainNumber) {
				train = trains.getTrains()[i];
			}

		}
		return train;
	}

	// sort by destination
	public void sortingDestination(TrainList trains) {
		for (int i = 0; i < trains.getTrains().length - 1; i++) {
			for (int j = i + 1; j < trains.getTrains().length; j++) {
				if (trains.getTrains()[j].getDestination()
						.compareToIgnoreCase((trains.getTrains()[i].getDestination())) < 0) {
					Train temp = trains.getTrains()[i];
					trains.getTrains()[i] = trains.getTrains()[j];
					trains.getTrains()[j] = temp;
				} else if (trains.getTrains()[j].getDestination().equals(trains.getTrains()[i].getDestination())) {
					Train tem = trains.getTrains()[j];
					trains.getTrains()[j] = trains.getTrains()[i];
					trains.getTrains()[i] = tem;
				}
			}
		}
	}

}

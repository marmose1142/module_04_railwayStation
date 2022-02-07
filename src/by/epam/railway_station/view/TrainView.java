package by.epam.railway_station.view;

import by.epam.railway_station.entity.Train;
import by.epam.railway_station.entity.TrainList;

public class TrainView {
	
	public void printTrainList(TrainList trainList) {
		System.out.println(trainList);
	}
	
	public void printTrainByNumber(Train train) {
		System.out.println(train);
	}

}

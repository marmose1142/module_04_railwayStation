package by.epam.railway_station.main;

import by.epam.railway_station.entity.Train;
import by.epam.railway_station.entity.TrainList;
import by.epam.railway_station.logic.TrainLogic;
import by.epam.railway_station.view.TrainView;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода иформации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {

	public static void main(String[] args) {

		TrainList trainListOne = new TrainList();
		TrainView trainView = new TrainView();		
		TrainLogic trainlogic = new TrainLogic();
		
		trainView.printTrainList(trainListOne);
		
		trainlogic.sortingTrainNumbers(trainListOne);
		trainView.printTrainList(trainListOne);
		
		int number = trainlogic.enterFromConsole("Please, insert number of train");
		Train train=trainlogic.trainNumberInput(trainListOne, number);
		trainView.printTrainByNumber(train);
		
		trainlogic.sortingDestination(trainListOne);
		trainView.printTrainList(trainListOne);		
	}

}

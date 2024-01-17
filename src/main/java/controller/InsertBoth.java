package controller;

import dao.CarDao;
import dto.CarDto;
import dto.EngineDto;

public class InsertBoth {

	public static void main(String[] args) {
		EngineDto engineDto=new EngineDto();
		engineDto.setEngineHP(202.38);
		engineDto.setEngineCC(1876);
		engineDto.setEngineType("petrol");
		CarDto carDto=new CarDto();
		carDto.setCarName("HYUNDAI");
		carDto.setCarModel("VERNA");
		carDto.setCarPrice(2200000);
		carDto.setCarColour("Black");
		carDto.setEngineDto(engineDto);
		CarDao carDao=new CarDao();
		carDao.insertCar(carDto);
		// TODO Auto-generated method stub

	}

}

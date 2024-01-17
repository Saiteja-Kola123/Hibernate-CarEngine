package controller;

import dao.CarDao;
import dto.CarDto;
import dto.EngineDto;

public class UpdateBoth {

	public static void main(String[] args) {
		CarDto carDto=new CarDto();
		carDto.setCarName("HYUNDAI");
		carDto.setCarModel("CRETA");
		carDto.setCarPrice(1300000);
		carDto.setCarColour("White");
		EngineDto engineDto=new EngineDto();
		engineDto.setEngineid(3);
		engineDto.setEngineHP(196.67);
		engineDto.setEngineCC(1876);
		engineDto.setEngineType("Diesel");
		carDto.setEngineDto(engineDto);
		CarDao carDao=new CarDao();
		carDao.updateBoth(3, carDto);
		// TODO Auto-generated method stub

	}

}

package controller;

import dao.CarDao;
import dto.CarDto;

public class UpdateCar {

	public static void main(String[] args) {
		CarDto carDto=new CarDto();
		carDto.setCarName("TATA");
		carDto.setCarModel("NEXON");
		carDto.setCarPrice(850000);
		carDto.setCarColour("Red");
		CarDao carDao=new CarDao();
		carDao.updateCar(1, carDto);
		
		// TODO Auto-generated method stub

	}

}

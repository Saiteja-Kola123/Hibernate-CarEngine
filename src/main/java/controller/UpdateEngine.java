package controller;

import dao.CarDao;
import dto.EngineDto;

public class UpdateEngine {

	public static void main(String[] args) {
		EngineDto engineDto=new EngineDto();
		engineDto.setEngineHP(113.42);
		engineDto.setEngineCC(1497);
		engineDto.setEngineType("Diesel");
		CarDao carDao=new CarDao();
		carDao.updateEngine(1, engineDto);
		// TODO Auto-generated method stub

	}

}

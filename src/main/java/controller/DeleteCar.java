package controller;

import dao.CarDao;

public class DeleteCar {

	public static void main(String[] args) {
		CarDao carDao=new CarDao();
		carDao.deletecar(2);
		// TODO Auto-generated method stub

	}

}

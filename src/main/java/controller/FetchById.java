package controller;

import dao.CarDao;

public class FetchById {

	public static void main(String[] args) {
		CarDao carDao=new CarDao();
		carDao.fetchCarById(2);
		// TODO Auto-generated method stub

	}

}

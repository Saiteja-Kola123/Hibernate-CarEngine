package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import dto.CarDto;
import dto.EngineDto;

public class CarDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("saiteja");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insertCar(CarDto carDto)
	{
		EngineDto engineDto =carDto.getEngineDto();
		entityTransaction.begin();
		entityManager.persist(engineDto);
		entityManager.persist(carDto);
		entityTransaction.commit();
	}
	public void fetchCarById(int id)
	{
		CarDto carDto=entityManager.find(CarDto.class,id);
		System.out.println(carDto);
	}
	public void fetchAllcar()
	{
		Query query=entityManager.createQuery("select c from CarDto c");
		List<CarDto> list=query.getResultList();
		System.out.println(list);
	}
	public void deletecar(int id)
	{
		CarDto carDto=entityManager.find(CarDto.class,id);
		EngineDto engineDto=carDto.getEngineDto();
		entityTransaction.begin();
		entityManager.remove(carDto);
		entityManager.remove(engineDto);
		entityTransaction.commit();
	}
	public void updateCar(int id,CarDto carDto)
	{
		CarDto cardb=entityManager.find(CarDto.class,id);
		carDto.setCarId(id);
		entityTransaction.begin();
		entityManager.merge(carDto);
		entityTransaction.commit();
	}
	public void updateEngine(int id,EngineDto engineDto)
	{
		EngineDto enginedb=entityManager.find(EngineDto.class,id);
		engineDto.setEngineid(id);
		entityTransaction.begin();
		entityManager.merge(engineDto);
		entityTransaction.commit();
	}
	public void updateBoth(int id,CarDto carDto)
	{
		EngineDto engineDto =carDto.getEngineDto();
		carDto.setCarId(id);
		entityTransaction.begin();
	    entityManager.merge(carDto);
	    entityManager.merge(engineDto);
	    entityTransaction.commit();
	}
	public void updatecolor(int id,String color)
	{
		CarDto carDto=entityManager.find(CarDto.class,id);
		carDto.setCarId(id);
		carDto.setCarColour(color);
		entityTransaction.begin();
		entityManager.merge(carDto);
		entityTransaction.commit();
	}

}

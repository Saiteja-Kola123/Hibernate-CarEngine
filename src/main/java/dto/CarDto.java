package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarDto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private String carModel;
	private double carPrice;
	private String carColour;
	@OneToOne
	private EngineDto engineDto;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColour() {
		return carColour;
	}
	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	public EngineDto getEngineDto() {
		return engineDto;
	}
	public void setEngineDto(EngineDto engineDto) {
		this.engineDto = engineDto;
	}
	@Override
	public String toString() {
		return "CarDto [carId=" + carId + ", carName=" + carName + ", carModel=" + carModel + ", carPrice=" + carPrice
				+ ", carColour=" + carColour + ", engineDto=" + engineDto + "]";
	}
	
	
	
}

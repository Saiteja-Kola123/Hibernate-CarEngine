package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EngineDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engineid;
	private double engineHP;
	private double engineCC;
	private String engineType;
	public int getEngineid() {
		return engineid;
	}
	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}
	public double getEngineHP() {
		return engineHP;
	}
	public void setEngineHP(double engineHP) {
		this.engineHP = engineHP;
	}
	public double getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(double engineCC) {
		this.engineCC = engineCC;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "EngineDto [engineid=" + engineid + ", engineHP=" + engineHP + ", engineCC=" + engineCC + ", engineType="
				+ engineType + "]";
	}
	
	

}

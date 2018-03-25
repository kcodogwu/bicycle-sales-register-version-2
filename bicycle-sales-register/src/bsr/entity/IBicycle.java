package bsr.entity;

import java.io.Serializable;

public interface IBicycle extends Serializable {
	//public int getId();
	//public void setId(int id);
	public String getBrandName();
	public void setBrandName(String brandName);
	public String getModelName();
	public void setModelName(String modelName);
	public double getCost();
	public void setCost(double cost);
	public int getQuantityInStock();
	public void setQuantityInStock(int quantityInStock);
}

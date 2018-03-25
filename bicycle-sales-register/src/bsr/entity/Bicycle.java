package bsr.entity;

public class Bicycle implements IBicycle {
	//private int id = 0;
	private String brandName = "";
	private String modelName = "";
	private double cost = 0.0;
	private int quantityInStock = 0;
	
	public Bicycle() {
		super();
	}
	
	public Bicycle(String brandName, String modelName, double cost, int quantityInStock) {
		super();
		//this.id = id;
		this.brandName = brandName;
		this.modelName = modelName;
		this.cost = cost;
		this.quantityInStock = quantityInStock;
	}

//	@Override
//	public int getId() {
//		return this.id;
//	}
//
//	@Override
//	public void setId(int id) {
//		this.id = id;
//	}

	@Override
	public String getBrandName() {
		return this.brandName;
	}

	@Override
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String getModelName() {
		return this.modelName;
	}

	@Override
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int getQuantityInStock() {
		return this.quantityInStock;
	}

	@Override
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
}

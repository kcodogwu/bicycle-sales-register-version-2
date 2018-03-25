package bsr.entity;

public class Sale implements ISale {
	//private int saleOrderNumber = 0;
	private String customer = "";
	private String address = "";
	private String phoneNumber = "";
	private String bicycle1 = "";
	private String bicycle2 = "";
	private String bicycle3 = "";
	private int quantity1 = 0;
	private int quantity2 = 0;
	private int quantity3 = 0;
	private double totalCost = 0.0;
	private double amountPaid = 0.0;
	private double change = 0.0;
	
	public Sale() {
		super();
	}
	
//	@Override
//	public int getSaleOrderNumber() {
//		return this.saleOrderNumber;
//	}
//
//	@Override
//	public void setSaleOrderNumber(int saleOrderNumber) {
//		this.saleOrderNumber = saleOrderNumber;
//	}

	@Override
	public String getCustomer() {
		return this.customer;
	}

	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getBicycle1() {
		return this.bicycle1;
	}

	@Override
	public void setBicycle1(String bicycle1) {
		this.bicycle1 = bicycle1;
	}

	@Override
	public int getQuantity1() {
		return this.quantity1;
	}

	@Override
	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}

	@Override
	public String getBicycle2() {
		return this.bicycle2;
	}

	@Override
	public void setBicycle2(String bicycle2) {
		this.bicycle2 = bicycle2;
	}

	@Override
	public int getQuantity2() {
		return this.quantity2;
	}

	@Override
	public void setQuantity2(int quantity2) {
		this.quantity2 = quantity2;
	}

	@Override
	public String getBicycle3() {
		return this.bicycle3;
	}

	@Override
	public void setBicycle3(String bicycle3) {
		this.bicycle3 = bicycle3;
	}

	@Override
	public int getQuantity3() {
		return this.quantity3;
	}

	@Override
	public void setQuantity3(int quantity3) {
		this.quantity3 = quantity3;
	}

	@Override
	public double getTotalCost() {
		return this.totalCost;
	}

	@Override
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public double getAmountPaid() {
		return this.amountPaid;
	}

	@Override
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public double getChange() {
		return this.change;
	}

	@Override
	public void setChange(double change) {
		this.change = change;
	}
}

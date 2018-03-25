package bsr.entity;

import java.io.Serializable;

public interface ISale extends Serializable {
//	public int getSaleOrderNumber();
//	public void setSaleOrderNumber(int saleOrderNumber);
	public String getCustomer();
	public void setCustomer(String customer);
	public String getAddress();
	public void setAddress(String address);
	public String getPhoneNumber();
	public void setPhoneNumber(String phoneNumber);
	public String getBicycle1();
	public void setBicycle1(String bicycle1);
	public int getQuantity1();
	public void setQuantity1(int quantity1);
	public String getBicycle2();
	public void setBicycle2(String bicycle2);
	public int getQuantity2();
	public void setQuantity2(int quantity2);
	public String getBicycle3();
	public void setBicycle3(String bicycle3);
	public int getQuantity3();
	public void setQuantity3(int quantity3);
	public double getTotalCost();
	public void setTotalCost(double totalCost);
	public double getAmountPaid();
	public void setAmountPaid(double amountPaid);
	public double getChange();
	public void setChange(double change);
}

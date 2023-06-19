package vet_clinic;

import java.sql.Date;


public class sales {
	private int saleID;
	private Date saleDate;
	private int itemID;
	private int quantity;
	private float price;
	private String paymentMethod;
	
	public sales(int saleID,Date saleDate, int itemID,int quantity,float price,String paymentMethod) {
		this.saleID=saleID;
		this.saleDate=saleDate;
		this.quantity=quantity;
		this.price=price;
		this.paymentMethod=paymentMethod;
	}
	
	public int getSaleID(){
		return saleID;
	}	
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate=saleDate;
	}
	public int getItemID(){
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID=itemID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod=paymentMethod;
	}
}

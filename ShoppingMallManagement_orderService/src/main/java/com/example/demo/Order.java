package com.example.demo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblOrder")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int customerId;
	private int storeid;
	private Date orderDate;
	private double totalPrice;
	private String status;
	
	public Order() {
		
	}
	
	
	public Order(int id, int customerId, int storeid, Date orderDate, double totalPrice, String status)
	{
		super();
		this.id = id;
		this.customerId = customerId;
		this.storeid = storeid;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setOrderId(int orderId) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + id + ", customerId=" + customerId + ", storeid=" + storeid + ", orderDate="
				+ orderDate + ", totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
}

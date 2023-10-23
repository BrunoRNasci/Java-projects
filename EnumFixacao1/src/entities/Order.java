package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> ordersItems = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrders() {
		return ordersItems;
	}

	public void addItem(OrderItem orders) {
		ordersItems.add(orders);
	}
	
	public void removeItem(OrderItem orders) {
		ordersItems.remove(orders);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem c : ordersItems) {
			sum += c.subTotal();
		}
		return sum;
	}
}

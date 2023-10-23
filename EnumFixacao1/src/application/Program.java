package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (dd/MM/yyyy): ");
		Date clientBirthDate = sdf.parse(sc.next());

		Client client = new Client(clientName, clientEmail, clientBirthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order?: ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(),status , client);
		Product product = new Product();
		OrderItem orderItem = new OrderItem();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter order #" + i + " data: ");
			System.out.print("Product name: ");
			String orderName = sc.next();
			System.out.print("Product price: ");
			double orderPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int orderQuantity = sc.nextInt();

			product = new Product(orderName, orderPrice);

			orderItem = new OrderItem(orderQuantity, orderPrice, product);

			
			order.addItem(orderItem);

			

		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.print("Order moment: " + sdf.format(order.getMoment()) + "\n");
		System.out.print("Order Status: " + order.getStatus() + "\n");
		System.out.println(
				"Client: " + client.getName() + "(" + sdf.format(client.getBirthDate()) + ")" + " - " + client.getEmail());
		System.out.println("Order Items: ");
		System.out.println(product.getName() + ", " + "$" + product.getPrice() + ", Quantity: ,"
				+ orderItem.getQuantity() + " Subtotal: $" + orderItem.subTotal());
		System.out.print("Total price: $" + order.total());

		sc.close();

	}

}

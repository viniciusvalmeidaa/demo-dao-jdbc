package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		Seller seller = new Seller(21, "Carlos jose", "CCj@gmail.com", LocalDate.of(1985, 05, 22) , 5000.0, obj);
		System.out.println(seller);

	}

}

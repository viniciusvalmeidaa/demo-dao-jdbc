package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("=== TEST 1: seller findById ===  ");
//		
//		Seller seller = sellerDao.findById(3);
//		
//		System.out.println(seller);
//		
//		System.out.println("\n=== TEST 2: seller findByDepartment ===  ");
//		Department department =  new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for (Seller obj: list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TEST 3: seller findAll ===  ");
//		list = sellerDao.findAll();
//		for (Seller obj: list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TEST 4:Insert seller ===  ");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = "+ newSeller.getId());
//		
//		System.out.println("\n=== TEST 5:Update seller ===  ");
//		seller = sellerDao.findById(2);
//		seller.setName("Jack Black");
//		sellerDao.update(seller);
//		System.out.println("Update completed!");
//
//		System.out.println("\n=== TEST 6:Delete seller ===  ");
//		System.out.println("Entre com o id a ser deletado: ");
//		int id = sc.nextInt();
//		sellerDao.deletedById(id);
//		System.out.println("Delete completed!");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 7:department findById  ===  ");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		System.out.println("\n=== TEST 8: department findAll ===  ");
		
		List<Department> list = departmentDao.findAll();
		for(Department dep: list) {
			System.out.println(dep);
		}
		
//		System.out.println("\n=== TEST 10:Insert department ===  ");
//		Department dep = new Department(14, "CrazyStuff");
//		departmentDao.insert(dep);
//		System.out.println("Inserted! ");
		
		System.out.println("\n=== TEST 11:Update department ===  ");
		Department newDep = departmentDao.findById(13);
		newDep.setName("Supe Crazy");
		departmentDao.update(newDep);
		System.out.println("Updated");
		
		System.out.println("\n=== TEST 12:Delete department ===  ");
		departmentDao.deletedById(6);
		departmentDao.deletedById(7);
		departmentDao.deletedById(8);
		departmentDao.deletedById(9);
		departmentDao.deletedById(10);
		departmentDao.deletedById(11);
		departmentDao.deletedById(12);
		System.out.println("Deletions completed");





		

		
		
		sc.close();
	}

}

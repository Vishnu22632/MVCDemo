package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class TestProduct {

	public static void main(String[] args) {

		addBtn();
		getAll();
		delete();
		System.out.println("get all after delete");
		getAll();

	}

	static void addBtn() {

		ProductService ps = new ProductServiceImpl();
		char flag = 'y';
		Scanner scn = new Scanner(System.in);

		do {

			Product p = new Product();

			System.out.println("Enter product id :");
			p.setId(scn.nextInt());

			System.out.println("Enter product Name : ");
			p.setName(scn.next());

			System.out.println("Enter product company");
			p.setCompany(scn.next());

			System.out.println("Enter product price : ");
			p.setPrice(scn.nextInt());

			ps.addProduct(p);

			System.out.println("Do you want to add more[y/n] ");
			flag = scn.next().charAt(0);

		} while (flag == 'y');

	}

	static void getAll() {
		ProductService ps = new ProductServiceImpl();

		List<Product> list = ps.getAllProduct();

		System.out.println(list);
	}

	static void delete() {
		ProductService ps = new ProductServiceImpl();

		ps.deleteProduct(0);
	}

}

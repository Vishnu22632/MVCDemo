package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	static List<Product> pList = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		pList.add(product);
		System.out.println("************Added successful ************ Size  "+pList.size());

	}

	@Override
	public void deleteProduct(int index) {
		pList.remove(index);

	}

	@Override
	public List<Product> getAllProduct() {

		return pList;
	}

}

package com.web.AmazonLikeShopAnalytics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ser;
	//"localhost:8080/1.0/Products"
	@GetMapping("/1.0/Products")
	public List<Product_Jyothi> getProducts()
	{
		return ser.getAllProducts();
	}

}

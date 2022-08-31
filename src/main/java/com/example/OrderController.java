package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	PurchaseOrderDAO dao;
	@PostMapping("PurchaseOrder/insert")
	public PurchaseOrder insert(@RequestBody PurchaseOrder o) {
		return dao.insert(o);
		
	}
	
	@GetMapping("PurchaseOrder/getall")
	public List<PurchaseOrder> get(){
		return dao.getall(); 
	}
	

}

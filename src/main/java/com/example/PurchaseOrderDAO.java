package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PurchaseOrderDAO {
	@Autowired
	PurchaseOrderRepos repo; 
	
	public PurchaseOrder insert(PurchaseOrder o) {
		return repo.save(o);
	}
	
	public List<PurchaseOrder> getall(){
		return repo.findAll(); 
	}

}

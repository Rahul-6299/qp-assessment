package com.example.Grocery.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Grocery.Entity.GroceryEntity;
import com.example.Grocery.Repository.GroceryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service

public class GroceryService {
	@Autowired
	private GroceryRepository repo;
	
	public void save(GroceryEntity groent)
	{
		repo.save(groent);
	}
	
	public List<GroceryEntity>getall()
	{
		return repo.findAll();
	}
	
	public void deletebyid(Long id)
	{
		repo.deleteById(id);
	}
   public GroceryEntity getbyid(Long id) 
   {
	   return repo.findById(id).orElse(null);
   }
   
   public GroceryEntity update(Long id,String name)
   {
	   Optional<GroceryEntity>Groceryupdate=repo.findById(id);
	   if(Groceryupdate.isPresent())
	   {
		   GroceryEntity gro=Groceryupdate.get();
		   gro.setName(name);
		   return repo.save(gro);
	   }
	   else
	   {
		   throw new EntityNotFoundException("Entity with ID " + id + " not found.");
	   }
   }
}

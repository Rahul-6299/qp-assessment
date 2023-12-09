package com.example.Grocery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Grocery.Appconstants.GroceryAppconstants;
import com.example.Grocery.Entity.GroceryEntity;
import com.example.Grocery.Service.GroceryService;

@RestController
@RequestMapping(value=GroceryAppconstants.GROCERY_CONTROLLER)

public class GroceryController {
	@Autowired
	public GroceryService gro;
	
	@PostMapping(value=GroceryAppconstants.GROCERY_SAVE)
	
	public void save(@RequestBody GroceryEntity groent)
	{
		gro.save(groent);
	}
	@DeleteMapping(value=GroceryAppconstants.GROCERY_DELETEBYID)
	
	public void delete(@RequestBody Long id)
	{
		gro.deletebyid(id);
	}
	
	@PutMapping(value=GroceryAppconstants.GROCERY_GETBYID)
	public GroceryEntity getbyid(@PathVariable Long id)
	{
		return gro.getbyid(id);
	}
	@PutMapping(value=GroceryAppconstants.GROCERY_GET)
	public @ResponseBody List<GroceryEntity>getall()
	{
		return gro.getall();
	}
	@PatchMapping(value=GroceryAppconstants.GROCERY_UPDATED)
	public ResponseEntity<GroceryEntity>update(@PathVariable Long id,@RequestBody String name)
	{
		GroceryEntity en=gro.update(id, name);
		return ResponseEntity.ok(en);
	}
	
	
	
	
	
	
	
	
	
	
	
}

package com.example.Grocery.Entity;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import com.example.Grocery.Appconstants.GroceryAppconstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name=GroceryAppconstants.GROCERY_INFO)

public class GroceryEntity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
}

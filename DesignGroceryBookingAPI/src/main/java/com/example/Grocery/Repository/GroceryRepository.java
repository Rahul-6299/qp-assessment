package com.example.Grocery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Grocery.Entity.GroceryEntity;
@Repository

public interface GroceryRepository extends JpaRepository<GroceryEntity, Long> {

}

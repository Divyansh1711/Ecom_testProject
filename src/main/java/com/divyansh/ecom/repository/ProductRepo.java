package com.divyansh.ecom.repository;

import com.divyansh.ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
   public List<Product> findAllByCategory_Id(int id);
}

package com.divyansh.ecom.service;

import com.divyansh.ecom.model.Category;
import com.divyansh.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public void addCategory(Category category){

        categoryRepository.save(category);

    }
    public List<Category> getCategory(){return categoryRepository.findAll();}
    public void removeCategoryById(int id){categoryRepository.deleteById(id);}

   public Optional<Category> getCategoriesById(int id){return categoryRepository.findById(id); }

}

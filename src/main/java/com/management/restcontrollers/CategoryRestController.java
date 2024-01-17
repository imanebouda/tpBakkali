package com.management.restcontrollers;

import com.management.entities.Category;
import com.management.repositories.CategoryReposirotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class CategoryRestController {
    @Autowired
    CategoryReposirotory categoryReposirotory;
    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryReposirotory.findAll();
    }
    @GetMapping(value = "/categories/{id}")
    public Category getCatehoryById(@PathVariable("id") Long id){
        return categoryReposirotory.findById(id).get();
    }
}

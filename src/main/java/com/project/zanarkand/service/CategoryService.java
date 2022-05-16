package com.project.zanarkand.service;

import com.project.zanarkand.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryService categoryService;

    @Transactional
    public Category save(Category category) {
        return categoryService.save(category);
    }
}

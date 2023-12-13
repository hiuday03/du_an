package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.Category;
import com.da.du_an.democode.model.request.CategoryRequest;
import com.da.du_an.democode.repository.CategoryRepository;
import com.da.du_an.democode.service.CategoryMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryMovieServiceImpl implements CategoryMovieService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategory() {
        List<Category> getCategory=categoryRepository.findAll();
        return getCategory;
    }

    @Override
    public Category addCategory(CategoryRequest categoryRequest) {
        Category category=new Category();
        category.setName(categoryRequest.getName());
        category.setDesc(categoryRequest.getDesc());
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(String id,CategoryRequest categoryRequest) {
        Category category=categoryRepository.findById(id).get();
        category.setName(categoryRequest.getName());
        category.setDesc(categoryRequest.getDesc());
        return categoryRepository.save(category);
    }

}

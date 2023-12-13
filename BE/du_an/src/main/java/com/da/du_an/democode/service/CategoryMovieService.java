package com.da.du_an.democode.service;

import com.da.du_an.democode.enity.Category;
import com.da.du_an.democode.model.request.CategoryRequest;

import java.util.List;

public interface CategoryMovieService {
    List<Category> getCategory();

    Category addCategory(CategoryRequest categoryRequest);

    Category updateCategory(String id,CategoryRequest categoryRequest);
}

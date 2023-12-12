package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CategoryRepository.NAME)
public interface CategoryRepository extends JpaRepository<Category, String> {
    public static final String NAME = "BaseCategoryRepository";
}

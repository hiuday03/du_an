package com.da.du_an.democode.controller;

import com.da.du_an.democode.common.base.ResponseObject;
import com.da.du_an.democode.enity.Category;
import com.da.du_an.democode.infrastructure.exception.rest.RestApiException;
import com.da.du_an.democode.model.request.CategoryRequest;
import com.da.du_an.democode.service.CategoryMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/category")
public class CategoryMovieController {

    @Autowired
    private CategoryMovieService categoryMovieService;

    @GetMapping()
    public ResponseObject getCategory() {
        return new ResponseObject(categoryMovieService.getCategory());
    }

    @PostMapping("/add-category")
    public ResponseObject addCategory(@RequestBody CategoryRequest categoryRequest){
//        try {
//            Category category=categoryMovieService.addCategory(categoryRequest);
//            ResponseObject responseObject = new ResponseObject(category);
//            responseObject.setMessage("Thành công");
//            return responseObject;
//        } catch (RestApiException ex) {
//            ResponseObject responseObject = new ResponseObject(null);
//            responseObject.setMessage("Không thành công: " + ex.getMessage());
//            return responseObject;
//        }
        Category category=categoryMovieService.addCategory(categoryRequest);
        return new ResponseObject(category);
    }


    @PutMapping("/update-category")
    public ResponseObject updateCategory(@RequestParam("idCategory") String id,@RequestBody CategoryRequest categoryRequest){
        try {
            Category category=categoryMovieService.updateCategory(id,categoryRequest);
            ResponseObject responseObject = new ResponseObject(category);
            responseObject.setMessage("Thành công");
            return responseObject;
        } catch (RestApiException ex) {
            ResponseObject responseObject = new ResponseObject(null);
            responseObject.setMessage("Không thành công: " + ex.getMessage());
            return responseObject;
        }
    }

}

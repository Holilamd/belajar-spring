package belajarjava.belajarspring.rest;

import belajarjava.belajarspring.entity.Category;
import belajarjava.belajarspring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/master/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category posting(@RequestBody Category category){
        System.out.println(category.getName());
        return categoryService.saveData(category);
    }

}

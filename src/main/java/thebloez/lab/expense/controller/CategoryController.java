package thebloez.lab.expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import thebloez.lab.expense.model.Category;
import thebloez.lab.expense.service.CategoryService;

@RestController
@RequestMapping(value = "/category", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category saveCategory(@RequestBody ){

    }
}

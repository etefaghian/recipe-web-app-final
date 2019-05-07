package ir.etefaghian.springrecipeapp.controllers.restControllers;

import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.services.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api/categories" )
public class RestCategoryController {
    private CategoryService categoryService;

    public RestCategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category save(@RequestBody Category category)
    {
        return  categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id)
    {
        categoryService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id)
    {
        return  categoryService.findById(id);
    }

    @PutMapping
    public Category update(@RequestBody Category category)
    {
        return categoryService.update( category);
    }







}

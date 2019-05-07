package ir.etefaghian.springrecipeapp.services;

import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.repositories.CategoryRepository;
import ir.etefaghian.springrecipeapp.services.exceptions.TupleNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepository  categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }



    public List<Category> findAll()
    {
        return  categoryRepository.findAll();
    }


    public Category update(Category category)
    {
        categoryRepository.deleteById(category.getId());
        categoryRepository.save(category);
        return  category;
    }


    public Category findById(Long id)
    {
            Optional<Category> category = categoryRepository.findById(id);
            if(!category.isPresent()) throw  new TupleNotFoundException("Category by id :"+id+" not found");
            return  category.get();
    }


    public void deleteById(Long id)
    {
        categoryRepository.deleteById(id);
    }

    public Category save(Category category)
    {
        categoryRepository.save(category);
        return  category;
    }






}

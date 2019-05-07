package ir.etefaghian.springrecipeapp.services;


import ir.etefaghian.springrecipeapp.domain.Recipe;
import ir.etefaghian.springrecipeapp.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    public Iterable<Recipe> findAll()
    {
        return recipeRepository.findAll();
    }

    public Recipe update(Recipe recipe)
    {
        recipeRepository.deleteById(recipe.getId());
        recipeRepository.save(recipe);
        return recipe;
    }

    //work correctly
     public Recipe findById(Long id) { return recipeRepository.findById(id).get(); }

     public void deleteById(Long id)
     {
         recipeRepository.deleteById(id);
     }







}

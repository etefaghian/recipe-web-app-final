package ir.etefaghian.springrecipeapp.controllers;

import ir.etefaghian.springrecipeapp.repositories.RecipeRepository;
import ir.etefaghian.springrecipeapp.services.RecipeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Data
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired    private final RecipeService recipeService;

    @RequestMapping(method = RequestMethod.GET,value = {"show"})
    public String showRecipes(Model model)
    {
        model.addAttribute("recipes",recipeService.findAll());
        return "show-recipes/index";
    }
}

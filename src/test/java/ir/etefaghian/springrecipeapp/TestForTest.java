package ir.etefaghian.springrecipeapp;


import ir.etefaghian.springrecipeapp.controllers.RecipeController;
import ir.etefaghian.springrecipeapp.domain.Recipe;
import ir.etefaghian.springrecipeapp.services.RecipeService;
import org.junit.Test;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestForTest {

    @Mock
   private RecipeController recipeController;









    @Test
    public void test()
    {
        System.out.println("Hello test 1");
    //   recipeService = mock(RecipeService.class);
        System.out.println(recipeController.getRecipeService());
    }





}

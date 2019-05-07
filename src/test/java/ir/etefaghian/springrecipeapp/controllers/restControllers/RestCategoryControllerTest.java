package ir.etefaghian.springrecipeapp.controllers.restControllers;

import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.services.CategoryService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;

public class RestCategoryControllerTest {

    @Mock
    CategoryService  categoryService;

    @InjectMocks
    RestCategoryController categoryController;

    private MockMvc  mockMvc;





    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(categoryController)
                .build();
    }

    @Test
    public void findById() {
       // when(categoryService.findById(12L)).thenReturn(Category.builder().id(12L).description("cat1"));





    }
}
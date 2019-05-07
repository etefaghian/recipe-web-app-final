package ir.etefaghian.springrecipeapp.repositories;

import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;



@RepositoryRestResource

public interface   RecipeRepository extends JpaRepository<Recipe,Long> {


    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);
}

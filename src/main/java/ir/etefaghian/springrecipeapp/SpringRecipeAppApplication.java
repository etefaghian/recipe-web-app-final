package ir.etefaghian.springrecipeapp;

import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.domain.Recipe;
import ir.etefaghian.springrecipeapp.repositories.CategoryRepository;
import ir.etefaghian.springrecipeapp.repositories.RecipeRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ir.etefaghian.springrecipeapp.repositories"})
@EntityScan("ir.etefaghian.springrecipeapp.domain")


public class SpringRecipeAppApplication  {



    public static void main(String[] args) {
        SpringApplication.run(SpringRecipeAppApplication.class, args);



    }
}


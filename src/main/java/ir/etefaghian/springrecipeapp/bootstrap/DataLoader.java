package ir.etefaghian.springrecipeapp.bootstrap;

import ir.etefaghian.springrecipeapp.domain.Authority;
import ir.etefaghian.springrecipeapp.domain.Category;
import ir.etefaghian.springrecipeapp.domain.Recipe;
import ir.etefaghian.springrecipeapp.domain.User;
import ir.etefaghian.springrecipeapp.domain.test.Book;
import ir.etefaghian.springrecipeapp.domain.test.Hello;
import ir.etefaghian.springrecipeapp.repositories.*;
import org.bouncycastle.jce.ECKeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ir.etefaghian.springrecipeapp.domain.test.Publisher;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RecipeRepository  recipeRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BookRepository  bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hell...............................................................................-");
        recipeRepository.save(Recipe.builder().cookTime(12).directions("Mohammad").prepTime(5).serving(2).build());
        recipeRepository.save(Recipe.builder().cookTime(12).directions("Mohammad").prepTime(5).serving(2).build());
        recipeRepository.save(Recipe.builder().cookTime(12).directions("Mohammad").prepTime(5).serving(2).build());
        recipeRepository.save(Recipe.builder().cookTime(12).directions("Mohammad").prepTime(5).serving(2).build());



        Publisher publisher = Publisher.builder().pISBN("111-232-1021").pName("hut-publisher").pother("yo hooo fo").build();
        Hello  hello = Hello.builder().hello1("h1").hello2("h2").build();
        List<String> list = Arrays.asList("note1","note2","note3");



        bookRepository.save(Book.builder().publisher(publisher).note(list).build());
        bookRepository.save(Book.builder().publisher(publisher).note(list).build());

        bookRepository.save(Book.builder().publisher(publisher).note(list).build());

        Set<Recipe> set  = new HashSet<>();
        set.add(Recipe.builder().cookTime(12).directions("Mohammad").prepTime(5).serving(2).build());


        categoryRepository.save(Category.builder().description("hello").recipes(set).build());

        Authority a1 = Authority.builder().authority("ROlE_ADMIN").build();
        Authority a2 = Authority.builder().authority("ROLE_USER").build();


         Set<Authority> setA1 = new HashSet<>();
        setA1.add(a1);
        Set<Authority> setA2 = new HashSet<>();
        setA1.add(a2);


        User u1 = User.builder().password(passwordEncoder.encode("123456")).username("Ali123").firstName("ali").authorities(setA1).build();
        User u2 = User.builder().password(passwordEncoder.encode("123456")).username("Hasan123").firstName("hasan").authorities(setA2).build();
/*
        Set<User> setU1 = new HashSet<>();
        setU1.add(u1);
        Set<User> setU2 = new HashSet<>();
        setU1.add(u2);
        a1.setUsers(setU1);
        a2.setUsers(setU2);


*/



        userRepository.save(u1);
        userRepository.save(u2);
















    }
}

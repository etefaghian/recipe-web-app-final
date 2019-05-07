package ir.etefaghian.springrecipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Builder
@Entity
@Data
public class Recipe {

    private String description;
    private  Integer  prepTime;
    private Integer cookTime;
    private  Integer serving;
    private  String  source;
    private  String url;
    private  String directions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "recipe_id"),inverseJoinColumns = @JoinColumn(name = "category_id"), name = "recipe_category")
    private Set<Category> categories;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private  Notes notes;

    @Enumerated(value =  EnumType.STRING)
    private Difficulty difficulty;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


    public Recipe(String description, Integer prepTime, Integer cookTime, Integer serving, String source, String url, String directions, Set<Ingredient> ingredients, Set<Category> categories, Byte[] image, Notes notes, Difficulty difficulty, Long id) {
        this.description = description;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.serving = serving;
        this.source = source;
        this.url = url;
        this.directions = directions;
        this.ingredients = ingredients;
        this.categories = categories;
        this.image = image;
        this.notes = notes;
        this.difficulty = difficulty;
        this.id = id;
    }

    public Recipe() {
    }
}

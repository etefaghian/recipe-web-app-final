package ir.etefaghian.springrecipeapp.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private  String description;

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)

    private Set<Recipe> recipes;


}

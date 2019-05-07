package ir.etefaghian.springrecipeapp.domain;

import lombok.Data;
import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;

@Entity
@Data
public class Notes {
    @Lob
    private String recipeNotes;

   @OneToOne
   private Recipe recipe;

   @Id
   @GeneratedValue( strategy =  GenerationType.IDENTITY)
   private Long id;


}

package ir.etefaghian.springrecipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;





@Entity
@Data
public class Ingredient {

    @Lob
    private String description;

    @ManyToOne
    private Recipe recipe;

    private BigDecimal amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private  UnitOfMeasure uom;


}

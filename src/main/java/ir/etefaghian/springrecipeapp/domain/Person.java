package ir.etefaghian.springrecipeapp.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Person {

    @Id
    private String id ;

    public Person()
    {
        super();
    }





}

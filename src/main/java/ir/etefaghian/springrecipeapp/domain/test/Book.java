package ir.etefaghian.springrecipeapp.domain.test;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.util.List;


@Entity
@Builder
public class Book {
    @Id
    @SequenceGenerator(name = "hello", initialValue = 1000, sequenceName = "hello", allocationSize = 1)
    @GeneratedValue(generator = "hello")
    private Long id;

    private String book;

    @Embedded
    private Publisher publisher;

    @ElementCollection
    private List<String> note;


    public Book(Long id,String book, Publisher publisher,List list) {
        this.book = book;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Book() {
    }
}




package ir.etefaghian.springrecipeapp.repositories;


import ir.etefaghian.springrecipeapp.domain.test.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}

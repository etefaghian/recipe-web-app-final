package ir.etefaghian.springrecipeapp.repositories;

import ir.etefaghian.springrecipeapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource

public interface CategoryRepository extends JpaRepository<Category,Long>
{

    @Query("select distinct u from Category  as  u  where  ?1 = 1")
    public List<Category>  myMethod (Long id);

    @Override
    Optional<Category> findById(Long aLong);

    @Override
    @RestResource(exported = false)
    List<Category> findAllById(Iterable<Long> longs);
}

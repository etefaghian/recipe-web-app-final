package ir.etefaghian.springrecipeapp.repositories;

import ir.etefaghian.springrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure,Long> {
}

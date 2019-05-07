package ir.etefaghian.springrecipeapp.repositories;

import ir.etefaghian.springrecipeapp.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface AuthorityRepository extends JpaRepository<Authority,Long> {

}

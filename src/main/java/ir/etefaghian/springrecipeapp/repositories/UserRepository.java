package ir.etefaghian.springrecipeapp.repositories;


import ir.etefaghian.springrecipeapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface UserRepository  extends JpaRepository<User,Long> {
    public User findByUsername(String s);
}

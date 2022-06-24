package qiwi.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qiwi.springdata.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author getByName(String name);
}

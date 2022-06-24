package qiwi.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qiwi.springdata.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book getByTitle(String title);
}

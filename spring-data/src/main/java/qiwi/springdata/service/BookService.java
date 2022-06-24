package qiwi.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qiwi.springdata.entity.Book;
import qiwi.springdata.repository.BookRepository;

import java.util.Set;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book getByTitle(String title) {
        return bookRepository.getByTitle(title);
    }

    public Set<Book> getAll() {
        return Set.copyOf(bookRepository.findAll());
    }
}

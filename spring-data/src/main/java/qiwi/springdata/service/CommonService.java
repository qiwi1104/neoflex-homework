package qiwi.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qiwi.springdata.entity.Author;
import qiwi.springdata.entity.Book;

import java.util.Set;

@Service
public class CommonService {
    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;

    public Set<Book> getBooksByAuthorName(String name) {
        return authorService.getAuthorByName(name).getBooks();
    }

    public Book getBookInfoByTitle(String title) {
        return bookService.getByTitle(title);
    }

    public Set<Author> getAllAuthors() {
        return Set.copyOf(authorService.getAll());
    }

    public Set<Book> getAllBooks() {
        return Set.copyOf(bookService.getAll());
    }
}

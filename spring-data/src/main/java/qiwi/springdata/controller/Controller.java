package qiwi.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import qiwi.springdata.dto.BookDTO;
import qiwi.springdata.entity.Author;
import qiwi.springdata.entity.Book;
import qiwi.springdata.service.CommonService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class Controller {
    @Autowired
    private CommonService commonService;

    //    Получить список книг от конкретного автора.
    @GetMapping("/books/{name}")
    public ResponseEntity<Set<Book>> getBooksByAuthor(@PathVariable String name) {
        return ResponseEntity.ok(commonService.getBooksByAuthorName(name));
    }

    //    Получить полную информацию по конкретной книге, включая список авторов.
    @GetMapping("/books/info/{title}")
    public ResponseEntity<BookDTO> getBookInfoByTitle(@PathVariable String title) {
        return ResponseEntity.ok(new BookDTO(commonService.getBookInfoByTitle(title)));
    }

    //    Получить полный список книг.
    @GetMapping("/books")
    public ResponseEntity<Set<Book>> getAllBooks() {
        return ResponseEntity.ok(commonService.getAllBooks());
    }

    //    Получить общую стоимость всех книг конкретного автора
    @GetMapping("/authors/sum/{name}")
    public ResponseEntity<Double> getAllBooksPriceByAuthor(@PathVariable String name) {
        Set<Book> books = commonService.getBooksByAuthorName(name);
        List<Double> prices = books.stream()
                .map(Book::getPrice)
                .collect(Collectors.toList());

        return ResponseEntity.ok(prices.stream().reduce((double) 0, Double::sum));
    }

    //    Получить полный список авторов.
    @GetMapping("/authors")
    public ResponseEntity<Set<Author>> getAllAuthors() {
        return ResponseEntity.ok(commonService.getAllAuthors());
    }
}

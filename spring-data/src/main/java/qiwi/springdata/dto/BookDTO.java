package qiwi.springdata.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import qiwi.springdata.entity.Author;
import qiwi.springdata.entity.Book;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class BookDTO {
    private String title;
    private Double price;
    private Set<AuthorDTO> authors;

    public BookDTO(Book book) {
        title = book.getTitle();
        price = book.getPrice();
        authors = new HashSet<>();

        for (Author author : book.getAuthors()) {
            AuthorDTO authorDTO = new AuthorDTO(author);
            authors.add(authorDTO);
        }
    }
}

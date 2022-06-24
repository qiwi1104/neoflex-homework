package qiwi.springdata.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import qiwi.springdata.entity.Author;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private String name;

    public AuthorDTO(Author author) {
        name = author.getName();
    }
}

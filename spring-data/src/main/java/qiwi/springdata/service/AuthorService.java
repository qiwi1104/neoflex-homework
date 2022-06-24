package qiwi.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qiwi.springdata.entity.Author;
import qiwi.springdata.repository.AuthorRepository;

import java.util.Set;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorByName(String name) {
        return authorRepository.getByName(name);
    }

    public Set<Author> getAll() {
        return Set.copyOf(authorRepository.findAll());
    }
}

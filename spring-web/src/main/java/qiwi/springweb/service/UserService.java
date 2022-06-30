package qiwi.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qiwi.springweb.model.User;
import qiwi.springweb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public User getUserById(Long id) {
        return repository.getById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}

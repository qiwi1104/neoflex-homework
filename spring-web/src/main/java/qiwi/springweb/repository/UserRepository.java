package qiwi.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qiwi.springweb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

package spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String username);
}

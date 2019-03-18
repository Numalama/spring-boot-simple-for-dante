package fr.numalama.demo.repository.db1;

import fr.numalama.demo.entity.User;
import fr.numalama.demo.model.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DAO OF USR FOR DB1
 */
public interface UserDB1Repository extends JpaRepository<User, String> {
    // Find User by id
    User findUserById(Integer id);
    // Save user in DB
    User save(User u);
}

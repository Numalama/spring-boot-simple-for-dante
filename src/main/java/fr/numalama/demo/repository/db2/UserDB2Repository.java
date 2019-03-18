package fr.numalama.demo.repository.db2;

import fr.numalama.demo.entity.User;
import fr.numalama.demo.model.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DAO OF USR FOR DB2
 */
public interface UserDB2Repository extends JpaRepository<User, String> {
    // Find User by id
    User findUserById(Integer id);

    // Save user in DB
    User save(User u);
}

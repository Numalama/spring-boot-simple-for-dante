package fr.numalama.demo.service.User;

import fr.numalama.demo.entity.User;
import fr.numalama.demo.model.DTO.UserDTO;
import fr.numalama.demo.repository.db1.UserDB1Repository;
import fr.numalama.demo.repository.db2.UserDB2Repository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     *
     * Dependence injection
     */
    @Autowired
    private UserDB1Repository userDB1Repository;

    @Autowired
    private UserDB2Repository userDB2Repository;

    public UserDTO selectUser(int id){
        // 1 - CALL THE DAO for find a user by id
        User userDb1 = this.userDB1Repository.findUserById(id);
        User userDb2 = this.userDB2Repository.findUserById(id);

        // 2 - WE NEED TO MAP A USER INTO A USERDTO
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO1 = modelMapper.map(userDb1, UserDTO.class);

        UserDTO userDTO2 = modelMapper.map(userDb2, UserDTO.class);

        // 3 - RETURN THE userInDatabase (UserDAO)
        // JUST NEED TO RETURN 1 !
        return userDTO1;

    }

    public UserDTO insertUser(UserDTO newUser){

        // WE NEED TO MAP A USER INTO A USERDTO
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(newUser, User.class);

        // 1 - CALL THE DAO FOR SAVING THE USERDTO
        User userDb1 = this.userDB1Repository.save(user);
        User userDb2 = this.userDB2Repository.save(user);

        // 2 - RETURN THE userInDatabase (UserDAO)
        // WE NEED TO MAP A USER INTO A USERDTO
        ModelMapper modelMapper2 = new ModelMapper();
        UserDTO userDTO = modelMapper2.map(userDb1, UserDTO.class);

        return userDTO;
    }
}

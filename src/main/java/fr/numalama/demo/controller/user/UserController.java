package fr.numalama.demo.controller.user;

import fr.numalama.demo.model.DTO.UserDTO;
import fr.numalama.demo.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    /**
     *
     * Dependence injection
     */
    @Autowired
    private UserService userService;

    @GetMapping(value="/{id}", produces = "application/json")
    public UserDTO getUser(@PathVariable int id){
        // 1 - go into the service
        // 2 - return a User object
        return this.userService.selectUser(id);
    }


    @PostMapping(value="", produces = "application/json")
    public UserDTO createUser(@RequestBody UserDTO user){
        // 1 - go into the service
        // 2 -return the new user
        return this.userService.insertUser(user);
    }
}

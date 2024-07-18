package com.lazyengineer.lazylinkspringboot.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public Users getUser(@PathVariable int id) {
        // TODO: change to return exception when user is not found
        return usersService.getUser(id).orElse(new Users());
    }

    @PostMapping("")
    public void postUser(@RequestBody Users entity) {
        System.out.println("entity: " + entity.toString());
        usersService.postUser(entity);
    }

    @GetMapping("")
    public List<Users> getAll() {
        return usersService.getAll();
    }
}

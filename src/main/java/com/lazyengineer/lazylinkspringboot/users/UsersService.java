package com.lazyengineer.lazylinkspringboot.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void postUser(Users entity) {
        usersRepository.save(entity);
    }

    public Optional<Users> getUser(int id) {
        return usersRepository.findById(id);
    }

    public List<Users> getAll() {
        return usersRepository.findAll();
    }
    
}

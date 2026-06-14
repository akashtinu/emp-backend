package com.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repo;
    public List<User> getAll()    { return repo.findAll(); }
    public User save(User u)       { return repo.save(u); }
    public void delete(Long id)    { repo.deleteById(id); }
}

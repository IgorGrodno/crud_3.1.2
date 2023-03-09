package com.CRUD_312.CRUD_312.service;

import com.CRUD_312.CRUD_312.model.User;
import com.CRUD_312.CRUD_312.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUser(long id){
        return  userRepository.getOne(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void deleteUser(long id){
        userRepository.delete(getUser(id));
    }
    public void addUser(User user){
        userRepository.save(user);
    }

    public void editUser(User user){
        User userToEdit = getUser(user.getId());
        userToEdit.setName(user.getName());
        userToEdit.setLastName(user.getLastName());
        userToEdit.setEMail(user.getEMail());
        userRepository.save(userToEdit);
    }
}

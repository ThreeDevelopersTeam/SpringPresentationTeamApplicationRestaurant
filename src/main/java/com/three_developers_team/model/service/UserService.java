package com.three_developers_team.model.service;

import com.three_developers_team.model.entity.User;
import com.three_developers_team.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void updateUser(User user){
        User newUser = userRepository.getOne(user.getId());
        newUser.setName(user.getName());
        newUser.setNickname(user.getNickname());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);
    }

    public User findUserByNicknameAndPassword(String nickname, String password){
        return userRepository.findByNicknameAndPassword(nickname, password);
    }
}

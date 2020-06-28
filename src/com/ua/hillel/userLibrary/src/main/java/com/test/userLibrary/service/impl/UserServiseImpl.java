package com.test.userLibrary.service.impl;

import com.test.userLibrary.exeptions.UserNotFoundExeption;
import com.test.userLibrary.model.User;
import com.test.userLibrary.repository.UserRepository;
import com.test.userLibrary.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserServiseImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().filter(u -> !u.isDeleted()).collect(Collectors.toList());
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        User userUpd = Optional.ofNullable(userRepository.getOne(user.getId())).orElseThrow(UserNotFoundExeption::new);
        userUpd.setFirstName(user.getFirstName());
        userUpd.setLastName(user.getLastName());
        userRepository.save(userUpd);
    }

    @Override
    public boolean deleteUser(Long id) {
        User user = userRepository.getOne(Math.toIntExact(id));
        user.setDeleted(true);
        userRepository.save(user);
        return true;
    }
}

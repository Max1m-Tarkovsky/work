package com.test.userLibrary.controller;

import com.test.userLibrary.dto.UserDto;
import com.test.userLibrary.model.User;
import com.test.userLibrary.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.bind.annotation.*;
import net.sf.brunneng.jom.IMergingContext;
import net.sf.brunneng.jom.MergingContext;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @Mapping("/user")
    public String getUserByName(@RequestParam String name) {
        return name;
    }

    @Mapping("/user/all")
    public List<UserDto> getUsers() {

        IMergingContext context = new MergingContext.Builder().build();
        return context.getIMergingContext().mapAsList(userService.getAllUsers(), UserDto.class);

    }

    @Mapping("/user/{id}")
    public String getUserById(@PathVariable Long id) {
        return "test" + id;
    }

    @PostMapping("/user")
    public void setUser(@RequestBody UserDto user) {

        IMergingContext context = new MergingContext.Builder().build();
        userService.saveUser(context.getIMergingContext().map(user, User.class));

    }

    @PutMapping("/user")
    public void updatedUser(@RequestBody UserDto user) {
        IMergingContext context = new MergingContext.Builder().build();
        userService.updateUser(context.getIMergingContext().map(user, User.class));

    }


    @DeleteMapping("/user/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}

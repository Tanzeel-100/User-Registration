package com.userRegistration.service;

import com.userRegistration.repository.dao.UserDao;
import com.userRegistration.repository.dao.UserDaoImp;
import com.userRegistration.repository.entities.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Setter
public class UserService {
    @Autowired
    private UserDao userDaoImp;

    @PostConstruct
    public void init() {
        System.out.println("Initialised userService object");
    }

    public int registerUser(User user) {
        int res = userDaoImp.insertUser(user);
        System.out.println("user inserted");
        return res;
    }
}

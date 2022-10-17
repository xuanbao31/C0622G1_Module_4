package com.service;

import com.model.Login;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setAge(18);
        user1.setName("Bao");
        user1.setAccount("bao");
        user1.setEmail("bao@codegym.vn");
        user1.setPassword("123456");
        users.add(user1);

        User user2 = new User();
        user2.setAge(22);
        user2.setName("Huy Sacxo");
        user2.setAccount("huyden");
        user2.setEmail("huysacxo@gmail.com");
        user2.setPassword("123456");
        users.add(user2);

        User user3 = new User();
        user3.setAge(22);
        user3.setName("Minh Mực");
        user3.setAccount("minhmuc");
        user3.setEmail("HGHS@gmail.com");
        user3.setPassword("123456");
        users.add(user3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}

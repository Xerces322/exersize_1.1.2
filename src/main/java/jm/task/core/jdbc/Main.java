package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Nikita", "Prudnikov", (byte) 18);
        userService.saveUser("Rostislav", "Prokopenko", (byte) 19);
        userService.saveUser("Vakho", "Brooklyn", (byte) 45);
        userService.saveUser("Vladimir", "Putin", (byte) 71);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//
//        userService.saveUser("Nikita", "Prudnikov", (byte) 18);
//        userService.saveUser("Rostislav", "Prokopenko", (byte) 19);
//        userService.saveUser("Vakho", "Brooklyn", (byte) 45);
//        userService.saveUser("Vladimir", "Putin", (byte) 71);
//
//        for (User user : userService.getAllUsers()) {
//            System.out.println(user);
//        }
//
//        userService.cleanUsersTable();
//        userService.dropUsersTable();


        UserDaoHibernateImpl user = new UserDaoHibernateImpl();
        user.createUsersTable();
        user.saveUser("Nikita", "Prudnikov", (byte) 18);
        user.saveUser("Vladimir", "Putin", (byte) 71);
        List<User> list = user.getAllUsers();
        for (User u : list) {
            System.out.println(u);
        }
        user.removeUserById(2);
        list = user.getAllUsers();
        for (User u : list) {
            System.out.println(u);
        }
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}

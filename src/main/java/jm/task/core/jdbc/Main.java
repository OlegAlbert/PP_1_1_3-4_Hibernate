package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Oleg", "Albert", (byte) 22);
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Petya", "Petrov", (byte) 31);
        userService.saveUser("Name", "LastName", (byte) 38);

        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

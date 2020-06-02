package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("tuan");
        u1.setPassword("123456");
        u1.setEmail("Tuan@123.com");
        u1.setName("Tuấn");
        u1.setAge(18);
        users.add(u1);

        User u2 = new User();
        u2.setAccount("binh");
        u2.setPassword("123456");
        u2.setEmail("Binh@123.com");
        u2.setName("Bình");
        u2.setAge(17);
        users.add(u2);

        User u3 = new User();
        u3.setAccount("duc");
        u3.setPassword("123456");
        u3.setEmail("Duc@123.com");
        u3.setName("Đức");
        u3.setAge(19);
        users.add(u3);
    }

    public static User checkLogin (Login login){
        for (User u: users){
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

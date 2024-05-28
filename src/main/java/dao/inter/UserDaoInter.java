package dao.inter;

import bean.User;

import java.util.List;

public interface UserDaoInter {

    List <User> getAll();
    User getbyId (int UserId);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(int UserId);
}

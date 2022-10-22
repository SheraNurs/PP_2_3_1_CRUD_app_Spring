package CRUD_app.service;

import CRUD_app.model.User;

import java.util.List;

public interface UsersService {
    public List<User> getAllUsers();

    public void saveUsers(User user);

    public User getUsers(int id);

    public void deleteUsers(int id);

    public void updateUsers(User updateUser);

}

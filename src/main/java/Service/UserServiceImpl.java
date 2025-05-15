package Service;

import  com.example.demo.service.UserService;
import FakeRepo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
        long id = (long) Math.floor(Math.random() * 1000000);
        fakeRepo.insertUser(id, name, surname);
        return name + " added";
    }

    @Override
    public String removeUser(long id) {
        String name = fakeRepo.deleteUser(id);
        return name + " removed";
    }

    @Override
    public String getUser(long id) {
        String user = fakeRepo.findUserById(id);
        return "hello " + user;
    }
}
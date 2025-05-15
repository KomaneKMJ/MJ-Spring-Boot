package FakeRepo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

public class FakeRepo implements FakeRepoInterface {
    private User[] users = new User[10];
    private int size = 0;

    @Override
    public String insertUser(long id, String name, String surname) {
        if (size >= users.length) {
            // Simple array expansion for demonstration
            User[] newArray = new User[users.length * 2];
            System.arraycopy(users, 0, newArray, 0, users.length);
            users = newArray;
        }

        User newUser = new User(id, name, surname);
        users[size++] = newUser;
        return name;
    }

    @Override
    public String findUserById(long id) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId() == id) {
                return users[i].getName() + " " + users[i].getSurname();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long id) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId() == id) {
                String name = users[i].getName();
                // Shift remaining elements
                System.arraycopy(users, i + 1, users, i, size - i - 1);
                size--;
                return name;
            }
        }
        return null;
    }
}
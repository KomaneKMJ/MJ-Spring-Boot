package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTests {

    @Mock
    private FakeRepo fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        // Arrange
        String name = "John";
        String surname = "Doe";
        long expectedId = 12345L;

        when(fakeRepo.insertUser(anyLong(), eq(name), eq(surname)))
                .thenReturn(name);

        // Act
        String result = userService.addUser(name, surname);

        // Assert
        assertEquals(name + " added", result);
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq(name), eq(surname));
    }

    @Test
    void testRemoveUser() {
        // Arrange
        long userId = 1L;
        String expectedName = "John";

        when(fakeRepo.deleteUser(userId))
                .thenReturn(expectedName);

        // Act
        String result = userService.removeUser(userId);

        // Assert
        assertEquals(expectedName + " removed", result);
        verify(fakeRepo, times(1)).deleteUser(userId);
    }

    @Test
    void testGetUser() {
        // Arrange
        long userId = 1L;
        String expectedUser = "John Doe";

        when(fakeRepo.findUserById(userId))
                .thenReturn(expectedUser);

        // Act
        String result = userService.getUser(userId);

        // Assert
        assertEquals("hello " + expectedUser, result);
        verify(fakeRepo, times(1)).findUserById(userId);
    }
}
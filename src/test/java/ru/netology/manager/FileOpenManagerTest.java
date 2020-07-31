package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    public void setUp(){
        manager.registerNewApp(".html", "App1");
        manager.registerNewApp(".jpg", "App2");
        manager.registerNewApp(".mov", "App3");
        manager.registerNewApp(".txt", "App4");
        manager.registerNewApp(".mp4", "App3");
    }

    @Test
    void shouldGetNameOfApp(){
        assertEquals("App2" , manager.getNameOfApp(".jpg"));
    }

    @Test
    void shouldDeleteApp(){
        manager.deleteApp(".JPG");
        assertArrayEquals(Arrays.asList( "App4", "App3", "App1").toArray(), manager.findAllApps().toArray());

    }

    @Test
    void shouldFindAllExtensions(){
        assertArrayEquals(Arrays.asList(".html", ".mov", ".txt", ".jpg", ".mp4").toArray(), manager.findAllExtensions().toArray());
    }

    @Test
    void shouldFindAllApps() {
        Set<String> expected = new HashSet<>(Arrays.asList("App1", "App2", "App3", "App4"));
        Set<String> actual = manager.findAllApps();
        assertEquals(expected, actual);
    }
}


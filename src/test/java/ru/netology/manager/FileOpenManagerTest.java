package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
    }

    @Test
    void shouldGetNameApp(){
        assertEquals("App2" , manager.getNameOfApp(".jpg"));
    }

    @Test
    void shouldDeleteApp(){
        manager.deleteApp(".JPG");
        assertArrayEquals(Arrays.asList( "App1", "App3", "App4").toArray(), manager.findAllApps().toArray());

    }

    @Test
    void shouldFindAllApp(){
        assertArrayEquals(Arrays.asList("App1", "App2", "App3", "App4").toArray(), manager.findAllApps().toArray());
    }

    @Test
    void shouldShowAllExtensions(){
        assertArrayEquals(Arrays.asList(".html", ".mov", ".txt", ".jpg").toArray(), manager.findAllExtensions().toArray());

    }

}

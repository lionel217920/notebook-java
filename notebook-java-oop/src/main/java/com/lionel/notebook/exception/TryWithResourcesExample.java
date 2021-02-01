package com.lionel.notebook.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryWithResourcesExample {

    public static void main(String[] args) {

    }

    public static void useResources() throws Exception {
        try (AutoCloseable r = new FileInputStream("hello")) {
            // 使用资源
        }
    }
}

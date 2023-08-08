package org.example.HW3New;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FileManager {
    public static String  readFile (String path) throws FileNotFoundException {
        String text = null;
        if (!Files.exists(Paths.get(path)))
            throw new FileNotFoundException("Файл по указанному пути не найден");
        try {
            text = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return text;
    }

    public static void writeInFile (String path, String text) throws IOException {
        if (!Files.exists(Paths.get(path)))
            createFile(path);
        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createFile (String path) {
        if (!Files.exists(Paths.get(path))) {
            try {
                Files.createFile(Paths.get(path));
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void copyFile (String source, String destination) throws FileNotFoundException {
        if (!Files.exists(Paths.get(source)))
            throw new FileNotFoundException("Файл по указанному пути не найден");
        try {
            Files.copy(Paths.get(source), Paths.get(destination));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

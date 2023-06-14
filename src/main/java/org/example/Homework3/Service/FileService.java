package org.example.Homework3.Service;

import org.example.Homework3.View.ExceptionsDescription;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class FileService {
    ExceptionsDescription exDesc = new ExceptionsDescription();
    private final String directoryPath =
            "D:\\Personal documents\\Education\\=Projects\\Exeptions_Intro\\src\\main\\java\\org\\example\\Homework3\\";

    public void addEntry(Path path, String text) {
        try {
            Files.write(path, (text + "\n").getBytes(), StandardOpenOption.APPEND);
        }
        catch (FileNotFoundException e) {
            System.out.println(exDesc.FileNotFoundDescription());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fillFile (String fileName, String text) {
        Path absolutePath = Path.of(directoryPath + fileName + ".txt");
        if (!Files.exists(absolutePath)) {
            try {
                Files.createFile(absolutePath);
            }
            catch (FileAlreadyExistsException e) {
                System.out.println(exDesc.FileAlreadyExistsDescription());
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        addEntry(absolutePath, text);
    }
}

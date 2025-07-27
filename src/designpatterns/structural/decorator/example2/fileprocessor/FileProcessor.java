package designpatterns.structural.decorator.example2.fileprocessor;

import java.nio.file.Path;

/*
 * This is the base interface or abstract class that defines the common
 * operations for both the concrete component and decorators.
 */
public interface FileProcessor {
    void save(Path filePath);

}

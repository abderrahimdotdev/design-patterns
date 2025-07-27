package dev.abderrahim.designpatterns.structural.decorator.example2.fileprocessor;

import java.nio.file.Path;

/*
 * This is the component and the base object that we will be decorating. It implements the common
 * interface FileProcessor and provides the actual functionality.
 */
public class BasicFileProcessor implements FileProcessor {

    @Override
    public void save(Path filePath) {
        System.out.println("Saving file " + filePath.getFileName());
    }

}

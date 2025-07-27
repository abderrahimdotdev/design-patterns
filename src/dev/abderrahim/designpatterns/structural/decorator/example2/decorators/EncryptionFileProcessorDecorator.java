package dev.abderrahim.designpatterns.structural.decorator.example2.decorators;

import java.nio.file.Path;

import dev.abderrahim.designpatterns.structural.decorator.example2.fileprocessor.FileProcessor;

/*
 * This is a concrete decorator that adds additional behavior or
 * responsibilities to the base component (BasicFileProcessor) by overriding the
 * base FileProcessor's methods.
 */
public class EncryptionFileProcessorDecorator extends FileProcessorDecorator {
    
    public EncryptionFileProcessorDecorator(FileProcessor fileProcessor) {
        super(fileProcessor);
    }

    @Override
    public void save(Path filePath) {
        System.out.println("Encrypting file: " + filePath.getFileName() + "...");
        super.save(filePath);
    }
}

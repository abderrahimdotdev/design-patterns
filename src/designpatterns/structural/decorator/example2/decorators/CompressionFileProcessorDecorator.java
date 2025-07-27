package designpatterns.structural.decorator.example2.decorators;

import java.nio.file.Path;

import designpatterns.structural.decorator.example2.fileprocessor.FileProcessor;

/*
 * This is a concrete decorator that adds additional behavior or
 * responsibilities to the base component (BasicFileProcessor) by overriding the
 * base FileProcessor's methods.
 */
public class CompressionFileProcessorDecorator extends FileProcessorDecorator {
   
    public CompressionFileProcessorDecorator(FileProcessor fileProcessor) {
        super(fileProcessor);
    }

    @Override
    public void save(Path filePath) {
        System.out.println("Compressing file: " + filePath.getFileName() + "...");
        super.save(filePath);
    }
}

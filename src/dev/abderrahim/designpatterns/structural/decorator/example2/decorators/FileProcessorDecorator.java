package dev.abderrahim.designpatterns.structural.decorator.example2.decorators;

import java.nio.file.Path;

import dev.abderrahim.designpatterns.structural.decorator.example2.fileprocessor.FileProcessor;

/*
 * This is an abstract class or interface that extends or implements the same
 * interface as the component BasicFileProcessor. It has a reference to a
 * BasicFileProcessor component and delegates calls to it.
 */
public abstract class FileProcessorDecorator implements FileProcessor {

    private FileProcessor decoratedFileProcessor;

    protected FileProcessorDecorator(FileProcessor fileProcessor) {
        this.decoratedFileProcessor = fileProcessor;
    }

    public void save(Path filePath) {
        decoratedFileProcessor.save(filePath);
    }
}

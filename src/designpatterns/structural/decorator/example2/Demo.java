package designpatterns.structural.decorator.example2;

import java.nio.file.Path;

import designpatterns.structural.decorator.example2.decorators.CompressionFileProcessorDecorator;
import designpatterns.structural.decorator.example2.decorators.EncryptionFileProcessorDecorator;
import designpatterns.structural.decorator.example2.fileprocessor.BasicFileProcessor;
import designpatterns.structural.decorator.example2.fileprocessor.FileProcessor;

public class Demo {
    public static void main(String[] args) {

        /*
         *************
         * Decorator *
         *************
         *
         * The Decorator Design Pattern is a structural pattern that allows you to add
         * new behavior to an object dynamically, without altering its structure. It is
         * a flexible alternative to subclassing, letting you "decorate" an object with
         * additional functionality.
         */

        final Path filePath = Path.of("document.txt");

        // Basic File Processor

        FileProcessor fileProcessor = new BasicFileProcessor();
        fileProcessor.save(filePath);

        // Add Compression

        fileProcessor = new CompressionFileProcessorDecorator(fileProcessor);
        fileProcessor.save(filePath);

        // Add Encryption
        fileProcessor = new EncryptionFileProcessorDecorator(fileProcessor);
        fileProcessor.save(filePath);
    }
}

package designpatterns.behavioral.observer;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LocalFileSystem implements FileSystem {

     private List<FileObserver> observers;
    
    public LocalFileSystem() {
        observers = new ArrayList<>();
    }

    public void registerObserver(FileObserver o) {
        observers.add(o);
    }

    public void deregisterObserver(FileObserver o) {
        observers.remove(o);
    }

    public void notifyObservers(Path filePath, FileOperation operation) {
        for (FileObserver observer : observers) {
            observer.update(filePath, operation);
        }
    }

    // Methods to simulate file system changes
    public void createFile(Path filePath) {
        System.out.println("File Created: " + filePath.getFileName());
        notifyObservers(filePath, FileOperation.CREATE);
    }

    public void modifyFile(Path filePath) {
        System.out.println("File Modified: " + filePath.getFileName());
        notifyObservers(filePath, FileOperation.MODIFY);
    }

    public void deleteFile(Path filePath) {
        System.out.println("File Deleted: " + filePath.getFileName());
        notifyObservers(filePath, FileOperation.DELETE);
    }

}

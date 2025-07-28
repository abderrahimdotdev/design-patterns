package designpatterns.behavioral.observer;

import java.nio.file.Path;

public interface FileSystem {

    enum FileOperation {
        CREATE, DELETE, MODIFY
    }

    void registerObserver(FileObserver stockObserver);

    void deregisterObserver(FileObserver stockObserver);

    void notifyObservers(Path filePath, FileOperation operation);
}

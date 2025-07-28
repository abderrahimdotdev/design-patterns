package designpatterns.behavioral.observer;

import java.nio.file.Path;

import designpatterns.behavioral.observer.FileSystem.FileOperation;

public interface FileObserver {
    void update(Path filePath, FileOperation operation);
}

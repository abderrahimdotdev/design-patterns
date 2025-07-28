package designpatterns.behavioral.observer;

import java.nio.file.Path;

import designpatterns.behavioral.observer.FileSystem.FileOperation;

class Antivirus implements FileObserver {
    @Override
    public void update(Path filePath, FileOperation operation) {
        if (operation == FileOperation.CREATE || operation == FileOperation.MODIFY) {
            System.out.println("Antivirus: Scanning the file " + filePath.getFileName() + " for threats.");
        }
    }
}

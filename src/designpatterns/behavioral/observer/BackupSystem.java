package designpatterns.behavioral.observer;

import java.nio.file.Path;

import designpatterns.behavioral.observer.FileSystem.FileOperation;

class BackupSystem implements FileObserver {
    @Override
    public void update(Path filePath, FileOperation operation) {
        if (operation == FileOperation.CREATE) {
            System.out.println("Backup System: Backing up the file " + filePath.getFileName() + ".");
        } else if (operation == FileOperation.MODIFY) {
            System.out.println("Backup System: Backing up the new version of the file " + filePath.getFileName() + ".");
        }
    }
}

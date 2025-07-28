package designpatterns.behavioral.observer;

import java.nio.file.Path;

import designpatterns.behavioral.observer.FileSystem.FileOperation;

class CloudSyncService implements FileObserver {
    @Override
    public void update(Path filePath, FileOperation operation) {
        if (operation == FileOperation.CREATE || operation == FileOperation.MODIFY) {
            System.out.println("Cloud Sync: Uploading file " + filePath.getFileName() + " to the cloud.");
        }
    }
}

package designpatterns.behavioral.observer;

import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) {

        /*
         ************
         * Observer *
         ************
         *
         * The Observer Design Pattern is a behavioral design pattern used to establish
         * a one-to-many relationship between objects, where one object (the subject)
         * maintains a list of dependents (observers) and notifies them automatically of
         * state changes. It’s useful for event handling, data updates, or when multiple
         * objects need to react to changes in one object.
         */

        // Create a file system (subject)
        LocalFileSystem fileSystem = new LocalFileSystem();

        // Create observers (antivirus, backup system, cloud sync)
        Antivirus antivirus = new Antivirus();
        BackupSystem backupSystem = new BackupSystem();
        CloudSyncService cloudSyncService = new CloudSyncService();

        // Register observers
        fileSystem.registerObserver(antivirus);
        fileSystem.registerObserver(backupSystem);
        fileSystem.registerObserver(cloudSyncService);

        // Simulate file system changes
        System.out.println("---- File Operations ----");

        Path myDocumentFile = Path.of("document.txt");

        // Simulate file creation
        fileSystem.createFile(myDocumentFile);

        // Simulate file modification
        fileSystem.modifyFile(myDocumentFile);

        // Simulate file deletion
        fileSystem.deleteFile(myDocumentFile);
    }
}

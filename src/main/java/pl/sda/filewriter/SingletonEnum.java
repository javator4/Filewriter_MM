package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public enum SingletonEnum {             //singleton na enumach nie potrzebuje synchronizacji

    INSTANCE;

    public synchronized void write(String text, String file) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File(file), true);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton(){

    }

    public synchronized static FileWriterSingleton getInstance(){ //po dodaniu synchronized singleton zachowuje 1 instancje w aplikacji wielowatkowej
        if (instance == null){
            System.out.println("jestem w if");
            instance = new FileWriterSingleton();
        }
        return instance;
    }

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

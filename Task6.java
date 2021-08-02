package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.
        FileSystemAlreadyExistsException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        List<XmlReader> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            XmlReader xmlR = new XmlReader();
            list.add(xmlR);
        }
        try {
            grab(list);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
    }

    static void grab(List<XmlReader> xml) throws FileNotFoundException {
        for (XmlReader reader : xml) {
            try {
                reader.read();
            } catch (FileSystemAlreadyExistsException ex) {
                throw new FileNotFoundException();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}

class XmlReader {
    private static final Random rnd = new Random();

    public void read() throws IOException {
        switch (rnd.nextInt(3)) {
            case 1:
                throw new
                        NullPointerException();
            case 2:
                throw new Error();
            case 3:
                throw new
                        FileNotFoundException();
            default:
                throw new
                        FileSystemAlreadyExistsException();
        }
    }
}
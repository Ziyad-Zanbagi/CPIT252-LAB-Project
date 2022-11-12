package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    private PrintWriter printWriter;

    private Logger() {
        try {
            printWriter = new PrintWriter(new FileWriter("log.txt", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null)
            return instance = new Logger();
        else
            return instance;
    }

    public void write(String str) {
        printWriter.write("\tDate :\t\t" + new Date());
        printWriter.println("\t" + str);
        printWriter.println("-----------------------------------------------------");
    }
}

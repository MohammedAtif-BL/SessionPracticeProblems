package org.example;

import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThreadExmaple {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread numberThread = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printNumbers();
            }
        });

        Thread letterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printLetters();
            }
        });

        numberThread.start();
        letterThread.start();

        // Sleep for some time to allow threads to print some output
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt both threads
//        numberThread.interrupt();
        letterThread.interrupt();
    }
}

class Printer {
    private final Object lock = new Object();
    private boolean isNumberTurn = true;

    public void printNumbers() {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                while (!isNumberTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Number thread interrupted");
                        return;
                    }
                }
                System.out.print(i + " ");
                isNumberTurn = false;
                lock.notifyAll();
            }
        }
    }

    public void printLetters() {
        synchronized (lock) {
            for (char c = 'a'; c <= 'z'; c++) {
                while (isNumberTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Letter thread interrupted");
                        return;
                    }
                }
                System.out.print(c + " ");
                isNumberTurn = true;
                lock.notifyAll();
            }
        }
    }
}

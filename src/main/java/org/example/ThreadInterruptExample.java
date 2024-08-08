//package org.example;
//
//public class ThreadInterruptExample {
//
//    public static void main(String[] args) {
//        Printer printer = new Printer();
//
//        Thread numberThread = new Thread(new NumberPrinter(printer));
//        Thread letterThread = new Thread(new LetterPrinter(printer));
//
//        numberThread.start();
//        letterThread.start();
//    }
//}
//
//class Printer {
//    private boolean isNumberTurn = true;
//
//    public synchronized void printNumbers() {
//        for (int i = 1; i <= 25; i++) {
//            while (!isNumberTurn) {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//            System.out.print(i + " ");
//            isNumberTurn = false;
//            notify();
//        }
//    }
//
//    public synchronized void printLetters() {
//        for (char c = 'a'; c <= 'z'; c++) {
//            while (isNumberTurn) {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//            System.out.print(c + " ");
//            isNumberTurn = true;
//            notify();
//        }
//    }
//}
//
//class NumberPrinter implements Runnable {
//    private final Printer printer;
//
//    public NumberPrinter(Printer printer) {
//        this.printer = printer;
//    }
//
//    @Override
//    public void run() {
//        printer.printNumbers();
//    }
//}
//
//class LetterPrinter implements Runnable {
//    private final Printer printer;
//
//    public LetterPrinter(Printer printer) {
//        this.printer = printer;
//    }
//
//    @Override
//    public void run() {
//        printer.printLetters();
//    }
//}
//

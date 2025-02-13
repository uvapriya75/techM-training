package org.example.multithreading;

public class UTask1ThreadOne extends Thread {

    public void run(){
        System.out.println("From ThreadOne!");
        System.out.println("From ThreadOne!");
        System.out.println("From ThreadOne!");
        System.out.println(10/0);
    }
}

class Test {
    public static void main(String[] args){
        UTask1ThreadOne l1= new UTask1ThreadOne();
       // l1.start();
        l1.run();

        System.out.println(10/0);
    }
}


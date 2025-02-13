package org.example.multithreading;

public class UTask1ThreadTwo extends Thread {
    public void run(){
        System.out.println("From ThreadTwo!");
        System.out.println("From ThreadTwo!");
        System.out.println(10/0);
    }
}

class test {
    public static void main(String[] args){
        UTask1ThreadTwo t2=new UTask1ThreadTwo();
        t2.start();
        t2.start();
        //t2.run();
    }
}


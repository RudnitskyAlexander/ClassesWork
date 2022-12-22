package Lesson41_MullThead;

import java.util.concurrent.Semaphore;

public class MySemaphore implements Runnable {
    Semaphore sem = new Semaphore(5);
    int counter;

    public MySemaphore(int c) {
        this.counter = c;
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println();


        }


    }

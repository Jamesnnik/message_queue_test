package com.james.message_queue_test.chapter1.workqueues;

public class Worker {
    public void doWork(String task) throws InterruptedException {
        for(char ch : task.toCharArray()){
            if(ch == '.'){
                Thread.sleep(1000);
            }
        }
    }
}

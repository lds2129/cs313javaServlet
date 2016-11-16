/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James Kim
 */
public class ThreadTest implements Runnable {
    private int start;
    private String name;
    public ThreadTest(String name, int start){
        this.start = start;
        this.name = name;
    }
    public void run() {
        for (int i = start; i < 100; i += 2)
        {
        try {
            System.out.println(name + ": " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
         }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Runnable run1 = new ThreadTest("Even", 0);
        Thread even = new Thread(run1);
        even.start();
        
         Runnable run2 = new ThreadTest("Odd", 1);
        Thread odd = new Thread(run2);
        odd.start();
        
        RunningMessageThread run3 = new RunningMessageThread();
        Thread test = new Thread(run3);
        test.start();
        
        

        try {
            odd.join();
            even.join();
        }catch (InterruptedException e) {
        }
            run3.shutDown();
            
            System.out.println("All finished!");
        }
    
}

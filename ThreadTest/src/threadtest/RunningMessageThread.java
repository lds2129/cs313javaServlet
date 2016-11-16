/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author James Kim
 */

public class RunningMessageThread implements Runnable {
    
    
    RunningMessageThread(){
        this.isRun  = true;
    }
    
    private boolean isRun;
@Override    
public void run() {
    while(this.isRun) {
        System.out.println("It's Running!");
        try {
            Thread.sleep(1000);
            
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    
   
    }

    public void shutDown() {
        this.isRun = false;
    };
}
    


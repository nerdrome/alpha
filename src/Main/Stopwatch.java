/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author larik
 */
public class Stopwatch {
    private long startTime;
    private long endTime;
    
    /**
     * Default constructor sets the start time
     */
    public Stopwatch(){
        startTime = System.nanoTime();
    }
    
    /**
     * sets the start time to the current time
     */
    public void start(){
        startTime = System.nanoTime();
    }
    
    /**
     * sets the end time to the current time 
     */
    public void stop(){
        endTime = System.nanoTime();
    }
    
    /**
     * Calculates the elapsed time.
     * @return   elapsed time
     */
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
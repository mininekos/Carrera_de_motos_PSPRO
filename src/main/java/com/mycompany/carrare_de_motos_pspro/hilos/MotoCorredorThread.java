/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrare_de_motos_pspro.hilos;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author Dam
 */
public class MotoCorredorThread extends Thread{

    Random rnd;
    String name;
    JProgressBar barra;
    int vuelta;
    public MotoCorredorThread(String name,JProgressBar barra) {
        
        this.name=name;
        this.barra=barra;
        rnd=new Random();
        vuelta=0;
    }

    @Override
    public void run() {
        
        try{
            while(vuelta<barra.getMaximum()){
            
                vuelta+=1;
                barra.setValue(vuelta);
                sleep(rnd.nextInt(100,1000));
            }
                
                
        }
        catch(Exception e){
        }
    }
    
    
}

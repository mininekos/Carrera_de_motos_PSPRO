/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrare_de_motos_pspro.hilos;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Dam
 */
public class MotoCorredorThread extends Thread{

    Random rnd;
    String name;
    JProgressBar barra;
    JLabel lbl;
    int vuelta;
    int avance;
    private final int MAXVUELTA=5;
    public MotoCorredorThread(String name,JProgressBar barra, JLabel lbl) {
        
        this.name=name;
        this.barra=barra;
        rnd=new Random();
        vuelta=0;
        this.lbl=lbl;
        lbl.setText(vuelta+"/"+MAXVUELTA);
    }

    @Override
    public void run() {
        
        try{
            while(vuelta<MAXVUELTA){
                
                avance+=rnd.nextInt(1,3);
                barra.setValue(avance);
                if(barra.getValue()==100){
                    barra.setValue(0);
                    avance=0;
                    vuelta++;
                    lbl.setText(vuelta+"/"+MAXVUELTA);
                }  
                sleep(rnd.nextInt(10,100));
            }
                
              
        }
        catch(Exception e){
        }
    }
    
    
}

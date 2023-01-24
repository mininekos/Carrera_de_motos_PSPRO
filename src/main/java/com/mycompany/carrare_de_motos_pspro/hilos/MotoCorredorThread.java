/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrare_de_motos_pspro.hilos;

import com.mycompany.carrare_de_motos_pspro.pojos.Corredor;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Dam
 */
public class MotoCorredorThread extends Thread{

    Random rnd;
    private Corredor corredor;
    JProgressBar barra;
    JLabel lbl;
    int vuelta;
    int avance;
    private final int MAXVUELTA=5;
    private boolean stop;
    private ArrayList<Corredor> corredores;
    public MotoCorredorThread(Corredor corredor,JProgressBar barra, JLabel lbl,ArrayList<Corredor> corredores ) {
        
        this.corredor=corredor;
        this.barra=barra;
        rnd=new Random();
        vuelta=0;
        this.lbl=lbl;
        lbl.setText(vuelta+"/"+MAXVUELTA);
        stop=false;
        this.corredores=corredores;
    }

    public void pausar(){
        stop=true;
    }
    
    public synchronized void reanudar(){
        stop=false;
        notify();
    }
    
    @Override
    public synchronized void run() {
        
        try{
            while(vuelta<MAXVUELTA){
                if(stop==false){  
                    avance+=rnd.nextInt(1,5);
                    barra.setValue(avance);
                    if(barra.getValue()==100){
                        barra.setValue(0);
                        avance=0;
                        vuelta++;
                        lbl.setText(vuelta+"/"+MAXVUELTA);
                    }  
                    sleep(50);
                }
                else{
                    wait();
                }
            }
               barra.setValue(100);
               corredores.add(corredor);
              
        }
        catch(Exception e){
        }
    }
    
    
}

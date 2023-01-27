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
    private final int MAXVUELTA=5,CAIDA=1;
    private boolean caido;
    private boolean stop;
    private static ArrayList<Corredor> corredores;
    public MotoCorredorThread(Corredor corredor,JProgressBar barra, JLabel lbl,ArrayList<Corredor> corredores ) {
        
        this.corredor=corredor;
        this.barra=barra;
        rnd=new Random();
        vuelta=0;
        this.lbl=lbl;
        lbl.setText(vuelta+"/"+MAXVUELTA);
        stop=false;
        caido=false;
        this.corredores=corredores;
    }

    public void pausar(){
        stop=true;
    }
    
    public synchronized void reanudar(){
        stop=false;
        notify();
    }

    public boolean isStop() {
        return stop;
    }
    
    @Override
    public synchronized void run() {
        
        try{
            while(vuelta<MAXVUELTA && caido==false){
                if(stop==false){  
                    avance+=rnd.nextInt(1,5);
                    if(CAIDA==rnd.nextInt(1,100))
                        caido=true;
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
            if (caido==false){
               barra.setValue(100);
               corredores.add(corredor);
               lbl.setText("Terminado");
            }
            else{
                lbl.setText("Accidente");
                barra.setEnabled(false);
            }
              
        }
        catch(Exception e){
        }
    }
    
    
}

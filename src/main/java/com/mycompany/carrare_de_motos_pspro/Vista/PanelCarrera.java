/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.carrare_de_motos_pspro.Vista;

import com.mycompany.carrare_de_motos_pspro.hilos.MotoCorredorThread;
import com.mycompany.carrare_de_motos_pspro.pojos.Corredor;
import java.util.ArrayList;

/**
 *
 * @author Dam
 */
public class PanelCarrera extends javax.swing.JPanel {

    private MotoCorredorThread moto1;
    private MotoCorredorThread moto2;
    private Corredor corredor1,corredor2;
    private static ArrayList<Corredor> corredores;
    
    public PanelCarrera(VentanaPrincipal ventana) {
        initComponents();
        corredor1=new Corredor("Marquez");
        corredor2=new Corredor("Valentino Rossi");
        lblNombreCorredor1.setText(corredor1.getNombre());
        lblNombreCorredor2.setText(corredor2.getNombre());
        corredores= new ArrayList<Corredor>();   
        for (Corredor corredor : corredores) {
            lblPodio.setText(lblPodio.getText()+" "+corredor.getNombre());
        }
        
    }

    public void iniciarHilos(){
        moto1= new MotoCorredorThread(corredor1, Barra1,lblCorredor1, corredores);       
        moto2= new MotoCorredorThread(corredor2, Barra2,lblCorredor2,corredores);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra1 = new javax.swing.JProgressBar();
        Barra2 = new javax.swing.JProgressBar();
        lblCorredor1 = new javax.swing.JLabel();
        lblCorredor2 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombreCorredor1 = new javax.swing.JLabel();
        lblNombreCorredor2 = new javax.swing.JLabel();
        btnReanudar = new javax.swing.JButton();
        lblPodio = new javax.swing.JLabel();
        btnRest = new javax.swing.JButton();

        Barra1.setStringPainted(true);
        Barra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Barra1MouseClicked(evt);
            }
        });

        Barra2.setStringPainted(true);
        Barra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Barra2MouseClicked(evt);
            }
        });

        lblCorredor1.setText("0/0");
        lblCorredor1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCorredor1PropertyChange(evt);
            }
        });

        lblCorredor2.setText("0/0");
        lblCorredor2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCorredor2PropertyChange(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnPause.setText("Pause");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("CARRERA ");

        lblNombreCorredor1.setText("jLabel2");

        lblNombreCorredor2.setText("jLabel3");

        btnReanudar.setText("Reanudar");
        btnReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReanudarActionPerformed(evt);
            }
        });

        lblPodio.setText("Podio=");

        btnRest.setText("Reset");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReanudar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCorredor2)
                    .addComponent(lblNombreCorredor1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Barra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorredor2)
                            .addComponent(lblCorredor1))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPodio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblNombreCorredor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorredor1))
                .addGap(25, 25, 25)
                .addComponent(lblNombreCorredor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barra2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorredor2))
                .addGap(18, 18, 18)
                .addComponent(lblPodio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnPause)
                    .addComponent(btnSalir)
                    .addComponent(btnReanudar)
                    .addComponent(btnRest))
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
    
            iniciarHilos();
            moto1.start();
            moto2.start();
            btnStart.setEnabled(false);
            corredores.clear();
            lblPodio.setText("Podio : ");
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        
        moto1.pausar();
        moto2.pausar();
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReanudarActionPerformed
        
        moto1.reanudar();
        moto2.reanudar();
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnReanudarActionPerformed

    private void lblCorredor1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCorredor1PropertyChange
        
        String cadena="";
        
        for (Corredor corredor : corredores) {
            cadena+=corredor.getNombre()+" ";
        }
        lblPodio.setText("Podio : "+cadena);
    }//GEN-LAST:event_lblCorredor1PropertyChange

    private void lblCorredor2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCorredor2PropertyChange
        String cadena="";
        for (Corredor corredor : corredores) {
            cadena+=corredor.getNombre()+" ";
        }
        lblPodio.setText("Podio : "+cadena);
    }//GEN-LAST:event_lblCorredor2PropertyChange

    private void Barra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra1MouseClicked
        
        if(moto1.isStop())
            moto1.reanudar();
        else
            moto1.pausar();

    }//GEN-LAST:event_Barra1MouseClicked

    private void Barra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra2MouseClicked
        if(moto2.isStop())
            moto2.reanudar();
        else
            moto2.pausar();
    }//GEN-LAST:event_Barra2MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        btnStart.setEnabled(true);
        moto1.pausar();
        moto2.pausar();
        Barra1.setValue(0);
        Barra2.setValue(0);
        lblPodio.setText("Podio : ");
        Barra1.setEnabled(true);
        Barra2.setEnabled(true);
        lblCorredor1.setText("0/5");
        lblCorredor2.setText("0/5");
    }//GEN-LAST:event_btnRestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra1;
    private javax.swing.JProgressBar Barra2;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReanudar;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCorredor1;
    private javax.swing.JLabel lblCorredor2;
    private javax.swing.JLabel lblNombreCorredor1;
    private javax.swing.JLabel lblNombreCorredor2;
    private javax.swing.JLabel lblPodio;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Chechboxes extends javax.swing.JFrame {

    public Chechboxes() {
        initComponents();
        setVisible(true);
        setLayout(null);
        setSize(1920,1080);
        python.addActionListener((ActionListener) this);
        java.addActionListener((ActionListener) this);
        c.addActionListener((ActionListener) this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        python = new javax.swing.JCheckBox();
        c = new javax.swing.JCheckBox();
        java = new javax.swing.JCheckBox();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        python.setText("Python");

        c.setText("C++");

        java.setText("java");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset)
                    .addComponent(java)
                    .addComponent(c)
                    .addComponent(python))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(python)
                .addGap(18, 18, 18)
                .addComponent(c)
                .addGap(18, 18, 18)
                .addComponent(java)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(reset)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actionPerformed(ActionEvent e){
        if(python.isSelected() || java.isSelected() || c.isSelected()){
            JLabel l = new JLabel();
        l.setBounds(100,100,100,30);
            l.setText("Python or java or c");
        }
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:Chechboxes()
        
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new Chechboxes();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c;
    private javax.swing.JCheckBox java;
    private javax.swing.JCheckBox python;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}

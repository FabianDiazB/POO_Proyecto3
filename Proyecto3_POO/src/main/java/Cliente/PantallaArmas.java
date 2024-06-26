/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cliente;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PantallaArmas extends javax.swing.JFrame {
    ArrayList<Guerrero> listaGuerreros;
    private int cA1,cA2,cA3,cA4=0;
    Jugador player;
    
    /**
     * Creates new form PantallaArmas
     */
    public PantallaArmas(ArrayList<Guerrero> listaGuerreros, Jugador j) {
        initComponents();
        this.player = j;
        this.listaGuerreros = listaGuerreros;
        ponerTextos();
    }
    
    public void ponerTextos(){
        lblG1.setText(listaGuerreros.get(0).getNombre());
        lblG2.setText(listaGuerreros.get(1).getNombre());
        lblG3.setText(listaGuerreros.get(2).getNombre());
        lblG4.setText(listaGuerreros.get(3).getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblG1 = new javax.swing.JLabel();
        lblG2 = new javax.swing.JLabel();
        lblG3 = new javax.swing.JLabel();
        lblG4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAG1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAG2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txAG3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txAG4 = new javax.swing.JTextArea();
        lblNA = new javax.swing.JLabel();
        txfNombreArma = new javax.swing.JTextField();
        btnG1 = new javax.swing.JButton();
        btnG2 = new javax.swing.JButton();
        btnG3 = new javax.swing.JButton();
        btnG4 = new javax.swing.JButton();
        btnG5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Armas de Guerreros");

        lblG1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblG1.setForeground(new java.awt.Color(255, 255, 255));
        lblG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblG2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblG2.setForeground(new java.awt.Color(255, 255, 255));
        lblG2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblG3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblG3.setForeground(new java.awt.Color(255, 255, 255));
        lblG3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblG4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblG4.setForeground(new java.awt.Color(255, 255, 255));
        lblG4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txAG1.setEditable(false);
        txAG1.setBackground(new java.awt.Color(102, 102, 102));
        txAG1.setColumns(20);
        txAG1.setFont(new java.awt.Font("Zilla Slab", 1, 18)); // NOI18N
        txAG1.setForeground(new java.awt.Color(255, 255, 255));
        txAG1.setRows(5);
        jScrollPane1.setViewportView(txAG1);

        txAG2.setEditable(false);
        txAG2.setBackground(new java.awt.Color(102, 102, 102));
        txAG2.setColumns(20);
        txAG2.setFont(new java.awt.Font("Zilla Slab", 1, 18)); // NOI18N
        txAG2.setForeground(new java.awt.Color(255, 255, 255));
        txAG2.setRows(5);
        jScrollPane2.setViewportView(txAG2);

        txAG3.setEditable(false);
        txAG3.setBackground(new java.awt.Color(102, 102, 102));
        txAG3.setColumns(20);
        txAG3.setFont(new java.awt.Font("Zilla Slab", 1, 18)); // NOI18N
        txAG3.setForeground(new java.awt.Color(255, 255, 255));
        txAG3.setRows(5);
        jScrollPane3.setViewportView(txAG3);

        txAG4.setEditable(false);
        txAG4.setBackground(new java.awt.Color(102, 102, 102));
        txAG4.setColumns(20);
        txAG4.setFont(new java.awt.Font("Zilla Slab", 1, 18)); // NOI18N
        txAG4.setForeground(new java.awt.Color(255, 255, 255));
        txAG4.setRows(5);
        jScrollPane4.setViewportView(txAG4);

        lblNA.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblNA.setForeground(new java.awt.Color(255, 255, 255));
        lblNA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNA.setText("Nombre Arma");

        txfNombreArma.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        btnG1.setBackground(new java.awt.Color(0, 0, 153));
        btnG1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnG1.setForeground(new java.awt.Color(255, 255, 255));
        btnG1.setText("Añadir");
        btnG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnG1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG1MouseExited(evt);
            }
        });
        btnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG1ActionPerformed(evt);
            }
        });

        btnG2.setBackground(new java.awt.Color(0, 0, 153));
        btnG2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnG2.setForeground(new java.awt.Color(255, 255, 255));
        btnG2.setText("Añadir");
        btnG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnG2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG2MouseExited(evt);
            }
        });
        btnG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG2ActionPerformed(evt);
            }
        });

        btnG3.setBackground(new java.awt.Color(0, 0, 153));
        btnG3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnG3.setForeground(new java.awt.Color(255, 255, 255));
        btnG3.setText("Añadir");
        btnG3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnG3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG3MouseExited(evt);
            }
        });
        btnG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG3ActionPerformed(evt);
            }
        });

        btnG4.setBackground(new java.awt.Color(0, 0, 153));
        btnG4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnG4.setForeground(new java.awt.Color(255, 255, 255));
        btnG4.setText("Añadir");
        btnG4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnG4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG4MouseExited(evt);
            }
        });
        btnG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG4ActionPerformed(evt);
            }
        });

        btnG5.setBackground(new java.awt.Color(153, 0, 0));
        btnG5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnG5.setForeground(new java.awt.Color(255, 255, 255));
        btnG5.setText("Listo");
        btnG5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnG5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG5MouseExited(evt);
            }
        });
        btnG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNombreArma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblG4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblG2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnG1)
                .addGap(46, 46, 46)
                .addComponent(btnG2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnG3)
                .addGap(52, 52, 52)
                .addComponent(btnG4)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnG5)
                        .addGap(315, 315, 315))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreArma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnG1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnG5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnG1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MouseExited
        btnG1.setBackground(new java.awt.Color(0,0,153));
        btnG1.setForeground(Color.white);
    }//GEN-LAST:event_btnG1MouseExited

    private void btnG1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MouseEntered
        btnG1.setBackground(new java.awt.Color(255,255,255));
        btnG1.setForeground(Color.black);
    }//GEN-LAST:event_btnG1MouseEntered

    private void btnG2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG2MouseEntered
        btnG2.setBackground(new java.awt.Color(255,255,255));
        btnG2.setForeground(Color.black);
    }//GEN-LAST:event_btnG2MouseEntered

    private void btnG2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG2MouseExited
        btnG2.setBackground(new java.awt.Color(0,0,153));
        btnG2.setForeground(Color.white);
    }//GEN-LAST:event_btnG2MouseExited

    private void btnG3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG3MouseEntered
        btnG3.setBackground(new java.awt.Color(255,255,255));
        btnG3.setForeground(Color.black);
    }//GEN-LAST:event_btnG3MouseEntered

    private void btnG3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG3MouseExited
        btnG3.setBackground(new java.awt.Color(0,0,153));
        btnG3.setForeground(Color.white);
    }//GEN-LAST:event_btnG3MouseExited

    private void btnG4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG4MouseEntered
        btnG4.setBackground(new java.awt.Color(255,255,255));
        btnG4.setForeground(Color.black);
    }//GEN-LAST:event_btnG4MouseEntered

    private void btnG4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG4MouseExited
        btnG4.setBackground(new java.awt.Color(0,0,153));
        btnG4.setForeground(Color.white);
    }//GEN-LAST:event_btnG4MouseExited

    private void btnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG1ActionPerformed
        if(cA1<=3){
          txAG1.append(txfNombreArma.getText()+"\n");
          this.listaGuerreros.get(0).addArma(txfNombreArma.getText());  
        }else{
            btnG1.setEnabled(false);
        }
        cA1+=1;
    }//GEN-LAST:event_btnG1ActionPerformed

    private void btnG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG2ActionPerformed
        if(cA2<=3){
        txAG2.append(txfNombreArma.getText()+"\n");
        this.listaGuerreros.get(1).addArma(txfNombreArma.getText());
        }else{
            btnG2.setEnabled(false);

        }
        cA2+=1;
    }//GEN-LAST:event_btnG2ActionPerformed

    private void btnG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG3ActionPerformed
        if(cA3<=3){
            txAG3.append(txfNombreArma.getText()+"\n");
            this.listaGuerreros.get(2).addArma(txfNombreArma.getText());
        }else{
            btnG3.setEnabled(false);
        }
        cA3+=1;
    }//GEN-LAST:event_btnG3ActionPerformed

    private void btnG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG4ActionPerformed
        if(cA4<=3){
            txAG4.append(txfNombreArma.getText()+"\n");
            this.listaGuerreros.get(3).addArma(txfNombreArma.getText());
        }else{
            btnG4.setEnabled(false);
        }
        cA4+=1;
    }//GEN-LAST:event_btnG4ActionPerformed

    private void btnG5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG5MouseEntered
        btnG5.setBackground(new java.awt.Color(255,255,255));
        btnG5.setForeground(Color.black);
    }//GEN-LAST:event_btnG5MouseEntered

    private void btnG5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG5MouseExited
        btnG5.setBackground(new java.awt.Color(153,0,0));
        btnG5.setForeground(Color.white);
    }//GEN-LAST:event_btnG5MouseExited

    private void btnG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG5ActionPerformed
        if(cA1>3 && cA2>3 && cA3>3 && cA4>3){
            JOptionPane.showMessageDialog(this, "Espere a que el admin inicie la partida","WAITING",JOptionPane.DEFAULT_OPTION);
        }else{
            JOptionPane.showMessageDialog(this, "Debe completar sus armas","ARMAS",JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_btnG5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnG1;
    private javax.swing.JButton btnG2;
    private javax.swing.JButton btnG3;
    private javax.swing.JButton btnG4;
    private javax.swing.JButton btnG5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblG1;
    private javax.swing.JLabel lblG2;
    private javax.swing.JLabel lblG3;
    private javax.swing.JLabel lblG4;
    private javax.swing.JLabel lblNA;
    private javax.swing.JTextArea txAG1;
    private javax.swing.JTextArea txAG2;
    private javax.swing.JTextArea txAG3;
    private javax.swing.JTextArea txAG4;
    private javax.swing.JTextField txfNombreArma;
    // End of variables declaration//GEN-END:variables
}

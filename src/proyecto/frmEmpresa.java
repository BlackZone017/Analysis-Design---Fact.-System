/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.*;
import javax.swing.JOptionPane;
import Clases.ConsultaEmpresas;

public class frmEmpresa extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoEmpresa
     */
    public frmEmpresa() {
        initComponents();
    }
        ConsultaEmpresas acc = new ConsultaEmpresas();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDirecc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtRNC = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("INFORMACION DE LA EMPRESA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 290, 30));

        jLabel2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel3.setText("RNC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 69, 20));

        jLabel4.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 69, 20));
        getContentPane().add(txtDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 290, -1));

        jLabel5.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel5.setText("Dirección");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabel6.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 177, 69, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 130, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, -1));

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, -1));

        try {
            txtRNC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRNC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtRNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 110));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registros (Todos)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erase.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modify.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_37110.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String db="jdbc:ucanaccess://"+"C:/proyecto/VentaRepuestos.accdb";
            Connection cn=DriverManager.getConnection(db, "", "");
            Statement s=cn.createStatement();

            String nom_empresa=txtNombre.getText();
            String rnc=txtRNC.getText();
            String Direccion=txtDirecc.getText();
            String Telefono=txtTel.getText();
            String Correo=txtCorreo.getText();
            s.execute("insert into Empresa values('"+nom_empresa+"','"+rnc+"','"+Direccion+"','"+Telefono+"','"+Correo+"')");
            JOptionPane.showMessageDialog(rootPane, "Datos Guardados");

            acc.Buscar(tblDatos);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"El error es "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtNombre.setText("");
        txtRNC.setText(null);
        txtTel.setText(null);
        txtCorreo.setText(null);
        txtCorreo.setText(null);
        txtDirecc.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int resp=JOptionPane.showConfirmDialog(this,"¿Desea Cerrar?","Salir",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(resp==0){this.dispose();}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        acc.Buscar(tblDatos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int fila = tblDatos.getSelectedRow();
        if (fila >= 0){

            String codigo = String.valueOf(tblDatos.getValueAt(fila, 0));
            acc.deletePersona(codigo);
            acc.Buscar(tblDatos);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        int FilaSelec =  tblDatos.getSelectedRow();
        if (FilaSelec>=0){
            txtNombre.setText(tblDatos.getValueAt(FilaSelec, 0).toString());
            txtRNC.setText(tblDatos.getValueAt(FilaSelec, 1).toString());
            txtTel.setText(tblDatos.getValueAt(FilaSelec, 2).toString());
            txtDirecc.setText(tblDatos.getValueAt(FilaSelec,3).toString());
            txtCorreo.setText(tblDatos.getValueAt(FilaSelec,4).toString());
           
            String codigo = String.valueOf(tblDatos.getValueAt(FilaSelec, 0));
            acc.deletePersona(codigo);
            acc.Buscar(tblDatos);
        }else{
            JOptionPane.showMessageDialog(this,"Fila NO Seleccionada","Row Defaul Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String db="jdbc:ucanaccess://"+"C:/proyecto/VentaRepuestos.accdb";
            Connection cn=DriverManager.getConnection(db, "", "");
            Statement s=cn.createStatement();

            String nom_empresa=txtNombre.getText();
            String rnc=txtRNC.getText();
            String Direccion=txtDirecc.getText();
            String Telefono=txtTel.getText();
            String Correo=txtCorreo.getText();
            s.execute("insert into Empresa values('"+nom_empresa+"','"+rnc+"','"+Direccion+"','"+Telefono+"','"+Correo+"')");
            JOptionPane.showMessageDialog(rootPane, "Datos Modificados Correctamente");
            acc.Buscar(tblDatos);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"El error es "+ex);
        }
        txtNombre.setText("");
        txtRNC.setText(null);
        txtTel.setText(null);
        txtCorreo.setText(null);
        txtCorreo.setText(null);
        txtDirecc.setText(null);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int fila1= tblDatos.getSelectedRow();
        fila1=fila1-1;
        tblDatos.setRowSelectionInterval(fila1, fila1);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int fila1= tblDatos.getSelectedRow();
        fila1=fila1+1;
        tblDatos.setRowSelectionInterval(fila1, fila1);
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirecc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtRNC;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
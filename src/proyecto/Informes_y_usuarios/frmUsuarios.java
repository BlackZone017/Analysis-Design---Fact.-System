/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Informes_y_usuarios;

import java.sql.*;
import javax.swing.JOptionPane;
import Clases.Queries_Usuarios;
import Clases.conectar;

public class frmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarUsuarios
     */
    public frmUsuarios() {
        initComponents();
    }

     conectar conn = new conectar();
     Queries_Usuarios consultas = new Queries_Usuarios();
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
        txtEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cboRol = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Configurar Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel2.setText("ID Empledo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));
        getContentPane().add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, -1));

        jLabel3.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel3.setText("Rol");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, -1));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 130, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, -1));

        jLabel4.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, -1));

        cboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Administrador", "Empleado" }));
        getContentPane().add(cboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 530, 110));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registros ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erase.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modify.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_37110.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        guardar();
        JOptionPane.showMessageDialog(rootPane, "Datos Guardados");
        consultas.buscar(tblDatos);
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardar(){
        //trato de acceder a la BD para luego hacer una query de insert
        try{
            conn.conexion();
            Statement query = conn.conexion().createStatement();
            
            String empleado = this.txtEmpleado.getText();
            String usuario = this.txtUsuario.getText();
            String contra = this.txtContra.getText();
            String rol = this.cboRol.getSelectedItem().toString();
            
            //Inserta los valores a la tabla
            
            query.execute("INSERT INTO usuario VALUES('"+empleado+"','"+usuario+"','"+contra+"','"+
                    rol+"');");
                                
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"El error es: "+e);
        }
    }
    
    public void limpiar(){
        txtEmpleado.setText(null);
        txtUsuario.setText(null);
        txtContra.setText(null);
        cboRol.setSelectedIndex(0);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int resp=JOptionPane.showConfirmDialog(this,"¿Desea Cerrar?","Salir",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(resp==0){this.dispose();}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        consultas.buscar(tblDatos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //Metodo para eliminar los registros seleccionados de la tabla [tblDatos]
        int resp=JOptionPane.showConfirmDialog(this,"¿Desea Eliminar este Registro?","Eliminar",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(resp==0){
            //Si la respuesta es "Si", este procede a eliminar dicho registro
            int fila = tblDatos.getSelectedRow();
            if (fila >= 0){
                String codigo = String.valueOf(tblDatos.getValueAt(fila, 0));
                consultas.eliminar(codigo);
                if (consultas.eliminar(codigo)){
                    consultas.buscar(tblDatos);
                    JOptionPane.showMessageDialog(rootPane, "Registro Eliminado");
                }                         
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

         // Este selecciona la fila deseada para modificar y a su vez, pone los valores del registro en su respectivo campo
        int FilaSelec =  tblDatos.getSelectedRow();
        if (FilaSelec>=0){

            txtEmpleado.setText(tblDatos.getValueAt(FilaSelec, 1).toString());
            txtUsuario.setText(tblDatos.getValueAt(FilaSelec, 2).toString());
            txtContra.setText(tblDatos.getValueAt(FilaSelec, 3).toString());
            cboRol.setSelectedItem(tblDatos.getValueAt(FilaSelec, 4).toString());
            
        }else{
            JOptionPane.showMessageDialog(this,"Fila NO Seleccionada","Row Defaul Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Boton para hacer la confirmacion de los datos modificados y a la vez los inserta en la tabla
            int FilaSelec =  tblDatos.getSelectedRow();
            String codigo = String.valueOf(tblDatos.getValueAt(FilaSelec, 0));
            consultas.modificar(codigo,txtEmpleado.getText(),txtUsuario.getText(),txtContra.getText(),cboRol.getSelectedItem().toString());
            JOptionPane.showMessageDialog(rootPane, "Datos Modificados");
            //Cuando modifica los datos, los campos se limpian
            limpiar();
            consultas.buscar(tblDatos); 
        
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
    private javax.swing.JComboBox<String> cboRol;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

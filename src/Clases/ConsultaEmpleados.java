/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import proyecto.conectar;
import com.sun.istack.internal.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class ConsultaEmpleados {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
     public boolean Buscar(JTable Tabla){
         
    String [] columnas={"id_Empleados","nom_empleado","ape_empleado", "Cedula","Direccion","Telefono","Correo","Cargo"};
    String [] registros=new String[8];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Empleado";
               try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Empleados");
             registros[1]=rs.getString("nom_empleado");
             registros[2]=rs.getString("ape_empleado");
             registros[3]=rs.getString("Cedula");
             registros[4]=rs.getString("Direccion");
             registros[5]=rs.getString("Telefono");
             registros[6]=rs.getString("Correo");
             registros[7]=rs.getString("Cargo");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     public boolean busquedaSimple(String valor,String cbo, JTable Tabla){

    String [] columnas={"id_Empleados","nom_empleado","ape_empleado", "Cedula","Direccion","Telefono","Correo","Cargo"};
    String [] registros=new String[8];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Empleado WHERE "+cbo+"LIKE '%"+valor+"%'";
               try {

      
             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Empleados");
             registros[1]=rs.getString("nom_empleado");
             registros[2]=rs.getString("ape_empleado");
             registros[3]=rs.getString("Cedula");
             registros[4]=rs.getString("Direccion");
             registros[5]=rs.getString("Telefono");
             registros[6]=rs.getString("Correo");
             registros[7]=rs.getString("Cargo");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     
     public void deletePersona (String cod){
    
    conect=con.conexion();
    
    try{
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM Empleado WHERE id_Empleados=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}

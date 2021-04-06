/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases_base.Cliente;
import Control.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloCliente extends Cliente{
    
    private static ConexionPG con = new ConexionPG();

    public ModeloCliente() {
    }

    public ModeloCliente(String idCliente, String nombre, String apellido) {
        super(idCliente, nombre, apellido);
    }
    
    public boolean Crear(){
        String sql;
        sql="INSERT INTO cliente (idcliente, nombre, apellidos)";
        sql+="VALUES ('"+ getIdCliente() +"', '"+ getNombre() +"', '"+ getApellido() +"')";
        if(con.noquery(sql) == null){
            return true;
        }else{
            return false;
        }
    };
    
    public static List<Cliente> listarCliente(String aguja){
        
        try {
        String sql = "SELECT * FROM cliente WHERE ";
        sql+="UPPER(idcliente) LIKE UPPER ('%"+aguja+"%') OR ";
        sql+="UPPER(nombre) LIKE UPPER ('%"+aguja+"%') OR ";
        sql+="UPPER(apellidos) LIKE UPPER ('%"+aguja+"%')";
        
        ResultSet rs = con.query(sql);
        List<Cliente> lista = new ArrayList<>();
        
        while (rs.next()) {            
            Cliente cli = new Cliente();
            cli.setIdCliente(rs.getString("idcliente"));
            cli.setNombre(rs.getString("nombre"));
            cli.setApellido(rs.getString("apellidos"));
            
            lista.add(cli);
        }
        rs.close();
        return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean Modificar(){
        String sql;
        sql="UPDATE cliente SET idcliente='"+getIdCliente()+"', nombre='"+getNombre()+"', apellidos='"+getApellido()+"' WHERE idcliente='"+getIdCliente()+"'";
        if(con.noquery(sql) == null){
            return true;
        }else{
            return false;
        }
    };
    
    public boolean Eliminar(){
        String sql;
        sql="DELETE FROM cliente WHERE idcliente='"+this.getIdCliente()+"'";
        if(con.noquery(sql) == null){
            return true;
        }else{
            return false;
        }
    };
}

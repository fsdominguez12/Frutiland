
package Modelo;

import Clases_base.Cliente;
import Clases_base.Ensalada;
import Control.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloEnsalada extends Ensalada {
  private static ConexionPG con = new ConexionPG();

    public ModeloEnsalada() {
    }

    public ModeloEnsalada(String codigoEnsalada, String cedulaCliEnsa, String descripcion, float precio, int tiempoEspera, boolean estado, String horaGeneracion, String horaEntrega) {
        super(codigoEnsalada, cedulaCliEnsa, descripcion, precio, tiempoEspera, estado, horaGeneracion, horaEntrega);
    }

    

    

public static List<Cliente> buscarCliente(String aguja){
        
        try {
        String sql = "SELECT * FROM cliente WHERE ";
        sql+="UPPER(idcliente) LIKE UPPER ('%"+aguja+"%') OR ";
        ResultSet rs = con.query(sql);
        List<Cliente> lista = new ArrayList<>();
        
        while (rs.next()) {            
            Cliente cli = new Cliente();
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

public boolean Crear(){
        String sql;
        sql="INSERT INTO ensalada (idensalada,cedclienteen,descripcion,precio,tiempoespera,estado,horageneracio,horaentrega)";
        sql+="VALUES ('"+ getCodigoEnsalada() +"', '"+ getCedulaCliEnsa() +"', '"+ getDescripcion() +"', '"+ getPrecio() +"', "
                + "'"+getTiempoEspera() +"', '"+ isEstado() +"', '"+getHoraGeneracion() +"', '"+ getHoraEntrega() +"')";
        if(con.noquery(sql) == null){
            return true;
        }else{
            return false;
           
        }
    }


 public static List<Ensalada> listarEnsalada(String aguja){
        
        try {
        String sql = "SELECT * FROM ensalada WHERE ";
        sql+="UPPER(idensalada) LIKE UPPER ('%"+aguja+"%') OR ";
        sql+="UPPER(cedclienteen) LIKE UPPER ('%"+aguja+"%') OR ";
        
        ResultSet rs = con.query(sql);
        List<Ensalada> lista = new ArrayList<>();
        
        while (rs.next()) {            
            Ensalada ens = new Ensalada();
            ens.setCodigoEnsalada(sql);
            
            //cli.setIdCliente(rs.getString("idcliente"));
            //cli.setNombre(rs.getString("nombre"));
            //cli.setApellido(rs.getString("apellidos"));
            
            //lista.add(cli);
        }
        rs.close();
        return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
 

public boolean Eliminar() {
        String sql;
        sql = "DELETE FROM ensalada WHERE =idensalada'" + getCodigoEnsalada() + "'";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

}

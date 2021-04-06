
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

    public ModeloEnsalada(String codigoEnsalada, String cedulaCliEnsa, String descripcion, double precio, float tiempoEspera, String estado) {
        super(codigoEnsalada, cedulaCliEnsa, descripcion, precio, tiempoEspera, estado);
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


}

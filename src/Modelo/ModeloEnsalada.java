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

    public ModeloEnsalada(String codigoEnsalada, boolean estado) {
        super(codigoEnsalada, estado);
    }

    
    public static List<Cliente> buscarCliente(String aguja) {

        try {
            String sql = "SELECT * FROM cliente WHERE ";
            sql += "UPPER(idcliente) LIKE UPPER ('%" + aguja + "%') OR ";
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

    public boolean Crear() {
        String sql;
        sql = "INSERT INTO ensalada (idensalada,cedclienteen,descripcion,precio,tiempoespera,estado,horageneracio,horaentrega)";
        sql += "VALUES ('" + getCodigoEnsalada() + "', '" + getCedulaCliEnsa() + "', '" + getDescripcion() + "', '" + getPrecio() + "', "
                + "'" + getTiempoEspera() + "', '" + isEstado() + "', '" + getHoraGeneracion() + "', '" + getHoraEntrega() + "')";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;

        }
    }

    public static List<Ensalada> listarEnsalada(String aguja, int nume) {

        try {
            String sql = "";
            if (nume == 0) {
                sql = "SELECT * FROM ensalada WHERE ";
                sql += "UPPER(idensalada) LIKE UPPER ('%" + aguja + "%') OR ";
                sql += "UPPER(cedclienteen) LIKE UPPER ('%" + aguja + "%')";
            } else {
                sql = "SELECT * FROM ensalada WHERE estado=false";
                
            }

            ResultSet rs = con.query(sql);
            List<Ensalada> lista = new ArrayList<>();

            while (rs.next()) {
                Ensalada ens = new Ensalada();
                ens.setCodigoEnsalada(sql);
                ens.setCodigoEnsalada(rs.getString("idensalada"));
                ens.setCedulaCliEnsa(rs.getString("cedclienteen"));
                ens.setDescripcion(rs.getString("descripcion"));
                ens.setPrecio(rs.getFloat("precio"));
                ens.setTiempoEspera(rs.getInt("tiempoespera"));
                ens.setEstado(rs.getBoolean("estado"));
                ens.setHoraGeneracion(rs.getString("horageneracio"));
                ens.setHoraEntrega(rs.getString("horaentrega"));

                lista.add(ens);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean ModificarEstadoEnsalada() {
        String sql;
        sql = "UPDATE ensalada SET idensalada='" + getCodigoEnsalada() + "',estado='" +isEstado() + "' WHERE idensalada='" +getCodigoEnsalada() + "'";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean EliminarEnsalada() {
        String sql;
        sql = "DELETE FROM ensalada WHERE idensalada='" + getCodigoEnsalada() + "'";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

}

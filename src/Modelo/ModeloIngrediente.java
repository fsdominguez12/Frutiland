package Modelo;

import Clases_base.Ingrediente;
import Control.ConexionPG;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.postgresql.util.Base64;

public class ModeloIngrediente extends Ingrediente {

    private static ConexionPG con = new ConexionPG();

    public ModeloIngrediente() {
    }

    public ModeloIngrediente(String codigoIngrediente, String nombre, String beneficio, int cantidad, float precio, int tiempoPreparacion) {
        super(codigoIngrediente, nombre, beneficio, cantidad, precio, tiempoPreparacion);
    }
   
    public boolean Crear() {
        String foto64 = null;
        //Transformar imgagen a base64 para postgresql

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            BufferedImage img = imgBimage(getFoto());
            ImageIO.write(img, "PNG", bos);
            byte[] imgb = bos.toByteArray();
            foto64 = Base64.encodeBytes(imgb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        String sql;
        sql = "INSERT INTO ingrediente (cod_ingrediente, nombre,beneficio,cantidad,precio,tiempo_preparacion,foto)";
        sql += "VALUES ('" + getCodigoIngrediente() + "', '" + getNombre() + "', '" + getBeneficio() + "', '" + getCantidad() + "', '" + getPrecio() + "','" + getTiempoPreparacion() + "' '" +foto64 + "')";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    public static List<Ingrediente> listarIngrediente(String aguja) {

        try {
            String sql = "SELECT * FROM ingrediente WHERE ";
            sql += "UPPER(cod_ingrediente) LIKE UPPER ('%" + aguja + "%') OR ";
            sql += "UPPER(nombre) LIKE UPPER ('%" + aguja + "%') OR ";
            sql += "UPPER(beneficio) LIKE UPPER ('%" + aguja + "%')";

            ResultSet rs = con.query(sql);
            List<Ingrediente> lista = new ArrayList<>();
            byte[] bf;    
            while (rs.next()) {
                Ingrediente ingr = new Ingrediente();
                ingr.setCodigoIngrediente(rs.getString("cod_ingrediente"));
                ingr.setNombre(rs.getString("nombre"));
                ingr.setBeneficio(rs.getString("beneficio"));
                ingr.setCantidad(rs.getInt("cantidad"));
                ingr.setPrecio(rs.getFloat("precio"));
                ingr.setTiempoPreparacion(rs.getInt("tiempo_preparacion"));
                    bf = rs.getBytes("foto");
                    
                if (bf != null) {
                    bf = Base64.decode(bf, 0, bf.length);
                    try {
                        //OBTENER IMAGEN
                        ingr.setFoto(obtenImagen(bf));
                    } catch (IOException ex) {
                        ingr.setFoto(null);
                        }
                } else {
                    ingr.setFoto(null);
                }
                
                lista.add(ingr);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloIngrediente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean Modificar() {
        String sql;
        sql = "UPDATE ingrediente SET cod_ingrediente='" + getCodigoIngrediente() + "', nombre='" +getNombre() + "', beneficio='" + getBeneficio() + "', cantidad='" +getCantidad() + "', precio='" + getPrecio() + "', tiempo_preparacion='" + getTiempoPreparacion() + "' WHERE cod_ingrediente='" + getCodigoIngrediente() + "'";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean Eliminar() {
        String sql;
        sql = "DELETE FROM ingrediente WHERE cod_ingrediente='" + this.getCodigoIngrediente() + "'";
        if (con.noquery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    private BufferedImage imgBimage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB
        );

        Graphics2D bGR = bi.createGraphics();
        bGR.drawImage(img, 0, 0, null);
        bGR.dispose();
        return bi;
    }
    public static Image obtenImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    

}

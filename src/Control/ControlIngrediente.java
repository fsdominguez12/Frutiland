package Control;

import Clases_base.Cliente;
import Clases_base.Ingrediente;
import Interfaces.Vista_Ingrediente;
import Interfaces.Vista_Principal;
import Modelo.ModeloCliente;
import Modelo.ModeloIngrediente;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class ControlIngrediente {

    private ModeloIngrediente modeloIn;
    private Vista_Ingrediente vistaIn;
    private Vista_Principal vipri;

    public ControlIngrediente(ModeloIngrediente modeloIn, Vista_Ingrediente vistaIn, Vista_Principal vipri) {
        this.modeloIn = modeloIn;
        this.vistaIn = vistaIn;
        this.vipri = vipri;
        vistaIn.setVisible(true);//Mostramos la interfaz

    }

    public void IniciaControl() {

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarLista(vistaIn.getTxtBuscar().getText());
                CargarBeneficio(vipri.getTxtbusquedabeneficio().getText());
                cargarIngredienteParaStock(vistaIn.getTxtStockBusqueda().getText());
                sumarStockIngresado(vistaIn.getTxtStockCantidadAgregar().getText());

            }

        };

        vistaIn.getBtnListar().addActionListener(l -> cargarLista(""));
        vistaIn.getBtnCrear().addActionListener(l -> AntesdeCrearIngrediente());
        vistaIn.getBtnExaminar().addActionListener(l -> cargarImagen());
        vistaIn.getBtnGuardar().addActionListener(l -> deBoton());
        vistaIn.getBtnModificar().addActionListener(l -> CargaDatosIngredienteaModificar());
        vistaIn.getBtnEliminar().addActionListener(l -> EliminarIngrediente());
        vistaIn.getBtnStockGuardar().addActionListener(l -> guardarStockActualizado());
        vistaIn.getBtnStockCancelar().addActionListener(l -> cancelarVentanaStock());
        vistaIn.getTxtBuscar().addKeyListener(kl);
        vistaIn.getTxtStockBusqueda().addKeyListener(kl);
        vistaIn.getTxtStockCantidadAgregar().addKeyListener(kl);
        vipri.getTxtbusquedabeneficio().addKeyListener(kl);
        vipri.getBtnvisualizar().addActionListener(l -> Visualizabeneficio());
    }

    public void deBoton() {
        String ca = vistaIn.getBtnGuardar().getText();
        if (ca == "CREAR") {
            grabaringrediente();

        } else {
            Actualizar();

        }

    }

    public void AntesdeCrearIngrediente() {
        MetodoControlTamaño("CREAR", "REGISTRO INGREDIENTE");
        LimpiarDialogo();
        vistaIn.getTxtCodigo().setEnabled(true);
    }

    public void MetodoControlTamaño(String nobo, String nobi) {
        vistaIn.getDgIngrediente().setTitle("CREAR INGREDIENTE");
        vistaIn.getDgIngrediente().setSize(615, 408);
        vistaIn.getDgIngrediente().setLocationRelativeTo(vistaIn);
        vistaIn.getBtnGuardar().setText(nobo);
        vistaIn.getLblTituloIng().setText(nobi);
        vistaIn.getDgIngrediente().setVisible(true);

    }

    private void LimpiarDialogo() {
        vistaIn.getTxtCodigo().setText("");
        vistaIn.getTxtNombre().setText("");
        vistaIn.getTxtBeneficio().setText("");
        vistaIn.getTxtCantidad().setText("");
        vistaIn.getTxtPrecio().setText("");
    }

    public void cargarLista(String aguja) {
        vistaIn.getTblingredientes().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaIn.getTblingredientes().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vistaIn.getTblingredientes().getModel();
        tblModel.setNumRows(0);
        List<Ingrediente> lista = modeloIn.listarIngrediente(aguja);

        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);

        lista.stream().forEach(p -> {

            tblModel.addRow(new Object[ncols]);
            vistaIn.getTblingredientes().setValueAt(p.getCodigoIngrediente(), i.value, 0);
            vistaIn.getTblingredientes().setValueAt(p.getNombre(), i.value, 1);
            vistaIn.getTblingredientes().setValueAt(p.getBeneficio(), i.value, 2);
            vistaIn.getTblingredientes().setValueAt(String.valueOf(p.getCantidad()), i.value, 3);
            vistaIn.getTblingredientes().setValueAt(String.valueOf(p.getPrecio()), i.value, 4);
            vistaIn.getTblingredientes().setValueAt(String.valueOf(MinutosEntrega(p.getTiempoPreparacion())), i.value, 5);
            Image img = p.getFoto();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vistaIn.getTblingredientes().setValueAt(new JLabel(icon), i.value, 6);
            } else {
                vistaIn.getTblingredientes().setValueAt(null, i.value, 6);
            }
            i.value++;
        });
    }

    private void grabaringrediente() {
        String ident = vistaIn.getTxtCodigo().getText();
        String nombre = vistaIn.getTxtNombre().getText();
        String beneficio = vistaIn.getTxtBeneficio().getText();
        int cantidad = Integer.parseInt(vistaIn.getTxtCantidad().getText());
        float precio = Float.parseFloat(vistaIn.getTxtPrecio().getText());
        int min = Integer.parseInt(vistaIn.getTxtMinTiPreparacion().getText());
        int seg = Integer.parseInt(vistaIn.getTxtSegTiPreparacion().getText());
        min = min * 60;
        int tiempo = min + seg;
        ModeloIngrediente ingrediente = new ModeloIngrediente(ident, nombre, beneficio, cantidad, precio, tiempo);
        ImageIcon ic = (ImageIcon) vistaIn.getLblFoto().getIcon();
        ingrediente.setFoto(ic.getImage());

        if (ingrediente.Crear()) {
            vistaIn.getDgIngrediente().setVisible(false);
            JOptionPane.showMessageDialog(vistaIn, "Ingrediente Creado");//Si la persona se creo envia el mensaje
        } else {
            JOptionPane.showMessageDialog(vistaIn, "ERROR!!!!!!");//Si no se creo se enviara el error
        }
        LimpiarDialogo();

        vistaIn.getDgIngrediente().setVisible(false);
        vistaIn.setVisible(true);
        cargarLista("");
    }

    private void cargarImagen() {

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vistaIn.getLblFoto().getWidth(),
                        vistaIn.getLblFoto().getHeight(),
                        Image.SCALE_DEFAULT
                );
                Icon ic = new ImageIcon(icono);
                vistaIn.getLblFoto().setIcon(ic);
                vistaIn.getLblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControlIngrediente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void CargaDatosIngredienteaModificar() {
        int fila = vistaIn.getTblingredientes().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
            cargarLista("");
        } else {
            String ident = (String) vistaIn.getTblingredientes().getValueAt(fila, 0);
            String nombre = (String) vistaIn.getTblingredientes().getValueAt(fila, 1);
            String beneficio = (String) vistaIn.getTblingredientes().getValueAt(fila, 2);
            String cantidad = (String) vistaIn.getTblingredientes().getValueAt(fila, 3);
            String precio = (String) vistaIn.getTblingredientes().getValueAt(fila, 4);
            String espera = (String) vistaIn.getTblingredientes().getValueAt(fila, 5);
            String[] parts = espera.split(" M ");
            String part1 = parts[0];
            String part2 = parts[1];

            ImageIcon icon = new ImageIcon((String) vistaIn.getTblingredientes().getValueAt(fila, 5));

            vistaIn.getTxtCodigo().setText(ident);
            vistaIn.getTxtNombre().setText(nombre);
            vistaIn.getTxtBeneficio().setText(beneficio);
            vistaIn.getTxtCantidad().setText(cantidad);
            vistaIn.getTxtPrecio().setText(precio);
            vistaIn.getTxtMinTiPreparacion().setText(part1);
            vistaIn.getTxtSegTiPreparacion().setText(part2);
            vistaIn.getTxtCodigo().setEnabled(false);
            vistaIn.getLblFoto().setIcon(icon);
            MetodoControlTamaño("ACTUALIZAR", "EDITAR PRODUCTO");
        }
    }

    public void Actualizar() {

        String ident = vistaIn.getTxtCodigo().getText();
        String nombre = vistaIn.getTxtNombre().getText();
        String beneficio = vistaIn.getTxtBeneficio().getText();
        int cantidad = Integer.parseInt(vistaIn.getTxtCantidad().getText());
        float precio = Float.parseFloat(vistaIn.getTxtPrecio().getText());
        int min = Integer.parseInt(vistaIn.getTxtMinTiPreparacion().getText());
        int seg = Integer.parseInt(vistaIn.getTxtSegTiPreparacion().getText());
        min = min * 60;
        int tiempo = min + seg;
        LimpiarDialogo();
        ModeloIngrediente ingrediente = new ModeloIngrediente(ident, nombre, beneficio, cantidad, precio, tiempo);
        if (ingrediente.Modificar()) {
            JOptionPane.showMessageDialog(vistaIn, "Datos De Cliente Modificados");
        } else {
            JOptionPane.showMessageDialog(vistaIn, "ERROR!!!");
        }

        vistaIn.getDgIngrediente().setVisible(false);
        cargarLista("");
    }

    private void EliminarIngrediente() {
        DefaultTableModel dtmIngrediente = (DefaultTableModel) vistaIn.getTblingredientes().getModel();
        int fila = vistaIn.getTblingredientes().getSelectedRow();

        if (fila != -1) {
            int i = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el ingrediente?", "ELIMINAR INGREDIENTE", 1, 2);
            if (i == 0) {
                String idin = dtmIngrediente.getValueAt(fila, 0).toString();
                modeloIn.setCodigoIngrediente(idin);
                if (modeloIn.Eliminar()) {
                    JOptionPane.showMessageDialog(vistaIn, "Ingrediente Eliminado");
                } else {
                    JOptionPane.showMessageDialog(vistaIn, "ERROR!!!");
                }
                cargarLista(idin);
            }

        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONAR UNA FILA");
        }
        cargarLista("");
    }

    //---------------- SE UTILIZARA EN EL DLGBENEFICIO-----------------------
    private void CargarBeneficio(String benefic) {

        vipri.getTblbeneficio().setDefaultRenderer(Object.class, new ImagenTabla());
        vipri.getTblbeneficio().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vipri.getTblbeneficio().getModel();
        tblModel.setNumRows(0);
        List<Ingrediente> lista = modeloIn.Beneficio(benefic);

        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);

        lista.stream().forEach(pl -> {
            tblModel.addRow(new Object[ncols]);
            vipri.getTblbeneficio().setValueAt(pl.getNombre(), i.value, 0);
            vipri.getTblbeneficio().setValueAt(pl.getBeneficio(), i.value, 1);
            Image img = pl.getFoto();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vipri.getTblbeneficio().setValueAt(new JLabel(icon), i.value, 2);
            } else {
                vipri.getTblbeneficio().setValueAt(null, i.value, 2);
            }
            i.value++;
        });
    }

    public void Visualizabeneficio() {
        int fila = vipri.getTblbeneficio().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FILA");
        } else {
            String nombre = (String) vipri.getTblbeneficio().getValueAt(fila, 0);
            String beneficio = (String) vipri.getTblbeneficio().getValueAt(fila, 1);
            vipri.getLblfruta().setText(nombre);
            vipri.getJepbeneficio().setText(beneficio);

        }
    }

    //STOCK
    public void cargarIngredienteParaStock(String aguja) {
        List<Ingrediente> lista = ModeloIngrediente.listarIngrediente(aguja);
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(in -> {
            String[] ingrediente = {in.getNombre(), String.valueOf(in.getCantidad())};
            vistaIn.getTxtStockCodigoPro().setText(in.getCodigoIngrediente());
            vistaIn.getTxtStockNombre().setText(in.getNombre());
            vistaIn.getTxtStockCantidadActual().setText(String.valueOf(in.getCantidad()));
        });
    }

    public void RestringirDialogoStock() {
        vistaIn.getTxtStockNombre().setEnabled(false);
        vistaIn.getTxtStockCodigoPro().setEnabled(false);
        vistaIn.getTxtStockCodigoPro().setVisible(false);
        vistaIn.getTxtStockCantidadActual().setEnabled(false);
        vistaIn.getTxtStockCantidadTotal().setEnabled(false);
        vistaIn.getTxtStockCantidadActual().setText("0");
        vistaIn.getTxtStockCantidadTotal().setText("0");
        vistaIn.getTxtStockBusqueda().setText("");
        vistaIn.getTxtStockNombre().setText("");
        vistaIn.getTxtStockCantidadAgregar().setText("");
    }

    public void sumarStockIngresado(String valorIngresar) {
        try {
            vistaIn.getTxtStockCantidadTotal().setText(String.valueOf((Integer.parseInt(valorIngresar)) + (Integer.parseInt(vistaIn.getTxtStockCantidadActual().getText()))));
        } catch (Exception ex) {
            vistaIn.getTxtStockCantidadAgregar().setText("0");
        }
    }

    public void guardarStockActualizado() {
        try {
            ModeloIngrediente ingrediente = new ModeloIngrediente((vistaIn.getTxtStockCodigoPro().getText()), (Integer.parseInt(vistaIn.getTxtStockCantidadTotal().getText())));

            if (ingrediente.RestaIngrediente()) {
                JOptionPane.showMessageDialog(vistaIn, "Cantidad de base de datos actualizado");
                RestringirDialogoStock();
                cargarLista("");
            } else {
                JOptionPane.showMessageDialog(vistaIn, "ERROR!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaIn, "Ingrese Valores");
        }
    }

    public void cancelarVentanaStock() {
        vistaIn.getDgStock().setVisible(false);
        RestringirDialogoStock();
    }

    public String MinutosEntrega(int ti) {

        int tiempoEspera = ti;
        int horage = 0;
        int minge = 0;
        int segge = 0;
        float resu = 0;
        int cont = 0;
        String descripcion = "";
        resu = tiempoEspera / 60;
        if (resu == 0) {

            minge = 0;
            segge = tiempoEspera;
        } else {
            do {
                tiempoEspera = tiempoEspera - 60;
                cont = cont + 1;
            } while (tiempoEspera > 59);

            minge = cont;
            segge = tiempoEspera;

            if (minge > 59) {
                cont = 0;
                tiempoEspera = minge;
                do {
                    tiempoEspera = tiempoEspera - 60;
                    cont = cont + 1;
                } while (tiempoEspera > 59);

                minge = tiempoEspera;
            }
        }
        descripcion = (minge + " M " + segge);
        return descripcion;
    }

}

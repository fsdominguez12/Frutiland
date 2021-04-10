package Control;

import Clases_base.Cliente;
import Clases_base.Ingrediente;
import Interfaces.Vista_Cliente;
import Interfaces.Vista_Ensalada;
import Interfaces.Vista_Ingrediente;
import Interfaces.Vista_Principal;
import Modelo.ModeloCliente;
import Modelo.ModeloEnsalada;
import Modelo.ModeloIngrediente;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class ControlEnsalada {

    private ModeloEnsalada moes;
    private ModeloIngrediente modeloIn;
    private Vista_Ensalada visen;
    private ControlCliente cocli;
    private Vista_Principal vp;

    public ControlEnsalada(ModeloEnsalada moes, Vista_Ensalada visen) {
        this.moes = moes;
        this.visen = visen;
        visen.setVisible(true);
    }

    public void IniciaControl() {
        restringirDialogo();

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
                buscarCliente(visen.getTxtCedulaClienteEnsalada().getText());
                cargaTabla(visen.getTxtBuscar().getText());
                calculoSubTotal(visen.getTxtPorcionIngrediente().getText());
            }

        };

        visen.getTxtCedulaClienteEnsalada().addKeyListener(kl);
        visen.getTxtBuscarAgregar().addKeyListener(kl);
        visen.getTxtPorcionIngrediente().addKeyListener(kl);
        visen.getBtnAgregarCliente().addActionListener(l -> crearCliente());
        visen.getBtnAgregarIngrediente().addActionListener(l -> agregaIngrediente());
        visen.getBtnSalir().addActionListener(l -> salirDialogo());
        visen.getBtnAgregaIngrediente().addActionListener(l -> agregarPro());
        visen.getBtnAdjuntar().addActionListener(l -> exportarDatos());
        visen.getBtnVerProductosAgregados().addActionListener(l -> abrirListaIngredientes());
        visen.getBtnQuitar().addActionListener(l -> QuitarIngredientesdDeListaAgregada());
    }

    public void limpiarDialogo() {
        visen.getTxtCodigoEnsalada().setText(" ");

    }

    public void restringirDialogo() {
        visen.getTxtClienteEnsalada().setEnabled(false);
        visen.getTxtDescripcionEnsalada().setEnabled(false);
        visen.getTxtTiempoEnsalada().setEnabled(false);
        visen.getTxtTotalEnsalada().setEnabled(false);
        visen.getTxtPrecioIngrediente().setEnabled(false);
        visen.getTxtCanDisponible().setEnabled(false);
        visen.getTxtPrecioIngrediente().setText("0");
        visen.getTxtSubTotal().setText("0");
        visen.getTxtCanDisponible().setText("0");
    }

    public void buscarCliente(String aguja) {

        List<Cliente> lista = ModeloCliente.listarCliente(aguja);
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(cl -> {
            String[] cliente = {cl.getNombre(), cl.getApellido()};
            visen.getTxtClienteEnsalada().setText(cl.getNombre() + " " + cl.getApellido());

        });
    }

    public void crearCliente() {

    }

    public void agregaIngrediente() {
        borrarDialogo();
        visen.getDlgAgregarIngrediente().setTitle("Agregar Ingrediente");
        visen.getDlgAgregarIngrediente().setSize(615, 408);
        visen.getDlgAgregarIngrediente().setLocationRelativeTo(vp);
        visen.getDlgAgregarIngrediente().setVisible(true);
        visen.getTxtSubTotal().setEnabled(false);
        cargaTabla("");

    }

    public void salirDialogo() {
        visen.getDlgAgregarIngrediente().setVisible(false);
        borrarDialogo();
    }

    public void borrarDialogo() {
        visen.getTxtSubTotal().setText("0");
        visen.getTxtBuscarAgregar().setText("");
        visen.getTxtPorcionIngrediente().setText("");
        visen.getTxtPrecioIngrediente().setText("0");
        visen.getTxtCanDisponible().setText("0");
        visen.getTxtPorcionIngrediente().setText("0");
    }

    public void cargaTabla(String aguja) {
        visen.getTblingredientes().setDefaultRenderer(Object.class, new ImagenTabla());
        visen.getTblingredientes().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) visen.getTblingredientes().getModel();
        tblModel.setNumRows(0);
        List<Ingrediente> lista = modeloIn.listarIngrediente(aguja);

        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);

        lista.stream().forEach(p -> {

            tblModel.addRow(new Object[ncols]);
            visen.getTblingredientes().setValueAt(p.getCodigoIngrediente(), i.value, 0);
            visen.getTblingredientes().setValueAt(p.getNombre(), i.value, 1);
            visen.getTblingredientes().setValueAt(p.getBeneficio(), i.value, 2);
            visen.getTblingredientes().setValueAt(String.valueOf(p.getCantidad()), i.value, 3);
            visen.getTblingredientes().setValueAt(String.valueOf(p.getPrecio()), i.value, 4);
            visen.getTblingredientes().setValueAt(String.valueOf(p.getTiempoPreparacion()), i.value, 5);
            Image img = p.getFoto();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                visen.getTblingredientes().setValueAt(new JLabel(icon), i.value, 6);
            } else {
                visen.getTblingredientes().setValueAt(null, i.value, 6);
            }
            i.value++;
        });
    }

    public void calculoSubTotal(String aguja) {
        int porcion = 0;
        try {
            DecimalFormat df = new DecimalFormat("#.00");
            porcion = Integer.parseInt(aguja);
            float precioi = Float.parseFloat(visen.getTxtPrecioIngrediente().getText());
            float sub = porcion * precioi;
            if (sub < 1) {
                visen.getTxtSubTotal().setText("0" + String.valueOf(df.format(sub)));
            } else {
                visen.getTxtSubTotal().setText(String.valueOf(df.format(sub)));
            }

        } catch (Exception ex) {
            visen.getTxtSubTotal().setText("0");

        }
    }

    public void agregarPro() {
        
        String cantidad = "";
        int fila = visen.getTblingredientes().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");

        } else {
            String ident = (String) visen.getTblingredientes().getValueAt(fila, 0);
            String nombre = (String) visen.getTblingredientes().getValueAt(fila, 1);
            cantidad = (String) visen.getTblingredientes().getValueAt(fila, 3);
            String precio = (String) visen.getTblingredientes().getValueAt(fila, 4);
           
            visen.getLblID().setText(ident);
            visen.getLblNombre().setText(nombre);
            visen.getTxtPrecioIngrediente().setText(precio);
            visen.getTxtCanDisponible().setText(cantidad);
            calculoSubTotal(visen.getTxtPorcionIngrediente().getText());
        }
       
    }
    

    
    public void exportarDatos() {

        int ca = Integer.parseInt(visen.getTxtPorcionIngrediente().getText());
        int di = Integer.parseInt(visen.getTxtCanDisponible().getText());

        if ((di - ca) < 0 || di == 0 || ca == 0) {
            JOptionPane.showMessageDialog(null, "Cantidad Insuficiente");
            borrarDialogo();
        } else {
            int i = JOptionPane.showConfirmDialog(null, "   El valor a pagar es " + visen.getTxtSubTotal().getText() + "\n¿Desea agregar el ingrediente?", "AGREGAR INGREDIENTE", 1, 2);

            if (i == 0) {
                JOptionPane.showMessageDialog(null, "aqui guarda los datos");
                DefaultTableModel tblModel;
                tblModel = (DefaultTableModel) visen.getTblIngredientesParaCalcular().getModel();
                String[] info = new String[4];
                info[0] = visen.getLblID().getText();
                info[1] = visen.getTxtPorcionIngrediente().getText();
                info[2] = visen.getLblNombre().getText();
                info[3] = visen.getTxtSubTotal().getText();
                tblModel.addRow(info);

            } else {
                if (i == 1) {
                    borrarDialogo();
                }

            }

        }

    }

    public void almacenarValores(String id, int cantidad) {

    }

    public void abrirListaIngredientes() {
        visen.getDlgListaProductosAgregados().setTitle("Lista Ingredientes Agregados");
        visen.getDlgListaProductosAgregados().setSize(615, 350);
        visen.getDlgListaProductosAgregados().setLocationRelativeTo(vp);
        visen.getDlgListaProductosAgregados().setVisible(true);
    }

    public void QuitarIngredientesdDeListaAgregada() {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) visen.getTblIngredientesParaCalcular().getModel();
        int fila = visen.getTblIngredientesParaCalcular().getSelectedRow();
        if (fila >= 0) {
            String produ = (String) visen.getTblIngredientesParaCalcular().getValueAt(fila, 2);
            int i = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar "+produ+" de la ensalada ?", "ELIMINAR", 0, 3);
            if(i==0){
                 tblModel.removeRow(fila);
            }
           
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }

}

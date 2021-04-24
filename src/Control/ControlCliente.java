package Control;

import Clases_base.Cliente;
import Interfaces.Vista_Cliente;
import Interfaces.Vista_Principal;
import Modelo.ModeloCliente;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControlCliente {    
    private ModeloCliente modelo;
    private Vista_Cliente vista;
    private Vista_Principal vp;
    
    public ControlCliente(ModeloCliente modelo, Vista_Cliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vp = vp;
        vista.setVisible(true);//Mostramos la interfaz
        //vista.setLocationRelativeTo(null);
    }
    
    public void IniciaControl(){
        
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                CargarLista(vista.getTxtbuscar().getText());
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        vista.getBtncrear().addActionListener(l->CrearCliente());//llamamos al listener del boton crear
        vista.getBtnmodificar().addActionListener(l->Elegir());//llamamos al listener del boton modificar
        vista.getBtneliminar().addActionListener(l->Eliminar());//llamamos al listener del boton eliminar
        vista.getBtnlistar().addActionListener(l->CargarLista(""));//llamamos al listener del boton listar
        vista.getBtnsalir().addActionListener(l->cancelar());//llamamos al listener del boton salir
        vista.getTxtbuscar().addKeyListener(kl);
        // JDIALOG
        
        vista.getBtnguardar().addActionListener(l->grabarpersona());
        vista.getBtneditar().addActionListener(l->Actualizar());
        vista.getBtncancelar().addActionListener(l->CancelarDialogo());
        vista.getBtncancelar().addActionListener(l->CancelarDialogo());

    }
    
    //LISTAR--------------------------------------------------------------------------------------------------------------------
    
    private void CargarLista(String aguja){
        
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista.getTblcliente().getModel();
        tblModel.setNumRows(0);
        List<Cliente> lista=ModeloCliente.listarCliente(aguja);
        int ncols=tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(cl->{
        String [] cliente={cl.getIdCliente(), cl.getNombre(), cl.getApellido()};
        
            tblModel.addRow(new Object[ncols]);
            vista.getTblcliente().setValueAt(cl.getIdCliente(), i.value, 0);
            vista.getTblcliente().setValueAt(cl.getNombre(), i.value, 1);
            vista.getTblcliente().setValueAt(cl.getApellido(), i.value, 2);
            
            i.value++;
        });
    }
    
    
    //CREAR---------------------------------------------------------------------------------------------------------------------
    public void CrearCliente(){
        vista.getBtnguardar().setVisible(true);
        vista.getBtneditar().setVisible(false);
        vista.getTxtid().setEnabled(true);
        vista.getDgcliente().setTitle("CREAR CLIENTE");
        vista.getDgcliente().setSize(450,550);
        vista.getDgcliente().setVisible(true);
        vista.setVisible(true);
        vista.getDgcliente().setLocationRelativeTo(null);
    }
    public void grabarpersona(){
        String ident = vista.getTxtid().getText();
        String nombre = vista.getTxtnombres().getText();
        String apellido = vista.getTxtapellidos().getText();
        
        ModeloCliente cliente = new ModeloCliente(ident, nombre, apellido);
        if(cliente.Crear()){
            
            //cargarLista("");
            vista.getDgcliente().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Cliente Creado");//Si la persona se creo envia el mensaje
            }else{
                JOptionPane.showMessageDialog(vista, "ERROR!!!!!!");//Si no se creo se enviara el error
        }
        LimpiarDialogo();
        
        vista.getDgcliente().setVisible(false);
        vista.setVisible(true);
       // CargarLista("");
    }
    public void LimpiarDialogo(){
        vista.getTxtid().setText("");
        vista.getTxtnombres().setText("");
        vista.getTxtapellidos().setText("");
    }
    private void CancelarDialogo(){
        vista.getDgcliente().setVisible(false);
        vista.setVisible(true);
    }
    //MODIFICAR------------------------------------------------------------------------------------------------------------------
    private void editarpersona(){
        vista.getBtnguardar().setVisible(false);
        vista.getBtneditar().setVisible(true);
        vista.getTxtid().setEnabled(false);
        vista.getDgcliente().setTitle("MODIFICAR DATOS DE PERSONA");//Poner titulo en el JDialogo
        vista.getDgcliente().setSize(450, 450);//Tamaño del JDialog
        vista.getDgcliente().setLocationRelativeTo(null);//Para que el Jdialog se muestre en la mitad de la pantalla
    }
    private void Elegir(){
        editarpersona();
        
        int fila = vista.getTblcliente().getSelectedRow();
        if (fila == -1) {
            vista.getDgcliente().setVisible(false);//Para que se puede ver el JDialog en la compilacion
            vista.setVisible(true);
            JOptionPane.showMessageDialog(null, "SELECCIONAR UNA FILA");
        } else {
            vista.getDgcliente().setVisible(true);//Para que se puede ver el JDialog en la compilacion
            vista.setVisible(false);
            String idpersona = (String) vista.getTblcliente().getValueAt(fila, 0);
            String nombre = (String) vista.getTblcliente().getValueAt(fila, 1);
            String apellido = (String) vista.getTblcliente().getValueAt(fila, 2);
            
            vista.getTxtid().setText(idpersona);
            vista.getTxtnombres().setText(nombre);
            vista.getTxtapellidos().setText(apellido);
            
            editarpersona();
        }
    }
    public void Actualizar(){
        String idcli = vista.getTxtid().getText();
        String nombre = vista.getTxtnombres().getText();
        String apellido = vista.getTxtapellidos().getText();
        
        LimpiarDialogo();
        
        ModeloCliente cli = new ModeloCliente(idcli, nombre, apellido);
        if (cli.Modificar()) {
            JOptionPane.showMessageDialog(vista, "Datos De Cliente Modificados");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR!!!");
        }
        
        vista.getDgcliente().setVisible(false);
        vista.setVisible(true);
        CargarLista("");
    }
    //ELIMINAR-----------------------------------------------------------------------------------------------------------------
    private void Eliminar(){
        DefaultTableModel dtmCliente = (DefaultTableModel) vista.getTblcliente().getModel();
        int fila = vista.getTblcliente().getSelectedRow();
        
        if (fila != -1) {
            String idcl = dtmCliente.getValueAt(fila, 0).toString();
            modelo.setIdCliente(idcl);
            if (modelo.Eliminar()) {
                JOptionPane.showMessageDialog(vista, "Cliente Eliminado");
            } else {
                JOptionPane.showMessageDialog(vista, "ERROR!!!");
            }
            CargarLista(idcl);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONAR UNA FILA");
        }
        CargarLista("");
    }
    //CERRAR JFRAME--------------------------------------------------------------------------------------------------------- 
    public void cancelar(){
        vista.setVisible(false);
    }
}

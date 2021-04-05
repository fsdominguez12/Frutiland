package Control;

import Clases_base.Cliente;
import Interfaces.Vista_Ensalada;
import Modelo.ModeloCliente;
import Modelo.ModeloEnsalada;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControlEnsalada {

    private ModeloEnsalada moes;
    private Vista_Ensalada visen;

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
            }

        };

        visen.getTxtCedulaClienteEnsalada().addKeyListener(kl);

    }

    public void limpiarDialogo() {
        visen.getTxtCodigoEnsalada().setText(" ");
    }

    public void restringirDialogo() {
        visen.getTxtClienteEnsalada().setEnabled(false);
        visen.getTxtDescripcionEnsalada().setEnabled(false);
        visen.getTxtTiempoEnsalada().setEnabled(false);
        visen.getTxtTotalEnsalada().setEnabled(false);
    }

    public void buscarCliente(String aguja) {

        List<Cliente> lista = ModeloCliente.listarCliente(aguja);
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(cl -> {
            String[] cliente = {cl.getNombre(), cl.getApellido()};
            visen.getTxtClienteEnsalada().setText(cl.getNombre()+" "+cl.getApellido());

        });
        
        
    }
}

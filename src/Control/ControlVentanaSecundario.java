package Control;

import Interfaces.Vista_Entrega_Ensalada;
import Interfaces.Vista_Inicio;
import Interfaces.Vista_Secundario;
import Modelo.ModeloEnsalada;
import javax.swing.JFrame;

public class ControlVentanaSecundario {

    Vista_Secundario vvse;

    public ControlVentanaSecundario(Vista_Secundario vvse) {
        this.vvse = vvse;
        vvse.setVisible(true);
        vvse.setLocationRelativeTo(null);
        vvse.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void IniciaControl() {
        vvse.getBtnSecundarioRegresar().addActionListener(l -> RegresarMenuEleccion());
        InterfazEntregaEnsalada();

    }

    private void RegresarMenuEleccion() {
        Vista_Inicio vi = new Vista_Inicio();
        ControlInicio cvi = new ControlInicio(vi);
        cvi.IniciaControl();
        vvse.setVisible(false);

    }

    private void InterfazEntregaEnsalada() {
        
         ModeloEnsalada modeloEns = new ModeloEnsalada();
        Vista_Entrega_Ensalada vienens = new Vista_Entrega_Ensalada();
        vvse.getDesktopSecundario().add(vienens);
        ControlEntrega coen = new ControlEntrega(modeloEns,vienens);
        coen.IniciaControl();
 
        
        
        
    }

}

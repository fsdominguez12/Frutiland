package Control;

import Interfaces.Vista_Ensalada;
import Interfaces.Vista_Entrega_Ensalada;
import Interfaces.Vista_Ingrediente;
import Interfaces.Vista_Inicio;
import Interfaces.Vista_Principal;
import Interfaces.Vista_Secundario;
import Modelo.ModeloEnsalada;
import Modelo.ModeloIngrediente;
import javax.swing.JFrame;

public class ControlVentanaSecundario {
    ControlVentanaPrincipal cove;
    Vista_Secundario vvse;

    public ControlVentanaSecundario(Vista_Secundario vvse) {
        this.vvse = vvse;
        vvse.setVisible(true);
        vvse.setLocationRelativeTo(null);
        vvse.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void IniciaControl() {
        InterfazEntregaEnsalada();
        vvse.getBtnSecundarioRegresar().addActionListener(l -> RegresarMenuEleccion());
        
        vvse.getMnuSecundarioBeneficios().addActionListener(l -> Beneficio());
        vvse.getMnuSecundarioBuscar().addActionListener(l -> BuscaEnsalada());
        vvse.getMnuSecundarioMisionVision().addActionListener(l ->MV());
        

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
    
    public void BuscaEnsalada(){
      Vista_Ensalada vistaEns = new Vista_Ensalada();
        vistaEns.getDlgListaEnsaladas().setSize(600, 390);
        vistaEns.getDlgListaEnsaladas().setLocationRelativeTo(null);
        vistaEns.getDlgListaEnsaladas().setVisible(true);
        
        ModeloEnsalada modeloEns = new ModeloEnsalada();
        ControlEnsalada ens = new ControlEnsalada(modeloEns, vistaEns);
        ens.IniciaControl();  
    }

    private void Beneficio() {
        Vista_Principal vipri = new Vista_Principal();
        vipri.getDlgBeneficios().setSize(776, 585);
        vipri.getDlgBeneficios().setLocationRelativeTo(null);
        vipri.getDlgBeneficios().setVisible(true);
        System.out.println("jnjk");
        ModeloIngrediente modeloIng = new ModeloIngrediente();
        Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        ControlIngrediente ingr = new ControlIngrediente(modeloIng, vistaIng, vipri);
        ingr.IniciaControl();
        ingr.cargarLista("");
    }
    
    private void MV(){
        Vista_Principal vista = new Vista_Principal();
        vista.getDlgmisionvision().setSize(581, 430);
        vista.getDlgmisionvision().setVisible(true);
        vista.getDlgmisionvision().setLocationRelativeTo(null);
    }
}

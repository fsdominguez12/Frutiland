package Control;

import Interfaces.Vista_Cliente;
import Interfaces.Vista_Ensalada;
import Interfaces.Vista_Ingrediente;
import Interfaces.Vista_Inicio;
import Interfaces.Vista_Principal;
import Modelo.ModeloCliente;
import Modelo.ModeloEnsalada;
import Modelo.ModeloIngrediente;
import javax.swing.JFrame;

public class ControlVentanaPrincipal {

    Vista_Principal vp;
    ControlCliente cl;

    public ControlVentanaPrincipal(Vista_Principal vp) {
        this.vp = vp;
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        vp.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void IniciaControl() {
        Thread hilo1 = new ControlHilo("reloj", vp);
        hilo1.start();
        Ensalada();
        vp.getBtncliente().addActionListener(l -> Cliente());
        vp.getBtningrediente().addActionListener(l -> Ingrediente());
        vp.getBtnensalada().addActionListener(l -> Ensalada());
        vp.getBtnRegresar().addActionListener(l -> Regresar());
        vp.getBtnCrearClienteMenu().addActionListener(l -> NuevoCliente());
        vp.getBtnBeneficiosmenu().addActionListener(l -> Beneficio());
        vp.getBtnBuscarEnsalada().addActionListener(l -> BuscarEnsalada());
        vp.getMnuAgregarStockIngrediente().addActionListener(l -> AgregarStockIngrediente());
        vp.getMnuCrearIngrediente().addActionListener(l -> CrearIngrediente());
        vp.getMisionvisionItem().addActionListener(l->MV());
    }

    private void Cliente() {
        ModeloCliente modelo = new ModeloCliente();
        Vista_Cliente vista = new Vista_Cliente();
        vp.getDesktop().add(vista);
        ControlCliente cli = new ControlCliente(modelo, vista);
        cli.IniciaControl();

    }

    private void Ingrediente() {
        ModeloIngrediente modeloIng = new ModeloIngrediente();
        Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        Vista_Principal vipri = new Vista_Principal();
        vp.getDesktop().add(vistaIng);
        ControlIngrediente ingr = new ControlIngrediente(modeloIng, vistaIng, vipri);
        ingr.IniciaControl();
        ingr.cargarLista("");
    }

    private void Ensalada() {
        ModeloEnsalada modeloEns = new ModeloEnsalada();
        Vista_Ensalada vistaEns = new Vista_Ensalada();
        vp.getDesktop().add(vistaEns);
        ControlEnsalada ens = new ControlEnsalada(modeloEns, vistaEns);
        ens.IniciaControl();
    }

    private void Regresar() {
        Vista_Inicio vi = new Vista_Inicio();
        ControlInicio cvi = new ControlInicio(vi);
        cvi.IniciaControl();
        vp.setVisible(false);

    }

    public void NuevoCliente() {
        ModeloCliente modelo = new ModeloCliente();
        Vista_Cliente vista = new Vista_Cliente();
        ControlCliente cli = new ControlCliente(modelo, vista);
        cli.IniciaControl();
        cli.CrearCliente();
    }

    private void Beneficio() {
        Vista_Principal vipri = new Vista_Principal();
        vipri.getDlgBeneficios().setSize(776, 585);
        vipri.getDlgBeneficios().setLocationRelativeTo(null);
        vipri.getDlgBeneficios().setVisible(true);

        ModeloIngrediente modeloIng = new ModeloIngrediente();
        Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        ControlIngrediente ingr = new ControlIngrediente(modeloIng, vistaIng, vipri);
        ingr.IniciaControl();
        ingr.cargarLista("");
    }

    public void BuscarEnsalada() {
        Vista_Ensalada vistaEns = new Vista_Ensalada();
        vistaEns.getDlgListaEnsaladas().setSize(600, 403);
        vistaEns.getDlgListaEnsaladas().setLocationRelativeTo(null);
        vistaEns.getDlgListaEnsaladas().setVisible(true);
        
        ModeloEnsalada modeloEns = new ModeloEnsalada();
        ControlEnsalada ens = new ControlEnsalada(modeloEns, vistaEns);
        ens.IniciaControl();
    }
    
    public void CrearIngrediente(){
        
       ModeloIngrediente modeloIng = new ModeloIngrediente();
       Vista_Ingrediente vistaIng = new Vista_Ingrediente();
       Vista_Principal vipri = new Vista_Principal();
       ControlIngrediente ingr = new ControlIngrediente(modeloIng, vistaIng, vipri);
       ingr.IniciaControl();
       ingr.MetodoControlTamaño("CREAR", "REGISTRO INGREDIENTE");

        
    }
    
    public void AgregarStockIngrediente(){
        
       
       
       Vista_Principal vipri = new Vista_Principal();
       Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        vistaIng.getDgStock().setSize(385, 405);
        vistaIng.getDgStock().setLocationRelativeTo(null);
        vistaIng.getDgStock().setVisible(true);
        
        ModeloIngrediente modeloIng = new ModeloIngrediente();
        ControlIngrediente ingr = new ControlIngrediente(modeloIng, vistaIng, vipri);
        ingr.IniciaControl();
        ingr.RestringirDialogoStock();
    }
    
    private void MV(){
        Vista_Principal vista = new Vista_Principal();
        vista.getDlgmisionvision().setSize(650, 500);
        vista.getDlgmisionvision().setVisible(true);
        vista.getDlgmisionvision().setLocationRelativeTo(null);
    }

    
}

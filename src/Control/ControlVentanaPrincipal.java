/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.Vista_Cliente;
import Interfaces.Vista_Ingrediente;
import Interfaces.Vista_Principal;
import Modelo.ModeloCliente;
import Modelo.ModeloIngrediente;

/**
 *
 * @author Jonnathan
 */
public class ControlVentanaPrincipal {
    
    Vista_Principal vp;

    public ControlVentanaPrincipal(Vista_Principal vp) {
        this.vp = vp;
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
    }
    
    public void IniciaControl(){
        vp.getBtncliente().addActionListener(l->Cliente());
        vp.getBtnsalir().addActionListener(l->Salir());
        vp.getBtningrediente().addActionListener(l->Ingrediente());
    }
    
    private void Cliente(){
        ModeloCliente modelo = new ModeloCliente();
        Vista_Cliente vista = new Vista_Cliente();
        ControlCliente cli = new ControlCliente(modelo, vista);
        cli.IniciaControl();
    }
    
     private void Ingrediente(){
        ModeloIngrediente modeloIng = new ModeloIngrediente();
        Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        ControlIngrediente ingr=new ControlIngrediente(modeloIng,vistaIng);
        ingr.IniciaControl();
    }
    
    private void Salir(){
        System.exit(0);
    }
}

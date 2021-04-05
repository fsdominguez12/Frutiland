/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public ControlVentanaPrincipal(Vista_Principal vp) {
        this.vp = vp;
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        vp.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void IniciaControl(){
        vp.getBtncliente().addActionListener(l->Cliente());
        vp.getBtnsalir().addActionListener(l->Salir());
        vp.getBtningrediente().addActionListener(l->Ingrediente());
        vp.getBtnensalada().addActionListener(l->Ensalada());
       
    }
    
    private void Cliente(){
        ModeloCliente modelo = new ModeloCliente();
        Vista_Cliente vista = new Vista_Cliente();
        vp.getDesktop().add(vista);
        ControlCliente cli = new ControlCliente(modelo, vista);
        cli.IniciaControl();
    }
    
     private void Ingrediente(){
        ModeloIngrediente modeloIng = new ModeloIngrediente();
        Vista_Ingrediente vistaIng = new Vista_Ingrediente();
        vp.getDesktop().add(vistaIng);
        ControlIngrediente ingr=new ControlIngrediente(modeloIng,vistaIng);
        ingr.IniciaControl();
        ingr.lis();
    }
     
     private void Ensalada(){
        ModeloEnsalada modeloEns = new ModeloEnsalada();
        Vista_Ensalada vistaEns = new Vista_Ensalada();
        vp.getDesktop().add(vistaEns);
        ControlEnsalada ens=new ControlEnsalada(modeloEns,vistaEns);
        ens.IniciaControl();
     }
    
    private void Salir(){
        System.exit(0);
    }
}

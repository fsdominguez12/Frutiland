
package Frutiland;

import Control.ControlInicio;
import Control.ControlVentanaPrincipal;
import Interfaces.Vista_Inicio;
import Interfaces.Vista_Principal;

public class Frutiland {

    public static void main(String[] args) {

        Vista_Inicio vi=new Vista_Inicio();
        ControlInicio cvi = new ControlInicio(vi);
        cvi.IniciaControl();        
    }
    
}

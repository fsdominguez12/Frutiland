
package Frutiland;

import Control.ControlVentanaPrincipal;
import Interfaces.Vista_Principal;




/**
 *
 * @author Jonnathan
 */
public class Frutiland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Vista_Principal vista = new Vista_Principal();
        ControlVentanaPrincipal cvp = new ControlVentanaPrincipal(vista);
        cvp.IniciaControl();
        
    }
    
}

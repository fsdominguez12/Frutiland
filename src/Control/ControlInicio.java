
package Control;

import Interfaces.Vista_Inicio;
import Interfaces.Vista_Principal;

public class ControlInicio {
    
Vista_Inicio vi;

    public ControlInicio(Vista_Inicio vi) {
        this.vi = vi;
        vi.setVisible(true);
        vi.setLocationRelativeTo(null);
    }
    
     public void IniciaControl(){
         vi.getBtnUsuario1().addActionListener(l->Usuario1());
         vi.getBtnUsuario2().addActionListener(l->Usuario2());
    }
    
     public void Usuario1(){
        Vista_Principal vista = new Vista_Principal();
        ControlVentanaPrincipal cvp = new ControlVentanaPrincipal(vista);
        cvp.IniciaControl();
        vi.setVisible(false);
     }
     
     public void Usuario2(){
        
     }
     
}

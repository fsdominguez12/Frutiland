
package Control;

import Interfaces.Vista_Principal;
import java.time.LocalDateTime;


public class ControlHilo extends Thread {
    boolean ejecucion = true;
    private LocalDateTime tiempo;
    private  Vista_Principal vipri;
    
    
     public ControlHilo(String name, Vista_Principal vipri) {
        super(name);
        this.vipri = vipri;
    }

    @Override
    public void run() {
        switch (getName()) {
            case "reloj":
                reloj();
                break;
        }
    
    }
    
    
    public void reloj() {
        while (true) {
            tiempo = LocalDateTime.now();
            if(tiempo.getMinute()<10){
                vipri.getLblReloj().setText(tiempo.getHour() + " : 0" + tiempo.getMinute() + " : " + tiempo.getSecond());
            }else{
                if(tiempo.getSecond()<10){
                    vipri.getLblReloj().setText(tiempo.getHour() + " : " + tiempo.getMinute() + " : 0" + tiempo.getSecond());
                }else{
                    if(tiempo.getMinute()<10 && tiempo.getSecond()<10 ){
                       vipri.getLblReloj().setText(tiempo.getHour() + " : 0" + tiempo.getMinute() + " : 0" + tiempo.getSecond()); 
                    }else{
                        vipri.getLblReloj().setText(tiempo.getHour() + " : " + tiempo.getMinute() + " : " + tiempo.getSecond());
                    }
                    
                }
                
            }
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }

        }
    }
}

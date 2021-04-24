/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases_base.Ensalada;
import Interfaces.Vista_Entrega_Ensalada;
import Modelo.ModeloEnsalada;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControlEntrega {

    ModeloEnsalada moensa;
    Vista_Entrega_Ensalada vivese;
    ControlEnsalada coen;

    public ControlEntrega(ModeloEnsalada moensa, Vista_Entrega_Ensalada vivese) {
        this.moensa = moensa;
        this.vivese = vivese;
    }

    public void IniciaControl() {
        vivese.setVisible(true);
        CargarListaEnsaladaParaBuscar("");
    }

    private void CargarListaEnsaladaParaBuscar(String aguja) {

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vivese.getTblEntregaEnsalada().getModel();
        tblModel.setNumRows(0);
        List<Ensalada> lista = ModeloEnsalada.listarEnsalada(aguja, 3);
        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach((Ensalada en) -> {
            String[] ensalada = {en.getCodigoEnsalada(), en.getCedulaCliEnsa(), en.getDescripcion(), String.valueOf(en.isEstado()).toString(), en.getHoraGeneracion(), en.getHoraEntrega()};

            tblModel.addRow(new Object[ncols]);

            vivese.getTblEntregaEnsalada().setValueAt(en.getCodigoEnsalada(), i.value, 0);
            vivese.getTblEntregaEnsalada().setValueAt(en.getCedulaCliEnsa(), i.value, 1);
            vivese.getTblEntregaEnsalada().setValueAt(en.getDescripcion(), i.value, 2);
            String estado="";
            if (en.isEstado()==true){
                estado="Entregado";
            }else{
                estado="Por Entregar";
            }
            vivese.getTblEntregaEnsalada().setValueAt(estado, i.value, 3);
            vivese.getTblEntregaEnsalada().setValueAt(en.getHoraGeneracion(), i.value, 4);
            vivese.getTblEntregaEnsalada().setValueAt(en.getHoraEntrega(), i.value, 5);
            i.value++;
        });
    }
}

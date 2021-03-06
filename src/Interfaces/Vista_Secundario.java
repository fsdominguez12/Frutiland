/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author Dominguez
 */
public class Vista_Secundario extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Usuario2
     */
    public Vista_Secundario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel9 = new javax.swing.JLabel();
        btnSecundarioRegresar = new javax.swing.JButton();
        DesktopSecundario = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSecundarioBuscar = new javax.swing.JMenuItem();
        mnuSecundarioBeneficios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuSecundarioMisionVision = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/Frutiland.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 250, 100));

        jToolBar1.setBackground(new java.awt.Color(102, 255, 255));
        jToolBar1.setRollover(true);

        jLabel9.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jToolBar1.add(jLabel9);

        btnSecundarioRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/atras.png"))); // NOI18N
        btnSecundarioRegresar.setFocusable(false);
        btnSecundarioRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSecundarioRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSecundarioRegresar);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 70, 50));

        javax.swing.GroupLayout DesktopSecundarioLayout = new javax.swing.GroupLayout(DesktopSecundario);
        DesktopSecundario.setLayout(DesktopSecundarioLayout);
        DesktopSecundarioLayout.setHorizontalGroup(
            DesktopSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        DesktopSecundarioLayout.setVerticalGroup(
            DesktopSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(DesktopSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 810, 470));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 100)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/im6.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1450, 700));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/ensalada-de-frutas.png"))); // NOI18N
        jMenu1.setText("ENSALADAS");

        mnuSecundarioBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/buscarEnsalada.png"))); // NOI18N
        mnuSecundarioBuscar.setText("Buscar Ensalada");
        mnuSecundarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSecundarioBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSecundarioBuscar);

        mnuSecundarioBeneficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/beneficio.png"))); // NOI18N
        mnuSecundarioBeneficios.setText("Beneficios");
        mnuSecundarioBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSecundarioBeneficiosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSecundarioBeneficios);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/info.png"))); // NOI18N
        jMenu2.setText("INFORMACI??N");

        mnuSecundarioMisionVision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/mision_vision.PNG"))); // NOI18N
        mnuSecundarioMisionVision.setText("Visi??n/Misi??n");
        jMenu2.add(mnuSecundarioMisionVision);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSecundarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSecundarioBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuSecundarioBuscarActionPerformed

    private void mnuSecundarioBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSecundarioBeneficiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuSecundarioBeneficiosActionPerformed

    public JDesktopPane getDesktopSecundario() {
        return DesktopSecundario;
    }

    public void setDesktopSecundario(JDesktopPane DesktopSecundario) {
        this.DesktopSecundario = DesktopSecundario;
    }

    public JButton getBtnSecundarioRegresar() {
        return btnSecundarioRegresar;
    }

    public void setBtnSecundarioRegresar(JButton btnSecundarioRegresar) {
        this.btnSecundarioRegresar = btnSecundarioRegresar;
    }

    public JMenuItem getMnuSecundarioBuscar() {
        return mnuSecundarioBuscar;
    }

    public void setMnuSecundarioBuscar(JMenuItem mnuSecundarioBuscar) {
        this.mnuSecundarioBuscar = mnuSecundarioBuscar;
    }

    public JMenuItem getMnuSecundarioBeneficios() {
        return mnuSecundarioBeneficios;
    }

    public void setMnuSecundarioBeneficios(JMenuItem mnuSecundarioBeneficios) {
        this.mnuSecundarioBeneficios = mnuSecundarioBeneficios;
    }

    public JMenuItem getMnuSecundarioMisionVision() {
        return mnuSecundarioMisionVision;
    }

    public void setMnuSecundarioMisionVision(JMenuItem mnuSecundarioMisionVision) {
        this.mnuSecundarioMisionVision = mnuSecundarioMisionVision;
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopSecundario;
    private javax.swing.JButton btnSecundarioRegresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuSecundarioBeneficios;
    private javax.swing.JMenuItem mnuSecundarioBuscar;
    private javax.swing.JMenuItem mnuSecundarioMisionVision;
    // End of variables declaration//GEN-END:variables
}


package Interfaces;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Vista_Ensalada extends javax.swing.JInternalFrame {

    
    public Vista_Ensalada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAgregarIngrediente = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblingredientes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        btnAgregaIngrediente = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtPorcionIngrediente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtPrecioIngrediente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCanDisponible = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnAdjuntar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        dlgListaProductosAgregados = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIngredientesParaCalcular = new javax.swing.JTable();
        btnQuitar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTexto2 = new javax.swing.JLabel();
        lblTexto3 = new javax.swing.JLabel();
        lblTexto4 = new javax.swing.JLabel();
        lblTexto6 = new javax.swing.JLabel();
        txtCodigoEnsalada = new javax.swing.JTextField();
        txtTiempoEnsalada = new javax.swing.JTextField();
        txtDescripcionEnsalada = new javax.swing.JTextField();
        txtCedulaClienteEnsalada = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtTotalEnsalada = new javax.swing.JTextField();
        lblTexto5 = new javax.swing.JLabel();
        btnAgregarIngrediente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        txtClienteEnsalada = new javax.swing.JTextField();
        lblTexto7 = new javax.swing.JLabel();
        btnEliminarIngrediente = new javax.swing.JButton();
        btnVerProductosAgregados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEspera = new javax.swing.JLabel();

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblingredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID PRODUCTO", "NOMBRE", "BENEFICIO", "PORCION", "PRECIO", "T.ESPERA", "FOTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblingredientes);
        if (tblingredientes.getColumnModel().getColumnCount() > 0) {
            tblingredientes.getColumnModel().getColumn(4).setHeaderValue("PRECIO");
            tblingredientes.getColumnModel().getColumn(5).setHeaderValue("T.ESPERA");
            tblingredientes.getColumnModel().getColumn(6).setHeaderValue("FOTO");
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel5.setOpaque(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar:");

        TxtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregaIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/mas.png"))); // NOI18N
        btnAgregaIngrediente.setToolTipText("AGREGAR PRODUCTO");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("AGREGAR INGREDIENTE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnAgregaIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregaIngrediente)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 70));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel7.setOpaque(false);

        txtPorcionIngrediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sub Total:");

        txtSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrecioIngrediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Precio:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Porción:");

        txtCanDisponible.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Disponible:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcionIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCanDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCanDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcionIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 150));

        btnAdjuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/carrito.png"))); // NOI18N
        btnAdjuntar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 70, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/cerrar.png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 70, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/im1.jpg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("Disponible:");
        jPanel4.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 23));

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Disponible:");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 23));

        javax.swing.GroupLayout dlgAgregarIngredienteLayout = new javax.swing.GroupLayout(dlgAgregarIngrediente.getContentPane());
        dlgAgregarIngrediente.getContentPane().setLayout(dlgAgregarIngredienteLayout);
        dlgAgregarIngredienteLayout.setHorizontalGroup(
            dlgAgregarIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgAgregarIngredienteLayout.setVerticalGroup(
            dlgAgregarIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblIngredientesParaCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblIngredientesParaCalcular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "CANTIDAD", "NOMBRE", "TIEMPO ESPERA", "PRECIO PAGAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblIngredientesParaCalcular);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 550, 80));

        btnQuitar.setText("Quitar");
        jPanel8.add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, -1));

        jButton2.setText("jButton2");
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/im1.jpg"))); // NOI18N
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        javax.swing.GroupLayout dlgListaProductosAgregadosLayout = new javax.swing.GroupLayout(dlgListaProductosAgregados.getContentPane());
        dlgListaProductosAgregados.getContentPane().setLayout(dlgListaProductosAgregadosLayout);
        dlgListaProductosAgregadosLayout.setHorizontalGroup(
            dlgListaProductosAgregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgListaProductosAgregadosLayout.setVerticalGroup(
            dlgListaProductosAgregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel2.setOpaque(false);

        lblTexto2.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto2.setText("Tiempo:");

        lblTexto3.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto3.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto3.setText("Código:");

        lblTexto4.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto4.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto4.setText("Cliente:");

        lblTexto6.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto6.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto6.setText("Productos:");

        txtCodigoEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTiempoEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescripcionEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCedulaClienteEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        txtTotalEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTexto5.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto5.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto5.setText("Total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto5)
                .addGap(28, 28, 28)
                .addComponent(txtTotalEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(lblTexto5))
                    .addComponent(txtTotalEnsalada))
                .addContainerGap())
        );

        btnAgregarIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/action_add.png"))); // NOI18N

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/action_add.png"))); // NOI18N
        btnAgregarCliente.setToolTipText("CREAR NUEVO CLIENTE");

        txtClienteEnsalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTexto7.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblTexto7.setForeground(new java.awt.Color(204, 255, 255));
        lblTexto7.setText("Cédula");

        btnEliminarIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/action_delete.png"))); // NOI18N

        btnVerProductosAgregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/action_remove.png"))); // NOI18N
        btnVerProductosAgregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosAgregadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTexto3)
                        .addGap(40, 40, 40)
                        .addComponent(txtCodigoEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTexto7)
                        .addGap(48, 48, 48)
                        .addComponent(txtCedulaClienteEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTexto6)
                            .addComponent(lblTexto2)
                            .addComponent(lblTexto4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTiempoEnsalada, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtDescripcionEnsalada, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtClienteEnsalada))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerProductosAgregados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto3)
                    .addComponent(txtCodigoEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaClienteEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTexto7))
                    .addComponent(btnAgregarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexto4)
                    .addComponent(txtClienteEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTexto6)
                            .addComponent(btnAgregarIngrediente)
                            .addComponent(txtDescripcionEnsalada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTexto2)
                            .addComponent(txtTiempoEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnVerProductosAgregados)
                    .addComponent(btnEliminarIngrediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, 350));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENSALADA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/im5.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        lblEspera.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblEspera.setForeground(new java.awt.Color(204, 255, 255));
        lblEspera.setText("Código:");
        jPanel1.add(lblEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosAgregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosAgregadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerProductosAgregadosActionPerformed

    public JButton getBtnAgregarCliente() {
        return btnAgregarCliente;
    }

    public void setBtnAgregarCliente(JButton btnAgregarCliente) {
        this.btnAgregarCliente = btnAgregarCliente;
    }

    public JButton getBtnAgregarIngrediente() {
        return btnAgregarIngrediente;
    }

    public void setBtnAgregarIngrediente(JButton btnAgregarIngrediente) {
        this.btnAgregarIngrediente = btnAgregarIngrediente;
    }

    public JButton getBtnVerProductosAgregados() {
        return btnVerProductosAgregados;
    }

    public void setBtnVerProductosAgregados(JButton btnVerProductosAgregados) {
        this.btnVerProductosAgregados = btnVerProductosAgregados;
    }

    public JButton getBtnEliminarIngrediente() {
        return btnVerProductosAgregados;
    }

    public void setBtnEliminarIngrediente(JButton btnEliminarIngrediente) {
        this.btnVerProductosAgregados = btnEliminarIngrediente;
    }

    public JTextField getTxtCedulaClienteEnsalada() {
        return txtCedulaClienteEnsalada;
    }

    public void setTxtCedulaClienteEnsalada(JTextField txtCedulaClienteEnsalada) {
        this.txtCedulaClienteEnsalada = txtCedulaClienteEnsalada;
    }

    public JTextField getTxtClienteEnsalada() {
        return txtClienteEnsalada;
    }

    public void setTxtClienteEnsalada(JTextField txtClienteEnsalada) {
        this.txtClienteEnsalada = txtClienteEnsalada;
    }

    public JTextField getTxtCodigoEnsalada() {
        return txtCodigoEnsalada;
    }

    public void setTxtCodigoEnsalada(JTextField txtCodigoEnsalada) {
        this.txtCodigoEnsalada = txtCodigoEnsalada;
    }

    public JTextField getTxtDescripcionEnsalada() {
        return txtDescripcionEnsalada;
    }

    public void setTxtDescripcionEnsalada(JTextField txtDescripcionEnsalada) {
        this.txtDescripcionEnsalada = txtDescripcionEnsalada;
    }

    public JTextField getTxtTiempoEnsalada() {
        return txtTiempoEnsalada;
    }

    public void setTxtTiempoEnsalada(JTextField txtTiempoEnsalada) {
        this.txtTiempoEnsalada = txtTiempoEnsalada;
    }

    public JTextField getTxtTotalEnsalada() {
        return txtTotalEnsalada;
    }

    public void setTxtTotalEnsalada(JTextField txtTotalEnsalada) {
        this.txtTotalEnsalada = txtTotalEnsalada;
    }

    public JButton getBtnAdjuntar() {
        return btnAdjuntar;
    }

    public void setBtnAdjuntar(JButton btnAdjuntar) {
        this.btnAdjuntar = btnAdjuntar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JTextField getBtnSubTotal() {
        return txtSubTotal;
    }

    public void setBtnSubTotal(JTextField btnSubTotal) {
        this.txtSubTotal = btnSubTotal;
    }

    public JDialog getDlgAgregarIngrediente() {
        return dlgAgregarIngrediente;
    }

    public void setDlgAgregarIngrediente(JDialog dlgAgregarIngrediente) {
        this.dlgAgregarIngrediente = dlgAgregarIngrediente;
    }

    public JTable getTblingredientes() {
        return tblingredientes;
    }

    public void setTblingredientes(JTable tblingredientes) {
        this.tblingredientes = tblingredientes;
    }

    public JTextField getTxtBuscarAgregar() {
        return TxtBuscar;
    }

    public void setTxtBuscarAgregar(JTextField txtBuscarAgregar) {
        this.TxtBuscar = txtBuscarAgregar;
    }

    public JTextField getTxtPorcionIngrediente() {
        return txtPorcionIngrediente;
    }

    public void setTxtPorcionIngrediente(JTextField txtPorcionIngrediente) {
        this.txtPorcionIngrediente = txtPorcionIngrediente;
    }

    public JTextField getTxtSubTotal() {
        return txtSubTotal;
    }

    public void setTxtSubTotal(JTextField txtSubTotal) {
        this.txtSubTotal = txtSubTotal;
    }

    public JTextField getTxtBuscar() {
        return TxtBuscar;
    }

    public void setTxtBuscar(JTextField TxtBuscar) {
        this.TxtBuscar = TxtBuscar;
    }

    public JTextField getTxtPrecioIngrediente() {
        return txtPrecioIngrediente;
    }

    public void setTxtPrecioIngrediente(JTextField txtPrecioIngrediente) {
        this.txtPrecioIngrediente = txtPrecioIngrediente;
    }

    public JButton getBtnAgregaIngrediente() {
        return btnAgregaIngrediente;
    }

    public void setBtnAgregaIngrediente(JButton btnAgregaIngrediente) {
        this.btnAgregaIngrediente = btnAgregaIngrediente;
    }

    public JLabel getLblEspera() {
        return lblEspera;
    }

    public void setLblEspera(JLabel lblEspera) {
        this.lblEspera = lblEspera;
    }

    
    
    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtCanDisponible() {
        return txtCanDisponible;
    }

    public void setTxtCanDisponible(JTextField txtCanDisponible) {
        this.txtCanDisponible = txtCanDisponible;
    }

    public JDialog getDlgListaProductosAgregados() {
        return dlgListaProductosAgregados;
    }

    public JButton getBtnQuitar() {
        return btnQuitar;
    }

    public void setBtnQuitar(JButton btnQuitar) {
        this.btnQuitar = btnQuitar;
    }

    public void setDlgListaProductosAgregados(JDialog dlgListaProductosAgregados) {
        this.dlgListaProductosAgregados = dlgListaProductosAgregados;
    }

    public JTable getTblIngredientesParaCalcular() {
        return tblIngredientesParaCalcular;
    }

    public void setTblIngredientesParaCalcular(JTable tblIngredientesParaCalcular) {
        this.tblIngredientesParaCalcular = tblIngredientesParaCalcular;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnAgregaIngrediente;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarIngrediente;
    private javax.swing.JButton btnEliminarIngrediente;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerProductosAgregados;
    private javax.swing.JDialog dlgAgregarIngrediente;
    private javax.swing.JDialog dlgListaProductosAgregados;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEspera;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTexto4;
    private javax.swing.JLabel lblTexto5;
    private javax.swing.JLabel lblTexto6;
    private javax.swing.JLabel lblTexto7;
    private javax.swing.JTable tblIngredientesParaCalcular;
    private javax.swing.JTable tblingredientes;
    private javax.swing.JTextField txtCanDisponible;
    private javax.swing.JTextField txtCedulaClienteEnsalada;
    private javax.swing.JTextField txtClienteEnsalada;
    private javax.swing.JTextField txtCodigoEnsalada;
    private javax.swing.JTextField txtDescripcionEnsalada;
    private javax.swing.JTextField txtPorcionIngrediente;
    private javax.swing.JTextField txtPrecioIngrediente;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTiempoEnsalada;
    private javax.swing.JTextField txtTotalEnsalada;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Jonnathan
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
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

        DlgBeneficios = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtbusquedabeneficio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbeneficio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnvisualizar = new javax.swing.JButton();
        lblfruta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jepbeneficio = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Dlgmisionvision = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        Desktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        lblReloj = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btncliente = new javax.swing.JMenuItem();
        btnCrearClienteMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btningrediente = new javax.swing.JMenuItem();
        mnuCrearIngrediente = new javax.swing.JMenuItem();
        mnuAgregarStockIngrediente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnensalada = new javax.swing.JMenuItem();
        btnBuscarEnsalada = new javax.swing.JMenuItem();
        btnBeneficiosmenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        misionvisionItem = new javax.swing.JMenuItem();

        DlgBeneficios.setBackground(new java.awt.Color(51, 255, 255));

        jPanel3.setBackground(new java.awt.Color(50, 137, 180));

        txtbusquedabeneficio.setToolTipText("");

        tblbeneficio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblbeneficio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Beneficio", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblbeneficio);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BENEFICIOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Nombre de Fruta:");

        btnvisualizar.setBackground(new java.awt.Color(25, 178, 229));
        btnvisualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnvisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnvisualizar.setText("Visualizar");
        btnvisualizar.setToolTipText("Visualizar");

        lblfruta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfruta.setForeground(new java.awt.Color(255, 255, 255));
        lblfruta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfruta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jepbeneficio.setEditable(false);
        jepbeneficio.setBackground(new java.awt.Color(50, 137, 180));
        jepbeneficio.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jepbeneficio);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre Fruta:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Beneficio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblfruta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                                .addComponent(btnvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbusquedabeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusquedabeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfruta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout DlgBeneficiosLayout = new javax.swing.GroupLayout(DlgBeneficios.getContentPane());
        DlgBeneficios.getContentPane().setLayout(DlgBeneficiosLayout);
        DlgBeneficiosLayout.setHorizontalGroup(
            DlgBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DlgBeneficiosLayout.setVerticalGroup(
            DlgBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(511, 422));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MISIÓN");
        jLabel7.setToolTipText("");

        jScrollPane4.setToolTipText("Ofrecer un servicio de calidad en todo el proceso, desde la elaboración de una\nensalada hasta la forma de atender a nuestros clientes, adaptándonos a sus\nnecesidades. Del mismo modo, implicar a nuestros empleados trabajando en\nequipo para lograr la excelencia");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(102, 153, 255));
        jTextPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("En el 2022 ser reconocidos a nivel cantonal a través de nuestra innovación, la\nmejora continua y la generación de beneficio que se puede generar en el tema\nde salud.");
        jScrollPane4.setViewportView(jTextPane1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VISIÓN");
        jLabel8.setToolTipText("");

        jScrollPane5.setToolTipText("Ofrecer un servicio de calidad en todo el proceso, desde la elaboración de una\nensalada hasta la forma de atender a nuestros clientes, adaptándonos a sus\nnecesidades. Del mismo modo, implicar a nuestros empleados trabajando en\nequipo para lograr la excelencia");

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(102, 153, 255));
        jTextPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Ofrecer un servicio de calidad en todo el proceso, desde la elaboración de una\nensalada hasta la forma de atender a nuestros clientes, adaptándonos a sus\nnecesidades. Del mismo modo, implicar a nuestros empleados trabajando en\nequipo para lograr la excelencia.");
        jScrollPane5.setViewportView(jTextPane2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dirección:  Vía a El Despacho - El Valle     Teléfono :  099 280 9914       Propietaria: Alexandra Vanegas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DlgmisionvisionLayout = new javax.swing.GroupLayout(Dlgmisionvision.getContentPane());
        Dlgmisionvision.getContentPane().setLayout(DlgmisionvisionLayout);
        DlgmisionvisionLayout.setHorizontalGroup(
            DlgmisionvisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        DlgmisionvisionLayout.setVerticalGroup(
            DlgmisionvisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/Frutiland.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 250, 100));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/atras.png"))); // NOI18N
        btnRegresar.setToolTipText("VOLVER");
        btnRegresar.setFocusable(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, -1, -1));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 810, 470));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel2.setOpaque(false);

        lblReloj.setBackground(new java.awt.Color(0, 255, 255));
        lblReloj.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("RELOJ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(lblReloj))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, 200, 50));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 100)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/im6.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1450, 700));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/grupo-de-personas-dibujadas-a-mano-de-personas.png"))); // NOI18N
        jMenu1.setText("CLIENTES");
        jMenu1.setToolTipText("CLIENTES");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/cleinte.png"))); // NOI18N
        btncliente.setText("Clientes");
        btncliente.setToolTipText("Clientes");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        jMenu1.add(btncliente);

        btnCrearClienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/seguir.png"))); // NOI18N
        btnCrearClienteMenu.setText("Crear Cliente");
        btnCrearClienteMenu.setToolTipText("Crear Cliente");
        jMenu1.add(btnCrearClienteMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/ingredientes.png"))); // NOI18N
        jMenu2.setText("INGREDIENTES");
        jMenu2.setToolTipText("INGREDIENTES");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btningrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/Ingrediente (2).png"))); // NOI18N
        btningrediente.setText("Ingredientes");
        btningrediente.setToolTipText("Ingredientes");
        btningrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningredienteActionPerformed(evt);
            }
        });
        jMenu2.add(btningrediente);

        mnuCrearIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/mas.png"))); // NOI18N
        mnuCrearIngrediente.setText("Crear Ingrediente");
        mnuCrearIngrediente.setToolTipText("Crear Ingrediente");
        jMenu2.add(mnuCrearIngrediente);

        mnuAgregarStockIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/valores.png"))); // NOI18N
        mnuAgregarStockIngrediente.setText("Agregar Stock");
        mnuAgregarStockIngrediente.setToolTipText("Agregar Stock");
        jMenu2.add(mnuAgregarStockIngrediente);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/ensalada-de-frutas.png"))); // NOI18N
        jMenu3.setText("ENSALADAS");

        btnensalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/ensalada2.png"))); // NOI18N
        btnensalada.setText("Ensaladas");
        btnensalada.setToolTipText("Ensaladas");
        jMenu3.add(btnensalada);

        btnBuscarEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/buscarEnsalada.png"))); // NOI18N
        btnBuscarEnsalada.setText("Buscar Ensalada");
        btnBuscarEnsalada.setToolTipText("Buscar Ensalada");
        jMenu3.add(btnBuscarEnsalada);

        btnBeneficiosmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/beneficio.png"))); // NOI18N
        btnBeneficiosmenu.setText("Beneficios");
        btnBeneficiosmenu.setToolTipText("Beneficios");
        btnBeneficiosmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeneficiosmenuActionPerformed(evt);
            }
        });
        jMenu3.add(btnBeneficiosmenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/info.png"))); // NOI18N
        jMenu4.setText("INFORMACIÓN");
        jMenu4.setToolTipText("INFORMACIÓN");

        misionvisionItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/mision_vision.PNG"))); // NOI18N
        misionvisionItem.setText("MISIÓN/VISIÓN");
        misionvisionItem.setToolTipText("MISIÓN/VISIÓN");
        jMenu4.add(misionvisionItem);

        jMenuBar1.add(jMenu4);

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

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btningredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btningredienteActionPerformed

    private void btnBeneficiosmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiosmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeneficiosmenuActionPerformed

    public JMenuItem getBtncliente() {
        return btncliente;
    }

    public void setBtncliente(JMenuItem btncliente) {
        this.btncliente = btncliente;
    }

    public JMenuItem getBtnensalada() {
        return btnensalada;
    }

    public void setBtnensalada(JMenuItem btnensalada) {
        this.btnensalada = btnensalada;
    }

    public JMenuItem getBtningrediente() {
        return btningrediente;
    }

    public void setBtningrediente(JMenuItem btningrediente) {
        this.btningrediente = btningrediente;
    }

    public JMenuItem getBtnCrearClienteMenu() {
        return btnCrearClienteMenu;
    }

    public void setBtnCrearClienteMenu(JMenuItem btnCrearClienteMenu) {
        this.btnCrearClienteMenu = btnCrearClienteMenu;
    }
    
    
    public JMenuItem getBtnBeneficiosmenu() {
        return btnBeneficiosmenu;
    }

    public void setBtnBeneficiosmenu(JMenuItem btnBeneficiosmenu) {
        this.btnBeneficiosmenu = btnBeneficiosmenu;
    }
    
    
    

    public JDesktopPane getDesktop() {
        return Desktop;
    }

    public void setDesktop(JDesktopPane Desktop) {
        this.Desktop = Desktop;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public void setBtnRegresar(JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }

    public JLabel getLblReloj() {
        return lblReloj;
    }

    public void setLblReloj(JLabel lblReloj) {
        this.lblReloj = lblReloj;
    }

    
    public JDialog getDlgBeneficios() {
        return DlgBeneficios;
    }

    public void setDlgBeneficios(JDialog DlgBeneficios) {
        this.DlgBeneficios = DlgBeneficios;
    }
    
    public JTable getTblbeneficio() {
        return tblbeneficio;
    }

    public void setTblbeneficio(JTable tblbeneficio) {
        this.tblbeneficio = tblbeneficio;
    }

    public JTextField getTxtbusquedabeneficio() {
        return txtbusquedabeneficio;
    }

    public void setTxtbusquedabeneficio(JTextField txtbusquedabeneficio) {
        this.txtbusquedabeneficio = txtbusquedabeneficio;
    }

    public JButton getBtnvisualizar() {
        return btnvisualizar;
    }

    public JMenuItem getMnuAgregarStockIngrediente() {
        return mnuAgregarStockIngrediente;
    }

    public void setMnuAgregarStockIngrediente(JMenuItem mnuAgregarStockIngrediente) {
        this.mnuAgregarStockIngrediente = mnuAgregarStockIngrediente;
    }

    public JMenuItem getMnuCrearIngrediente() {
        return mnuCrearIngrediente;
    }

    public void setMnuCrearIngrediente(JMenuItem mnuCrearIngrediente) {
        this.mnuCrearIngrediente = mnuCrearIngrediente;
    }

    public JDialog getDlgmisionvision() {
        return Dlgmisionvision;
    }

    public void setDlgmisionvision(JDialog Dlgmisionvision) {
        this.Dlgmisionvision = Dlgmisionvision;
    }

    public JMenuItem getMisionvisionItem() {
        return misionvisionItem;
    }

    public void setMisionvisionItem(JMenuItem misionvisionItem) {
        this.misionvisionItem = misionvisionItem;
    }

   
    
    

    public void setBtnvisualizar(JButton btnvisualizar) {
        this.btnvisualizar = btnvisualizar;
    }

    public JEditorPane getJepbeneficio() {
        return jepbeneficio;
    }

    public void setJepbeneficio(JEditorPane jepbeneficio) {
        this.jepbeneficio = jepbeneficio;
    }

    public JLabel getLblfruta() {
        return lblfruta;
    }

    public void setLblfruta(JLabel lblfruta) {
        this.lblfruta = lblfruta;
    }

    public JMenuItem getBtnBuscarEnsalada() {
        return btnBuscarEnsalada;
    }

    public void setBtnBuscarEnsalada(JMenuItem btnBuscarEnsalada) {
        this.btnBuscarEnsalada = btnBuscarEnsalada;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JDialog DlgBeneficios;
    private javax.swing.JDialog Dlgmisionvision;
    private javax.swing.JMenuItem btnBeneficiosmenu;
    private javax.swing.JMenuItem btnBuscarEnsalada;
    private javax.swing.JMenuItem btnCrearClienteMenu;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenuItem btncliente;
    private javax.swing.JMenuItem btnensalada;
    private javax.swing.JMenuItem btningrediente;
    private javax.swing.JButton btnvisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JEditorPane jepbeneficio;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblfruta;
    private javax.swing.JMenuItem misionvisionItem;
    private javax.swing.JMenuItem mnuAgregarStockIngrediente;
    private javax.swing.JMenuItem mnuCrearIngrediente;
    private javax.swing.JTable tblbeneficio;
    private javax.swing.JTextField txtbusquedabeneficio;
    // End of variables declaration//GEN-END:variables
}

package Inicio; //ERICK ALFONSO MERINO ROQUE

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import control.usuarios.Estudiante;
import control.datos.Informacion;

public class InterfazGrafica extends javax.swing.JFrame {
//LO DE ABAJO ES PARA EL ICONO DE LA PALOMA APARESCA UNA VEZ RELLENADO EL CAMPO
    javax.swing.ImageIcon Icono=new javax.swing.ImageIcon(getClass().getResource("/Inicio/Fondos/palomita1.jpg"));
    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNombre = new javax.swing.JLabel();
        JLApellidos = new javax.swing.JLabel();
        JLRFC = new javax.swing.JLabel();
        JLTelefono = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtHomonimia = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLImagenNombre = new javax.swing.JLabel();
        JLImagenApellidos = new javax.swing.JLabel();
        JLImagenRFC = new javax.swing.JLabel();
        JLImagenEmail = new javax.swing.JLabel();
        JLImagenTelefono = new javax.swing.JLabel();
        BotonMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonPromedio = new javax.swing.JButton();
        txtMateria1 = new javax.swing.JTextField();
        txtMateria2 = new javax.swing.JTextField();
        txtMateria3 = new javax.swing.JTextField();
        txtMateria4 = new javax.swing.JTextField();
        txtMateria5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLImagenMateria1 = new javax.swing.JLabel();
        JLImagenMateria2 = new javax.swing.JLabel();
        JLImagenMateria3 = new javax.swing.JLabel();
        JLImagenMateria4 = new javax.swing.JLabel();
        JLImagenMateria5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtControl = new javax.swing.JTextField();
        JLImagenControl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLNombre.setForeground(new java.awt.Color(255, 255, 255));
        JLNombre.setText("Nombre");

        JLApellidos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLApellidos.setForeground(new java.awt.Color(255, 255, 255));
        JLApellidos.setText("Apellidos");

        JLRFC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLRFC.setForeground(new java.awt.Color(255, 255, 255));
        JLRFC.setText("RFC");

        JLTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        JLTelefono.setText("Telefono");

        JLEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLEmail.setForeground(new java.awt.Color(255, 255, 255));
        JLEmail.setText("Email");

        BotonGuardar.setBackground(new java.awt.Color(0, 0, 204));
        BotonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtHomonimia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHomonimiaFocusLost(evt);
            }
        });
        txtHomonimia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomonimiaKeyTyped(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        BotonLimpiar.setBackground(new java.awt.Color(153, 0, 0));
        BotonLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(0, 0, 0));
        BotonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 0));

        JLImagenNombre.setMaximumSize(new java.awt.Dimension(20, 20));
        JLImagenNombre.setMinimumSize(new java.awt.Dimension(20, 20));
        JLImagenNombre.setName(""); // NOI18N
        JLImagenNombre.setPreferredSize(new java.awt.Dimension(20, 20));

        JLImagenApellidos.setMaximumSize(new java.awt.Dimension(20, 20));
        JLImagenApellidos.setMinimumSize(new java.awt.Dimension(20, 20));
        JLImagenApellidos.setPreferredSize(new java.awt.Dimension(20, 20));

        JLImagenRFC.setMaximumSize(new java.awt.Dimension(20, 20));
        JLImagenRFC.setMinimumSize(new java.awt.Dimension(20, 20));
        JLImagenRFC.setPreferredSize(new java.awt.Dimension(20, 20));

        JLImagenEmail.setMaximumSize(new java.awt.Dimension(20, 20));
        JLImagenEmail.setMinimumSize(new java.awt.Dimension(20, 20));
        JLImagenEmail.setPreferredSize(new java.awt.Dimension(20, 20));

        JLImagenTelefono.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenTelefono.setMinimumSize(new java.awt.Dimension(20, 20));
        JLImagenTelefono.setPreferredSize(new java.awt.Dimension(20, 20));

        BotonMostrar.setBackground(new java.awt.Color(0, 110, 33));
        BotonMostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calcular Promedio");

        BotonPromedio.setBackground(new java.awt.Color(0, 0, 0));
        BotonPromedio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonPromedio.setForeground(new java.awt.Color(255, 255, 255));
        BotonPromedio.setText("Calcular Promedio");
        BotonPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPromedioActionPerformed(evt);
            }
        });

        txtMateria1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMateria1FocusLost(evt);
            }
        });
        txtMateria1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMateria1KeyTyped(evt);
            }
        });

        txtMateria2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMateria2FocusLost(evt);
            }
        });
        txtMateria2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMateria2KeyTyped(evt);
            }
        });

        txtMateria3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMateria3FocusLost(evt);
            }
        });
        txtMateria3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMateria3KeyTyped(evt);
            }
        });

        txtMateria4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMateria4FocusLost(evt);
            }
        });
        txtMateria4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMateria4KeyTyped(evt);
            }
        });

        txtMateria5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMateria5FocusLost(evt);
            }
        });
        txtMateria5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMateria5KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Materia 1:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Materia 2:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Materia 3:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Materia 4:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Materia 5:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTROL DE ESTUDIANTES");

        JLImagenMateria1.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria1.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria1.setPreferredSize(new java.awt.Dimension(14, 14));

        JLImagenMateria2.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria2.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria2.setPreferredSize(new java.awt.Dimension(14, 14));

        JLImagenMateria3.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria3.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria3.setPreferredSize(new java.awt.Dimension(14, 14));

        JLImagenMateria4.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria4.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria4.setPreferredSize(new java.awt.Dimension(14, 14));

        JLImagenMateria5.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria5.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenMateria5.setPreferredSize(new java.awt.Dimension(14, 14));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NoControl");

        txtControl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtControlFocusLost(evt);
            }
        });
        txtControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtControlKeyTyped(evt);
            }
        });

        JLImagenControl.setMaximumSize(new java.awt.Dimension(14, 14));
        JLImagenControl.setMinimumSize(new java.awt.Dimension(14, 14));
        JLImagenControl.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLRFC)
                            .addComponent(JLEmail)
                            .addComponent(JLTelefono)
                            .addComponent(JLApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTelefono)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHomonimia, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEmail))
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLImagenControl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(JLImagenRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLImagenMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLImagenMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLImagenMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLImagenMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLImagenMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BotonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonPromedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLImagenControl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(JLImagenMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLApellidos)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLImagenRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHomonimia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLRFC)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLEmail))
                            .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLImagenMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(txtMateria3))
                            .addComponent(JLImagenMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMateria4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(JLImagenMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMateria5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(JLImagenMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BotonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPromedio))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if(txtNombre.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre");  //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }     //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
        if(txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese los apellidos");  //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }  //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
        if(txtRFC.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese el RFC");   //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }  //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
        if(txtHomonimia.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese la homonimia"); //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }  //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
        if(txtEmail.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese el e-mail");  //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }  //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
        if(txtTelefono.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor ingrese el telefono"); //SIRVE PARA QUE SALTE Y APARESCA EL MENSAJE QUE NO A ESCRITO NADA
           return;    }  //<----SIRVE PARA QUE NO SIGA EL PROCESO Y REGRESE A RELLENAR EL CAMPO
          JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la persona");
          
        String NoControl, Nombre, Apellidos, RFC, Email, Telefono,Materia1,Materia2,Materia3,Materia4,Materia5;
        NoControl=txtControl.getText();
        Nombre=txtNombre.getText();
        Apellidos=txtApellidos.getText();
        RFC=txtRFC.getText()+"-"+txtHomonimia.getText();
        Email=txtEmail.getText();
        Telefono=txtTelefono.getText();
        Materia1=txtMateria1.getText();
        Materia2=txtMateria2.getText();
        Materia3=txtMateria3.getText();
        Materia4=txtMateria4.getText();
        Materia5=txtMateria5.getText();
        
        Estudiante Persona=new Estudiante(NoControl,Nombre,Apellidos,RFC,Email,Telefono,Materia1,Materia2,Materia3,Materia4,Materia5);
        Informacion.GuardaEstudy(Persona);
        
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FondoInterfaz AplicarFondo= new FondoInterfaz();
        this.add(AplicarFondo,BorderLayout.SOUTH);
        AplicarFondo.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
txtControl.setText("");
        txtNombre.setText( "" ) ;     //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtApellidos.setText( "" ) ;  //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtRFC.setText( "" ) ;        //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtHomonimia.setText( "" ) ;  //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtEmail.setText( "" ) ;      //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtTelefono.setText( "" ) ;   //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtMateria1.setText( "" ) ;     //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtMateria2.setText( "" ) ;  //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtMateria3.setText( "" ) ;        //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtMateria4.setText( "" ) ;  //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
txtMateria5.setText( "" ) ;      //<<<-------SIRVE PARA CUANDO EL BOTON LIMPIAR SEA EJECUTADO SE BORREN LOS DATOS ESCRITOS
JLImagenNombre.setIcon(null);
JLImagenApellidos.setIcon(null);
JLImagenRFC.setIcon(null);
 JLImagenEmail.setIcon(null);
 JLImagenTelefono.setIcon(null);
 JLImagenMateria1.setIcon(null);    
 JLImagenMateria2.setIcon(null); 
 JLImagenMateria3.setIcon(null); 
 JLImagenMateria4.setIcon(null); 
 JLImagenMateria5.setIcon(null); 
JLImagenControl.setIcon(null);

JOptionPane.showMessageDialog(null,"Se han Limpiado los Datos");
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
dispose();  
JOptionPane.showMessageDialog(null,"Asta Luego");
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>30) //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 30 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar(); //<-------SOLO PARA ESCRIBIR LETRAS NO NUMEROS
        if(Character.isDigit(TipoDeTecla))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if(txtApellidos.getText().length()>30)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 30 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR LETRAS NO NUMEROS
        if(Character.isDigit(TipoDeTecla))
            evt.consume();
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if(txtTelefono.getText().length()>10)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 10 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla))  //<-------SOLO PARA ESCRIBIR NUMEROS NO LETRAS
            evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtHomonimiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomonimiaKeyTyped
        if(txtHomonimia.getText().length()>3)   //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 3 LETRAS
            evt.consume();
    }//GEN-LAST:event_txtHomonimiaKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(txtNombre.getText().length()>=2){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenNombre.setIcon(Icono);}
        else{
            JLImagenNombre.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if(txtApellidos.getText().length()>=2){  //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenApellidos.setIcon(Icono);}
        else{
            JLImagenApellidos.setIcon(null);      //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO     
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtHomonimiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHomonimiaFocusLost
        if(txtHomonimia.getText().length()>=2){  //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenRFC.setIcon(Icono);}
        else{
            JLImagenRFC.setIcon(null);        //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
    }//GEN-LAST:event_txtHomonimiaFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().length()>=2){   //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenEmail.setIcon(Icono);}
        else{
            JLImagenEmail.setIcon(null);       //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO    
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().length()>=2){  //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenTelefono.setIcon(Icono);}
        else{
            JLImagenTelefono.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO      
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        JOptionPane.showMessageDialog(null,Informacion.MostrarInfo());
        
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void BotonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPromedioActionPerformed
if(txtMateria1.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Ingrese Calificacion de la Materia 1");
    return;
}
if(txtMateria2.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Ingrese Calificacion de la Materia 2");
    return;
}
  if(txtMateria3.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Ingrese Calificacion de la Materia 3");
    return;
}
  if(txtMateria4.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Ingrese Calificacion de la Materia 4");
    return;
}
  if(txtMateria5.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Ingrese Calificacion de la Materia 5");
    return;
}
        
        
        
        double m1,m2,m3,m4,m5;
double PRO;
m1=Double.parseDouble(txtMateria1.getText());
m2=Double.parseDouble(txtMateria2.getText());
m3=Double.parseDouble(txtMateria3.getText());
m4=Double.parseDouble(txtMateria4.getText());
m5=Double.parseDouble(txtMateria5.getText());
PRO= (m1+m2+m3+m4+m5)/5;
JOptionPane.showMessageDialog(null,"El promedio es:"+PRO);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPromedioActionPerformed

    private void txtMateria1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMateria1FocusLost
    if(txtMateria1.getText().length()>=1){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenMateria1.setIcon(Icono);}
        else{
            JLImagenMateria1.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria1FocusLost

    private void txtMateria2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMateria2FocusLost
 if(txtMateria2.getText().length()>=1){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenMateria2.setIcon(Icono);}
        else{
            JLImagenMateria2.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria2FocusLost

    private void txtMateria3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMateria3FocusLost
 if(txtMateria3.getText().length()>=1){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenMateria3.setIcon(Icono);}
        else{
            JLImagenMateria3.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria3FocusLost

    private void txtMateria4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMateria4FocusLost
 if(txtMateria4.getText().length()>=1){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenMateria4.setIcon(Icono);}
        else{
            JLImagenMateria4.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria4FocusLost

    private void txtMateria5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMateria5FocusLost
 if(txtMateria5.getText().length()>=1){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 2 O MAS LETRAS
            JLImagenMateria5.setIcon(Icono);}
        else{
            JLImagenMateria5.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria5FocusLost

    private void txtMateria1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateria1KeyTyped
if(txtMateria1.getText().length()>=2)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 2 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR NUMEROS no letras
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria1KeyTyped

    private void txtMateria2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateria2KeyTyped
if(txtMateria2.getText().length()>=2)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 2 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR NUMEROS no letras
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria2KeyTyped

    private void txtMateria3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateria3KeyTyped
if(txtMateria3.getText().length()>=2)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 2 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR NUMEROS no letras
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria3KeyTyped

    private void txtMateria4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateria4KeyTyped
if(txtMateria4.getText().length()>=2)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 2 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR NUMEROS no letras
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria4KeyTyped

    private void txtMateria5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateria5KeyTyped
if(txtMateria5.getText().length()>=2)  //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 2 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar();  //<-------SOLO PARA ESCRIBIR NUMEROS no letras
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateria5KeyTyped

    private void txtControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlKeyTyped
if(txtControl.getText().length()>=8) //<------SIRVE PARA AL ESCRIBIR EN EL RRENGLON NO PASE MAS DE 30 LETRAS
            evt.consume();
        char TipoDeTecla=evt.getKeyChar(); //<-------SOLO PARA ESCRIBIR LETRAS NO NUMEROS
        if(!Character.isDigit(TipoDeTecla))
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlKeyTyped

    private void txtControlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtControlFocusLost
if(txtControl.getText().length()>=8){ //<-----SIRVE PARA QUE SALTE EL ICONO DE LA PALOMA CUANDO EN EL RENGLON SE HAIGA ESCRITO 8 O MAS LETRAS
            JLImagenControl.setIcon(Icono);}
        else{
            JLImagenControl.setIcon(null);     //<<-----SIRVE PARA QUE SI NO ESCRIBE MAS DE UNA LETRA NO SALGA EL ICONO   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonPromedio;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel JLApellidos;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLImagenApellidos;
    private javax.swing.JLabel JLImagenControl;
    private javax.swing.JLabel JLImagenEmail;
    private javax.swing.JLabel JLImagenMateria1;
    private javax.swing.JLabel JLImagenMateria2;
    private javax.swing.JLabel JLImagenMateria3;
    private javax.swing.JLabel JLImagenMateria4;
    private javax.swing.JLabel JLImagenMateria5;
    private javax.swing.JLabel JLImagenNombre;
    private javax.swing.JLabel JLImagenRFC;
    private javax.swing.JLabel JLImagenTelefono;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLRFC;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHomonimia;
    private javax.swing.JTextField txtMateria1;
    private javax.swing.JTextField txtMateria2;
    private javax.swing.JTextField txtMateria3;
    private javax.swing.JTextField txtMateria4;
    private javax.swing.JTextField txtMateria5;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
}

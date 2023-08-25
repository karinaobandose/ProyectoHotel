/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Habitacion;

import Controllers.CHabitaciones;
import Controllers.Controlador;
import Models.MHabitacion;
import Views.Vista;
import static Views.Vista.Correcto;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author emalo
 */
public class FrmHabitaciones extends javax.swing.JFrame implements Vista {

    private Controlador<MHabitacion> controlador;

    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = (CHabitaciones) controlador;
        System.out.println(this.controlador);
    }

    /**
     * Creates new form Habitaciones
     */
    public FrmHabitaciones() {
        initComponents();
        this.setControlador(new CHabitaciones());
        this.btnEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtNumero = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        CkIndividual = new javax.swing.JCheckBox();
        CkDoble = new javax.swing.JCheckBox();
        CkSuite = new javax.swing.JCheckBox();
        LblNumero = new javax.swing.JLabel();
        LblPrecio = new javax.swing.JLabel();
        LblTipo = new javax.swing.JLabel();

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Registro Habitaciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroActionPerformed(evt);
            }
        });
        TxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumeroKeyTyped(evt);
            }
        });

        TxtPrecio.setText("45000");
        TxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioActionPerformed(evt);
            }
        });
        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });

        CkIndividual.setSelected(true);
        CkIndividual.setText("Individual");
        CkIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkIndividualActionPerformed(evt);
            }
        });

        CkDoble.setText("Doble");
        CkDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkDobleActionPerformed(evt);
            }
        });

        CkSuite.setText("Suite");
        CkSuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkSuiteActionPerformed(evt);
            }
        });

        LblNumero.setText("Numero de Habitacion");

        LblPrecio.setText("Precio");

        LblTipo.setText("Tipo de Habitacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(LblPrecio)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CkIndividual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CkDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkSuite, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(LblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CkIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CkDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CkSuite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    @Override
    public Controlador<MHabitacion> getControlador() {
        return controlador;
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        FrmBuscarProveedor frm = new FrmBuscarProveedor(null,true);
//        frm.setController(controller);
//        controller.setView(frm);
//        Gui.loadWindow(frm);
//        this.controller.setView(this);
//        this.controller.read(this.controller.getModel());

        FrmHabitacionesBuscar frm = new FrmHabitacionesBuscar(null, true);
        frm.setControlador(controlador);
        frm.setVisible(true);

        this.TxtNumero.setEditable(false);
        this.TxtPrecio.setEditable(false);
        this.btnEliminar.setEnabled(true);

        ValidarCancelar();

        try {
            showData();
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "\"No encontrado\"", "Error", Error);

            System.out.println("error 2");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    public void ValidarCancelar() {
        if (this.controlador.getObjecto() == null) {
            this.btnEliminar.setEnabled(false);
            this.TxtNumero.setEditable(true);
            this.TxtPrecio.setEditable(true);
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//        if(!this.txtId1.getText().isEmpty()){
//
//        }else{
//            //          Provider provider = new Provider(Integer.parseInt(this.txtProveedor.getText()),null,null);
//            Product product = new Product(null,this.txtDescripcion1.getText(),
//                Double.parseDouble(this.txtPrecio.getText()),
//                this.chkExcento.isSelected(),new Provider(Integer.parseInt(this.txtProveedor.getText()),null,null));
//            this.controller.create(product);
//        }

        if (!this.TxtNumero.getText().isEmpty() && !this.TxtPrecio.getText().isEmpty()) {
            MHabitacion Temp = CrearHabitacion();
            try {
                if (this.btnEliminar.isEnabled()) {

                    this.controlador.Actualizar(Temp);
                    JOptionPane.showMessageDialog(null, "\"Actualizado\"", "Info", Correcto);

                    this.Limpiar();
                } else {
                    if (this.controlador.Buscar(Temp.getNumero()) == null) {

                        this.controlador.Crear(Temp);
                        System.out.println(this.controlador.getLista());

                        JOptionPane.showMessageDialog(null, "\"Agregado\"", "info", Correcto);
                        this.Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "\"No agregado\"", "Error", Error);

                        System.out.println("Ya existe");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "\"No actualizado\"", "Error", Error);

                System.out.println(e);
            }

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    public MHabitacion CrearHabitacion() {
        int Eleccion = 0;
        if (this.CkIndividual.isSelected()) {
            Eleccion = 1;
        } else if (this.CkDoble.isSelected()) {
            Eleccion = 2;
        } else if (this.CkSuite.isSelected()) {
            Eleccion = 3;
        }

        int Numero = Integer.parseInt(this.TxtNumero.getText());
        double Precio = Double.parseDouble(this.TxtPrecio.getText());
        MHabitacion Temp = new MHabitacion(Numero, Eleccion, Precio);
        return Temp;
    }

    public int SaberCheckMarcado() {
        if (this.CkIndividual.isSelected()) {
            return 1;
        } else if (this.CkDoble.isSelected()) {
            return 2;
        } else {
            return 3;
        }
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
//        this.clear();
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    public void Limpiar() {
        this.controlador.setObjecto(null);
        this.TxtNumero.setEditable(true);
        this.TxtPrecio.setEditable(true);
        this.TxtNumero.setText("");
        this.TxtPrecio.setText("45000");
        this.CkIndividual.setSelected(true);
        this.CkDoble.setSelected(false);
        this.CkSuite.setSelected(false);
        this.btnEliminar.setEnabled(false);
    }

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void CkIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkIndividualActionPerformed
        // TODO add your handling code here:
        this.CkDoble.setSelected(false);
        this.CkSuite.setSelected(false);
        if (!this.btnEliminar.isEnabled()) {
            this.TxtPrecio.setText("45000");
        }

    }//GEN-LAST:event_CkIndividualActionPerformed

    private void CkDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkDobleActionPerformed
        // TODO add your handling code here:
        this.CkIndividual.setSelected(false);
        this.CkSuite.setSelected(false);
        if (!this.btnEliminar.isEnabled()) {
            this.TxtPrecio.setText("80000");
        }

    }//GEN-LAST:event_CkDobleActionPerformed

    private void CkSuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkSuiteActionPerformed
        // TODO add your handling code here:
        this.CkDoble.setSelected(false);
        this.CkIndividual.setSelected(false);
        if (!this.btnEliminar.isEnabled()) {
            this.TxtPrecio.setText("140000");
        }

    }//GEN-LAST:event_CkSuiteActionPerformed

    private void TxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioActionPerformed

    private void TxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtNumeroActionPerformed

    private void TxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Consume el evento si no es un dígito válido
        }
    }//GEN-LAST:event_TxtNumeroKeyTyped

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Consume el evento si no es un dígito válido
        }
    }//GEN-LAST:event_TxtPrecioKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        MHabitacion Temp = CrearHabitacion();
        try {
            this.controlador.Eliminar(Temp);
            JOptionPane.showMessageDialog(null, "\"Eliminado\"", "Info", Correcto);

            this.Limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\"No eliminado\"", "Error", Error);

            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.Limpiar();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JCheckBox CkDoble;
    private javax.swing.JCheckBox CkIndividual;
    private javax.swing.JCheckBox CkSuite;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblTipo;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showData() {
        this.TxtNumero.setText(String.valueOf(this.controlador.getObjecto().getNumero()));
        this.TxtPrecio.setText(String.valueOf(this.controlador.getObjecto().getPrecio()));
        ConfirmarCheck();
    }

    public void ConfirmarCheck() {
        this.CkIndividual.setSelected(false);
        this.CkDoble.setSelected(false);
        this.CkSuite.setSelected(false);
        if (this.controlador.getObjecto().getTipo() == 1) {
            this.CkIndividual.setSelected(true);
        } else if (this.controlador.getObjecto().getTipo() == 2) {
            this.CkDoble.setSelected(true);
        } else {
            this.CkSuite.setSelected(true);
        }
    }

    @Override
    public void showMessage(String msg, int messageType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

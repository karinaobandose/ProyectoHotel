/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Views.Habitacion;

import Controllers.CHabitaciones;
import Controllers.Controlador;
import Models.MHabitacion;
import Views.Vista;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emalo
 */
public class FrmHabitacionesBuscar extends javax.swing.JDialog implements Vista {

    private Controlador<MHabitacion> controlador;
    
    @Override
    public Controlador<MHabitacion> getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = (CHabitaciones) controlador;
    }

    /**
     * Creates new form HabitacionesBucar
     * @param parent
     * @param modal
     */
    public FrmHabitacionesBuscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel2 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaHab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Numero de habitacion");

        txtFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        tbListaHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Tipo", "Estado", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaHab.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbListaHab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Habitaciones");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //        if (tbListaHab.getRowCount()>0&&tbListaHab.getSelectedRow()>-1){
            //            Provider provider=new Provider((int)tbListaHab.getValueAt(tbListaHab.getSelectedRow(), 0),String.valueOf(tbListaHab.getValueAt(tbListaHab.getSelectedRow(), 1)),String.valueOf(tbListaHab.getValueAt(tbListaHab.getSelectedRow(), 2)));
            //            controller.setModel(provider);
            //            this.dispose();
            //        }
            
            if (this.tbListaHab.getRowCount()>0&&this.tbListaHab.getSelectedRow()>-1){
            Integer Numero =((Integer) this.tbListaHab.getValueAt(this.tbListaHab.getSelectedRow(),0)) ;
            Integer Tipo =this.SaberTipo((String)(this.tbListaHab.getValueAt(this.tbListaHab.getSelectedRow(),1)));
            
            boolean Estado =this.SaberEstado(((String) this.tbListaHab.getValueAt(this.tbListaHab.getSelectedRow(),2)));
            
            Double Precio =((double) this.tbListaHab.getValueAt(this.tbListaHab.getSelectedRow(),3)) ;
            
            
            
            MHabitacion Habitacion=new MHabitacion(Numero,Tipo,Precio);
            this.controlador.setObjecto(Habitacion);
            this.dispose();
        } 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.controlador.setObjecto(null);
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            System.out.println("%" + this.txtFiltro.getText() + "%");
            controlador.Leer(this.txtFiltro.getText());
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        // TODO add your handling code here:
        String filtro = this.txtFiltro.getText().trim();
        System.out.println(filtro);

        if (!filtro.isEmpty()) {

            System.out.println("%" + this.txtFiltro.getText() + "%");
            controlador.Leer(this.txtFiltro.getText());

            try {
                DefaultTableModel table = (DefaultTableModel) this.tbListaHab.getModel();
                table.setRowCount(0);
                Integer Numero = controlador.getObjecto().getNumero();
                String Tipo = SaberTipo(controlador.getObjecto().getTipo());
                String Estado = SaberEstado(controlador.getObjecto().isEstado());
                Double Precio = controlador.getObjecto().getPrecio();
                table.addRow(new Object[]{Numero, Tipo, Estado, Precio});
                this.tbListaHab.setModel(table);
            } catch (Exception e) {
            }

        }else{
            this.showData();
        }
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // TODO add your handling code here:
        //        String filtro = this.txtFiltro.getText().trim();
        //        System.out.println(filtro);
        //
        //        if(!filtro.isEmpty()){
            //
            //            System.out.println("%"+this.txtFiltro.getText()+"%");
            //            controlador.Leer(this.txtFiltro.getText());
            //        }
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.showData();
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
            java.util.logging.Logger.getLogger(FrmHabitacionesBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionesBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionesBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionesBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmHabitacionesBuscar dialog = new FrmHabitacionesBuscar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    
    
    @Override
    public void showData() {
        DefaultTableModel table = (DefaultTableModel) this.tbListaHab.getModel();
        table.setRowCount(0);
        if (this.controlador.getLista() != null) {
            Iterator<MHabitacion> iterator = this.controlador.getLista().iterator();
            while (iterator.hasNext()) {
                MHabitacion Habitacion = iterator.next();

                Integer Numero = Habitacion.getNumero();
                String Tipo = SaberTipo(Habitacion.getTipo());
                String Estado = SaberEstado(Habitacion.isEstado());
                Double Precio = Habitacion.getPrecio();

                table.addRow(new Object[]{Numero, Tipo, Estado, Precio});
            }
        }
        this.tbListaHab.setModel(table);
    }

    public String SaberTipo(Integer Tipo) {
        switch (Tipo) {
            case 1 -> {
                return "Individual";
            }
            case 2 -> {
                return "Doble";
            }
            case 3 -> {
                return "Suite";
            }
        }
        return null;
    }
    public Integer SaberTipo(String Tipo) {
        switch (Tipo) {
            case "Individual" -> {
                return 1;
            }
            case "Doble" -> {
                return 2;
            }
            case "Suite" -> {
                return 3;
            }
        }
        return null;
    }

    public String SaberEstado(boolean Estado) {
        if (Estado) {
            return "Ocupado";
        } else {
            return "Libre";
        }
    }
    public boolean SaberEstado(String Estado) {
        if (Estado.equals("Ocupado")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void showMessage(String msg, int messageType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListaHab;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}

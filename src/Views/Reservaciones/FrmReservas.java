/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Reservaciones;

import Controllers.CReserva;
import Controllers.Controlador;
import Models.MCliente;
import Models.MHabitacion;
import Models.MReservas;
import Models.Utils;
import Views.Vista;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author emalo
 */
public class FrmReservas extends javax.swing.JFrame implements Vista {

    private Utils utiles;
    private Controlador<MReservas> controlador;
    private MHabitacion MHabitacionTemp = null;

    private ArrayList<MCliente> controladorClientes = new ArrayList<>();
    private ArrayList<MHabitacion> controladorHabitaciones = new ArrayList<>();

    public void setControladorClientes(ArrayList<MCliente> controladorClientes) {
        this.controladorClientes = controladorClientes;
    }

    public ArrayList<MHabitacion> getControladorHabitaciones() {
        return controladorHabitaciones;
    }

    public void setControladorHabitaciones(ArrayList<MHabitacion> controladorHabitaciones) {
        this.controladorHabitaciones = controladorHabitaciones;
    }

    public ArrayList<MCliente> getControladorClientes() {
        return controladorClientes;
    }

    @Override
    public Controlador<MReservas> getControlador() {
        return controlador;
    }

    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = (CReserva) controlador;
        System.out.println(this.controlador);
    }

    public void ValidarCancelar() {
        if (this.controlador.getObjecto() == null) {
            this.JpBotonesReserva.setVisible(false);

            this.TxtFechaEn.setEditable(true);
            this.TxtFechaSa.setEditable(true);
            this.TxtCedula.setEditable(true);
        }
    }

    public void Limpiar() {
//        this.btnEliminar.setEnabled(false);
        this.JpBotonesReserva.setVisible(false);
        this.JpHabitacion.setVisible(false);
        this.JpRegistrarCliente.setVisible(false);

        this.TxtCedula.setEditable(true);
        this.TxtFechaEn.setEditable(true);
        this.TxtFechaSa.setEditable(true);
        this.CbHabitaciones.setEnabled(true);

        this.CbHabitaciones.setSelectedIndex(0);
        this.LblDisponibles.setText("");
        this.TxtFechaEntrada.setText("");
        this.TxtFechaSalida.setText("");
        this.TxtEstadia.setText("");
        this.TxtSubtotal.setText("");
        this.TxtImpuestos.setText("");
        this.TxtTotal.setText("");
        this.TxtCedula.setText("");
        this.TxtNombre.setText("");

        this.LblValidacion.setText("");

        this.TxtNumeroReserva.setText(String.valueOf(this.utiles.getNumero()));

        this.TxtEstado.setText("Pendiente");

//        this.TxtCedula.setEditable(true);
//
//        this.TxtCedula.setText("");
//        this.TxtNombre.setText("");
//        this.TxtSalario.setText("");
//        this.TxtTelefono.setText("");
//        this.DescarmarChecks();
    }

    public MReservas CrearReserva() {

        try {
            Integer NumeroReserva = Integer.valueOf(this.TxtNumeroReserva.getText());
            MCliente Cliente = this.MandarCliente();
            MHabitacion Habitacion = this.MHabitacionTemp;
            LocalDate FechaEntrada = LocalDate.parse(this.TxtFechaEn.getText());
            LocalDate FechaSalida = LocalDate.parse(this.TxtFechaSa.getText());
            Integer Estado = SaberEstado(this.TxtEstado.getText()); //1-, 2-, 3-, 4-
            Integer Estadia = Integer.valueOf(this.TxtEstadia.getText());
            Double Subtotal = Double.valueOf(this.TxtSubtotal.getText());
            Double Impuestos = Double.valueOf(this.TxtImpuestos.getText());
            Double Total = Double.valueOf(this.TxtTotal.getText());

            System.out.println("SIIIIIIIIIIIII");

            return new MReservas(NumeroReserva, Cliente, Habitacion, FechaEntrada, FechaSalida, Estado, Estadia, Subtotal, Impuestos, Total);
        } catch (Exception e) {
            return null;
        }

    }

    public int SaberEstado(String Estado) {
        int temp = 0;
        switch (Estado) {
            case "Pendiente" -> {
                return 1;
            }
            case "En ejecucion" -> {
                return 2;
            }
            case "Finalizada" -> {
                return 3;
            }
            case "Cancelada" -> {
                return 4;
            }
        };

        return temp;
    }

    @Override
    public void showData() {

        System.out.println(this.controlador.getObjecto().getFechaEntrada().toString());
        System.out.println(this.controlador.getObjecto().getFechaEntrada().toString());
        System.out.println(this.controlador.getObjecto().getFechaEntrada().toString());

        this.CbHabitaciones.setSelectedIndex(this.controlador.getObjecto().getEstado());
        this.LblDisponibles.setText("");
        this.TxtFechaEn.setText(this.controlador.getObjecto().getFechaEntrada().toString());
        this.TxtFechaSa.setText(this.controlador.getObjecto().getFechaSalida().toString());
        this.TxtEstadia.setText(String.valueOf(this.controlador.getObjecto().getEstadia()));
        this.TxtSubtotal.setText(String.valueOf(this.controlador.getObjecto().getSubtotal()));
        this.TxtImpuestos.setText(String.valueOf(this.controlador.getObjecto().getImpuestos()));
        this.TxtTotal.setText(String.valueOf(this.controlador.getObjecto().getTotal()));
        this.TxtCedula.setText(String.valueOf(this.controlador.getObjecto().getCliente().getCedula()));
        this.TxtNombre.setText(String.valueOf(this.controlador.getObjecto().getCliente().getNombre()));
        this.LblValidacion.setText("Validado");
        this.TxtNumeroReserva.setText(String.valueOf(this.controlador.getObjecto().getNumeroReserva()));
        this.TxtEstado.setText(SaberEstado(this.controlador.getObjecto().getEstado()));

    }

    public String SaberEstado(Integer Estado) {
        String temp = "";
        switch (Estado) {
            case 1 -> {
                return "Pendiente";
            }
            case 2 -> {
                return "En ejecucion";
            }
            case 3 -> {
                return "Finalizada";
            }
            case 4 -> {
                return "Cancelada";
            }
        }

        return temp;
    }

    /**
     * Creates new form Reservas
     */
    public FrmReservas() {
        initComponents();
        this.setControlador(new CReserva());
        utiles = new Utils();
        this.TxtNombre.setEditable(false);
        this.TxtNumeroReserva.setEditable(false);
        this.TxtEstado.setEditable(false);
        this.TxtEstadia.setEditable(false);
        this.TxtSubtotal.setEditable(false);
        this.TxtImpuestos.setEditable(false);
        this.TxtTotal.setEditable(false);
        this.TxtNumeroReserva.setText(String.valueOf(utiles.AutoNumerico()));

        this.JpRegistrarCliente.setVisible(false);
//        this.JpHabitacion.setVisible(false);
        this.JpBotonesReserva.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtFechaEntrada = new javax.swing.JTextField();
        TxtFechaSalida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNumeroReserva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtNombre = new javax.swing.JTextField();
        TxtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblValidacion = new javax.swing.JLabel();
        JpRegistrarCliente = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        JpHabitacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CbHabitaciones = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblDisponibles = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        TxtEstadia = new javax.swing.JTextField();
        TxtSubtotal = new javax.swing.JTextField();
        TxtImpuestos = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        JpBotonesReserva = new javax.swing.JPanel();
        BtnActivar = new javax.swing.JButton();
        BtnFinalizar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtFechaEn = new javax.swing.JFormattedTextField();
        TxtFechaSa = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Numero de reserva:");

        jLabel7.setText("Registro Reserva");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addComponent(TxtNumeroReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaActionPerformed(evt);
            }
        });
        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Cedula");

        jLabel4.setText("Validacion Clientes:");

        jLabel6.setText("Validacion");

        JpRegistrarCliente.setBackground(new java.awt.Color(204, 204, 255));
        JpRegistrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpRegistrarClienteLayout = new javax.swing.GroupLayout(JpRegistrarCliente);
        JpRegistrarCliente.setLayout(JpRegistrarClienteLayout);
        JpRegistrarClienteLayout.setHorizontalGroup(
            JpRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpRegistrarClienteLayout.setVerticalGroup(
            JpRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(154, 154, 154)
                .addComponent(jLabel6)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JpRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblValidacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnGuardar)
                .addGap(37, 37, 37)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        JpHabitacion.setBackground(new java.awt.Color(255, 255, 204));
        JpHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Reservaciones:");

        CbHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Individual", "Double", "Suite" }));
        CbHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbHabitacionesActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Habitacion");

        jLabel9.setText("Habitaciones Disponible");

        LblDisponibles.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setText("Fecha de entrada");

        jLabel12.setText("Fecha de salida");

        jLabel13.setText("Estado");

        jLabel14.setText("Estadia");

        jLabel15.setText("Subtotal");

        jLabel16.setText("Impuestos");

        jLabel17.setText("Total");

        TxtEstado.setText("Pendiente");

        JpBotonesReserva.setBackground(new java.awt.Color(204, 204, 255));
        JpBotonesReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnActivar.setText("Activar");
        BtnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActivarActionPerformed(evt);
            }
        });

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpBotonesReservaLayout = new javax.swing.GroupLayout(JpBotonesReserva);
        JpBotonesReserva.setLayout(JpBotonesReservaLayout);
        JpBotonesReservaLayout.setHorizontalGroup(
            JpBotonesReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpBotonesReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnActivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpBotonesReservaLayout.setVerticalGroup(
            JpBotonesReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBotonesReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpBotonesReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActivar)
                    .addComponent(BtnFinalizar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        try {
            TxtFechaEn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFechaEn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFechaEnKeyReleased(evt);
            }
        });

        try {
            TxtFechaSa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFechaSa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFechaSaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout JpHabitacionLayout = new javax.swing.GroupLayout(JpHabitacion);
        JpHabitacion.setLayout(JpHabitacionLayout);
        JpHabitacionLayout.setHorizontalGroup(
            JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpHabitacionLayout.createSequentialGroup()
                .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JpHabitacionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel14)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel15))
                            .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JpHabitacionLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel8)
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel9))
                                .addGroup(JpHabitacionLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JpHabitacionLayout.createSequentialGroup()
                                            .addComponent(CbHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(LblDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpHabitacionLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel16)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpHabitacionLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(TxtImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpHabitacionLayout.createSequentialGroup()
                                .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(TxtFechaEn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpHabitacionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtFechaSa)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpHabitacionLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))))
                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(JpBotonesReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JpHabitacionLayout.setVerticalGroup(
            JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CbHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(TxtImpuestos)
                            .addComponent(TxtSubtotal)
                            .addComponent(TxtEstadia)
                            .addComponent(TxtEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(JpBotonesReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpHabitacionLayout.createSequentialGroup()
                        .addGroup(JpHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFechaEn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFechaSa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!this.TxtCedula.getText().isEmpty() && !this.TxtEstadia.getText().isEmpty()
                && !this.TxtEstado.getText().isEmpty() && !this.TxtFechaEn.getText().isEmpty()
                && !this.TxtFechaSa.getText().isEmpty() && !this.TxtImpuestos.getText().isEmpty()
                && !this.TxtNombre.getText().isEmpty() && !this.TxtNumeroReserva.getText().isEmpty()
                && !this.TxtSubtotal.getText().isEmpty()
                && !this.TxtTotal.getText().isEmpty() && this.CbHabitaciones.getSelectedIndex() != 0) {

            MReservas Temp = CrearReserva();
            try {
                if (this.JpBotonesReserva.isVisible()) {

//                    this.controlador.Actualizar(Temp);
//                    this.utiles.AutoNumerico();
                } else {
                    if (this.controlador.Buscar(Temp.getNumeroReserva()) == null) {

                        this.controlador.Crear(Temp);

                        System.out.println(this.controlador.getLista());
                        System.out.println(this.controladorHabitaciones);
                        JOptionPane.showMessageDialog(null, "\"Reservas Agregada\"", "Exito", Correcto);
                        System.out.println(this.MHabitacionTemp);
                        System.out.println(this.MHabitacionTemp);
                        System.out.println(this.MHabitacionTemp);
                        System.out.println(this.MHabitacionTemp);
                        this.utiles.AutoNumerico();
                        this.Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "\"Reservas No Agregada\"", "error", Error);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "\" No Actualizado\"", "error", Error);

                System.out.println(e);
            }

            this.TxtNumeroReserva.setText(String.valueOf(this.utiles.getNumero()));
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //        this.clear();

        Limpiar();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        FrmReservacionesBuscar frm = new FrmReservacionesBuscar(null, true);
        frm.setControlador(controlador);
        frm.setControladorClientes(controladorClientes);
        frm.setControladorHabitaciones(controladorHabitaciones);
        frm.setVisible(true);

        this.TxtFechaEn.setEditable(false);
        this.TxtFechaSa.setEditable(false);
        this.TxtCedula.setEditable(false);
        this.CbHabitaciones.setEditable(false);
        this.CbHabitaciones.setEnabled(false);

//        this.btnEliminar.setEnabled(true);
        ValidarCancelar();

        try {
            System.out.println(this.controlador.getObjecto());
            System.out.println(this.controlador.getObjecto());
            System.out.println(this.controlador.getObjecto());
        } catch (Exception e) {
        }

        try {
            showData();
            this.JpBotonesReserva.setVisible(true);
            this.JpHabitacion.setVisible(true);
//            this.JpRegistrarCliente.setVisible(true);
        } catch (Exception e) {
            this.CbHabitaciones.setEnabled(true);
            this.TxtNumeroReserva.setText(String.valueOf(this.utiles.getNumero()));
//            JOptionPane.showMessageDialog(null, "\"No encontrado\"", "error", Error);

            System.out.println("error 2");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void CbHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbHabitacionesActionPerformed
        // TODO add your handling code here:
        System.out.println(this.CbHabitaciones.getSelectedItem());
        System.out.println(this.CbHabitaciones.getSelectedIndex() + 1);

        Integer Temp = SaberDisponibles();

        this.LblDisponibles.setText(String.valueOf(Temp));
        this.MandarHabitacion(this.CbHabitaciones.getSelectedIndex());

        this.TxtFechaEn.setText("");
        this.TxtFechaSa.setText("");
        this.TxtEstadia.setText("");
        this.TxtSubtotal.setText("");
        this.TxtImpuestos.setText("");
        this.TxtTotal.setText("");


    }//GEN-LAST:event_CbHabitacionesActionPerformed

    public int SaberDisponibles() {
        Integer Temp = 0;

        for (MHabitacion Habitaciones : controladorHabitaciones) {
            if (Habitaciones.getTipo().equals(this.CbHabitaciones.getSelectedIndex()) && Habitaciones.isEstado() == false) {
                Temp++;
            }
        }

        return Temp;
    }

    public void setear() {
        this.MHabitacionTemp.setTipo(this.SaberEstado(this.TxtEstado.getText()));
    }

    private void BtnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActivarActionPerformed
        // TODO add your handling code here:

//        setear();
        this.MandarHabitacion2(this.CbHabitaciones.getSelectedIndex());
        MReservas Temp = CrearReserva();
        System.out.println(Temp);

        if (this.JpBotonesReserva.isVisible() && this.controlador.getObjecto().getHabitacion().getTipo().equals(1)) {
            Temp.setEstado(2);
            this.MHabitacionTemp.setEstado(true);
            this.controlador.Actualizar(Temp);
            this.TxtEstado.setText("En ejecucion");
            JOptionPane.showMessageDialog(null, "\"Actualizado\"", "Info", Correcto);
            System.out.println(this.MHabitacionTemp);
        } else {
            JOptionPane.showMessageDialog(null, "\"No Actualizado\"", "Error", Error);

        }

        this.Limpiar();
    }//GEN-LAST:event_BtnActivarActionPerformed

    public MCliente MandarCliente() {
        MCliente MClienteTemp = null;

        for (MCliente controladorCliente : controladorClientes) {
            if (controladorCliente.getCedula().equals(Integer.valueOf(this.TxtCedula.getText()))) {
                MClienteTemp = controladorCliente;
            }
        }

        return MClienteTemp;
    }

    public void MandarHabitacion(Integer Tipo) {
        MHabitacionTemp = null;

        if (Integer.parseInt(this.LblDisponibles.getText()) != 0) {

            for (MHabitacion MHabitacion : controladorHabitaciones) {
                if (MHabitacion.getTipo().equals(Tipo) && MHabitacion.isEstado() == false) {
                    MHabitacionTemp = MHabitacion;
                    break;
                }
            }

        }
    }

    public void MandarHabitacion2(Integer Tipo) {
        MHabitacionTemp = null;

        if (true) {

            for (MHabitacion MHabitacion : controladorHabitaciones) {
                if (MHabitacion.getNumero().equals(this.controlador.getObjecto().getHabitacion().getNumero())) {
                    MHabitacionTemp = MHabitacion;
                    break;
                }
            }

        }
    }

    private void TxtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                boolean validar = false;
//                this.controladorClientes.Leer(this.TxtCedula.getText());
//                MCliente ClienteTemp = this.controladorClientes.getObjecto();

                String NombreTemp = "";

                System.out.println(this.TxtCedula.getText());
                System.out.println(controladorClientes);

                for (MCliente controladorCliente : controladorClientes) {
                    if (controladorCliente.getCedula().equals(Integer.valueOf(this.TxtCedula.getText()))) {
                        NombreTemp = controladorCliente.getNombre();
                        validar = true;
                        break;
                    }
                }

                if (validar) {
                    JOptionPane.showMessageDialog(null, "\"Usuario Validado\"", "Exito", Correcto);
                    this.TxtNombre.setText(NombreTemp);
                    this.JpHabitacion.setVisible(true);
                    this.JpRegistrarCliente.setVisible(false);
                    this.TxtCedula.setEditable(false);
                    this.LblValidacion.setText("Validado");
                } else {
                    JOptionPane.showMessageDialog(null, "\"Usuario NO Validado\"", "ERROR", Correcto);
                    this.JpHabitacion.setVisible(false);
                    this.JpRegistrarCliente.setVisible(true);
                    this.LblValidacion.setText("No Validado");
                }

            } catch (Exception e) {
            }

//            System.out.println("%" + this.txtFiltro.getText() + "%");
//            controlador.Leer(this.txtFiltro.getText());
        }

    }//GEN-LAST:event_TxtCedulaKeyPressed

    private void TxtFechaSaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFechaSaKeyReleased
        // TODO add your handling code here:

        try {

            Integer Estadia = this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText()));
            double Subtotal = utiles.CalcularSubtotal(this.MHabitacionTemp.getPrecio(), this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText())));
            double Impuestos = utiles.CalcularImpuestos(utiles.CalcularSubtotal(this.MHabitacionTemp.getPrecio(), this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText()))));
            double Total = utiles.CalcularTotal(Subtotal, Impuestos);

            if (Estadia > 0) {
                this.TxtEstadia.setText(String.valueOf(Estadia));
                this.TxtSubtotal.setText(String.valueOf(Subtotal));
                this.TxtImpuestos.setText(String.valueOf(Impuestos));
                this.TxtTotal.setText(String.valueOf(Total));
            }
        } catch (Exception e) {
            this.TxtEstadia.setText("");
            this.TxtSubtotal.setText("");
            this.TxtImpuestos.setText("");
            this.TxtTotal.setText("");
        }
    }//GEN-LAST:event_TxtFechaSaKeyReleased

    private void TxtFechaEnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFechaEnKeyReleased
        // TODO add your handling code here:

        try {

            Integer Estadia = this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText()));
            double Subtotal = utiles.CalcularSubtotal(this.MHabitacionTemp.getPrecio(), this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText())));
            double Impuestos = utiles.CalcularImpuestos(utiles.CalcularSubtotal(this.MHabitacionTemp.getPrecio(), this.utiles.CalcularEstadia(LocalDate.parse(this.TxtFechaEn.getText()), LocalDate.parse(this.TxtFechaSa.getText()))));
            double Total = utiles.CalcularTotal(Subtotal, Impuestos);

            if (Estadia > 0) {
                this.TxtEstadia.setText(String.valueOf(Estadia));
                this.TxtSubtotal.setText(String.valueOf(Subtotal));
                this.TxtImpuestos.setText(String.valueOf(Impuestos));
                this.TxtTotal.setText(String.valueOf(Total));
            }
        } catch (Exception e) {
            this.TxtEstadia.setText("");
            this.TxtSubtotal.setText("");
            this.TxtImpuestos.setText("");
            this.TxtTotal.setText("");
        }

    }//GEN-LAST:event_TxtFechaEnKeyReleased

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
//        setear();
        this.MandarHabitacion2(this.CbHabitaciones.getSelectedIndex());
        MReservas Temp = CrearReserva();

        if (this.JpBotonesReserva.isVisible() && this.controlador.getObjecto().getEstado().equals(2)) {
            Temp.setEstado(3);
            this.MHabitacionTemp.setEstado(false);
            this.controlador.Actualizar(Temp);
            this.TxtEstado.setText("Finalizada");
            JOptionPane.showMessageDialog(null, "\"Actualizado\"", "Info", Correcto);
            System.out.println(this.MHabitacionTemp);
        } else {
            JOptionPane.showMessageDialog(null, "\"No Actualizado\"", "Error", Error);

        }

        this.Limpiar();
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.MandarHabitacion2(this.CbHabitaciones.getSelectedIndex());
//        setear();
        MReservas Temp = CrearReserva();

        try {
            if (this.JpBotonesReserva.isVisible() && this.MHabitacionTemp.getTipo().equals(1)) {
                Temp.setEstado(4);
                this.MHabitacionTemp.setEstado(false);
                this.controlador.Actualizar(Temp);
                this.TxtEstado.setText("Cancelada");

                JOptionPane.showMessageDialog(null, "\"Cancelada\"", "Info", Correcto);

            } else {
                JOptionPane.showMessageDialog(null, "\"No Cancelada\"", "Error", Error);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "\"No Cancelada\"", "Error", Error);
        }
        this.Limpiar();

    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActivar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JComboBox<String> CbHabitaciones;
    private javax.swing.JPanel JpBotonesReserva;
    private javax.swing.JPanel JpHabitacion;
    private javax.swing.JPanel JpRegistrarCliente;
    private javax.swing.JLabel LblDisponibles;
    private javax.swing.JLabel LblValidacion;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtEstadia;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JFormattedTextField TxtFechaEn;
    private javax.swing.JTextField TxtFechaEntrada;
    private javax.swing.JFormattedTextField TxtFechaSa;
    private javax.swing.JTextField TxtFechaSalida;
    private javax.swing.JTextField TxtImpuestos;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumeroReserva;
    private javax.swing.JTextField TxtSubtotal;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showMessage(String msg, int messageType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

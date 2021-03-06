/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamhome;

import static dreamhome.Formulario.conn;
import dreamhome.Main;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CyC
 */
public class InsertaraCliente extends javax.swing.JFrame {

    static Connection conn;
    static Statement s;
    static ResultSet rs;
    int cantidadColumnas;
    int cantidadFilas;
    DefaultTableModel modelo = new DefaultTableModel();

    //Variables
    int contadorDeRegistros = 0;
    int ubicacionDeRegistro = 0;
    int buscador = 0;
    boolean enter = false;
    boolean DPIencontrado = false;
    String numCliente[] = new String[25];
    String nombre[] = new String[25];
    String apellido[] = new String[25];
    String direccion[] = new String[25];
    String telefono[] = new String[25];
    String tipoPref[] = new String[25];
    String maxRent[] = new String[25];
    String NumCliente1 = "";

    /**
     * Creates new form InsertaraCliente
     */
    public InsertaraCliente() {
        //this.setLocation(300,100);
        initComponents();
        this.setLocationRelativeTo(null);
        consultaDeTabla();
        this.jTable1.setModel(modelo);
        this.setExtendedState(MAXIMIZED_BOTH);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtTipoPref = new javax.swing.JTextField();
        txtMaxRent = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        jbMostrarAutores = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdSiguiente = new javax.swing.JButton();
        cmdPrimero = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        lblNRegistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero Cliente");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Apellido");

        jLabel4.setText("Direccion");

        jLabel5.setText("Telefono");

        jLabel6.setText("Tipo Referencia");

        jLabel7.setText("Max Renta");

        txtNumCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumClienteActionPerformed(evt);
            }
        });
        txtNumCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumClienteKeyTyped(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtMaxRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxRentActionPerformed(evt);
            }
        });

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        jbMostrarAutores.setText("Mostrar ");
        jbMostrarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarAutoresActionPerformed(evt);
            }
        });

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdSiguiente.setText("Siguiente");
        cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSiguienteActionPerformed(evt);
            }
        });

        cmdPrimero.setText("Primero");
        cmdPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeroActionPerformed(evt);
            }
        });

        cmdUltimo.setText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });

        cmdAnterior.setText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(33, 33, 33)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(txtMaxRent, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .add(txtTipoPref)
                    .add(txtTelefono)
                    .add(txtDireccion)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtNombre)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtApellido)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtNumCliente))
                .add(231, 231, 231)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(cmdEliminar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jbMostrarAutores, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(cmdGuardar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .add(49, 49, 49)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(cmdAnterior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cmdPrimero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cmdUltimo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cmdSiguiente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(txtNumCliente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel2)
                                    .add(txtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(9, 9, 9)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel3)
                                    .add(txtApellido, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(6, 6, 6)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel4)
                                    .add(txtDireccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(6, 6, 6)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel5)
                                    .add(txtTelefono, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(8, 8, 8)
                                .add(cmdEliminar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jbMostrarAutores)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton1))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cmdPrimero)
                            .add(cmdGuardar))
                        .add(5, 5, 5)
                        .add(cmdSiguiente)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmdUltimo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmdAnterior)))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtTipoPref, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(txtMaxRent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 920, 280));

        lblRegistro.setText("Registro :");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));
        getContentPane().add(lblNRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, 53, 15));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1160, -1));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void jbMostrarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarAutoresActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
               try {
//ejecuta la conexion   
            conn=Main.Enlace(conn);
//ejecuta la consulta
            rs=Main.EnlEst(rs);
//volcamos los resultados de rs a rsmetadata
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
    
         modelo.addRow(fila);
            }
            rs.close();
            conn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }

    }//GEN-LAST:event_jbMostrarAutoresActionPerformed

    private void txtMaxRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxRentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxRentActionPerformed

    private void cmdPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeroActionPerformed
        if (ubicacionDeRegistro != 0) {
            ubicacionDeRegistro = 0;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el primer dato");
            txtNumCliente.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPrimeroActionPerformed

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        if (ubicacionDeRegistro != 0) {
            ubicacionDeRegistro--;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el primer dato");
            txtNumCliente.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAnteriorActionPerformed

    private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed

        if (contadorDeRegistros != 0) {
            if (ubicacionDeRegistro < (contadorDeRegistros - 1)) {
                ubicacionDeRegistro++;
                mostrarDatos(ubicacionDeRegistro);
                lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
            } else {
                JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el ultimo dato");
                txtTelefono.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSiguienteActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        if (ubicacionDeRegistro < (contadorDeRegistros - 1)) {
            ubicacionDeRegistro = contadorDeRegistros - 1;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el ultimo dato");
            txtNumCliente.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed

        eliminar((ubicacionDeRegistro));

        if (numCliente[0] != "") {

            ubicacionDeRegistro = 0;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            limpiar();
            deshabilitar();
            lblRegistro.setText("");
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void txtNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumClienteActionPerformed

    private void txtNumClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumClienteKeyTyped


    }//GEN-LAST:event_txtNumClienteKeyTyped

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        try {
            if (DPIencontrado == false) {
                ingresoDeDatos(txtNumCliente.getText(),
                        txtNombre.getText(),
                        txtApellido.getText(),
                        txtDireccion.getText(),
                        txtTelefono.getText(), txtTipoPref.getText(),
                        txtMaxRent.getText());

                contadorDeRegistros++;
                ubicacionDeRegistro = contadorDeRegistros;
                deshabilitar();
                lblNRegistro.setText("" + contadorDeRegistros);
                limpiar();
            } else {

                modificarDatos(txtNumCliente.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), txtTipoPref.getText(), txtMaxRent.getText(), buscador);

                ubicacionDeRegistro = contadorDeRegistros;
                deshabilitar();
                lblNRegistro.setText("" + contadorDeRegistros);
                limpiar();

            }
        } catch (ArrayIndexOutOfBoundsException error) {
            JOptionPane.showMessageDialog(null, "Error Guardando los datos");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Formulario  Fmostrar = new Formulario();
        Fmostrar.setVisible(true);
        Fmostrar.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertaraCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertaraCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertaraCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertaraCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertaraCliente().setVisible(true);
            }
        });
    }

    public void ingresoEnTabla() {
        // TODO add your handling code here:
        try {
           conn = Main.Enlace(conn);
           String sqlinsertar="insert into cliente values (?,?,?,?,?,?,?)";
           PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, txtNumCliente.getText());
            psta.setString(2, txtNombre.getText());
            psta.setString(3, txtApellido.getText());
            psta.setString(4, txtDireccion.getText());
            psta.setString(5, txtTelefono.getText());
            psta.setString(6, txtTipoPref.getText());
            psta.setString(7, txtMaxRent.getText());
            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error ingresando datos: " + ex);
        }
        /*
            PreparedStatement psta = conn.prepareStatement(result);
            psta.setString(1, jtxtNumCliente.getText());
            psta.setString(2, jtxtNombre.getText());
            psta.setString(3, jtxtApellido.getText());
            psta.setString(4, jtxtDireccion.getText());
            psta.setString(5, jtxtTelefono.getText());
            psta.setString(6, jtxtTipoPref.getText());
            psta.setString(7, jtxtMaxRent.getText());
            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
         */

    }

    public void conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn = DriverManager.getConnection(url, "DREAMHOME", "123");
            s = conn.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }

    }

    public void consultaDeTabla() {
        int x = 0;
        try {

            conectar();
            rs = s.executeQuery("SELECT count(*) FROM cliente");

            if (rs.next()) {

                cantidadFilas = rs.getInt("count(*)");
            } else {
                cantidadFilas = 0;
            }

            rs = s.executeQuery("SELECT * FROM cliente");
            ResultSetMetaData rsMd = rs.getMetaData();
            cantidadColumnas = rsMd.getColumnCount();

            Object[] fila = new Object[cantidadColumnas];
            while (rs.next()) {

                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);

                }

                numCliente[x] = fila[0].toString();
                nombre[x] = fila[1].toString();
                apellido[x] = fila[2].toString();
                direccion[x] = fila[3].toString();
                telefono[x] = fila[4].toString();
                tipoPref[x] = fila[5].toString();
                maxRent[x] = fila[6].toString();
                x++;

            }

            contadorDeRegistros = cantidadFilas;
            ubicacionDeRegistro = contadorDeRegistros;

            rs.close();
            s.close();
            conn.close();

            lblRegistro.setForeground(Color.WHITE);
        } catch (SQLException | NumberFormatException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error en la consulta \nError: " + ex);
        }
    }

    public void actualizarTabla(int x) {
        try {

            conectar();
            String orden = "UPDATE cliente SET NOMBRE='" + nombre[x] + "' ,"
                    + "APELLIDO='" + apellido[x] + "' ,"
                    + "DIRECCION='" + direccion[x] + "', TELEFONO='" + telefono[x] + "',TIPOPREF='" + tipoPref[x] + "' "
                    + "MAXRENT='" + maxRent[x] + "' "
                    + "WHERE NUMCLIENTE='" + numCliente[x] + "'";

            s.executeUpdate(orden);

            s.close();
            conn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de Actualizacion: " + ex);
        }
    }

    //metodo de ingreso de datos
    public void ingresoDeDatos(String NumCliente, String Nombre, String Apellido, String Direccion, String Telefono, String TipoPref,
            String MaxRent) {

        lblNRegistro.setForeground(Color.WHITE);
        if (contadorDeRegistros < 24) {
            numCliente[contadorDeRegistros] = NumCliente.replaceAll("-", "").replaceAll(" ", "");
            nombre[contadorDeRegistros] = Nombre;
            apellido[contadorDeRegistros] = Apellido;
            direccion[contadorDeRegistros] = Direccion;
            telefono[contadorDeRegistros] = Telefono;
            tipoPref[contadorDeRegistros] = TipoPref;
            maxRent[contadorDeRegistros] = MaxRent;

            ingresoEnTabla();

        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede ingresar mas datos.");
        }

    }

    //metodo de modificacion de datos
    public void modificarDatos(String NumCliente, String Nombre, String Apellido, String Direccion, String Telefono, String TipoPref,
            String MaxRent, int i) {

        numCliente[i] = NumCliente.replaceAll("-", "").replaceAll(" ", "");
        nombre[i] = Nombre;
        apellido[i] = Apellido;
        direccion[i] = Direccion;
        telefono[i] = Telefono;
        tipoPref[i] = TipoPref;
        maxRent[i] = MaxRent;

        actualizarTabla(i);

    }

    public void borrarDeTabla(int i) {
        try {
            conectar();
            String res = "DELETE FROM cliente WHERE numCliente='" + numCliente[i] + "'";
            s.executeUpdate(res);

            s.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Registro Eliminado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al borrar: " + e);
        }
    }

    public void eliminar(int x) {
        if (x != contadorDeRegistros) {
            if (x >= 0) {
                borrarDeTabla(x);
                for (int i = x; i < contadorDeRegistros; i++) {
                    numCliente[i] = numCliente[i + 1];
                    nombre[i] = nombre[i + 1];
                    apellido[i] = apellido[i + 1];
                    direccion[i] = direccion[i + 1];
                    telefono[i] = telefono[i + 1];
                    tipoPref[i] = tipoPref[i + 1];
                    maxRent[i] = maxRent[i + 1];
                }
                contadorDeRegistros--;
            } else {
                JOptionPane.showMessageDialog(null, "No tiene registros.");
            }
        }
    }

    //metodo para buscar el DPI en el arreglo
    public int buscarDPI(String DPI) throws ArrayIndexOutOfBoundsException {
        DPIencontrado = false;
        int regresar = 10002;
        for (int i = 0; i < contadorDeRegistros; i++) {
            if ((DPI.replaceAll("-", "").replaceAll(" ", "")).equals(numCliente[i])) {
                regresar = i;
                DPIencontrado = true;
                break;
            }
        }

        return regresar;
    }

    //metodo para mostrar datos
    public void mostrarDatos(int i) {
        txtNumCliente.setText(numCliente[i]);
        txtNumCliente.setEnabled(true);
        txtNombre.setText(nombre[i]);
        txtNombre.setEnabled(false);
        txtApellido.setText(apellido[i]);
        txtApellido.setEnabled(false);
        txtDireccion.setText(direccion[i]);
        txtDireccion.setEnabled(false);
        txtTelefono.setText(telefono[i]);
        txtTelefono.setEnabled(false);
        txtTipoPref.setText(tipoPref[i]);
        txtTipoPref.setEnabled(false);
        txtMaxRent.setText(maxRent[i]);
        txtMaxRent.setEnabled(false);
        txtNumCliente.requestFocus();
    }

    public void habilitarYMostrar(int i) {
        lblRegistro.setForeground(Color.WHITE);
        txtNumCliente.setEnabled(false);
        txtNombre.setText(nombre[i]);
        txtNombre.setEnabled(true);
        txtApellido.setText(apellido[i]);
        txtApellido.setEnabled(true);
        txtDireccion.setText(direccion[i]);
        txtDireccion.setEnabled(true);
        txtTelefono.setText(telefono[i]);
        txtTelefono.setEnabled(true);
        txtTipoPref.setText(tipoPref[i]);
        txtTipoPref.setEnabled(true);
        txtMaxRent.setText(maxRent[i]);
        txtMaxRent.setEnabled(true);
        cmdSiguiente.setEnabled(false);
        cmdPrimero.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdGuardar.setEnabled(true);
        cmdEliminar.setEnabled(true);
        DPIencontrado = true;
    }

    //metodo para habilitar ingreso de datos
    public void habilitar() {
        lblRegistro.setForeground(Color.WHITE);
        txtNumCliente.setEnabled(false);
        txtNombre.setText("");
        txtNombre.setEnabled(true);
        txtApellido.setText("");
        txtApellido.setEnabled(true);
        txtDireccion.setText("");
        txtDireccion.setEnabled(true);
        txtTelefono.setText("");
        txtTelefono.setEnabled(true);
        txtTipoPref.setText("");
        txtTipoPref.setEnabled(true);
        txtMaxRent.setText("");
        txtMaxRent.setEnabled(true);
        cmdSiguiente.setEnabled(false);
        cmdPrimero.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdGuardar.setEnabled(true);
        cmdEliminar.setEnabled(true);
        DPIencontrado = false;
    }

    //metodo que deshabilita las casillas y muestra la info
    public void deshabilitarYMostrar() {
        txtNumCliente.setEnabled(true);
        txtNombre.setText(nombre[buscador]);
        txtNombre.setEnabled(false);
        txtApellido.setText(apellido[buscador]);
        txtApellido.setEnabled(false);
        txtDireccion.setText(direccion[buscador]);
        txtDireccion.setEnabled(false);
        txtTelefono.setText(telefono[buscador]);
        txtTelefono.setEnabled(false);
        txtTipoPref.setText(tipoPref[buscador]);
        txtTipoPref.setEnabled(false);
        txtMaxRent.setText(maxRent[buscador]);
        txtMaxRent.setEnabled(false);
        cmdSiguiente.setEnabled(true);
        cmdPrimero.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdGuardar.setEnabled(false);

        DPIencontrado = false;
    }

    //metodo que deshabilita las casillas de edicion
    public void deshabilitar() {
        txtNumCliente.setEnabled(true);

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtDireccion.setEnabled(false);

        txtTelefono.setEnabled(false);

        txtTipoPref.setEnabled(false);

        txtMaxRent.setEnabled(false);

        cmdSiguiente.setEnabled(true);
        cmdPrimero.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdGuardar.setEnabled(false);

    }

    //metodo que limpia las casillas
    public void limpiar() {
        txtNumCliente.setText("");

        txtNumCliente.requestFocus();

        txtApellido.setText("");

        txtDireccion.setText("");

        txtTelefono.setText("");

        txtTipoPref.setText("");

        txtMaxRent.setText("");

    }

    //metodo que permite solo numeros y guiones en el numCliente
    public void errorDeFormato(String nombre) {
        JOptionPane.showMessageDialog(null, "No se permiten " + nombre + " en esta seccion.");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdPrimero;
    private javax.swing.JButton cmdSiguiente;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbMostrarAutores;
    private javax.swing.JLabel lblNRegistro;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMaxRent;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoPref;
    // End of variables declaration//GEN-END:variables
}

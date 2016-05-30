/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamhome;

import static dreamhome.InsertaraCliente.conn;
import static dreamhome.InsertaraCliente.s;
import static dreamhome.Main.conn;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class InsertarPropiedad extends javax.swing.JFrame {

    static Connection conn;
    static Statement s;
    static ResultSet rs;
    int cantidadColumnas;
    int cantidadFilas;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int contadorDeRegistros = 0;
    int ubicacionDeRegistro = 0;
    int buscador = 0;
    boolean enter = false;
    boolean DPIencontrado = false;
    String numPropiedad[] = new String[50];
    String calle[] = new String[50];
    String ciudad[] = new String[50];
    String codigoPostal[] = new String[50];
    String tipo[] = new String[50];
    String habitacion[] = new String[50];
    String renta[] = new String[50];
    String numPropietario[] = new String[50];
    String numEmpleado[] = new String[50];
    String NumCliente1 = "";
    /**
     * Creates new form InsertarPropiedad
     */
    public InsertarPropiedad() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmpleado = new javax.swing.JTextField();
        txtNumPropiedad = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtRenta = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblNRegistro = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        cmdPrimero = new javax.swing.JButton();
        cmdSiguiente = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel1.setText("Habitacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel2.setText("Ciudad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("Renta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel4.setText("Codigo Postal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 40));

        jLabel5.setText("Numero Propietario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setText("Numero Empleado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel8.setText("Numero Propiedad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel9.setText("Calle");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, -1));
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 100, -1));
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -8, 10, 270));
        getContentPane().add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, -1));
        getContentPane().add(txtNumPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, -1));
        getContentPane().add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, -1));

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 840, 310));
        getContentPane().add(txtRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, -1));
        getContentPane().add(txtPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, -1));

        jButton3.setText("Regresar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        getContentPane().add(lblNRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 53, 15));

        lblRegistro.setText("Registro :");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 20));

        cmdPrimero.setText("Primero");
        cmdPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(cmdPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        cmdSiguiente.setText("Siguiente");
        cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        cmdUltimo.setText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        cmdAnterior.setText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(cmdAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           conn = Main.Enlace(conn);
           String sqlinsertar="insert into propiedad values (?,?,?,?,?,?,?,?,?)";
           PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, txtNumPropiedad.getText());
            psta.setString(2, txtCalle.getText());
            psta.setString(3, txtCiudad.getText());
            psta.setString(4, txtCodigoPostal.getText());
            psta.setString(5, txtTipo.getText());
            psta.setString(6, txtHabitacion.getText());
            psta.setString(7, txtRenta.getText());
            psta.setString(8, txtPropietario.getText());
            psta.setString(9, txtEmpleado.getText());
            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error ingresando datos: " + ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void consultaDeTabla() {
        int x = 0;
        try {

            conectar();
            rs = s.executeQuery("SELECT count(*) FROM propiedad");

            if (rs.next()) {

                cantidadFilas = rs.getInt("count(*)");
            } else {
                cantidadFilas = 0;
            }

            rs = s.executeQuery("SELECT * FROM propiedad");
            ResultSetMetaData rsMd = rs.getMetaData();
            cantidadColumnas = rsMd.getColumnCount();

            Object[] fila = new Object[cantidadColumnas];
            while (rs.next()) {

                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);

                }

                numPropiedad[x] = fila[0].toString();
                calle[x] = fila[1].toString();
                ciudad[x] = fila[2].toString();
                codigoPostal[x] = fila[3].toString();
                tipo[x] = fila[4].toString();
                habitacion[x] = fila[5].toString();
                renta[x] = fila[6].toString();
                numPropietario[x] = fila[7].toString();
                numEmpleado[x] = fila[8].toString();
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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
               try {
//ejecuta la conexion   
            conn=Main.Enlace(conn);
//ejecuta la consulta
            rs=Main.En2Est(rs);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
        Formulario  Fmostrar = new Formulario();
        Fmostrar.setVisible(true);
        Fmostrar.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         eliminar((ubicacionDeRegistro));

        if (numPropiedad[0] != "") {

            ubicacionDeRegistro = 0;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            limpiar();
            deshabilitar();
            lblRegistro.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmdPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeroActionPerformed
        if (ubicacionDeRegistro != 0) {
            ubicacionDeRegistro = 0;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el primer dato");
            txtNumPropiedad.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPrimeroActionPerformed

    private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed

        if (contadorDeRegistros != 0) {
            if (ubicacionDeRegistro < (contadorDeRegistros - 1)) {
                ubicacionDeRegistro++;
                mostrarDatos(ubicacionDeRegistro);
                lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
            } else {
                JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el ultimo dato");
                txtCiudad.requestFocus();
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
            txtNumPropiedad.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        if (ubicacionDeRegistro != 0) {
            ubicacionDeRegistro--;
            mostrarDatos(ubicacionDeRegistro);
            lblNRegistro.setText("" + (ubicacionDeRegistro + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya se encuentra en el primer dato");
            txtNumPropiedad.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAnteriorActionPerformed

    public void limpiar() {
        txtNumPropiedad.setText("");

        txtNumPropiedad.requestFocus();

        txtCalle.setText("");

        txtCiudad.setText("");

        txtCodigoPostal.setText("");

        txtTipo.setText("");

        txtHabitacion.setText("");
        txtRenta.setText("");
        txtPropietario.setText("");
        txtEmpleado.setText("");

    }
    public void mostrarDatos(int i) {
        txtNumPropiedad.setText(numPropiedad[i]);
        txtNumPropiedad.setEnabled(true);
        txtCalle.setText(calle[i]);
        txtCalle.setEnabled(false);
        txtCiudad.setText(ciudad[i]);
        txtCiudad.setEnabled(false);
        txtCodigoPostal.setText(codigoPostal[i]);
        txtCodigoPostal.setEnabled(false);
        txtTipo.setText(tipo[i]);
        txtTipo.setEnabled(false);
        txtHabitacion.setText(habitacion[i]);
        txtHabitacion.setEnabled(false);
        txtRenta.setText(renta[i]);
        txtRenta.setEnabled(false);
        txtPropietario.setText(numPropietario[i]);
        txtPropietario.setEnabled(false);
        txtEmpleado.setText(numEmpleado[i]);
        txtEmpleado.setEnabled(false);
        txtNumPropiedad.requestFocus();
    }
    
    public void deshabilitar() {
        txtNumPropiedad.setEnabled(true);
        txtCalle.setEnabled(false);
        txtCiudad.setEnabled(false);
        txtCodigoPostal.setEnabled(false);
        txtTipo.setEnabled(false);
        txtHabitacion.setEnabled(false);
        txtRenta.setEnabled(false);
        txtPropietario.setEnabled(false);
        txtEmpleado.setEnabled(false);


    }
    
 public void borrarDeTabla(int i) {
        try {
            conectar();
            String res = "DELETE FROM propiedad WHERE numPropiedad='" + numPropiedad[i] + "'";
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
                    numPropiedad[i] = numPropiedad[i + 1];
                    calle[i] = calle[i + 1];
                    ciudad[i] = ciudad[i + 1];
                    codigoPostal[i] = codigoPostal[i + 1];
                    tipo[i] = tipo[i + 1];
                    habitacion[i] = habitacion[i + 1];
                    renta[i] = renta[i + 1];
                    numPropietario[i] = numPropietario[i + 1];
                    numEmpleado[i] = numEmpleado[i + 1];
                }
                contadorDeRegistros--;
            } else {
                JOptionPane.showMessageDialog(null, "No tiene registros.");
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(InsertarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarPropiedad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdPrimero;
    private javax.swing.JButton cmdSiguiente;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNRegistro;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtNumPropiedad;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtRenta;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

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

}
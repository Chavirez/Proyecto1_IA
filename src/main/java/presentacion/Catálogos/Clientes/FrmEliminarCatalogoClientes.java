/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.Catálogos.Clientes;

import dtos.ClienteDTO;
import presentacion.*;
import dtos.ciudadDTO;
import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.CiudadNegocio;
import negocio.ClienteNegocio;
import negocio.ControlRegistros;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.NegocioException;
import persistencia.CiudadDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;

/**
 *
 * @author nomar
 */
public class FrmEliminarCatalogoClientes extends javax.swing.JFrame {

    // Conexion obligatoria cuando se interactua con la base de datos.
    IConexionBD conexionBD = new ConexionBD();
    IClienteDAO clienteDAO = new ClienteDAO(conexionBD);
    ICiudadDAO ciudadDAO = new CiudadDAO(conexionBD);
    IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
    ICiudadNegocio ciudad = new CiudadNegocio(ciudadDAO);

    /**
     * Creates new form FrmRegistro
     */
    public FrmEliminarCatalogoClientes() {
        initComponents();
        llenarBoxCiudades(buscarCiudadTabla());
        llenarBoxClientes(buscarClienteTabla());
    }

    private void llenarBoxClientes(List<ClienteDTO> clientesLista) {
        int i = 0;
        while (clientesLista.size() > i) {
            boxClientes.addItem(clientesLista.get(i).getNombre());
            i++;
        }
    }

    /**
     * Metodo que se encarga de hacer la lista de las ciudades con la info de la
     * base de datos.
     *
     * @return lista con las ciudades de la base de datos.
     */
    private List<ClienteDTO> buscarClienteTabla() {
        List<ClienteDTO> clientesLista = null;
        try {

            clientesLista = this.clienteNegocio.buscarClientesTabla();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return clientesLista;
    }    
    
    /**
     * Metodo que se encarga de llenar de informacion el comboBox de Ciudad.
     *
     * @param ciudadLista lista con las ciudades.
     */
    private void llenarBoxCiudades(List<ciudadDTO> ciudadLista) {
        int i = 0;
        while (ciudadLista.size() > i) {
            boxCiudad.addItem(ciudadLista.get(i).getNombre());
            i++;
        }
    }

    /**
     * Metodo que se encarga de hacer la lista de las ciudades con la info de la
     * base de datos.
     *
     * @return lista con las ciudades de la base de datos.
     */
    private List<ciudadDTO> buscarCiudadTabla() {
        List<ciudadDTO> ciudadLista = null;
        try {

            ciudadLista = this.ciudad.buscarCiudadTabla();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return ciudadLista;
    }

    /**
     * Metodo que convierte el texto de la fecha en un formato fecha para SQL.
     *
     * @param dateText fecha en formato texto.
     * @return fecha en formato fecha para SQL.
     */
    private static java.sql.Date getSQLDate(String dateText) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false); // To ensure strict date parsing
        try {
            // Parse the date string to a java.util.Date
            java.util.Date parsedDate = format.parse(dateText);
            // Convert java.util.Date to java.sql.Date
            return new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * Metodo para registrar cliente en la base de datos
     *
     * @param cliente clienteDTO
     * @throws NegocioException Posible Excepcion
     */
    private void eliminarCliente(registrarClienteDTO cliente) throws NegocioException {
        try {
            clienteNegocio.eliminarCliente(cliente);
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo editar a el cliente \n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_camposObligatorios = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JPanel();
        close_icon2 = new javax.swing.JLabel();
        mail_icon = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        lock_icon = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        lbl_registro = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        txtNacimiento = new javax.swing.JTextField();
        lbl_fecha_nacimiento = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        Correo1 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        lbl_ciudad = new javax.swing.JLabel();
        boxCiudad = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();
        boxClientes = new javax.swing.JComboBox<>();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_camposObligatorios.setBackground(new java.awt.Color(153, 153, 153));
        lbl_camposObligatorios.setForeground(new java.awt.Color(153, 153, 153));
        lbl_camposObligatorios.setText("(*) Campos obligatorios.");
        getContentPane().add(lbl_camposObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        btn_close2.setBackground(new java.awt.Color(47, 48, 55));
        btn_close2.setForeground(new java.awt.Color(47, 48, 55));
        btn_close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close2.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close2MouseClicked(evt);
            }
        });
        btn_close2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_icon2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close_icon2.setForeground(new java.awt.Color(255, 255, 255));
        close_icon2.setText("X");
        btn_close2.add(close_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 20, 20));

        getContentPane().add(btn_close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 20));

        mail_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail_icon.png"))); // NOI18N
        getContentPane().add(mail_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(47, 48, 55));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("<");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 17, -1));

        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, -1));

        lock_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock_icon.png"))); // NOI18N
        getContentPane().add(lock_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 300, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 300, 30));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 300, 30));

        lbl_registro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registro.setText("Eliminar Cliente");
        getContentPane().add(lbl_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 100, 310, -1));

        btnRegistro.setBackground(new java.awt.Color(53, 53, 53));
        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Eliminar");
        btnRegistro.setBorderPainted(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));
        getContentPane().add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 300, 30));

        lbl_fecha_nacimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fecha_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha_nacimiento.setText("Fecha de nacimiento (YYYY-MM-DD) *");
        getContentPane().add(lbl_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        Contraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña *");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        Correo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Correo1.setForeground(new java.awt.Color(255, 255, 255));
        Correo1.setText("Correo *");
        getContentPane().add(Correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre(s) *");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 300, 30));

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido(s) *");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        lbl_ciudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ciudad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ciudad.setText("Ciudad *");
        getContentPane().add(lbl_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        getContentPane().add(boxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 300, 30));

        logo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setText("Cinépolis");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        boxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxClientesActionPerformed(evt);
            }
        });
        getContentPane().add(boxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 210, -1));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close2MouseClicked
        dispose();
    }//GEN-LAST:event_btn_close2MouseClicked

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed

        try {
            String correo = txtCorreo.getText();
            String contrasenia = txtContraseña.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String fechaTexto = txtNacimiento.getText();
            Date fechaSql = getSQLDate(fechaTexto);
            int ciudad = boxCiudad.getSelectedIndex();
            int ciudadSql = 1 + boxCiudad.getSelectedIndex();
            int idCliente = 1 + boxClientes.getSelectedIndex();
            System.out.println(idCliente);
            System.out.println(boxClientes.getSelectedIndex());

            ControlRegistros cRegistro = new ControlRegistros();
            //cRegistro.validarCampos(correo, contrasenia, nombre, apellido, fechaTexto, ciudad);
            boolean verificacionValidacion = cRegistro.validarCampos(correo,
                    contrasenia, nombre, apellido, fechaTexto,
                    ciudad); // Regresa true si todas las validaciones son satisfactorias, false en caso contrario.

            // Revisa las validaciones de ControlRegistros
            if (verificacionValidacion == true) {

                registrarClienteDTO cliente = new registrarClienteDTO(nombre, apellido, correo, ciudadSql, contrasenia, fechaSql, idCliente);

              
                    eliminarCliente(cliente);
                    JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente");

                }
            
        } catch (Exception ex) {
            Logger.getLogger(FrmEliminarCatalogoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegistroActionPerformed



    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacimientoActionPerformed

    private void boxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCiudadActionPerformed

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:

        new FrmCatalogoClientes().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void boxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxClientesActionPerformed
        // TODO add your handling code here:
        int selectedIndex = boxClientes.getSelectedIndex();
        if (selectedIndex != -1)
        {
            try
            {
                // Obtener el ID del chat seleccionado usando el índice
                List<ClienteDTO> chats = clienteNegocio.buscarClientesTabla();
                ClienteDTO clienteSeleccionado = chats.get(selectedIndex);
                txtCorreo.setText(clienteSeleccionado.getEmail());
                txtContraseña.setText(clienteSeleccionado.getContraseña());
                txtNombre.setText(clienteSeleccionado.getNombre());
                txtApellido.setText(clienteSeleccionado.getApellido());
                txtNacimiento.setText(clienteSeleccionado.getFechaNacimiento().toString());

            } catch (NegocioException ex)
            {
                Logger.getLogger(FrmEliminarCatalogoClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
    }//GEN-LAST:event_boxClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Correo1;
    private javax.swing.JLabel Regresar;
    private javax.swing.JLabel background_img;
    private javax.swing.JComboBox<String> boxCiudad;
    private javax.swing.JComboBox<String> boxClientes;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JPanel btn_close2;
    private javax.swing.JLabel close_icon2;
    private javax.swing.JLabel lbl_camposObligatorios;
    private javax.swing.JLabel lbl_ciudad;
    private javax.swing.JLabel lbl_fecha_nacimiento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lock_icon;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mail_icon;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

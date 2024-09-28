/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.validarClienteDTO;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.ClienteNegocio;
import negocio.IClienteNegocio;
import negocio.NegocioException;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;

/**
 *
 * @author PC
 */
public class FrmInicioSesion extends javax.swing.JFrame {

    // Conexion obligatoria cuando se interactua con la base de datos.
    IConexionBD conexionBD = new ConexionBD();
    IClienteDAO clienteDAO = new ClienteDAO(conexionBD);
    IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);

    /**
     * Creates new form FrmInicioSesion
     */
    public FrmInicioSesion() {
        initComponents();
        textoPlaceholders();
    }

    /**
     * Este metodo sirve para darle un formato a los campos de texto de correo y
     * de contraseña, poniendoles un texto de placeholder.
     */
    public void textoPlaceholders() {
        //Agregar placeholder a Correo Electronico
        // Configurar el marcador de posición
        txt_correo.setText("Correo electrónico");
        txt_correo.setForeground(java.awt.Color.GRAY); // Color del texto de marcador de posición

        // Agregar un FocusListener
        txt_correo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt_correo.getText().equals("Correo electrónico")) {
                    txt_correo.setText("");
                    txt_correo.setForeground(java.awt.Color.BLACK); // Cambiar el color del texto
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txt_correo.getText().isEmpty()) {
                    txt_correo.setForeground(java.awt.Color.GRAY); // Color del texto de marcador de posición
                    txt_correo.setText("Correo electrónico");
                }
            }
        });

        //Agregar placeholder a Contraseña
        // Configurar el marcador de posición
        txt_contrasenia.setText("Contraseña");
        txt_contrasenia.setForeground(java.awt.Color.GRAY); // Color del texto de marcador de posición

        // Agregar un FocusListener
        txt_contrasenia.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt_contrasenia.getText().equals("Contraseña")) {
                    txt_contrasenia.setText("");
                    txt_contrasenia.setForeground(java.awt.Color.BLACK); // Cambiar el color del texto
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txt_contrasenia.getText().isEmpty()) {
                    txt_contrasenia.setForeground(java.awt.Color.GRAY); // Color del texto de marcador de posición
                    txt_contrasenia.setText("Contraseña");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        lbl_o = new javax.swing.JLabel();
        btn_close = new javax.swing.JPanel();
        close_icon = new javax.swing.JLabel();
        mail_icon = new javax.swing.JLabel();
        lock_icon = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JTextField();
        btn_continuar = new javax.swing.JPanel();
        lbl_continuar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinepolis App");
        setUndecorated(true);
        setResizable(false);

        content.setBackground(new java.awt.Color(47, 48, 55));
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(800, 600));
        content.setPreferredSize(new java.awt.Dimension(800, 600));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_o.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_o.setForeground(new java.awt.Color(153, 153, 153));
        lbl_o.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_o.setText("ó");
        lbl_o.setToolTipText("");
        content.add(lbl_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 20, -1));

        btn_close.setBackground(new java.awt.Color(47, 48, 55));
        btn_close.setForeground(new java.awt.Color(47, 48, 55));
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        btn_close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_icon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close_icon.setForeground(new java.awt.Color(255, 255, 255));
        close_icon.setText("X");
        btn_close.add(close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 20, 20));

        content.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 20));

        mail_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail_icon.png"))); // NOI18N
        content.add(mail_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        lock_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock_icon.png"))); // NOI18N
        content.add(lock_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, -1));
        content.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 300, 30));
        content.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 300, 30));

        btn_continuar.setBackground(new java.awt.Color(83, 85, 96));
        btn_continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });

        lbl_continuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_continuar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_continuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_continuar.setText("Continuar");

        javax.swing.GroupLayout btn_continuarLayout = new javax.swing.GroupLayout(btn_continuar);
        btn_continuar.setLayout(btn_continuarLayout);
        btn_continuarLayout.setHorizontalGroup(
            btn_continuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_continuar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        btn_continuarLayout.setVerticalGroup(
            btn_continuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_continuar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        content.add(btn_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 300, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cinépolis");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        btnRegistrarse.setBackground(new java.awt.Color(47, 48, 55));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registarse");
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        content.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 100, 30));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        content.add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    /**
     * Metodo para iniciar sesion. Si el usuario existe en la base de datos
     * inicia sesion, error en caso contrario.
     *
     * @param evt Presionar el JPanel con un click
     */
    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked
        String correo = txt_correo.getText();
        String contrasenia = txt_contrasenia.getText();

        try {
            validarClienteDTO cliente = new validarClienteDTO(correo, contrasenia);
            if (validarCliente(cliente) == true) {
                JOptionPane.showMessageDialog(this, "Sesión iniciada", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                // PLACEHOLDER
                // Aqui se agregara que se desea que se realiza cuando el
                // usuario inicialize sesion.
                System.out.println("Se inicia la sesion");
            } else {
                JOptionPane.showMessageDialog(this, "Error al iniciar sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NegocioException ex) {
            Logger.getLogger(FrmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_continuarMouseClicked

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        
        new FrmRegistro().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPanel btn_close;
    private javax.swing.JPanel btn_continuar;
    private javax.swing.JLabel close_icon;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_continuar;
    private javax.swing.JLabel lbl_o;
    private javax.swing.JLabel lock_icon;
    private javax.swing.JLabel mail_icon;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
    private boolean validarCliente(validarClienteDTO cliente) throws NegocioException {

        return this.clienteNegocio.validarCliente(cliente);

    }

}

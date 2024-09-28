/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

/**
 *
 * @author nomar
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        SetImageLabel(imgPromo, "\"C:\\Users\\nomar\\Downloads\\Cinepolis.png\"");
    }

    private void SetImageLabel(JLabel labelname, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuario = new javax.swing.JPanel();
        UsuarioIcon = new javax.swing.JLabel();
        FondoPromo = new javax.swing.JPanel();
        imgPromo = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        CinepolisLogo = new javax.swing.JLabel();
        LogoC = new javax.swing.JLabel();
        btnCatalago = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        UbicacionIcon = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        fondoEncabezado = new javax.swing.JLabel();
        ConoceLaRopa = new javax.swing.JLabel();
        todasTus = new javax.swing.JLabel();
        ClubCinepolis = new javax.swing.JLabel();
        Cinépolis = new javax.swing.JLabel();
        btnAdquiere = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnUsuario.add(UsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 30, 25));

        FondoPromo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgPromo.png"))); // NOI18N
        FondoPromo.add(imgPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 260));

        getContentPane().add(FondoPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 350, 258));

        Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CinepolisLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCinepolis.png"))); // NOI18N
        Encabezado.add(CinepolisLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
        Encabezado.add(LogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btnCatalago.setBackground(new java.awt.Color(54, 54, 54));
        btnCatalago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCatalago.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalago.setText("Catalogo");
        btnCatalago.setBorderPainted(false);
        btnCatalago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalagoActionPerformed(evt);
            }
        });
        Encabezado.add(btnCatalago, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnPromos.setBackground(new java.awt.Color(54, 54, 54));
        btnPromos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromos.setForeground(new java.awt.Color(255, 255, 255));
        btnPromos.setText("Promos");
        btnPromos.setBorderPainted(false);
        btnPromos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromosActionPerformed(evt);
            }
        });
        Encabezado.add(btnPromos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));
        Encabezado.add(UbicacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 20, 30));

        jTextField1.setBackground(new java.awt.Color(54, 54, 54));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 54, 54)));
        Encabezado.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 30));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        ConoceLaRopa.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        ConoceLaRopa.setForeground(new java.awt.Color(255, 255, 255));
        ConoceLaRopa.setText("Conoce la ropa"); // NOI18N
        ConoceLaRopa.setToolTipText("");
        getContentPane().add(ConoceLaRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, -1));

        todasTus.setForeground(new java.awt.Color(255, 255, 255));
        todasTus.setText("Todas tus compras acumulan puntos para");
        getContentPane().add(todasTus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        ClubCinepolis.setForeground(new java.awt.Color(255, 255, 255));
        ClubCinepolis.setText(" Club Cinépolis®");
        getContentPane().add(ClubCinepolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        Cinépolis.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        Cinépolis.setForeground(new java.awt.Color(255, 255, 255));
        Cinépolis.setText("Cinépolis");
        getContentPane().add(Cinépolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnAdquiere.setBackground(new java.awt.Color(54, 54, 54));
        btnAdquiere.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdquiere.setForeground(new java.awt.Color(255, 255, 255));
        btnAdquiere.setText("Adquiere la tuya");
        btnAdquiere.setToolTipText("");
        btnAdquiere.setBorderPainted(false);
        btnAdquiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdquiereActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdquiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));
        fondo.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdquiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdquiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdquiereActionPerformed

    private void btnPromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPromosActionPerformed

    private void btnCatalagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalagoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CinepolisLogo;
    private javax.swing.JLabel Cinépolis;
    private javax.swing.JLabel ClubCinepolis;
    private javax.swing.JLabel ConoceLaRopa;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel FondoPromo;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel UbicacionIcon;
    private javax.swing.JLabel UsuarioIcon;
    private javax.swing.JButton btnAdquiere;
    private javax.swing.JButton btnCatalago;
    private javax.swing.JButton btnPromos;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JLabel imgPromo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel todasTus;
    // End of variables declaration//GEN-END:variables
}

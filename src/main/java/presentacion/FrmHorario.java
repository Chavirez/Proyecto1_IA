/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.FuncionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.FuncionNegocio;
import negocio.IFuncionNegocio;
import negocio.NegocioException;
import persistencia.ConexionBD;
import persistencia.IConexionBD;
import persistencia.IFuncionDAO;
import persistencia.funcionDAO;

/**
 *
 * @author nomar
 */
public class FrmHorario extends javax.swing.JFrame {

    IConexionBD conexionBD = new ConexionBD();
    IFuncionDAO funcionDAO = new funcionDAO(conexionBD);
    IFuncionNegocio funcionNegocio = new FuncionNegocio(funcionDAO);
    private int pagina = 0;
    private int LIMITE = 3;

    /**
     * Creates new form FrmHorario
     */
    public FrmHorario() {
        initComponents();
        llenarTablaFunciones(obtenerPagina(pagina, LIMITE));
    }

    private List<FuncionDTO> buscarFuncionesTabla() {
        List<FuncionDTO> funcionesLista = null;
        try {

            funcionesLista = this.funcionNegocio.buscarFuncionesTablaT();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return funcionesLista;
    }

    private void llenarTablaFunciones(List<FuncionDTO> funcionesLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaHorario.getModel();

        if (modeloTabla.getRowCount() > 0) {
            for (int i = modeloTabla.getRowCount() - 1; i > -1; i--) {
                modeloTabla.removeRow(i);
            }
        }

        if (funcionesLista != null) {
            funcionesLista.forEach(row -> {
                Object[] fila = new Object[8];
                fila[0] = row.getTitulo();
                fila[1] = row.getHoraInicio();
                fila[2] = row.getHoraFin();
                fila[3] = row.getSala();

                modeloTabla.addRow(fila);
            });
        }
    }

    private List<FuncionDTO> obtenerPagina(int indiceInicio, int indiceFin) {
        List<FuncionDTO> todas = buscarFuncionesTabla();
        List<FuncionDTO> todasLasPaginas = new ArrayList<>();
        indiceFin = Math.min(indiceFin, todas.size());
        for (int i = indiceInicio; i < indiceFin; i++) {
            todasLasPaginas.add(todas.get(i));
        }
        return todasLasPaginas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        btnCatalago = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        LogoC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondoEncabezado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        panelRegresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horarios");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Encabezado.add(LogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinépolis");
        Encabezado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        jScrollPane1.setBackground(new java.awt.Color(54, 54, 54));
        jScrollPane1.setForeground(new java.awt.Color(54, 54, 54));

        tablaHorario.setBackground(new java.awt.Color(54, 54, 54));
        tablaHorario.setForeground(new java.awt.Color(255, 255, 255));
        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pelicula", "Hora Inicio", "Hora Fin", "Sala", "Comprar"
            }
        ));
        tablaHorario.setRowHeight(81);
        jScrollPane1.setViewportView(tablaHorario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 650, 280));

        btnAnterior.setBackground(new java.awt.Color(54, 54, 54));
        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorderPainted(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 140, 30));

        btnSiguiente.setBackground(new java.awt.Color(54, 54, 54));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 140, 30));

        panelRegresar.setBackground(new java.awt.Color(34, 35, 41));
        panelRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegresarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<");

        javax.swing.GroupLayout panelRegresarLayout = new javax.swing.GroupLayout(panelRegresar);
        panelRegresar.setLayout(panelRegresarLayout);
        panelRegresarLayout.setHorizontalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegresarLayout.setVerticalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegresarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(panelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 40, 40));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalagoActionPerformed
        // TODO add your handling code here:

        new FrmSucursal().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCatalagoActionPerformed

    private void btnPromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromosActionPerformed
        // TODO add your handling code here:

        new FrmMenu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnPromosActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
         // TODO add your handling code here:
        pagina += 3;
        LIMITE += 3;
        llenarTablaFunciones(obtenerPagina(pagina, LIMITE));
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void panelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegresarMouseClicked
        // TODO add your handling code here:

        new FrmSucursal().setVisible(true);
//        new FrmCartelera().setVisible(true); 
        this.dispose();

    }//GEN-LAST:event_panelRegresarMouseClicked

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        if (pagina -3 < 0)
        {
            JOptionPane.showMessageDialog(this, "No hay más páginas atrás");
        }
        else
        {
            pagina -= 3;
            LIMITE -= 3;
            llenarTablaFunciones(obtenerPagina(pagina, LIMITE));
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel background_img;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCatalago;
    private javax.swing.JButton btnPromos;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables
}

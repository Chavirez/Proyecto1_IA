/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.PeliculaDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import negocio.IPeliculaNegocio;
import negocio.NegocioException;
import negocio.PeliculaNegocio;
import persistencia.ConexionBD;
import persistencia.IConexionBD;
import persistencia.IPeliculasDAO;
import persistencia.peliculasDAO;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author nomar
 */
public class FrmCartelera extends javax.swing.JFrame {

    IConexionBD conexionBD = new ConexionBD();
    IPeliculasDAO peliculasDAO = new peliculasDAO(conexionBD);
    IPeliculaNegocio peliculasNegocio = new PeliculaNegocio(peliculasDAO);
    private int pagina = 0;
    private int LIMITE = 3;

    /**
     * Creates new form FrmCartelera
     */
    public FrmCartelera() {
        initComponents();

        llenarTablaPeliculas(obtenerPagina(pagina, LIMITE));
    }

    private List<PeliculaDTO> buscarPeliculasTabla() {
        List<PeliculaDTO> PeliculasLista = null;
        try {

            PeliculasLista = this.peliculasNegocio.buscarPeliculaTablaT();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return PeliculasLista;
    }

    private void llenarTablaPeliculas(List<PeliculaDTO> PeliculasLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaCartelera.getModel();

        if (modeloTabla.getRowCount() > 0) {
            for (int i = modeloTabla.getRowCount() - 1; i > -1; i--) {
                modeloTabla.removeRow(i);
            }
        }

        if (PeliculasLista != null) {
            PeliculasLista.forEach(row -> {
                Object[] fila = new Object[7];
                fila[0] = row.getTitulo();
                fila[1] = row.getClasificacion();
                fila[2] = row.getGenero();
                fila[3] = row.getDuracion();               
                fila[4] = row.getPais();
                fila[5] = row.getTrailer();
                fila[6] = row.getSinopsis();

                modeloTabla.addRow(fila);
            });
        }
    }

    private List<PeliculaDTO> obtenerPagina(int indiceInicio, int indiceFin) {
        List<PeliculaDTO> todas = buscarPeliculasTabla();
        List<PeliculaDTO> todasLasPaginas = new ArrayList<>();
        indiceFin = Math.min(indiceFin, todas.size());
        for (int i = indiceInicio; i < indiceFin; i++) {
            todasLasPaginas.add(todas.get(i));
        }
        return todasLasPaginas;
    }

    private void cargarConfiguracionInicialTablaCartelera() { 
        
        ActionListener onVerSinopsisClickListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                

                
            }               
        };
            
        TableColumnModel modeloColumnas = this.tablaCartelera.getColumnModel();
        modeloColumnas.getColumn(3).setCellRenderer(new JButtonRenderer("Ver Sinopsis"));
        modeloColumnas.getColumn(3).setCellEditor(new JButtonCellEditor("Ver Sinopsis",onVerSinopsisClickListener));
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
        btn_close = new javax.swing.JPanel();
        close_icon = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        UsuarioIcon = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnCartelera = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        UbicacionIcon = new javax.swing.JLabel();
        LogoC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondoEncabezado = new javax.swing.JLabel();
        panelRegresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCartelera = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartelera");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cartelera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

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

        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 20));

        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UsuarioIcon.png"))); // NOI18N
        btnUsuario.add(UsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 30, 25));

        Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(54, 54, 54));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 54, 54)));
        Encabezado.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 30));

        btnCartelera.setBackground(new java.awt.Color(54, 54, 54));
        btnCartelera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setText("Cartelera");
        btnCartelera.setBorderPainted(false);
        btnCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteleraActionPerformed(evt);
            }
        });
        Encabezado.add(btnCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

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

        UbicacionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gps_icon.png"))); // NOI18N
        Encabezado.add(UbicacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 20, 30));
        Encabezado.add(LogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinépolis");
        Encabezado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

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

        getContentPane().add(panelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 40, 40));

        jButton1.setBackground(new java.awt.Color(54, 54, 54));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 140, 30));

        jButton2.setBackground(new java.awt.Color(54, 54, 54));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Anterior");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 140, 30));

        tablaCartelera.setBackground(new java.awt.Color(54, 54, 54));
        tablaCartelera.setForeground(new java.awt.Color(255, 255, 255));
        tablaCartelera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Clasificación", "Género", "Duración", "País", "Trailer", "Sinópsis"
            }
        ));
        tablaCartelera.setGridColor(new java.awt.Color(50, 50, 50));
        tablaCartelera.setRowHeight(81);
        jScrollPane1.setViewportView(tablaCartelera);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 760, 330));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));
        fondo.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 801, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromosActionPerformed
        // TODO add your handling code here:

        new FrmMenu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnPromosActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void panelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegresarMouseClicked
        new FrmMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelRegresarMouseClicked

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        // TODO add your handling code here:
        new FrmSucursal().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pagina += 3;
        LIMITE += 3;
        llenarTablaPeliculas(obtenerPagina(pagina, LIMITE));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (pagina -3 < 0)
        {
            JOptionPane.showMessageDialog(this, "No hay más páginas atrás");
        }
        else
        {
            pagina -= 3;
            LIMITE -= 3;
            llenarTablaPeliculas(obtenerPagina(pagina, LIMITE));
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel UbicacionIcon;
    private javax.swing.JLabel UsuarioIcon;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnPromos;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JPanel btn_close;
    private javax.swing.JLabel close_icon;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JTable tablaCartelera;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CMedidas;
import Modelo.CmFrenos;
import Modelo.CmHojaPruebas;
import Modelo.CmPruebas;
import Utilidades.CValidaciones;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class frmFrenos extends javax.swing.JFrame {

    CmFrenos frenos;

    private static int idPrueba;
    private static int idHojaPruebas;
    //private CmPruebas pruebas;
    public static boolean aplicFupa = false;

    /**
     * Creates new form frmFrenos
     */
    public frmFrenos() {
        initComponents();
        System.out.println("entro al amarillo de motos");
         aplicFupa = false;
        CValidaciones.validarCamposNumeros(pnlFrenos);
    }

    private void cargarDatos() {
        frenos.setPesoDelantero(Float.parseFloat(txtPesoDelantero.getText()));
        frenos.setPesoTrasero(Float.parseFloat(txtPesoTrasero.getText()));
        frenos.setFuerzaDelantera(Float.parseFloat(txtFuerzaDelantera.getText()));
        frenos.setFuerzaTrasera(Float.parseFloat(txtFuerzaTrasera.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLuces = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        fupas = new javax.swing.JCheckBox();
        pnlFrenos = new javax.swing.JPanel();
        txtFuerzaDelantera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPesoTrasero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFuerzaTrasera = new javax.swing.JTextField();
        txtPesoDelantero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblInclinacion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        fupas.setText("Escribir Fupas");
        fupas.setToolTipText("");
        fupas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fupasActionPerformed(evt);
            }
        });

        jLabel4.setText("Fuerza Delantera:");

        jLabel3.setText("Peso Trasero:");

        jLabel2.setText("Peso Delantero:");

        lblInclinacion.setText("Fuerza Trasera:");

        javax.swing.GroupLayout pnlFrenosLayout = new javax.swing.GroupLayout(pnlFrenos);
        pnlFrenos.setLayout(pnlFrenosLayout);
        pnlFrenosLayout.setHorizontalGroup(
            pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrenosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFrenosLayout.createSequentialGroup()
                        .addComponent(lblInclinacion)
                        .addGap(18, 18, 18)
                        .addComponent(txtFuerzaTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFrenosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesoDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFrenosLayout.createSequentialGroup()
                        .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesoTrasero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuerzaDelantera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlFrenosLayout.setVerticalGroup(
            pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrenosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesoDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPesoTrasero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFuerzaDelantera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInclinacion)
                    .addComponent(txtFuerzaTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/block.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pnlFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(fupas)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fupas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout pnlLucesLayout = new javax.swing.GroupLayout(pnlLuces);
        pnlLuces.setLayout(pnlLucesLayout);
        pnlLucesLayout.setHorizontalGroup(
            pnlLucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlLucesLayout.setVerticalGroup(
            pnlLucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLucesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 158, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FRENOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLuces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLuces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        idPrueba = frmMenuPrincipal.getIdPruebas();
        frenos = new CmFrenos();
        if (!CValidaciones.validarCampos(pnlFrenos)) {
            return;
        }
        cargarDatos();
        if (frenos.guardarDatos(idPrueba)) {
            this.setVisible(false);
            frmMenuPrincipal menuPrincipal = new frmMenuPrincipal();
            menuPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menuPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal();
        menuPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        idHojaPruebas = frmLogin.getIdHojaPruebas();
        CMedidas medias = new CMedidas();
        Map<Integer, Float> mapMedidas;
        mapMedidas = medias.buscarMedidas(idHojaPruebas, 5);
        txtPesoDelantero.setText(String.valueOf(mapMedidas.get(5000)));
        txtPesoTrasero.setText(String.valueOf(mapMedidas.get(5001)));
        txtFuerzaDelantera.setText(String.valueOf(mapMedidas.get(5008)));
        txtFuerzaTrasera.setText(String.valueOf(mapMedidas.get(5009)));
        txtPesoDelantero.setEditable(false);
        txtPesoTrasero.setEditable(false);
        txtFuerzaDelantera.setEditable(false);
        txtFuerzaTrasera.setEditable(false);
        txtPesoDelantero.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void fupasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fupasActionPerformed
        CMedidas medias = new CMedidas();
        Map<Integer, Float> mapMedidas;
        int i = JOptionPane.showOptionDialog(null, "Desea Aplicar Correccion a la Fupa de la Prueba", "Confirmacion de Cambio", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        if (i != JOptionPane.YES_OPTION) {
            aplicFupa = false;
            fupas.setSelected(false);
            mapMedidas = medias.buscarMedidas(idHojaPruebas, 5);
            txtPesoDelantero.setEditable(false);
            txtPesoTrasero.setEditable(false);
            txtFuerzaDelantera.setEditable(false);
            txtFuerzaTrasera.setEditable(false);
            txtPesoDelantero.setEditable(false);
            txtPesoDelantero.setText(String.valueOf(mapMedidas.get(5000)));
            txtPesoTrasero.setText(String.valueOf(mapMedidas.get(5001)));
            txtFuerzaDelantera.setText(String.valueOf(mapMedidas.get(5008)));
            txtFuerzaTrasera.setText(String.valueOf(mapMedidas.get(5009)));
        } else {
             aplicFupa = true;
            txtPesoDelantero.setEditable(true);
            txtPesoTrasero.setEditable(true);
            txtFuerzaDelantera.setEditable(true);
            txtFuerzaTrasera.setEditable(true);
            txtPesoDelantero.setEditable(true);
            fupas.setSelected(true);
        }
    }//GEN-LAST:event_fupasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox fupas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInclinacion;
    private javax.swing.JPanel pnlFrenos;
    private javax.swing.JPanel pnlLuces;
    private javax.swing.JTextField txtFuerzaDelantera;
    private javax.swing.JTextField txtFuerzaTrasera;
    private javax.swing.JTextField txtPesoDelantero;
    private javax.swing.JTextField txtPesoTrasero;
    // End of variables declaration//GEN-END:variables
}

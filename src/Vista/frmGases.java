/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CMedidas;
import Modelo.CmGases;
import Utilidades.CValidaciones;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class frmGases extends javax.swing.JFrame {

    private CmGases gases;
    private int modeloVehiculo;
    private int tiemposMotor;
    private int idHojaPrueba;
    private int idPrueba;
    public static boolean aplicFupa= false;

    /**
     * Creates new form frmGases
     */
    public frmGases() {
        initComponents();
         aplicFupa = false;
        CValidaciones.validarCamposNumeros(pnlGases);
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
        pnlGases = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHC = new javax.swing.JTextField();
        txtCO2 = new javax.swing.JTextField();
        txtCO = new javax.swing.JTextField();
        txtO2 = new javax.swing.JTextField();
        txtTemperaturaAmbiente = new javax.swing.JTextField();
        txtRPM = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtHumedadRelativa = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        chFupasMotos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 155, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GASES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("HC:");

        jLabel3.setText("CO:");

        jLabel4.setText("CO2:");

        jLabel5.setText("O2:");

        jLabel6.setText("RPM:");

        jLabel7.setText("Temperatura:");

        jLabel8.setText("Temperatura Ambiente:");

        jLabel9.setText("Humedad Relativa:");

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

        chFupasMotos.setText("Escribir Fupas");
        chFupasMotos.setToolTipText("");
        chFupasMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFupasMotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGasesLayout = new javax.swing.GroupLayout(pnlGases);
        pnlGases.setLayout(pnlGasesLayout);
        pnlGasesLayout.setHorizontalGroup(
            pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGasesLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGasesLayout.createSequentialGroup()
                        .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperaturaAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRPM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHumedadRelativa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chFupasMotos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlGasesLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        pnlGasesLayout.setVerticalGroup(
            pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGasesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chFupasMotos)
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTemperaturaAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtHumedadRelativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlGases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cargar datos de los campos de texto a las variables de la clase
    private void cargarDatos() {
        gases.setHc(Float.parseFloat(txtHC.getText()));
        gases.setCo(Float.parseFloat(txtCO.getText()));
        gases.setCo2(Float.parseFloat(txtCO2.getText()));
        gases.setO2(Float.parseFloat(txtO2.getText()));
        gases.setRpm(Float.parseFloat(txtRPM.getText()));
        gases.setTemperatura(Float.parseFloat(txtTemperatura.getText()));
        gases.setTemperaturaAmbiente(Float.parseFloat(txtTemperaturaAmbiente.getText()));
        gases.setHumedadRelativa(Float.parseFloat(txtHumedadRelativa.getText()));
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        gases = new CmGases();

        if (!CValidaciones.validarCampos(pnlGases)) {
            return;
        }
        cargarDatos();
        String tramaAuditoriaGases = "{\"tempRalenti\":\"".concat(txtTemperatura.getText()).concat("\",").concat("\"tempCrucero\":\"").concat("").concat("\",").concat("\"rpmRalenti\":\"").concat(txtRPM.getText()).concat("\",").concat("\"rpmCrucero\":\"").concat(" ").concat("\",").concat("\"CORalenti\":\"").concat(txtCO.getText()).concat("\",").concat("\"COCrucero\":\"").concat(" ").concat("\",").concat("\"CO2Ralenti\":\"").concat(txtCO2.getText()).concat("\",").concat("\"CO2Crucero\":\"").concat(" ").concat("\",").concat("\"O2Ralenti\":\"").concat(txtO2.getText()).concat("\",").concat("\"O2Crucero\":\"").concat(" ").concat("\",").concat("\"HCRalenti\":\"").concat(txtHC.getText()).concat("\",").concat("\"HCCrucero\":\"").concat(" ").concat("\",").concat("\"NORalenti\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"NOCrucero\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"tempDiesel\":\"").concat(String.valueOf("")).concat("\",").concat("\"rpmDiesel\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"ciclo1\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"ciclo2\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"ciclo3\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"ciclo4\":\"").concat(String.valueOf(" ")).concat("\",").concat("\"resultadoValor\":\"").concat(String.valueOf(" ")).concat("\",");
        tramaAuditoriaGases = tramaAuditoriaGases.concat("\"dilucion\":\"").concat("\",\"revisionVisual\":\"").concat("\",\"tablaAfectada\":\"medidas\",\"idRegistro\":\"").concat(String.valueOf(idPrueba)).concat("\"}");
        if (gases.guardarDatos(idPrueba, modeloVehiculo, tiemposMotor, tramaAuditoriaGases)) {
            this.setVisible(false);
            frmMenuPrincipal principal = new frmMenuPrincipal();
            principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            principal.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        frmMenuPrincipal principal = new frmMenuPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        idPrueba = frmMenuPrincipal.getIdPruebas();
        modeloVehiculo = frmLogin.getModeloVehiculo();
        tiemposMotor = frmLogin.getTiemposMotor();
        idHojaPrueba =frmLogin.getIdHojaPruebas();
        CMedidas medias = new CMedidas();
        
        txtHC.setEditable(false);
        txtCO.setEditable(false);
        txtCO2.setEditable(false);
        txtO2.setEditable(false);
        txtRPM.setEditable(false);
        txtTemperatura.setEditable(false);
        txtTemperaturaAmbiente.setEditable(false);
        txtHumedadRelativa.setEditable(false);
            Map<Integer, Float> mapMedidas = medias.buscarMedidas(idHojaPrueba, 8);
            if (tiemposMotor == 4) {
                txtHC.setText(String.valueOf(mapMedidas.get(8001)));
                txtCO.setText(String.valueOf(mapMedidas.get(8002)));
                txtCO2.setText(String.valueOf(mapMedidas.get(8003)));
                txtO2.setText(String.valueOf(mapMedidas.get(8004)));
                txtRPM.setText(String.valueOf(mapMedidas.get(8005)));
                txtTemperatura.setText(String.valueOf(mapMedidas.get(8006)));
            } else {
                txtHC.setText(String.valueOf(mapMedidas.get(8018)));
                txtCO.setText(String.valueOf(mapMedidas.get(8020)));
                txtCO2.setText(String.valueOf(mapMedidas.get(8019)));
                txtO2.setText(String.valueOf(mapMedidas.get(8021)));
                txtRPM.setText(String.valueOf(mapMedidas.get(8028)));
                txtTemperatura.setText(String.valueOf(mapMedidas.get(8022)));
            }
            Object validador = mapMedidas.get(8031);
            if (validador != null) {
                txtTemperaturaAmbiente.setText(String.valueOf(mapMedidas.get(8031)));
            } else {
                txtTemperaturaAmbiente.setText("0");
            }
            validador = mapMedidas.get(8032);
            if (validador != null) {
                txtHumedadRelativa.setText(String.valueOf(mapMedidas.get(8032)));
            } else {
                txtHumedadRelativa.setText("0");
            }        
    }//GEN-LAST:event_formWindowOpened

    private void chFupasMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFupasMotosActionPerformed
        int i = JOptionPane.showOptionDialog(null, "Desea Aplicar Correccion a la Fupa de la Prueba", "Confirmacion de Cambio", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        if (i != JOptionPane.YES_OPTION) {
            txtHC.setEditable(true);
        txtCO.setEditable(true);
        txtCO2.setEditable(true);
        txtO2.setEditable(true);
        txtRPM.setEditable(true);
            aplicFupa = false;
            CMedidas medias = new CMedidas();
            Map<Integer, Float> mapMedidas = medias.buscarMedidas(idHojaPrueba, 8);
            chFupasMotos.setSelected(false);
            if (tiemposMotor == 4) {
                txtHC.setText(String.valueOf(mapMedidas.get(8001)));
                txtCO.setText(String.valueOf(mapMedidas.get(8002)));
                txtCO2.setText(String.valueOf(mapMedidas.get(8003)));
                txtO2.setText(String.valueOf(mapMedidas.get(8004)));
                txtRPM.setText(String.valueOf(mapMedidas.get(8005)));
                txtTemperatura.setText(String.valueOf(mapMedidas.get(8006)));
            } else {
                txtHC.setText(String.valueOf(mapMedidas.get(8018)));
                txtCO.setText(String.valueOf(mapMedidas.get(8020)));
                txtCO2.setText(String.valueOf(mapMedidas.get(8019)));
                txtO2.setText(String.valueOf(mapMedidas.get(8021)));
                txtRPM.setText(String.valueOf(mapMedidas.get(8028)));
                txtTemperatura.setText(String.valueOf(mapMedidas.get(8022)));
            }
            Object validador = mapMedidas.get(8031);
            if (validador != null) {
                txtTemperaturaAmbiente.setText(String.valueOf(mapMedidas.get(8031)));
            } else {
                txtTemperaturaAmbiente.setText("0");
            }
            validador = mapMedidas.get(8032);
            if (validador != null) {
                txtHumedadRelativa.setText(String.valueOf(mapMedidas.get(8032)));
            } else {
                txtHumedadRelativa.setText("0");
            }            
            txtHC.setEditable(false);
            txtCO.setEditable(false);
            txtCO2.setEditable(false);
            txtO2.setEditable(false);
            txtRPM.setEditable(false);
            txtTemperatura.setEditable(false);
            txtTemperaturaAmbiente.setEditable(false);
            txtHumedadRelativa.setEditable(false);
        } else {
            chFupasMotos.setSelected(true);
            aplicFupa = true;
            txtHC.setEditable(true);
            txtCO.setEditable(true);
            txtCO2.setEditable(true);
            txtO2.setEditable(true);
            txtRPM.setEditable(true);
            txtTemperatura.setEditable(true);
            txtTemperaturaAmbiente.setEditable(true);
            txtHumedadRelativa.setEditable(true);
        }
    }//GEN-LAST:event_chFupasMotosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chFupasMotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlGases;
    private javax.swing.JTextField txtCO;
    private javax.swing.JTextField txtCO2;
    private javax.swing.JTextField txtHC;
    private javax.swing.JTextField txtHumedadRelativa;
    private javax.swing.JTextField txtO2;
    private javax.swing.JTextField txtRPM;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtTemperaturaAmbiente;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CMedidas;
import Modelo.CmLuces;
import Utilidades.CValidaciones;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.transform.sax.SAXSource;

/**
 *
 * @author
 */
public class frmLuces extends javax.swing.JFrame {

    private CmLuces luces;
    private int cantidadLuces;
    private static int idPrueba;
    private static int idHojaPruebas;
    public static boolean aplicFupa = false;

    /**
     * Creates new form frmLuces
     */
    public frmLuces() {
        initComponents();
        CValidaciones.validarCamposNumeros(pnlLuces);
        aplicFupa = false;
        
    }

    private void esconderSegundaLuz() {
        lblInclinacion.setVisible(false);
        lblIntensidadBaja.setVisible(false);
        txtInclinacionLuzSe.setVisible(false);
        txtIntensidadLuzBajaSe.setVisible(false);
    }
    
    
     private void esconderTerceraLuz() {
        lblInclinacionTer.setVisible(false);
        lblIntensidadBajaTer.setVisible(false);
        txtInclinacionLuzBajaTer.setVisible(false);
        txtIntensidadLuzBajaTer.setVisible(false);
    }

    private void cargarDatos() {
         if (cantidadLuces == 1) {
            luces.setInclinacionLuz(Float.parseFloat(txtInclinacionLuz.getText()));
            luces.setIntensidadLuzBaja(Float.parseFloat(txtIntensidadLuzBaja.getText()));
        }
        if (cantidadLuces == 2) {
            luces.setInclinacionLuz(Float.parseFloat(txtInclinacionLuz.getText()));
            luces.setIntensidadLuzBaja(Float.parseFloat(txtIntensidadLuzBaja.getText()));
            luces.setInclinacionLuzSecundaria(Float.parseFloat(txtInclinacionLuzSe.getText()));
            luces.setIntensidadLuzBajaSe(Float.parseFloat(txtIntensidadLuzBajaSe.getText()));
        }
         if (cantidadLuces == 3) {
            luces.setInclinacionLuz(Float.parseFloat(txtInclinacionLuz.getText()));
            luces.setIntensidadLuzBaja(Float.parseFloat(txtIntensidadLuzBaja.getText()));
            luces.setInclinacionLuzSecundaria(Float.parseFloat(txtInclinacionLuzSe.getText()));
            luces.setIntensidadLuzBajaSe(Float.parseFloat(txtIntensidadLuzBajaSe.getText()));
            luces.setInclinacionLuzTer(Float.parseFloat(txtInclinacionLuzBajaTer.getText()));
            luces.setIntensidadLuzBajaTer(Float.valueOf(txtIntensidadLuzBajaTer.getText()));
            
        }
    }
    
    
    private int ValidarLuces(){
            CMedidas medias = new CMedidas();
            Map<Integer, Float> mapMedidas;
            int luces =1;
            mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
            if(mapMedidas.get(2013) != null)
            {
                luces=1;
                
            }
            if(mapMedidas.get(2002) != null)
            {
                luces=2;
            }
            if(mapMedidas.get(2022) != null)
            {
                luces=3;
            }
            System.out.println("cantidad de luces encontradas: "+ luces);
        
        return luces;
    }
    
    private void GuardarAltas(Map<Integer, Float> mapMedidas ){
        if(mapMedidas.get(2056) != null )
            {
             luces.setIntensidadLuzAlta(Float.valueOf(mapMedidas.get(2056)));
             System.out.println("valor recibido de la medida 2056:" + luces.getIntensidadLuzAlta());
            }
        if(mapMedidas.get(2057) != null)
            {
            luces.setIntensidadLuzAltaSe(Float.valueOf(mapMedidas.get(2057)));
            System.out.println("valor recibido de la medida 2057:" + luces.getIntensidadLuzAlta());
            }
        if(mapMedidas.get(2061) != null)
            {   
                System.out.println("valor recibido de la medida 2061:" + luces.getIntensidadLuzAlta());
            luces.setIntensidadLuzAltaTer(Float.valueOf(mapMedidas.get(2061)));
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

        dlgLuces = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbCantidadLuces = new javax.swing.JComboBox();
        btnAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlLuces = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        fupas = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtInclinacionLuz = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIntensidadLuzBaja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblInclinacion = new javax.swing.JLabel();
        txtInclinacionLuzSe = new javax.swing.JTextField();
        lblIntensidadBaja = new javax.swing.JLabel();
        txtIntensidadLuzBajaSe = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblInclinacionTer = new javax.swing.JLabel();
        lblIntensidadBajaTer = new javax.swing.JLabel();
        txtInclinacionLuzBajaTer = new javax.swing.JTextField();
        txtIntensidadLuzBajaTer = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dlgLuces.setAlwaysOnTop(true);
        dlgLuces.setMinimumSize(new java.awt.Dimension(265, 260));

        jPanel2.setBackground(new java.awt.Color(0, 158, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LUCES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setText("Cantidad de Luces");

        cmbCantidadLuces.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cmbCantidadLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantidadLucesActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgLucesLayout = new javax.swing.GroupLayout(dlgLuces.getContentPane());
        dlgLuces.getContentPane().setLayout(dlgLucesLayout);
        dlgLucesLayout.setHorizontalGroup(
            dlgLucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgLucesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(dlgLucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCantidadLuces, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        dlgLucesLayout.setVerticalGroup(
            dlgLucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLucesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cmbCantidadLuces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 158, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LUCES");

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

        pnlLuces.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fupas.setText("Escribir Fupas");
        fupas.setToolTipText("");
        fupas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fupasActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(fupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, -1, -1));

        jLabel2.setText("Inclinacion Luz:");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 40, -1, -1));
        jInternalFrame1.getContentPane().add(txtInclinacionLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 37, 150, -1));

        jLabel4.setText("Intensidad Luz Baja:");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 78, -1, -1));
        jInternalFrame1.getContentPane().add(txtIntensidadLuzBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 75, 150, -1));
        jInternalFrame1.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 380, 10));

        lblInclinacion.setText("Inclinacion segunda luz:");
        jInternalFrame1.getContentPane().add(lblInclinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 132, -1, -1));
        jInternalFrame1.getContentPane().add(txtInclinacionLuzSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 129, 150, -1));

        lblIntensidadBaja.setText("Intensidad segunda luz baja: ");
        jInternalFrame1.getContentPane().add(lblIntensidadBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jInternalFrame1.getContentPane().add(txtIntensidadLuzBajaSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 167, 150, -1));
        jInternalFrame1.getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 205, 400, 10));

        lblInclinacionTer.setText("Inclinacion tercera luz:");
        jInternalFrame1.getContentPane().add(lblInclinacionTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 224, -1, -1));

        lblIntensidadBajaTer.setText("Intensidad tercera luz baja: ");
        jInternalFrame1.getContentPane().add(lblIntensidadBajaTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 262, -1, -1));
        jInternalFrame1.getContentPane().add(txtInclinacionLuzBajaTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 221, 150, -1));
        jInternalFrame1.getContentPane().add(txtIntensidadLuzBajaTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 259, 150, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/block.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 335, 120, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 335, 120, -1));

        pnlLuces.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLuces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLuces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            luces = new CmLuces();
            CMedidas medias = new CMedidas();
            Map<Integer, Float> mapMedidas;
            mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
            if (!CValidaciones.validarCampos(pnlLuces)) 
            {
                return;
            }
            System.out.println("voy a guardar luces altas ");
            GuardarAltas(mapMedidas);
            cargarDatos();
            if (luces.guardarDatos(idPrueba, cantidadLuces))  
            {
                this.setVisible(false);
                frmMenuPrincipal menuPrincipal = new frmMenuPrincipal();
                menuPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                menuPrincipal.setVisible(true);
            }        
           // this.setVisible(false);
            //frmMenuPrincipal menuPrincipal = new frmMenuPrincipal();
            //menuPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            //menuPrincipal.setVisible(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal();
        menuPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        idPrueba = frmMenuPrincipal.getIdPruebas();
        idHojaPruebas = frmLogin.getIdHojaPruebas();
        cantidadLuces = ValidarLuces();
       // cantidadLuces = Integer.parseInt(cmbCantidadLuces.getSelectedItem().toString());
        luces = new CmLuces();
        dlgLuces.setVisible(false);
        CMedidas medias = new CMedidas();
        Map<Integer, Float> mapMedidas;
        mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
        //Validacion de cantidad de luces para saber si se esconde o no los campos del
        //segundo foco de luz.
        switch (cantidadLuces) {
            case 1:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuz.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                esconderSegundaLuz();
                esconderTerceraLuz();
                break;
            case 2:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                txtInclinacionLuz.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                esconderTerceraLuz();
                break;
            case 3:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                txtInclinacionLuzBajaTer.setText(String.valueOf(mapMedidas.get(2022)));
                txtIntensidadLuzBajaTer.setText(String.valueOf(mapMedidas.get(2000)));
                txtInclinacionLuzBajaTer.setEditable(false);
                txtIntensidadLuzBajaTer.setEditable(false);
                txtInclinacionLuz.setEditable(false);
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                break;
            default:
                break;
        }
      //  dlgLuces.setLocationRelativeTo(null);
       // dlgLuces.setVisible(true);
        txtInclinacionLuz.setEditable(false);
        txtIntensidadLuzBaja.setEditable(false);
        
    }//GEN-LAST:event_formWindowOpened

    
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        cantidadLuces = Integer.parseInt(cmbCantidadLuces.getSelectedItem().toString());
        luces = new CmLuces();
        dlgLuces.setVisible(false);
        CMedidas medias = new CMedidas();
        Map<Integer, Float> mapMedidas;
        mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
        //Validacion de cantidad de luces para saber si se esconde o no los campos del
        //segundo foco de luz.
        switch (cantidadLuces) {
            case 1:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuz.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                esconderSegundaLuz();
                esconderTerceraLuz();
                break;
            case 2:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                txtInclinacionLuz.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                esconderTerceraLuz();
                break;
            case 3:
                txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
                txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
                txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                txtInclinacionLuzBajaTer.setText(String.valueOf(mapMedidas.get(2022)));
                txtIntensidadLuzBajaTer.setText(String.valueOf(mapMedidas.get(2000)));
                txtInclinacionLuzBajaTer.setEditable(false);
                txtIntensidadLuzBajaTer.setEditable(false);
                txtInclinacionLuz.setEditable(false);
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                txtIntensidadLuzBaja.setEditable(false);
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void fupasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fupasActionPerformed
        CMedidas medias = new CMedidas();
        Map<Integer, Float> mapMedidas;
        int i = JOptionPane.showOptionDialog(null, "Desea Aplicar Correccion a la Fupa de la Prueba", "Confirmacion de Cambio", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        if (i != JOptionPane.YES_OPTION) 
        {
            aplicFupa = false;
            fupas.setSelected(false);
            mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
            txtInclinacionLuz.setText(String.valueOf(mapMedidas.get(2013)));
            txtIntensidadLuzBaja.setText(String.valueOf(mapMedidas.get(2014)));
            txtInclinacionLuz.setEditable(false);
            txtIntensidadLuzBaja.setEditable(false);
            if (cantidadLuces == 2  ) 
            {
                txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);                
            }
            if(cantidadLuces == 3)
            {
                    txtInclinacionLuzSe.setText(String.valueOf(mapMedidas.get(2002)));
                    txtIntensidadLuzBajaSe.setText(String.valueOf(mapMedidas.get(2015)));
                    txtInclinacionLuzBajaTer.setText(String.valueOf(mapMedidas.get(2022)));
                    txtIntensidadLuzBajaTer.setText(String.valueOf(mapMedidas.get(2000)));
                    txtInclinacionLuzBajaTer.setEditable(false);
                    txtIntensidadLuzBajaTer.setEditable(false);
                    txtInclinacionLuzSe.setEditable(false);
                    txtIntensidadLuzBajaSe.setEditable(false);
            }
        } else {
            aplicFupa = true;
            mapMedidas = medias.buscarMedidas(idHojaPruebas, 2);
            txtInclinacionLuz.setEditable(true);
            txtIntensidadLuzBaja.setEditable(true);
            if (cantidadLuces == 2) 
            {
                if(mapMedidas.get(2002) == null)
                {
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                }else
                {
                txtInclinacionLuzSe.setEditable(true);
                txtIntensidadLuzBajaSe.setEditable(true);
                }          
            }
            if (cantidadLuces == 3) 
            {
                if(mapMedidas.get(2002) == null)
                {
                txtInclinacionLuzSe.setEditable(false);
                txtIntensidadLuzBajaSe.setEditable(false);
                }else{
                txtInclinacionLuzSe.setEditable(true);
                txtIntensidadLuzBajaSe.setEditable(true);
                }
                if(mapMedidas.get(2022) == null)
                {
                txtInclinacionLuzBajaTer.setEditable(false);
                txtIntensidadLuzBajaTer.setEditable(false);
                }else{
                 txtInclinacionLuzBajaTer.setEditable(true);
                txtIntensidadLuzBajaTer.setEditable(true);
                }
            }
            fupas.setSelected(true);
        }
    }//GEN-LAST:event_fupasActionPerformed

    private void cmbCantidadLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantidadLucesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCantidadLucesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbCantidadLuces;
    private javax.swing.JDialog dlgLuces;
    private javax.swing.JCheckBox fupas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInclinacion;
    private javax.swing.JLabel lblInclinacionTer;
    private javax.swing.JLabel lblIntensidadBaja;
    private javax.swing.JLabel lblIntensidadBajaTer;
    private javax.swing.JPanel pnlLuces;
    private javax.swing.JTextField txtInclinacionLuz;
    private javax.swing.JTextField txtInclinacionLuzBajaTer;
    private javax.swing.JTextField txtInclinacionLuzSe;
    private javax.swing.JTextField txtIntensidadLuzBaja;
    private javax.swing.JTextField txtIntensidadLuzBajaSe;
    private javax.swing.JTextField txtIntensidadLuzBajaTer;
    // End of variables declaration//GEN-END:variables
}

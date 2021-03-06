/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipisa.proyectofinal.frontend;

import ipisa.proyectofinal.clases.Conexion;
import ipisa.proyectofinal.clases.Usuario;
import ipisa.proyectofinal.combo.Acceso;
import ipisa.proyectofinal.models.Fusuario;
import ipisa.proyectofinal.utilidades.IObserver;
import ipisa.proyectofinal.utilidades.ISubject;
import static ipisa.proyectofinal.utilidades.ISubject.observers;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Martinez
 */
public class AgreUsuarios extends javax.swing.JDialog implements ISubject{
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    /**
     * Creates new form AgreUsuarios
     */
    public AgreUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComboGenero();
    }
    
     private void initComboGenero() {

        DefaultComboBoxModel<String> dmodel = new DefaultComboBoxModel<>();

        for (Acceso c : Acceso.values()) {
            dmodel.addElement(c.name());
        }

        this.cbxSeccion.setModel(dmodel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        cbxSeccion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdemplead = new javax.swing.JTextField();
        Botones = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Titulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Registrar Usuario");
        Titulo.add(jLabel1);

        Datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Datos.setEnabled(false);

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        cbxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Acceso");

        jLabel5.setText("ID Empleado");

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(cbxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(10, 10, 10)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPass)
                    .addComponent(txtIdemplead, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(cbxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdemplead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        Botones.setLayout(new java.awt.GridLayout(1, 0));

        Agregar.setText("Registrar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        Botones.add(Agregar);

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Botones.add(Cancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if (this.txtUser.getText().isEmpty() || this.txtPass.getText().isEmpty()) {
            
             JOptionPane.showMessageDialog(this, "Campos en Blanco", "Mensaje", JOptionPane.ERROR_MESSAGE);
           
        }else{
            Usuario op = new Usuario();
            String sql = "SELECT * FROM usuarios WHERE usuario = ?";
            try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, this.txtUser.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "Ya el usuario existe");
        }else{
            op.setUsuario(this.txtUser.getText());
            op.setPassword(this.txtPass.getText());
            op.setEstado(this.cbxSeccion.getSelectedItem().toString());
            op.setIdEmpleado(Integer.parseInt(this.txtIdemplead.getText()));
            
            Fusuario fu = new Fusuario();
            
            if (fu.insertUsu(op)!=0) {
                JOptionPane.showMessageDialog(this, "Usuario ingresado Correctamente");
                notify(getClass(), op , "prueba");
                dispose();
                 
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al ingresar usuarios", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            
        }
            }catch(HeadlessException | NumberFormatException | SQLException e){
            
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JPanel Botones;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel Titulo;
    private javax.swing.JComboBox<String> cbxSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtIdemplead;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

       @Override
    public void addObserver(IObserver observador) {
        observers.add(observador);
    }

    @Override
    public void removeObserver(IObserver observador) {
         observers.remove(observador);
    }

    @Override
    public void notify(Class clase, Object argumento, String mensaje) {
    
         for (IObserver observer : observers) {
            observer.update(clase, argumento, mensaje);
        }
    }

}

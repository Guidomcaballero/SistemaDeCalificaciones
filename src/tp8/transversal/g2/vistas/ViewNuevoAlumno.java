/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.transversal.g2.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import tp8.transversal.g2.clases.Alumno;
import tp8.transversal.g2.data.AlumnoData;


/**
 *
 * @author Guido Caballero
 */
public class ViewNuevoAlumno extends javax.swing.JInternalFrame {
    private AlumnoData ad;
    private boolean ok;
    private int id;

    /**
     * Creates new form ViewNuevoAlumno
     */
    public ViewNuevoAlumno(AlumnoData ad) {
        initComponents();
        this.ad=ad;


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
        jtLegajo = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JCheckBox();

        setClosable(true);

        jtLegajo.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jtApellido.setEditable(false);
        jtApellido.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jtNombre.setEditable(false);
        jtNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jtFecha.setEditable(false);
        jtFecha.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("Número de legajo");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Apellido/s");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel3.setText("Nombre/s");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel4.setText("Fecha de nacimiento");

        jbGuardar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("* seleccione fecha");

        jLabel6.setText("* Busque para ver disponibilidad");

        cbEstado.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        cbEstado.setText(" Activado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(cbEstado))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cbEstado)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtFecha)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    int legajo=0;
    ok=false;
    try{
        legajo=Integer.parseInt(jtLegajo.getText());
    }
    catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Volver a cargar, en campo legajo ingresar solo numeros");
    }
    if(legajo==0)
        JOptionPane.showMessageDialog(this,"Volver a cargar, en campo legajo ingresar solo numeros");
    else {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        Iterator it=ad.obtenerAlumnos().iterator();
        while(it.hasNext()){
            Alumno a1=(Alumno)it.next();
            if(legajo==a1.getLegajo()){
                id = a1.getId_alumno();
                jtApellido.setText(a1.getApellido());
                jtNombre.setText(a1.getNombre());
                jtFecha.setText(a1.getFechaNac().format(formatter));
                jDateChooser1.setDate(java.sql.Date.valueOf(a1.getFechaNac()));
                if(a1.isActivo()){
                        cbEstado.setSelected(true);}
                else { 
                cbEstado.setSelected(false);
                }
                jtApellido.setEditable(true);
                jtNombre.setEditable(true);
                cbEstado.setEnabled(true);
                jbGuardar.setEnabled(true);
                ok=true;
            }
        }
            if(ok==false){
                this.jbLimpiarActionPerformed(evt);
                jtApellido.setEditable(true);
                jtNombre.setEditable(true);
                jtLegajo.setText(String.valueOf(legajo));
                cbEstado.setEnabled(true);
                JOptionPane.showMessageDialog(this,legajo+" ,está disponible para usar");
                jbGuardar.setEnabled(true);
            }//else
               // jbGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtLegajo.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtFecha.setText("");
        jbGuardar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int legajo=0;
        try{
            legajo=Integer.parseInt(jtLegajo.getText());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Volver a cargar, en campo legajo ingresar solo numeros");
        }
        String apellido=jtApellido.getText();
        String nombre=jtNombre.getText();
        Date fecha=jDateChooser1.getDate();
        if(fecha==null||legajo==0||apellido==null||nombre==null)
            JOptionPane.showMessageDialog(this,"Rellene todos los campos, apellido, nombre, legajo y fecha");
        else{
            LocalDate fe=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            System.out.println(fe);
            //Alumno a1=new Alumno(nombre,apellido,fe,legajo,cbEstado.isSelected());
            if (ok== false) {
                Alumno a1=new Alumno(nombre,apellido,fe,legajo,cbEstado.isSelected());
                ad.ingresarAlumno(a1);}
                else {
                Alumno a1=new Alumno(id,nombre,apellido,fe,legajo,cbEstado.isSelected());
                ad.actualizarAlumno(a1);
                        }
            jbGuardar.setEnabled(false);this.jbLimpiarActionPerformed(evt);
        }
        this.jbLimpiarActionPerformed(evt);
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbEstado;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
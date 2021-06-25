/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.transversal.g2.vistas;

import javax.swing.JOptionPane;
import tp8.transversal.g2.clases.Conexion;
import tp8.transversal.g2.data.AlumnoData;
import tp8.transversal.g2.data.CursadaData;
import tp8.transversal.g2.data.MateriaData;

/**
 *
 * @author Guido Caballero
 */
public class ViewEscritorio extends javax.swing.JFrame {
private AlumnoData ad;
private MateriaData md;
private CursadaData cd;
private Conexion con;
    /**
     * Creates new form ViewEscritorio
     */
    public ViewEscritorio() {
        initComponents();
        this.con=null;
        try {
            con = new Conexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"error de driver");
        }
        this.ad=new AlumnoData(con);
        this.md=new MateriaData(con);
        this.cd=new CursadaData(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumnos = new javax.swing.JMenu();
        jbNuevoAlumno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jbVerAlumno = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        jbNuevaMateria = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jbVerMaterias = new javax.swing.JMenuItem();
        jmSistema = new javax.swing.JMenu();
        jbInscribir = new javax.swing.JMenuItem();
        jbVerInscriptos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jbVerNotas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        jmAlumnos.setText("Alumnos");

        jbNuevoAlumno.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbNuevoAlumno.setText("Nuevo/Modificar");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });
        jmAlumnos.add(jbNuevoAlumno);
        jmAlumnos.add(jSeparator1);

        jbVerAlumno.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbVerAlumno.setText("Ver Alumnos");
        jbVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerAlumnoActionPerformed(evt);
            }
        });
        jmAlumnos.add(jbVerAlumno);

        jMenuBar1.add(jmAlumnos);

        jmMaterias.setText("Materias");

        jbNuevaMateria.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbNuevaMateria.setText("Nueva/Modificar");
        jbNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMateriaActionPerformed(evt);
            }
        });
        jmMaterias.add(jbNuevaMateria);
        jmMaterias.add(jSeparator2);

        jbVerMaterias.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbVerMaterias.setText("Ver Materias");
        jbVerMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerMateriasActionPerformed(evt);
            }
        });
        jmMaterias.add(jbVerMaterias);

        jMenuBar1.add(jmMaterias);

        jmSistema.setText("Sistema");

        jbInscribir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        jmSistema.add(jbInscribir);

        jbVerInscriptos.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbVerInscriptos.setText("Ver Inscriptos/borrar");
        jbVerInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerInscriptosActionPerformed(evt);
            }
        });
        jmSistema.add(jbVerInscriptos);
        jmSistema.add(jSeparator3);

        jbVerNotas.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbVerNotas.setText("Ver Notas");
        jbVerNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerNotasActionPerformed(evt);
            }
        });
        jmSistema.add(jbVerNotas);

        jMenuBar1.add(jmSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewNuevoAlumno view = new ViewNuevoAlumno(ad);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    private void jbNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMateriaActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewNuevaMateria view = new ViewNuevaMateria(md);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbNuevaMateriaActionPerformed

    private void jbVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerAlumnoActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewVerAlumnos view = new ViewVerAlumnos(ad);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbVerAlumnoActionPerformed

    private void jbVerMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerMateriasActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewVerMaterias view = new ViewVerMaterias(md);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbVerMateriasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewInscripcion view = new ViewInscripcion(ad,md,cd);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbVerInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerInscriptosActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewVerInscriptos view = new ViewVerInscriptos(cd,md);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbVerInscriptosActionPerformed

    private void jbVerNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerNotasActionPerformed
        jpEscritorio.removeAll();
        jpEscritorio.repaint();
        ViewVerNotas view = new ViewVerNotas(ad, cd);
        jpEscritorio.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jbVerNotasActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem jbInscribir;
    private javax.swing.JMenuItem jbNuevaMateria;
    private javax.swing.JMenuItem jbNuevoAlumno;
    private javax.swing.JMenuItem jbVerAlumno;
    private javax.swing.JMenuItem jbVerInscriptos;
    private javax.swing.JMenuItem jbVerMaterias;
    private javax.swing.JMenuItem jbVerNotas;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JDesktopPane jpEscritorio;
    // End of variables declaration//GEN-END:variables
}

package personalizacion_grafica;

import ficheros.Escritura;
import ficheros.Lectura;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import proyectoprogramacion.Juegos;
import proyectoprogramacion.Proyecto;

/**
 *
 * @author estudios
 */
public class Administrar extends javax.swing.JFrame {

    Juegos j1 = new Juegos();
    Escritura ObxetoEscritura = new Escritura();
    Proyecto ObxetoProxecto = new Proyecto();
    Sesion ObxetoSesion = new Sesion();

    /**
     * Creates new form Administrar
     */
    public Administrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BNuevoJuego = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        BMostrarJuego = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        BVolverInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BNuevoJuego.setText("Nuevo Juego");
        BNuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoJuegoActionPerformed(evt);
            }
        });

        AreaTexto.setColumns(20);
        AreaTexto.setRows(5);
        AreaTexto.setSelectedTextColor(new java.awt.Color(204, 0, 0));
        AreaTexto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                AreaTextoInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(AreaTexto);

        BMostrarJuego.setText("Mostrar Juegos");
        BMostrarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarJuegoActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        BVolverInicio.setText("Volver al Inicio");
        BVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BNuevoJuego)
                .addGap(18, 18, 18)
                .addComponent(BMostrarJuego)
                .addGap(18, 18, 18)
                .addComponent(BModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(BVolverInicio)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNuevoJuego)
                    .addComponent(BMostrarJuego)
                    .addComponent(BModificar)
                    .addComponent(BVolverInicio))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoJuegoActionPerformed
        //  ArrayList<Juegos> juegosAnhadidos= new ArrayList();
        Map<Integer, Juegos> mapaJuegos = new TreeMap<>();
        nuevoJuego(mapaJuegos);
    }//GEN-LAST:event_BNuevoJuegoActionPerformed

    private void AreaTextoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AreaTextoInputMethodTextChanged

    }//GEN-LAST:event_AreaTextoInputMethodTextChanged

    private void BMostrarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarJuegoActionPerformed
        mostrarJuegos();
    }//GEN-LAST:event_BMostrarJuegoActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        modificarTxt();
    }//GEN-LAST:event_BModificarActionPerformed

    private void BVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverInicioActionPerformed
        inicio();
    }//GEN-LAST:event_BVolverInicioActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Administrar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BMostrarJuego;
    private javax.swing.JButton BNuevoJuego;
    private javax.swing.JButton BVolverInicio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void nuevoJuego(Map mapaJuegos) {

        j1 = j1.nuevoJuego();
        ObxetoEscritura.escribir(new File("juegos.txt"), j1.getCodigo(), j1, mapaJuegos);
        ObxetoEscritura.escribeCodigo(new File("codigos.txt"), j1.getCodigo());
    }

    private void mostrarJuegos() {
        Lectura ObxetoLectura = new Lectura();
        String fichero = ObxetoLectura.leerCompleto(new File("juegos.txt"));
        this.AreaTexto.setText(fichero);
    }

    private void modificarTxt() {
        String[] completo = this.AreaTexto.getText().split("\n");
        for (int i = 0; i < completo.length; i++) {
            JOptionPane.showMessageDialog(null, completo[i]);
        }

    }

    private void inicio() {
        this.setVisible(false);
        this.ObxetoSesion.setVisible(true);
    }
}

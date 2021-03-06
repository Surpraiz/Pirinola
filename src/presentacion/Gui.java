/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.JuegoPirinolaImplementacion;
import logica.Jugador;

/**
 *
 * @author Lewis De la hoz
 */
public class Gui extends javax.swing.JFrame {

    JuegoPirinolaImplementacion Juego;
    int turno = 0;

    /**
     * Creates new form GUI
     */
    public Gui() {
        initComponents();
        Juego = new JuegoPirinolaImplementacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirarPirinola = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        ListJugadores = new javax.swing.JLabel();
        Apuesta = new javax.swing.JLabel();
        AreaJugadores = new javax.swing.JScrollPane();
        JugadorList = new javax.swing.JTextArea();
        AreaHistorial = new javax.swing.JScrollPane();
        CaraArriba = new javax.swing.JTextArea();
        AreaMensaje = new javax.swing.JScrollPane();
        MensajesPublicos = new javax.swing.JTextArea();
        Alerta = new javax.swing.JLabel();
        Historial = new javax.swing.JLabel();
        RemitenteTex = new javax.swing.JTextField();
        DestinatarioTex = new javax.swing.JTextField();
        Remitente = new javax.swing.JLabel();
        Destinatario = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        VerMensaje = new javax.swing.JButton();
        MensajeTex = new javax.swing.JTextField();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GirarPirinola.setText("Girar Pirinola");
        GirarPirinola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarPirinolaActionPerformed(evt);
            }
        });

        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        Titulo.setText("JUEGO PIRINOLA");

        ListJugadores.setText("Jugadores");

        Apuesta.setText("Apuesta: 0");

        JugadorList.setColumns(20);
        JugadorList.setRows(5);
        AreaJugadores.setViewportView(JugadorList);

        CaraArriba.setColumns(20);
        CaraArriba.setRows(5);
        AreaHistorial.setViewportView(CaraArriba);

        MensajesPublicos.setColumns(20);
        MensajesPublicos.setRows(5);
        AreaMensaje.setViewportView(MensajesPublicos);

        Historial.setText("Historial");

        RemitenteTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemitenteTexActionPerformed(evt);
            }
        });

        Remitente.setText("Remitente");

        Destinatario.setText("Destinatario");

        Enviar.setText("Enviar Mensaje");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        VerMensaje.setText("Ver Mensaje");
        VerMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMensajeActionPerformed(evt);
            }
        });

        MensajeTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensajeTexActionPerformed(evt);
            }
        });

        Mensaje.setText("          Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AreaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ListJugadores))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Historial)
                                    .addComponent(AreaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(GirarPirinola, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                    .addComponent(MensajeTex, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AreaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VerMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DestinatarioTex, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Destinatario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RemitenteTex, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Remitente))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Apuesta)
                                .addGap(31, 31, 31)
                                .addComponent(Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(Titulo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListJugadores)
                    .addComponent(Historial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GirarPirinola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MensajeTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE))
                    .addComponent(AreaJugadores)
                    .addComponent(AreaHistorial))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemitenteTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Remitente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DestinatarioTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Enviar)
                            .addComponent(VerMensaje))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        String nombre = NombreUsuario.getText();
        if (Juego.cerrarSesion(nombre)) {
            Alerta.setText("Se cerro la sesion del usuario: " + nombre);
            JugadorList.setText("");
            if (Juego.getJugadores().size() == 1) {
                Alerta.setText("Ganaste");
                nombre = Juego.getJugadores().get(0).getNombre();
                Juego.setApuestaManual(Juego.getapuestas(), nombre);
                Apuesta.setText("Apuesta: " + Juego.getapuestas());
            }
            for (int i = 0; i < Juego.getJugadores().size(); i++) {
                Jugador jugador = Juego.getJugadores().get(i);
                JugadorList.append(Juego.getJugadores().get(i).getDatos() + "\n");

            }
        }


    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void GirarPirinolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarPirinolaActionPerformed
        String nombre = NombreUsuario.getText();
        boolean indicadordegiro = false;
        if (Juego.getapuestas() > 0 && Juego.getJugadores().size() > 1) {
            Juego.setJugadorTurno(turno);
            if (Juego.getJugadorTurno(nombre)) {
                Juego.girarPirinola(nombre);
                Juego.setApuesta();
                Apuesta.setText("Apuesta: " + Juego.getapuestas());
                turno++;
                CaraArriba.append(Juego.CaraArriba() + "\n");
            }
            if (turno == Juego.getJugadores().size()) {
                turno = 0;
            }
            for (int i = 0; i < Juego.getJugadores().size(); i++) {
                if (Juego.getJugadores().get(i).getMonedas() < 0) {
                    Juego.cerrarSesion(Juego.getJugadores().get(i).getNombre());
                    i--;
                }
            }

            JugadorList.setText("");
            for (int i = 0; i < Juego.getJugadores().size(); i++) {
                JugadorList.append(Juego.getJugadores().get(i).getDatos() + "\n");
            }
            if (Juego.getapuestas() == 0) {
                Alerta.setText("Ganaste");
            }
            if (Juego.getJugadores().size() == 1) {
                indicadordegiro = true;
                Alerta.setText("Ganaste");
                nombre = Juego.getJugadores().get(0).getNombre();
                Juego.setApuestaManual(Juego.getapuestas(), nombre);
                Apuesta.setText("Apuesta: " + Juego.getapuestas());
            }

        }

        if (Juego.getJugadores().size() < 2 && !indicadordegiro) {
            Alerta.setText("Faltan jugadores para girar la pirinola");
        }

    }//GEN-LAST:event_GirarPirinolaActionPerformed


    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        String nombre = NombreUsuario.getText();
        if (Juego.iniciarSesion(nombre, 10) == true) {
            Alerta.setText("Ya el Jugador se encuentra inscrito");
        } else {
            Alerta.setText("Ha iniciado sesion el usuario: " + nombre);
            Apuesta.setText("Apuesta: " + Juego.getapuestas());
            JugadorList.append(Juego.getJugadores().get(Juego.getJugadores().size() - 1).getDatos() + "\n");
        }
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void RemitenteTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemitenteTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemitenteTexActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        String Remitente = RemitenteTex.getText();
        String Destinatario = DestinatarioTex.getText();
        String Mensaje = MensajeTex.getText();
        if (DestinatarioTex.getText().equals("")) {
            Juego.enviarMensajes(Remitente, Mensaje);
            MensajesPublicos.setText("");
            for (int i = 0; i < Juego.getMensajes().size(); i++) {
                String MensajesList = Juego.getMensajes().get(i);
                MensajesPublicos.append(MensajesList + "\n");
            }
        } else {
            Juego.enviarMensajes(Remitente, Destinatario, Mensaje);
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void VerMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMensajeActionPerformed
        String Destinatario = NombreUsuario.getText();
        for (int i = 0; i < Juego.getJugadores().size(); i++) {
            Jugador jugador = Juego.getJugadores().get(i);
            if (jugador.getNombre().equals(Destinatario)) {
                for (int j = 0; j < jugador.getMensaje().size(); j++) {
                    String MensajesList = jugador.getMensaje().get(j);
                    MensajesPublicos.append(MensajesList + "\n");
                }
            }

        }

    }//GEN-LAST:event_VerMensajeActionPerformed

    private void MensajeTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajeTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MensajeTexActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alerta;
    private javax.swing.JLabel Apuesta;
    private javax.swing.JScrollPane AreaHistorial;
    private javax.swing.JScrollPane AreaJugadores;
    private javax.swing.JScrollPane AreaMensaje;
    private javax.swing.JTextArea CaraArriba;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel Destinatario;
    private javax.swing.JTextField DestinatarioTex;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton GirarPirinola;
    private javax.swing.JLabel Historial;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JTextArea JugadorList;
    private javax.swing.JLabel ListJugadores;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JTextField MensajeTex;
    private javax.swing.JTextArea MensajesPublicos;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel Remitente;
    private javax.swing.JTextField RemitenteTex;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerMensaje;
    // End of variables declaration//GEN-END:variables
}

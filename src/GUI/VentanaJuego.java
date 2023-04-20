/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Categoria.Categoria;
import Jugador.Jugador;

/**
 *
 * @author Miguel
 */
public class VentanaJuego extends javax.swing.JFrame {

    char vocal;
    String palabraOculta;
    int total_Palabras = 0;
    int cantidadIntentos = 0;
    int cantidadFallos = 0;
    int contador = 1;
    public int i = 0; // CONTADOR DEL CICLO

    public VentanaJuego() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textMostrar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BotonA = new javax.swing.JButton();
        BotonE = new javax.swing.JButton();
        BotonI = new javax.swing.JButton();
        BotonO = new javax.swing.JButton();
        BotonU = new javax.swing.JButton();
        totalPalabras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPalabras1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalPalabras2 = new javax.swing.JTextField();
        BotonSiguientePalabra = new javax.swing.JButton();
        btnSalir = new java.awt.Button();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMostrar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        textMostrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textMostrar.setAlignmentX(2.0F);
        textMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMostrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setText("MOSTRAR PALABRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotonA.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        BotonA.setText("a");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        BotonE.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        BotonE.setText("e");
        BotonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEActionPerformed(evt);
            }
        });

        BotonI.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        BotonI.setText("i");
        BotonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIActionPerformed(evt);
            }
        });

        BotonO.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        BotonO.setText("o");
        BotonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOActionPerformed(evt);
            }
        });

        BotonU.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        BotonU.setText("u");
        BotonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUActionPerformed(evt);
            }
        });

        totalPalabras.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        totalPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPalabrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Total Palabras ");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Intentos");

        totalPalabras1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        totalPalabras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPalabras1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Fallos");

        totalPalabras2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        totalPalabras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPalabras2ActionPerformed(evt);
            }
        });

        BotonSiguientePalabra.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BotonSiguientePalabra.setText("SIGUIENTE PALABRA");
        BotonSiguientePalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguientePalabraActionPerformed(evt);
            }
        });

        btnSalir.setLabel("Salir");
        btnSalir.setName("Salir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonSiguientePalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(totalPalabras1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(totalPalabras2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(textMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(totalPalabras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(totalPalabras2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(BotonSiguientePalabra)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMostrarActionPerformed
        String palabraOculta;
        String palabraMostrar;
        char vocal;

        Categoria categoria = new Categoria();
        categoria.setArregloAnimales();

        for (int i = 0; i < 10; i++) {

        }
        palabraOculta = categoria.getArreglo(i);
        this.palabraOculta = categoria.getArreglo(i);
        vocal = categoria.getVocal(palabraOculta);
        this.vocal = vocal;
        palabraMostrar = categoria.quitarVocal(palabraOculta);

        textMostrar.setText(palabraMostrar);

        System.out.println("PRIMER ANIMAL : " + palabraOculta);
        System.out.println("PALABRA A MOSTRAR : " + palabraMostrar);
        System.out.println("VOCAL = " + vocal);
        textMostrar.setText(categoria.palabraMostrar);

    }//GEN-LAST:event_textMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String palabraOculta;
        String palabraMostrar;
        char vocal;

        Categoria categoria = new Categoria();
        categoria.setArregloAnimales();

        for (int i = 0; i < 10; i++) {

        }
        palabraOculta = categoria.getArreglo(i);
        this.palabraOculta = categoria.getArreglo(i);
        vocal = categoria.getVocal(palabraOculta);
        this.vocal = vocal;
        palabraMostrar = categoria.quitarVocal(palabraOculta);

        textMostrar.setText(palabraMostrar);

        System.out.println("PRIMER ANIMAL : " + palabraOculta);
        System.out.println("PALABRA A MOSTRAR : " + palabraMostrar);
        System.out.println("VOCAL = " + vocal);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
        if ('a' == vocal) {
            textMostrar.setText(palabraOculta);
            total_Palabras++;
            cantidadIntentos++;

        } else {
            cantidadIntentos++;
            cantidadFallos++;
        }
    }//GEN-LAST:event_BotonAActionPerformed

    private void totalPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPalabrasActionPerformed
        String StringTotalPalabras = Integer.toString(total_Palabras);
        totalPalabras.setText(StringTotalPalabras);
    }//GEN-LAST:event_totalPalabrasActionPerformed

    private void totalPalabras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPalabras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPalabras1ActionPerformed

    private void totalPalabras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPalabras2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPalabras2ActionPerformed

    private void BotonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEActionPerformed
        if ('e' == vocal) {
            textMostrar.setText(palabraOculta);
            total_Palabras++;
            cantidadIntentos++;

        } else {
            cantidadIntentos++;
            cantidadFallos++;
        }
    }//GEN-LAST:event_BotonEActionPerformed

    private void BotonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIActionPerformed
        if ('i' == vocal) {
            textMostrar.setText(palabraOculta);
            total_Palabras++;
            cantidadIntentos++;

        } else {
            cantidadIntentos++;
            cantidadFallos++;
        }
    }//GEN-LAST:event_BotonIActionPerformed

    private void BotonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOActionPerformed
        if ('o' == vocal) {
            textMostrar.setText(palabraOculta);
            total_Palabras++;
            cantidadIntentos++;

        } else {
            cantidadIntentos++;
            cantidadFallos++;
        }
    }//GEN-LAST:event_BotonOActionPerformed

    private void BotonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUActionPerformed
        if ('u' == vocal) {
            textMostrar.setText(palabraOculta);
            total_Palabras++;
            cantidadIntentos++;

        } else {
            cantidadIntentos++;
            cantidadFallos++;
        }
    }//GEN-LAST:event_BotonUActionPerformed

    private void BotonSiguientePalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguientePalabraActionPerformed
        total_Palabras++;
        i++;
        contador++;

    }//GEN-LAST:event_BotonSiguientePalabraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaEstadisticas ventanaEstadisticas = new VentanaEstadisticas();
        ventanaEstadisticas.setVisible(true);
        ventanaEstadisticas.setLocationRelativeTo(null);
        this.setVisible(false);


    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonE;
    private javax.swing.JButton BotonI;
    private javax.swing.JButton BotonO;
    private javax.swing.JButton BotonSiguientePalabra;
    private javax.swing.JButton BotonU;
    private java.awt.Button btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textMostrar;
    private javax.swing.JTextField totalPalabras;
    private javax.swing.JTextField totalPalabras1;
    private javax.swing.JTextField totalPalabras2;
    // End of variables declaration//GEN-END:variables
}

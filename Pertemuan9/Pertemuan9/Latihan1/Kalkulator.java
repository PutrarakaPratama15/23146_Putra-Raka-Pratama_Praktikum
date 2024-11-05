/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan9.Latihan1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Kalkulator extends javax.swing.JFrame {
    private ArrayList<Double> numbers = new ArrayList<>();
    private ArrayList<String> operators = new ArrayList<>();
    private double result;
    
    public Kalkulator() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        angkaDelapan = new javax.swing.JButton();
        angkaTujuh = new javax.swing.JButton();
        angkaSembilan = new javax.swing.JButton();
        angkaEmpat = new javax.swing.JButton();
        angkaLima = new javax.swing.JButton();
        angkaEnam = new javax.swing.JButton();
        angkaSatu = new javax.swing.JButton();
        angkaDua = new javax.swing.JButton();
        angkaTiga = new javax.swing.JButton();
        tombolKoma = new javax.swing.JButton();
        angkaNol = new javax.swing.JButton();
        tombolClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tombolTambah = new javax.swing.JButton();
        tombolKurang = new javax.swing.JButton();
        tombolKali = new javax.swing.JButton();
        tombolBagi = new javax.swing.JButton();
        tombolPersenAtauModulus = new javax.swing.JButton();
        tombolBackspace = new javax.swing.JButton();
        tombolEnd = new javax.swing.JButton();
        tombolSamaDengan = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        angkaDelapan.setText("8");
        angkaDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaDelapanActionPerformed(evt);
            }
        });

        angkaTujuh.setText("7");
        angkaTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaTujuhActionPerformed(evt);
            }
        });

        angkaSembilan.setText("9");
        angkaSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaSembilanActionPerformed(evt);
            }
        });

        angkaEmpat.setText("4");
        angkaEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaEmpatActionPerformed(evt);
            }
        });

        angkaLima.setText("5");
        angkaLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaLimaActionPerformed(evt);
            }
        });

        angkaEnam.setText("6");
        angkaEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaEnamActionPerformed(evt);
            }
        });

        angkaSatu.setText("1");
        angkaSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaSatuActionPerformed(evt);
            }
        });

        angkaDua.setText("2");
        angkaDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaDuaActionPerformed(evt);
            }
        });

        angkaTiga.setText("3");
        angkaTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaTigaActionPerformed(evt);
            }
        });

        tombolKoma.setText(".");
        tombolKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKomaActionPerformed(evt);
            }
        });

        angkaNol.setText("0");
        angkaNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaNolActionPerformed(evt);
            }
        });

        tombolClear.setText("C");
        tombolClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tombolKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angkaNol, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angkaSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angkaDua, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angkaEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angkaLima, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angkaDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angkaTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angkaEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angkaDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angkaEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaLima, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angkaSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaDua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaNol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tombolTambah.setText("+");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolKurang.setText("-");
        tombolKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKurangActionPerformed(evt);
            }
        });

        tombolKali.setText("*");
        tombolKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKaliActionPerformed(evt);
            }
        });

        tombolBagi.setText("/");
        tombolBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBagiActionPerformed(evt);
            }
        });

        tombolPersenAtauModulus.setText("%");
        tombolPersenAtauModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPersenAtauModulusActionPerformed(evt);
            }
        });

        tombolBackspace.setText("B");
        tombolBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBackspaceActionPerformed(evt);
            }
        });

        tombolEnd.setText("E");
        tombolEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEndActionPerformed(evt);
            }
        });

        tombolSamaDengan.setText("=");
        tombolSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSamaDenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(tombolKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tombolKali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tombolBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tombolSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolPersenAtauModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolKali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolPersenAtauModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void angkaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String buttonText = evt.getActionCommand();
        textField.setText(textField.getText() + buttonText);
    }
    private void tombolBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBagiActionPerformed
        // TODO add your handling code here:
        operatorButtonActionPerformed(evt);
    }//GEN-LAST:event_tombolBagiActionPerformed
    
     private void operatorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String buttonText = evt.getActionCommand();
        if (!textField.getText().isEmpty()) {
            double number = Double.parseDouble(textField.getText());
            numbers.add(number);
            operators.add(buttonText);
            textField.setText("");
        }
    }
    
    private void tombolSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSamaDenganActionPerformed
        // TODO add your handling code here:
        if (!textField.getText().isEmpty()) {
            double number = Double.parseDouble(textField.getText());
            numbers.add(number);
        }
        
        result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            switch (operators.get(i)) {
                case "+":
                    result += numbers.get(i + 1);
                    break;
                case "-":
                    result -= numbers.get(i + 1);
                    break;
                case "*":
                    result *= numbers.get(i + 1);
                    break;
                case "/":
                    if (numbers.get(i + 1) != 0) {
                        result /= numbers.get(i + 1);
                    } else {
                        textField.setText("Error: Bilangan dibagi dengan nol!");
                        return;
                    }
                    break;
                case "%":
                    result %= numbers.get(i + 1);
                    break;
                default:
                    break;
            }
        }
        textField.setText(String.valueOf(result));
        numbers.clear();
        operators.clear();
    }//GEN-LAST:event_tombolSamaDenganActionPerformed

    private void tombolEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEndActionPerformed
        // TODO add your handling code here:
        // Menampilkan dialog konfirmasi
        int response = JOptionPane.showConfirmDialog(
            this, 
            "Apakah Anda yakin ingin keluar?", 
            "Konfirmasi Keluar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );
    
        // Jika pengguna memilih "Yes", aplikasi keluar
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_tombolEndActionPerformed

    private void angkaDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaDuaActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaDuaActionPerformed

    private void angkaTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaTigaActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaTigaActionPerformed

    private void tombolKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKurangActionPerformed
        // TODO add your handling code here:
        operatorButtonActionPerformed(evt);
    }//GEN-LAST:event_tombolKurangActionPerformed

    private void angkaTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaTujuhActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaTujuhActionPerformed

    private void angkaSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaSembilanActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaSembilanActionPerformed

    private void tombolClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolClearActionPerformed
        // TODO add your handling code here:
        textField.setText("");
        numbers.clear();
        operators.clear();
    }//GEN-LAST:event_tombolClearActionPerformed

    private void tombolBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBackspaceActionPerformed
        // TODO add your handling code here:
        String currentText = textField.getText();
        if (currentText.length() > 0) {
            textField.setText(currentText.substring(0, currentText.length() - 1));
        }
    }//GEN-LAST:event_tombolBackspaceActionPerformed

    private void angkaSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaSatuActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaSatuActionPerformed

    private void angkaEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaEmpatActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaEmpatActionPerformed

    private void angkaLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaLimaActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaLimaActionPerformed

    private void angkaEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaEnamActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaEnamActionPerformed

    private void angkaDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaDelapanActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaDelapanActionPerformed

    private void angkaNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaNolActionPerformed
        // TODO add your handling code here:
        angkaButtonActionPerformed(evt);
    }//GEN-LAST:event_angkaNolActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        // TODO add your handling code here:
        operatorButtonActionPerformed(evt);
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKaliActionPerformed
        // TODO add your handling code here:
        operatorButtonActionPerformed(evt);
    }//GEN-LAST:event_tombolKaliActionPerformed

    private void tombolPersenAtauModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPersenAtauModulusActionPerformed
        // TODO add your handling code here:
        operatorButtonActionPerformed(evt);
    }//GEN-LAST:event_tombolPersenAtauModulusActionPerformed

    private void tombolKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKomaActionPerformed
        // TODO add your handling code here:
        // Memeriksa apakah sudah ada koma di dalam input angka
        if (!textField.getText().contains(".")) {
            textField.setText(textField.getText() + ".");
        }
    }//GEN-LAST:event_tombolKomaActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
        String input = textField.getText();
    }//GEN-LAST:event_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angkaDelapan;
    private javax.swing.JButton angkaDua;
    private javax.swing.JButton angkaEmpat;
    private javax.swing.JButton angkaEnam;
    private javax.swing.JButton angkaLima;
    private javax.swing.JButton angkaNol;
    private javax.swing.JButton angkaSatu;
    private javax.swing.JButton angkaSembilan;
    private javax.swing.JButton angkaTiga;
    private javax.swing.JButton angkaTujuh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textField;
    private javax.swing.JButton tombolBackspace;
    private javax.swing.JButton tombolBagi;
    private javax.swing.JButton tombolClear;
    private javax.swing.JButton tombolEnd;
    private javax.swing.JButton tombolKali;
    private javax.swing.JButton tombolKoma;
    private javax.swing.JButton tombolKurang;
    private javax.swing.JButton tombolPersenAtauModulus;
    private javax.swing.JButton tombolSamaDengan;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables

}

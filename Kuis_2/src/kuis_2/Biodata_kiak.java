/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuis_2;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat; // Untuk format tanggal
import java.util.Date; // Untuk kelas Date
import java.util.Calendar; 
import java.awt.event.KeyEvent;
/**
 *
 * @author destini marine
 */
public class Biodata_kiak extends javax.swing.JFrame {

    /**
     * Creates new form Biodata_kiak
     */
    public Biodata_kiak() {
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

        jJenisKelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jNIK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jlaki = new javax.swing.JRadioButton();
        jPerempuan = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jMakan = new javax.swing.JCheckBox();
        jTidur = new javax.swing.JCheckBox();
        jBelajar = new javax.swing.JCheckBox();
        jMusik = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPendidikan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jIPK = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jTglLahir = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jJenisKelamin.add(jlaki);
        jJenisKelamin.add(jPerempuan);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jAlamat.setColumns(20);
        jAlamat.setRows(5);
        jScrollPane1.setViewportView(jAlamat);

        jLabel4.setText("Jenis Kelamin");

        jJenisKelamin.add(jlaki);
        jlaki.setText("Laki-laki");
        jlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlakiActionPerformed(evt);
            }
        });

        jJenisKelamin.add(jPerempuan);
        jPerempuan.setText("Perempuan");

        jLabel5.setText("Hobi");

        jMakan.setText("Makan");
        jMakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMakanActionPerformed(evt);
            }
        });

        jTidur.setText("Tidur");

        jBelajar.setText("Belajar");

        jMusik.setText("Bermain Musik");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("FORMULIR LAMARAN");

        jLabel7.setText("No. Telp");

        jTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelpKeyTyped(evt);
            }
        });

        jLabel8.setText("Tanggal Lahir");

        jLabel9.setText("Pendidikan");

        jPendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4/S1", "S2", "S3" }));
        jPendidikan.setSelectedIndex(-1);
        jPendidikan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jPendidikanItemStateChanged(evt);
            }
        });
        jPendidikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPendidikanActionPerformed(evt);
            }
        });

        jLabel10.setText("IPK");

        jIPK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIPKKeyTyped(evt);
            }
        });

        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTglLahir.setText("dd/MM/YYYY");
        jTglLahir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTglLahirFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTglLahir, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jIPK, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPerempuan))
                                    .addComponent(jNIK)
                                    .addComponent(jNama)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jMakan)
                                            .addComponent(jTidur))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jMusik)
                                            .addComponent(jBelajar)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel6)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlaki)
                    .addComponent(jPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jMakan)
                    .addComponent(jBelajar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidur)
                    .addComponent(jMusik))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jIPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        jlaki.setActionCommand("Laki-laki");
        jPerempuan.setActionCommand("Perempuan");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlakiActionPerformed

    private void jMakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMakanActionPerformed

    private void jPendidikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPendidikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPendidikanActionPerformed

    private void jTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelpKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    
        // Memeriksa apakah karakter bukan angka, kecuali Backspace
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            // Membatalkan karakter yang bukan angka
            evt.consume(); 

            // Menampilkan peringatan bahwa hanya angka yang diperbolehkan
            JOptionPane.showMessageDialog(null, "Harus angka semua");
        }
    }//GEN-LAST:event_jTelpKeyTyped

    private void jTglLahirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTglLahirFocusLost
        // TODO add your handling code here:
        try {
            // Ambil nilai dari JFormattedTextField (format: "dd/MM/yyyy")
            String tglLahirStr = jTglLahir.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date tglLahir = dateFormat.parse(tglLahirStr);

            // Dapatkan tanggal hari ini
            Calendar today = Calendar.getInstance();
            Calendar birthDate = Calendar.getInstance();
            birthDate.setTime(tglLahir);

            // Hitung usia
            int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
            if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
                age--;
            }

            // Periksa usia minimal
            if (age < 18) {
                // Tampilkan pesan jika usia kurang dari 18 tahun
                JOptionPane.showMessageDialog(this, "Anda belum cukup umur untuk melamar pekerjaan ini.");
            }
        } catch (Exception e) {
            // Tangani jika format tanggal salah
            JOptionPane.showMessageDialog(this, "Format tanggal tidak valid. Harap masukkan tanggal dengan format dd/MM/yyyy.");
        } 
    }//GEN-LAST:event_jTglLahirFocusLost

    private void jIPKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIPKKeyTyped
        // TODO add your handling code here:
        char typedChar = evt.getKeyChar();
    
        // Ambil teks saat ini di JFormattedTextField
        String ipkStr = jIPK.getText();

        // Jika karakter adalah backspace atau delete
        if (typedChar == '\b' || typedChar == 127) {
            return; // Izinkan backspace atau delete tanpa validasi lebih lanjut
        }

        // Gabungkan karakter yang diketik ke dalam teks IPK
        ipkStr += typedChar;

        // Ganti koma dengan titik untuk format desimal
        ipkStr = ipkStr.replace(",", ".");

        try {
            // Cek apakah input setelah penambahan karakter adalah angka yang valid
            double ipk = Double.parseDouble(ipkStr);

            // Validasi nilai IPK harus antara 0,00 dan 4,00
            if (ipk < 0.00 || ipk > 4.00) {
                evt.consume(); // Hentikan input karakter jika tidak valid
                JOptionPane.showMessageDialog(this, "IPK tidak valid. Masukkan nilai antara 0,00 dan 4,00.");
            }
        } catch (NumberFormatException e) {
            // Tangani jika input bukan angka yang valid
            evt.consume(); // Hentikan input karakter jika tidak valid
            JOptionPane.showMessageDialog(this, "IPK tidak valid. Masukkan nilai numerik antara 0,00 dan 4,00.");
        }
    }//GEN-LAST:event_jIPKKeyTyped

    private void jPendidikanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jPendidikanItemStateChanged
        // TODO add your handling code here:
        String pendidikan = (String) jPendidikan.getSelectedItem();
    
        // Pastikan nilai pendidikan tidak null sebelum melakukan perbandingan
        if (pendidikan != null && (pendidikan.equals("SD") || pendidikan.equals("SMP") || pendidikan.equals("SMA"))) {
            JOptionPane.showMessageDialog(this, "Pendidikan minimal D1 untuk mendaftar.");

            // Mengembalikan pilihan JComboBox ke index -1 (kosongkan pilihan)
            jPendidikan.setSelectedIndex(-1);
        }
        
    }//GEN-LAST:event_jPendidikanItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean valid = true;
         StringBuilder errorMessage = new StringBuilder();

         // Cek NIK
         String nik = jNIK.getText();
         if (nik.isEmpty()) {
             valid = false;
             errorMessage.append("NIK harus diisi.\n");
         }

         // Cek Nama
         String nama = jNama.getText();
         if (nama.isEmpty()) {
             valid = false;
             errorMessage.append("Nama harus diisi.\n");
         }

         // Cek Alamat
         String alamat = jAlamat.getText();
         if (alamat.isEmpty()) {
             valid = false;
             errorMessage.append("Alamat harus diisi.\n");
         }

         // Cek Jenis Kelamin
        if (!jlaki.isSelected() && !jPerempuan.isSelected()) {
            valid = false;
            errorMessage.append("Jenis Kelamin harus dipilih.\n");
        }

         // Cek Hobi
        if (!jMakan.isSelected() && !jTidur.isSelected() && !jMusik.isSelected() && !jBelajar.isSelected()) {
            valid = false;
            errorMessage.append("Pilih setidaknya satu hobi.\n");
        }

         // Cek No Telp
         String noTelp = jTelp.getText();
         if (noTelp.isEmpty()) {
             valid = false;
             errorMessage.append("Nomor Telepon harus diisi.\n");
         }

         // Cek Tanggal Lahir
        String tglLahir = jTglLahir.getText();
        if (tglLahir.isEmpty()) {
            valid = false;
            errorMessage.append("Tanggal lahir harus diisi.\n");
        }

         // Cek Pendidikan
         String pendidikan = (String) jPendidikan.getSelectedItem();
         if (pendidikan == null || pendidikan.isEmpty()) {
             valid = false;
             errorMessage.append("Pendidikan harus dipilih.\n");
         }

         // Cek IPK
         String ipkStr = jIPK.getText();
         try {
             double ipk = Double.parseDouble(ipkStr.replace(",", "."));
             if (ipk < 0.00 || ipk > 4.00) {
                 valid = false;
                 errorMessage.append("IPK tidak valid. Masukkan nilai antara 0,00 dan 4,00.\n");
             }
         } catch (NumberFormatException e) {
             valid = false;
             errorMessage.append("IPK tidak valid.\n");
         }

         // Jika ada error, tampilkan pesan kesalahan
         if (!valid) {
             JOptionPane.showMessageDialog(this, errorMessage.toString(), "Peringatan", JOptionPane.WARNING_MESSAGE);
         } else {
             // Jika semua valid, tampilkan pesan sukses
             JOptionPane.showMessageDialog(this, "Anda berhasil mendaftar.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);

             // Kosongkan form
             jNIK.setText(""); 
             jNama.setText(""); 
             jAlamat.setText(""); 
             jJenisKelamin.clearSelection();
             jMakan.setSelected(false);  // Kosongkan CheckBox Hobi
             jTidur.setSelected(false);  // Kosongkan CheckBox Hobi
             jBelajar.setSelected(false);  // Kosongkan CheckBox Hobi
             jMusik.setSelected(false);  // Kosongkan CheckBox Hobi
             jTelp.setText(""); 
             jTglLahir.setText(""); 
             jPendidikan.setSelectedIndex(-1); 
             jIPK.setText(""); 
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Biodata_kiak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata_kiak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata_kiak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata_kiak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata_kiak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAlamat;
    private javax.swing.JCheckBox jBelajar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jIPK;
    private javax.swing.ButtonGroup jJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox jMakan;
    private javax.swing.JCheckBox jMusik;
    private javax.swing.JTextField jNIK;
    private javax.swing.JTextField jNama;
    private javax.swing.JComboBox<String> jPendidikan;
    private javax.swing.JRadioButton jPerempuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTelp;
    private javax.swing.JFormattedTextField jTglLahir;
    private javax.swing.JCheckBox jTidur;
    private javax.swing.JRadioButton jlaki;
    // End of variables declaration//GEN-END:variables
}

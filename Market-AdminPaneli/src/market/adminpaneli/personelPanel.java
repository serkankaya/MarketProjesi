package market.adminpaneli;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;

public class personelPanel extends javax.swing.JFrame {

    public personelPanel() {
        initComponents();
        jTextField2.setText("1");
        jTextField1.requestFocus();
        jButton1.setText(adminGiris.personelKullaniciAdi + " Çıkış");
        satilacakUrun.addColumn("ID");
        satilacakUrun.addColumn("Ürün Adı");
        satilacakUrun.addColumn("Kategorisi");
        satilacakUrun.addColumn("Barkod");
        satilacakUrun.addColumn("Satış Fiyatı");
        satilacakUrun.addColumn("Stok");
        satilacakUrun.addColumn("Satılacak Adet");
        jTable1.setModel(satilacakUrun);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Paneli");
        setBackground(new java.awt.Color(255, 255, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Barkod No");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel2.setText("Satış Adedi");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/sepetekle.png"))); // NOI18N
        jButton2.setText("Satış Listesine Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/tamamla.png"))); // NOI18N
        jButton3.setText("Satışı Tamamla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Durum :");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/sepetsil.png"))); // NOI18N
        jButton4.setText(" Sepetten Ürün Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Satış Ekranı", jPanel1);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/kasakapat.png"))); // NOI18N
        jButton5.setText("Kasayı Kapat");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/report.png"))); // NOI18N
        jButton7.setText("Yaptığım Satışlar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gün Sonu İşlemi ve Rapor", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("İade Edilecek Ürünün Satış İdsini Giriniz ..."));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/uruniade.png"))); // NOI18N
        jButton8.setText("İade Et");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel4.setText("Satış İdsi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jButton8)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürün İadesi", jPanel4);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Personel Şifre  Değiştirme"));

        jLabel9.setText("Eski Şifre");

        jLabel10.setText("Yeni Şifre");

        jLabel11.setText("Yeni Şifre Tekrarı");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/sifredegistir.png"))); // NOI18N
        jButton6.setText("Şifre Değiştir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(jPasswordField2))
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ayarlar", jPanel3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market/adminpaneli/login.png"))); // NOI18N
        jButton1.setText("Çıkış");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String eskisifre = jPasswordField1.getText();
        String yenisifre = jPasswordField2.getText();
        String yenisifretekrar = jPasswordField3.getText();
        String sifrekontrol = "";
        int tekrarkontrol = 0;
        int olumlukontrol = 0, olumsuzkontrol = 0;
        SQLITEDB db = new SQLITEDB();
        try {

            ResultSet rs = db.dataFnc("personel where personel_id = '" + adminGiris.personelKullaniciID + "' and personel_sifre = '" + eskisifre + "'");
            rs.next();
            sifrekontrol = rs.getString("personel_sifre");

            if (jPasswordField1.getText().equals("") || jPasswordField2.getText().equals("") || jPasswordField3.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
            } else {
                db.kapat();
                if (yenisifre.equals(yenisifretekrar)) {
                    tekrarkontrol += 1;
                }
                if (yenisifre.equals(yenisifretekrar) && eskisifre.equals(sifrekontrol) && tekrarkontrol == 1) {

                    //                        SQLITEDB db=new SQLITEDB();
                    try {

                        int sonuc = db.baglan().executeUpdate("update personel set personel_sifre='" + yenisifre + "' where personel_id='" + adminGiris.personelKullaniciID + "'");

                        if (sonuc > 0) {
                            olumlukontrol += 1;
                            olumsuzkontrol = 0;
                        } else {

                            olumsuzkontrol += 1;

                        }
                        if (olumlukontrol > 0) {
                            JOptionPane.showMessageDialog(rootPane, "Şifre Değiştirme Başarılı ...");
                            jPasswordField1.setText("");
                            jPasswordField2.setText("");
                            jPasswordField3.setText("");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Şifre Değiştirme Başarısız ...");
                        System.err.println("Şifre Değiştirme Hatası : " + e);
                    }

                } else if (tekrarkontrol != 1) {
                    JOptionPane.showMessageDialog(rootPane, "Şifre tekrarı uyuşmuyor ...");
                    jPasswordField2.setText("");
                    jPasswordField3.setText("");
                    jPasswordField2.requestFocus();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Eski Şifre Yanlış ...");
            jPasswordField1.requestFocus();
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    public void sepetSil() {
        int sonuc = 0;
        SQLITEDB db = new SQLITEDB();
        try {
            int sepetsil = db.baglan().executeUpdate("delete from sepet");
            if (sonuc > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sepet Silme Başarılı ...");
            }
        } catch (Exception e) {
            System.err.println("Sepet Silme Hatası : " + e);
        }
        db.kapat();
    }

    public void kisiyeGoreSatisGunSonuSil() {
        SQLITEDB db = new SQLITEDB();
        try {
            int sonuc6 = db.baglan().executeUpdate("delete from SatisGunSonu where satan_personel_id='" + adminGiris.personelKullaniciAdi + "'");
        } catch (Exception e) {
            System.err.println("Sepet Silme Hatası : " + e);
        }
        db.kapat();
    }

    public void urunIadesiSatislarTablosundanSilme() {
        SQLITEDB db = new SQLITEDB();
        try {
            int sonuc6 = db.baglan().executeUpdate("delete from satislar where satis_id='" + satisdanSil + "'");
        } catch (Exception e) {
            System.err.println("Satis tablosundan Silme Hatası : " + e);
        }
        db.kapat();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sepetSil();
        adminGiris acikis = new adminGiris();
        acikis.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jPasswordField2.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jPasswordField3.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    boolean durum = false;
//    boolean stokDurum[];

    int sepetsil = 0;
    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton6ActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordField3KeyPressed
    DefaultTableModel satilacakUrun = new DefaultTableModel();

    int urunSayac = 0;
    int urunStokSayisi = 0;
    String silinecekUrunID = "";
    ArrayList<String> urunID = new ArrayList<String>();
    ArrayList<String> urunAdi = new ArrayList<String>();
    ArrayList<String> urun_kategori = new ArrayList<String>();
    ArrayList<String> barkod = new ArrayList<String>();
    ArrayList<String> satis_fiyati = new ArrayList<String>();
    ArrayList<String> stok = new ArrayList<String>();
    ArrayList<String> satis_adedi = new ArrayList<String>();
    ////////////////////////////////GUN SONU TANIMLAMALARI/////////////////////////////////
    ArrayList<String> gunSonuUrunID = new ArrayList<>();
    ArrayList<String> gunSonuUrunAdi = new ArrayList<String>();
    ArrayList<String> gunSonuUrun_kategori = new ArrayList<String>();
    ArrayList<String> gunSonuBarkod = new ArrayList<String>();
    ArrayList<String> gunSonuSatis_fiyati = new ArrayList<String>();
    ArrayList<String> gunSonuSatis_adedi = new ArrayList<String>();
    ArrayList<String> gunSonuSatanPersonelID = new ArrayList<String>();
    ////////////////////////////////GUN SONU TANIMLAMALARI/////////////////////////////////
    Map<String, Integer> farkliUrunStokToplami = new HashMap<String, Integer>();

    Map<String, Boolean> stokDurumSorgulama = new HashMap<String, Boolean>();
    Map<String, Integer> urunIDyeGorestokSayisi = new HashMap<String, Integer>();


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int sonuc = 0;
        int urunKontrol = 0;
        String barkodNo = jTextField1.getText();
        SQLITEDB db = new SQLITEDB();
        try {
            if (urunSayac == 0) {
            }
            urunSayac += 1;
            ResultSet rs = db.dataFnc("urunler where barkod='" + barkodNo + "'");
            if (rs.next()) {
                satilacakUrun.addRow(new String[]{rs.getString("urun_id"), rs.getString("urun_adi"), rs.getString("urun_kategori"), rs.getString("barkod"), rs.getString("satis_fiyat"), rs.getString("stok"), jTextField2.getText()});
                durum = true;
            } else {
                durum = false;
            }
            db.kapat();

            jTable1.setModel(satilacakUrun);
            for (int count = 0; count < jTable1.getRowCount(); count++) {
                urunID.add(satilacakUrun.getValueAt(count, 0).toString());
                urunAdi.add(satilacakUrun.getValueAt(count, 1).toString());
                urun_kategori.add(satilacakUrun.getValueAt(count, 2).toString());
                barkod.add(satilacakUrun.getValueAt(count, 3).toString());
                satis_fiyati.add(satilacakUrun.getValueAt(count, 4).toString());
                stok.add(satilacakUrun.getValueAt(count, 5).toString());
                satis_adedi.add(satilacakUrun.getValueAt(count, 6).toString());
            }

            if (durum) {
                try {
                    db = new SQLITEDB();
                    sonuc = db.ekleFnc("sepet", new String[]{urunID.get(jTable1.getRowCount() - 1), urunAdi.get(jTable1.getRowCount() - 1), urun_kategori.get(jTable1.getRowCount() - 1), barkod.get(jTable1.getRowCount() - 1), satis_fiyati.get(jTable1.getRowCount() - 1), satis_adedi.get(jTable1.getRowCount() - 1), adminGiris.personelKullaniciAdi});
                    if (sonuc > 0) {
                        jLabel3.setText("Durum : Sepete Ekleme Başarılı !!!");
                        jTextField1.requestFocus();
                    }
                } catch (Exception e) {
                    System.err.println("Sepete ekleme Hatası : " + e);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Barkod'a ait ürün stok'da yok ...");
            }

            urunID.clear();
            urunAdi.clear();
            urun_kategori.clear();
            barkod.clear();
            satis_fiyati.clear();
            stok.clear();
            satis_adedi.clear();

        } catch (Exception e) {
            System.err.println("Ürün Getirme Hatası : " + e);
        }
        db.kapat();
        jTextField1.setText("");
        jTextField2.setText("1");
        jTextField1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton2ActionPerformed(null);
        }

    }//GEN-LAST:event_jTextField1KeyPressed
    public void tableTemizle() {
        satilacakUrun.setRowCount(0);
    }
    int toplamStok = 0;
    int toplamStok2 = 0;

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        System.out.println("Row sayısı : "+ jTable1.getRowCount());
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Barkod Verisi Giriniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            ////////////////////////////////
            for (int count = 0; count < jTable1.getRowCount(); count++) {
                urunID.add(satilacakUrun.getValueAt(count, 0).toString());
                urunAdi.add(satilacakUrun.getValueAt(count, 1).toString());
                urun_kategori.add(satilacakUrun.getValueAt(count, 2).toString());
                barkod.add(satilacakUrun.getValueAt(count, 3).toString());
                satis_fiyati.add(satilacakUrun.getValueAt(count, 4).toString());
                stok.add(satilacakUrun.getValueAt(count, 5).toString());
                satis_adedi.add(satilacakUrun.getValueAt(count, 6).toString());

            }
        ////////////////////////////////

            ////////////////////////////////
            int sonuc = 0;

            SQLITEDB db = new SQLITEDB();
            try {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    ResultSet rs = db.stokToplamDataFnc("sepet where urun_id='" + urunID.get(i) + "'");
                    while (rs.next()) {

                        toplamStok = 0;

                        toplamStok = Integer.valueOf(rs.getString("stoktoplami"));

                        toplamStok2 += toplamStok;

                        farkliUrunStokToplami.put(urunID.get(i).toString(), toplamStok2);
                        toplamStok2 = 0;
                        toplamStok = 0;
                    }

                }
                toplamStok2 += toplamStok;

            } catch (Exception e) {
                System.err.println("Stok Toplam Sayısı Getirme Hatası : " + e);
            }
            db.kapat();
            ////////////////////////////////
            sonuc = 0;
            db = new SQLITEDB();
            try {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    ResultSet rs = db.dataFnc("urunler where urun_id='" + urunID.get(i) + "'");
                    while (rs.next()) {
                        urunStokSayisi = Integer.valueOf(rs.getString("stok"));
                        urunIDyeGorestokSayisi.put(urunID.get(i).toString(), urunStokSayisi);
                    }
                }
            } catch (Exception e) {
                System.err.println("Stok Getirme Hatası : " + e);
            }
            db.kapat();
            ////////////////////////////////
            int mesaj = 0;
//        Integer stokOlumlumu[] = new Integer[jTable1.getRowCount()];
            ArrayList<Integer> stokOlumlumu = new ArrayList<Integer>();
//        TreeMap<String,Integer> stokOlumlumu2=new TreeMap<String,Integer>();
            for (Map.Entry<String, Integer> uruneGoreStokSayisi : urunIDyeGorestokSayisi.entrySet()) {
                System.out.println("Urune Göre Stok Sayısı : " + uruneGoreStokSayisi);

                for (Map.Entry<String, Integer> stokToplami : farkliUrunStokToplami.entrySet()) {
                    System.out.println("Satılacak Urunun Toplam Sayısı : " + stokToplami);
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        if (uruneGoreStokSayisi.getValue() >= stokToplami.getValue()) {

                            stokOlumlumu.add(1);

                        } else if (uruneGoreStokSayisi.getValue() < stokToplami.getValue()) {
                            stokOlumlumu.add(0);

                        }
                    }
//            if (stokSayisi.getValue() >= stokToplami.getValue()) {
//                
//            }
//            for (Map.Entry<String, Integer> stokSayisi : stokKontrol.entrySet()) {
//                for (int i = 0; i < urunID.size(); i++) {
//                if (stokSayisi.getValue() >= stokToplami.getValue()) {
//                    
//                    stokDurumSorgulama.put(urunID.get(i), true);
//                } else if(stokSayisi.getValue() < stokToplami.getValue()) {
//                    
//                    stokDurumSorgulama.put(urunID.get(i), false);
//                }
//                }
//            }
                }
            }
            boolean stokKontrolSonDurum = false;
            for (Integer item : stokOlumlumu) {
                System.out.println("Olumlu mu :" + item);
                if (item.equals(0)) {
                    stokKontrolSonDurum = true;

                }
            }

            stokOlumlumu.clear();

            ////////////////////////////////
//        for (Map.Entry<String, Boolean> stokToplami : stokDurumSorgulama.entrySet()) {
//            System.out.println("Durum :" + stokToplami);
//            
//        }
//        stokDurumSorgulama.clear();
//        farkliUrunStokToplami.clear();
//        stokKontrol.clear();
            ////////////////////////////////
            if (stokKontrolSonDurum) {
                JOptionPane.showMessageDialog(rootPane, "Satılacak Ürünlerden birinin stoğu yetersiz ...");
                stokKontrolSonDurum = false;
            } else {

                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    db = new SQLITEDB();
                    try {
                        sonuc = db.ekleFnc("SatisGunSonu", new String[]{urunID.get(i), urunAdi.get(i), urun_kategori.get(i), barkod.get(i), satis_fiyati.get(i), satis_adedi.get(i), adminGiris.personelKullaniciAdi});
                        if (sonuc > 0) {
                            jLabel3.setText("Durum : Satış Başarılı !!!");
                            jTextField1.requestFocus();
                            durum = true;
                        }
                    } catch (Exception e) {
                        System.err.println("Ekleme Hatası : " + e);
                    }
                    db.kapat();
                }

                if (durum) {
                    sepetSil();
                    durum = false;
                } else {
                    durum = false;
                }
                ///////////// STOK EKSİLTME /////////////////////
                for (Map.Entry<String, Integer> tempStokSayisi : farkliUrunStokToplami.entrySet()) {
                    System.out.println("Eksiltilecek değer : " + tempStokSayisi.getValue());

//                for (int i = 0; i < jTable1.getRowCount(); i++) {
//                    int deger=stokToplami.get;
                    try {
                        sonuc = 0;
                        db = new SQLITEDB();
                        sonuc = db.baglan().executeUpdate("update urunler set stok=stok-'" + tempStokSayisi.getValue() + "' where urun_id=" + tempStokSayisi.getKey());

                        if (sonuc > 0) {
                            System.out.println("Stok Eksiltildi ...");

                        }
                    } catch (Exception e) {
                        System.err.println("Ürün Düzenleme Hatası : " + e);
                    }
                    db.kapat();
//                }
                }

                stokDurumSorgulama.clear();
                farkliUrunStokToplami.clear();

                urunID.clear();
                urunAdi.clear();
                urun_kategori.clear();
                barkod.clear();
                satis_fiyati.clear();
                stok.clear();
                satis_adedi.clear();
                tableTemizle();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        silinecekUrunID = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked
//    private void sepetGetir() {
//        SQLITEDB db = new SQLITEDB();
//        try {
//            DefaultTableModel dt = new DefaultTableModel();
//            dt.addColumn("ID");
//            dt.addColumn("Adı");
//            dt.addColumn("Soyadı");
//            dt.addColumn("Kullanıcı Adı");
//            dt.addColumn("Şifre");
//
//            ResultSet rs = db.dataFnc("personel");
//            while (rs.next()) {
//                dt.addRow(new String[]{rs.getString("personel_id"), rs.getString("personel_adi"), rs.getString("personel_soyadi"), rs.getString("personel_kadi"), rs.getString("personel_sifre")});
//            }
//
//            jTable1.setModel(dt);
//        } catch (Exception e) {
//            System.err.println("Data Getirme Hatası : " + e);
//        }
//        db.kapat();
//    }
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sepetSil();
    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jTable1.setModel(satilacakUrun);
        SQLITEDB db = new SQLITEDB();
        if (silinecekUrunID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen silinecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Ürünü Sepetten Silmek İstediğinizden Emin misiniz ?", "Ürün Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (sonkarar == 0) {
                int numRows = jTable1.getSelectedRows().length;
                for (int i = 0; i < numRows; i++) {
                    satilacakUrun.removeRow(jTable1.getSelectedRow());
                }
                try {

                    int sonuc = db.baglan().executeUpdate("delete from sepet where urun_id=" + silinecekUrunID);

                    if (sonuc > 0) {
                        jLabel3.setText("Durum : Sepetten Silme Başarılı !!!");
                        silinecekUrunID = "";
                    }

                } catch (Exception e) {
                    System.err.println("Sepetten satır Silme Hatası : " + e);
                }
                db.kapat();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public String satisGunSonuUrunSayisi() {
        String sonuc2 = "";
        SQLITEDB db = new SQLITEDB();
        try {
            ResultSet rs = db.sepetToplam("SatisGunSonu");
            rs.next();
            sonuc2 = rs.getString("satistoplami");
            db.kapat();
        } catch (Exception e) {
            System.out.println("Sepet Toplamı Hatası : " + e);
        }
        return sonuc2;
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ArrayList<Integer> sil = new ArrayList<>();
        int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Gün Sonu İşlemi Yapmak İstediğinizden Emin misiniz ?", "Ürün Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (sonkarar == 0) {
            System.out.println(adminGiris.personelKullaniciAdi);
            SQLITEDB db = new SQLITEDB();
            try {

                ResultSet rs = db.dataFnc("SatisGunSonu where satan_personel_id='" + adminGiris.personelKullaniciAdi + "'");

                while (rs.next()) {
                    gunSonuUrunID.add(rs.getString("urun_id"));
                    gunSonuUrunAdi.add(rs.getString("urun_adi"));
                    gunSonuUrun_kategori.add(rs.getString("urun_kategori"));
                    gunSonuBarkod.add(rs.getString("barkod"));
                    gunSonuSatis_fiyati.add(rs.getString("satis_fiyati"));
                    gunSonuSatis_adedi.add(rs.getString("satis_adedi"));
                    gunSonuSatanPersonelID.add(rs.getString("satan_personel_id"));
//                durum = true;
                }
                db.kapat();
            } catch (Exception e) {
                System.out.println("Satılan Ürün Veri Çekme Hatası  :" + e);
            }

            for (int i = 0; i < gunSonuSatanPersonelID.size(); i++) {
                System.out.println("Satışı yapan kişi : " + gunSonuSatanPersonelID.get(i));

            }
            Date tarih = new Date();
            DateFormat tf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Tarih : " + tf.format(tarih));
            for (int i = 0; i < gunSonuUrunID.size(); i++) {
                db = new SQLITEDB();
                try {
                    int sonuc = db.ekleFnc("satislar", new String[]{gunSonuUrunID.get(i), gunSonuUrunAdi.get(i), gunSonuUrun_kategori.get(i), gunSonuBarkod.get(i), gunSonuSatis_fiyati.get(i), gunSonuSatis_adedi.get(i), gunSonuSatanPersonelID.get(i), String.valueOf(tf.format(tarih))});
                    if (sonuc > 0) {
                        sil.add(1);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Ürün Ekleme işlemi başarısız ...");
                        sil.add(0);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Ürün Ekleme işlemi başarısız2 ...");
                    System.out.println("hata : " + e);
                }
                db.kapat();
            }
            for (Integer SatisGunSonuSil : sil) {
                System.out.println("silindimi : " + SatisGunSonuSil);
                if (SatisGunSonuSil.equals(1)) {
                    kisiyeGoreSatisGunSonuSil();
                }

            }
            sil.clear();
            gunSonuUrunID.clear();
            gunSonuUrunAdi.clear();
            gunSonuUrun_kategori.clear();
            gunSonuBarkod.clear();
            gunSonuSatis_fiyati.clear();
            gunSonuSatis_adedi.clear();
            gunSonuSatanPersonelID.clear();

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        kisiyeGoreSatisGrafik rapor1 = new kisiyeGoreSatisGrafik(adminGiris.personelKullaniciAdi + " Kullanıcı isimli Çalışanın Satışları(CİRO)");
        rapor1.setSize(500, 300);
        RefineryUtilities.centerFrameOnScreen(rapor1);
        rapor1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    Map<String, Integer> satilaniadeurunvarmi = new HashMap<String, Integer>();
    Map<String, Integer> IadeEdilecekSatisSayisi = new HashMap<String, Integer>();
    boolean urunvarmi;
    String satisdanSil = "";
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İade Etmek İstediğiniz Ürünün Satış ID sini giriniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {

            urunvarmi = false;
            SQLITEDB db = new SQLITEDB();
            try {
                ResultSet rs = db.dataFnc("satislar where satis_id='" + jTextField3.getText().toString() + "'");
                while (rs.next()) {
                    satilaniadeurunvarmi.put(rs.getString("satis_id"), Integer.valueOf(rs.getString("satis_adedi")));
                    IadeEdilecekSatisSayisi.put(rs.getString("urun_id"), Integer.valueOf(rs.getString("satis_adedi")));
                }
                db.kapat();
            } catch (Exception e) {
                System.out.println("Satılan Ürün Veri Çekme Hatası  :" + e);
            }
            for (Map.Entry<String, Integer> entrySet : satilaniadeurunvarmi.entrySet()) {
                String key = entrySet.getKey();
                Integer value = entrySet.getValue();
                if (jTextField3.getText().equals(key)) {
                    urunvarmi = true;
                } else {
                    urunvarmi = false;
                }
            }
            if (urunvarmi) {
                int sonkarar = JOptionPane.showConfirmDialog(rootPane, jTextField3.getText() + " Satış id li ürünü iade etmek İstediğinizden Emin misiniz ?", "Ürün Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (sonkarar == 0) {
                    satisdanSil = jTextField3.getText();
                    for (Map.Entry<String, Integer> entrySet : IadeEdilecekSatisSayisi.entrySet()) {
                        String key = entrySet.getKey();
                        Integer value = entrySet.getValue();
                        try {
                            int sonuc2 = 0;
                            db = new SQLITEDB();
                            sonuc2 = db.baglan().executeUpdate("update urunler set stok=stok+'" + value + "' where urun_id=" + key);

                            if (sonuc2 > 0) {
                                JOptionPane.showMessageDialog(rootPane, "Ürün İade işlemi Gerçekleşti ...");

                            }
                        } catch (Exception e) {
                            System.err.println("Ürün Düzenleme Hatası : " + e);
                        }
                        db.kapat();

                    }

                    urunIadesiSatislarTablosundanSilme();
                    satisdanSil = "";
                    satilaniadeurunvarmi.clear();
                    IadeEdilecekSatisSayisi.clear();
                    jTextField3.setText("");
                    jTextField3.requestFocus();
                }

            } else if (!urunvarmi) {
                JOptionPane.showMessageDialog(rootPane, "Bu satış id sinde urun yok ...", "Uyarı", JOptionPane.OK_OPTION, null);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton8ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField3KeyPressed
    
    

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
            java.util.logging.Logger.getLogger(personelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personelPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

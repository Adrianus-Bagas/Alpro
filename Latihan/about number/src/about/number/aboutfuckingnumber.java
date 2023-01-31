package about.number;
public class aboutfuckingnumber extends javax.swing.JFrame {
    public aboutfuckingnumber() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        angka1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fpb = new javax.swing.JTextField();
        kpk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        faktor1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        angka2 = new javax.swing.JTextField();
        faktor2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("About Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 22, -1, -1));

        jLabel2.setText("Number 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, -1));

        jLabel3.setText("Number 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 55, -1, -1));
        getContentPane().add(angka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 88, 46, -1));

        jLabel4.setText("GCD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 131, -1, -1));

        jLabel5.setText("LCM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 176, -1, -1));

        fpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpbActionPerformed(evt);
            }
        });
        getContentPane().add(fpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 128, 67, -1));
        getContentPane().add(kpk, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 176, 68, -1));

        jLabel6.setText("FACTOR 1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 221, -1, -1));

        faktor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faktor1ActionPerformed(evt);
            }
        });
        getContentPane().add(faktor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 246, 110, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("FACTOR 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        proses.setText("Cek");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        jPanel1.add(proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        jPanel1.add(angka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 70, -1));

        faktor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faktor2ActionPerformed(evt);
            }
        });
        jPanel1.add(faktor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fpbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpbActionPerformed
        
    }//GEN-LAST:event_fpbActionPerformed

    private void faktor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faktor1ActionPerformed
        
    }//GEN-LAST:event_faktor1ActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
      int bil1=Integer.parseInt(angka1.getText());
      int bil2=Integer.parseInt(angka2.getText());
      int x=bil1*bil2;
      for(int i=1;i<=bil1;i++){
          if(bil1%i==0){
              faktor1.setText(faktor1.getText()+Integer.toString(i)+" ");
          }
      }
      for(int i=1;i<=bil2;i++){
          if(bil2%i==0){
              faktor2.setText(faktor2.getText()+Integer.toString(i)+" ");
          }
      }
      int r=bil1%bil2;
      while(r!=0){
          bil1=bil2;
          bil2=r;
          r=bil1%bil2;
      }
      int gcd=bil2;
      fpb.setText(Integer.toString(gcd));
      
      int lcm=x/gcd;
      kpk.setText(Integer.toString(lcm));
    }//GEN-LAST:event_prosesActionPerformed

    private void faktor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faktor2ActionPerformed
        
    }//GEN-LAST:event_faktor2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutfuckingnumber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JTextField faktor1;
    private javax.swing.JTextField faktor2;
    private javax.swing.JTextField fpb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kpk;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import javafx.util.Duration;
import DB_Connection.*;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilina Prasad
 */
public class GetKeyStroke extends javax.swing.JFrame {

    /**
     * Creates new form GetKeyStroke
     */
    ArrayList<Long> pressed_int = new ArrayList<>();
    ArrayList<Long> fly_int = new ArrayList<>();
    ArrayList<Long> total_time = new ArrayList<>();
    long pressed_time = 0;
    long released_time = 0;
    String uName = "";
    int analyzedCount = 10;

    public GetKeyStroke() {
        initComponents();

    }

    public static Long calcAvg(ArrayList<Long> data) {
        long tot = 0;
        long length = data.size();
        for (int i = 0; i < length; i++) {
            tot += data.get(i);
        }
        //System.out.println(tot);
        //System.out.println(length);
        return tot / length;
    }

    public static String getKey(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return KeyEvent.getKeyText(keyCode);
    }

    public void resetFields() {
        analyzeBtn.setEnabled(true);
        userName.setEnabled(true);
        userName.setText("");
        pressed_int.clear();
        fly_int.clear();
        total_time.clear();
        pressed_time = 0;
        released_time = 0;
        uName = "";
        analyzedCount = 0;
        pressedTimeLbl.setText("00");
        flyTimeLbl.setText("00");
        totTimeLbl.setText("00");
        regBtn.setEnabled(false);
        messageText.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        analyzeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pressedTimeLbl = new javax.swing.JLabel();
        flyTimeLbl = new javax.swing.JLabel();
        totTimeLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        regBtn = new javax.swing.JButton();
        messageText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        fullNameField = new javax.swing.JTextField();

        jLabel10.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Key Stroke | SignUp");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setFocusCycleRoot(true);
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFocusGained(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameKeyReleased(evt);
            }
        });

        jLabel4.setText("Age                             :");

        analyzeBtn.setText("Analyze (10)");
        analyzeBtn.setFocusCycleRoot(true);
        analyzeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyzeBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("System Needs to anlyze your key stroke in 10 times.Type user name in 10 times");

        jLabel5.setText("Pressed Time :");

        jLabel6.setText("Fly Time          :");

        jLabel7.setText("Total Time       :");

        pressedTimeLbl.setText("00");

        flyTimeLbl.setText("00");

        totTimeLbl.setText("00");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register Section"));

        regBtn.setText("Register");
        regBtn.setEnabled(false);
        regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regBtnMouseClicked(evt);
            }
        });

        messageText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        messageText.setText("      ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regBtn)
                    .addComponent(messageText))
                .addContainerGap())
        );

        jButton1.setText("Log In");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel8.setText("User Name                :");

        jLabel9.setText("Full Name                  :");

        ageField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageField.setFocusCycleRoot(true);
        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFieldFocusGained(evt);
            }
        });
        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageFieldKeyReleased(evt);
            }
        });

        fullNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullNameField.setFocusCycleRoot(true);
        fullNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullNameFieldFocusGained(evt);
            }
        });
        fullNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fullNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullNameFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(analyzeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pressedTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flyTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8)
                    .addContainerGap(328, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analyzeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pressedTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(flyTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
        if (getKey(evt).length() == 1 && getKey(evt) != "Backspace" && getKey(evt) != "Space" && getKey(evt) != "Shift" && getKey(evt) != "Delete") {
            //System.out.println("In");
            //System.out.println(pressed_time);
            pressed_time = System.currentTimeMillis();
            if (released_time != 0) {
                fly_int.add(pressed_time - released_time);
            } else {
                fly_int.add(released_time);
            }
        } else {
            
            if (!pressed_int.isEmpty() && !fly_int.isEmpty()) {
                for (int i = 0; i < userName.getText().length(); i++) {
                    pressed_int.remove(pressed_int.size() - 1);
                    fly_int.remove(fly_int.size() - 1);
                }
                pressed_time = 0;
                released_time = 0;
                userName.setText(null);
                System.out.println(pressed_int.toString());
                System.out.println(fly_int.toString());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameKeyPressed

    private void regBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regBtnMouseClicked
        DBDataHandel db = new DBDataHandel();
        long avg_pressed = calcAvg(pressed_int);
        long avg_fly = calcAvg(fly_int);
        long avg_tot = calcAvg(total_time);
        /*System.out.println(pressed_int.toString());
        System.out.println(fly_int.toString());
        System.out.println(total_time.toString());
        System.out.println(avg_pressed);
        System.out.println(avg_fly);
        System.out.println(avg_tot);*/
        String fullName = this.fullNameField.getText();
        String age = this.ageField.getText();
        if (fullName.length() != 0 && age.length() != 0) {
            if (!db.storeData(uName, Long.toString(avg_pressed), Long.toString(avg_fly), Long.toString(avg_tot), fullName, age)) {
                JOptionPane.showMessageDialog(this, "Successfully Added!", "Success", JOptionPane.INFORMATION_MESSAGE);
                resetFields();
                LogIn log = new LogIn();
                log.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete the user data!", "Success", JOptionPane.WARNING_MESSAGE);
        }
//System.out.println(calcAvg(pressed_int));
        /*
        for(int i=0;i<pressed.size();i++){
            System.out.println(pressed_int.get(i));
            System.out.println(released_time.get(i));
        }*/

    }//GEN-LAST:event_regBtnMouseClicked

    private void userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFocusGained

    }//GEN-LAST:event_userNameFocusGained

    private void userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyReleased
        if (getKey(evt).length() == 1 && getKey(evt) != "Backspace" && getKey(evt) != "Space" && getKey(evt) != "Shift" && getKey(evt) != "Delete") {
            //System.out.println("In");
            released_time = System.currentTimeMillis();
            pressed_int.add(released_time - pressed_time);
        } else {
            System.err.println("relesed ignored");
        }

    }//GEN-LAST:event_userNameKeyReleased

    private void analyzeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyzeBtnMouseClicked
        if (userName.getText().length() != 0) {
            boolean validity = true;
            if (analyzedCount == 10) {
                DBDataHandel data = new DBDataHandel();
                ArrayList<String> temp = data.getData(userName.getText());
                if (!temp.isEmpty()) {
                    validity = false;
                    JOptionPane.showMessageDialog(this, "User Name Already Exists!\nPlase Try another one", "  Attention", JOptionPane.WARNING_MESSAGE);
                }
            }

            if (validity) {
                if (uName.length() == 0) {

                    uName = userName.getText().trim();
                }

                if (userName.getText().equals(uName)) {

                    analyzedCount -= 1;
                    if (analyzedCount != 0) {
                        analyzeBtn.setText("Analyze (" + Integer.toString(analyzedCount) + ")");
                    } else {
                        userName.setEnabled(false);
                        analyzeBtn.setText("Done");
                        analyzeBtn.setEnabled(false);
                        regBtn.setEnabled(true);
                        messageText.setText("Now you can register >>>>");
                    }

                    userName.setText("");
                    pressed_time = 0;
                    released_time = 0;

                    int strSize = pressed_int.size();
                    //System.out.println(strSize);
                    //System.out.println(pressed_int.toString());
                    List<Long> lastPressed = pressed_int.subList(strSize - uName.length(), strSize);
                    List<Long> lastFly = fly_int.subList(strSize - uName.length(), strSize);

                    //System.out.println(lastPressed.toString());
                    System.out.println(pressed_int);
                    pressedTimeLbl.setText(lastPressed.toString());
                    flyTimeLbl.setText(lastFly.toString());
                    long totTime = 0;
                    for (int i = 0; i < uName.length(); i++) {

                        totTime += (lastPressed.get(i) + lastFly.get(i));
                    }
                    total_time.add(totTime);
                    totTimeLbl.setText(Long.toString(totTime));
                    userName.requestFocus();
                    // System.out.println(lastFly.toString());
                    //System.out.println(pressed_int.toString());
                    //System.out.println(fly_int.toString());
                    //System.out.println(total_time.toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Entered User name doesn't match. Re-Enter User name", "  Attention", JOptionPane.WARNING_MESSAGE);
                    //System.out.println(pressed_int.toString());
                    //System.out.println(fly_int.toString());
                    for (int i = 0; i < userName.getText().length(); i++) {
                        pressed_int.remove(pressed_int.size() - 1);
                        fly_int.remove(fly_int.size() - 1);

                    }
                    userName.setText("");
                    pressed_time = 0;
                    released_time = 0;
                    //System.out.println(pressed_int.toString());
                    //System.out.println(fly_int.toString());
                }
            }

        } else if (analyzeBtn.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Please enter user name before press 'Analyze'", "  Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_analyzeBtnMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        GetKeyStroke gs = new GetKeyStroke();
        gs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void ageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldFocusGained

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldKeyPressed

    private void ageFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldKeyReleased

    private void fullNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldFocusGained

    private void fullNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldKeyPressed

    private void fullNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldKeyReleased

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
                if ("Macintosh*".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GetKeyStroke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetKeyStroke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetKeyStroke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetKeyStroke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetKeyStroke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JButton analyzeBtn;
    private javax.swing.JLabel flyTimeLbl;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel messageText;
    private javax.swing.JLabel pressedTimeLbl;
    private javax.swing.JButton regBtn;
    private javax.swing.JLabel totTimeLbl;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
package CoffeeManagement.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Le Duc Hoa
 */
public class LoginForm extends javax.swing.JFrame{

    /**
     * Creates new form LoginForm
     */
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    CoffeeManagement.server.DBHelper db = new CoffeeManagement.server.DBHelper();
    Graphics g = getGraphics();
    
    public LoginForm() {
        initComponents();
//            ImageIcon img = new ImageIcon("src/CoffeeManagement/image/Login.png");
//        this.setIconImage(img.getImage());
        try {
            con = db.getCon();
            imgUser.setSize(20, 20);
            new SetImage().setImageLabel(imgUser, "src/CoffeeManagement/image/user.png");
            imgPass.setSize(20, 20);
            new SetImage().setImageLabel(imgPass, "src/CoffeeManagement/image//pass.png");
            imgRole.setSize(20, 20);
            new SetImage().setImageLabel(imgRole, "src/CoffeeManagement/image/role.png");
            BufferedImage myPicture = ImageIO.read(new File("src/CoffeeManagement/image/huhu.jpg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            picLabel.setSize(490, 490);
            jPanel3.add(picLabel);
//            btnOK.setSize(30, 30);
//            new SetImage().setImageButton(btnOK, "image//Login.png");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    public void OK(){
        while(true){
            if(txtUser.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Tên tài khoản không được để trống.");
                txtUser.grabFocus();
                return;
            } else{
                break;
            }
        }
        while(true){
            if(txtPassword.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống.");
                txtPassword.grabFocus();
                return;
            } else{
                break;
            }
        }
        if (cbRole.getSelectedIndex() == 1) {
            try {
                String admin = "select * from Administrator where Username=? COLLATE SQL_Latin1_General_CP1_CS_AS and Password=? COLLATE SQL_Latin1_General_CP1_CS_AS";
                ps = con.prepareStatement(admin);
                ps.setString(1, txtUser.getText());
                ps.setString(2, txtPassword.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    new AdminForm().setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Lỗi: Sai tên tài khoản hoặc mật khẩu Quản lý.");
                    txtUser.grabFocus();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Lỗi: Không thể kết nối đến SQL");
            }
        }
        if (cbRole.getSelectedIndex() == 0) {
            try {
                String Emp = "select * from Employee where UsernameEmp=? COLLATE SQL_Latin1_General_CP1_CS_AS and Password=? COLLATE SQL_Latin1_General_CP1_CS_AS";
                ps = con.prepareStatement(Emp);
                ps.setString(1, txtUser.getText());
                ps.setString(2, txtPassword.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    new BillForm(rs.getString("NameEmp")).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Lỗi: Sai tên tài khoản hoặc mật khẩu Nhân viên.");
                    txtUser.grabFocus();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Lỗi: Không thể kết nối đến máy chủ");
            }
        }
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
        jPanel3 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("image//back_Login.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        imgUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        imgPass = new javax.swing.JLabel();
        imgRole = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel3.setPreferredSize(new java.awt.Dimension(900, 490));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tài khoản:");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        imgPass.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Quyền truy cập:");

        cbRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhân viên", "Quản lý" }));
        cbRole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbRoleKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgRole)
                    .addComponent(imgPass)
                    .addComponent(imgUser))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imgUser)
                .addGap(46, 46, 46)
                .addComponent(imgPass)
                .addGap(46, 46, 46)
                .addComponent(imgRole)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           OK();
       }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           OK();
       }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void cbRoleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbRoleKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           OK();
       }
    }//GEN-LAST:event_cbRoleKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel imgPass;
    private javax.swing.JLabel imgRole;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

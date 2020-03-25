/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeManagement.gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tung
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    DefaultTableModel tblModel;
    Vector row;
    CoffeeManagement.server.DBHelper db = new CoffeeManagement.server.DBHelper();

    public Customer() {
        initComponents();
        ImageIcon img = new ImageIcon("src/CoffeeManagement/image/Customer.jpg");
        this.setIconImage(img.getImage());
        btnAdd.setSize(30, 30);
        new SetImage().setImageButton(btnAdd, "src/CoffeeManagement/image/floating-toucher_icon.png");
        btnUpdate.setSize(30, 30);
        new SetImage().setImageButton(btnUpdate, "src/CoffeeManagement/image/Setting-icon.png");
        btnDel.setSize(30, 30);
        new SetImage().setImageButton(btnDel, "src/CoffeeManagement/image/cross.png");
        btnReset.setSize(30, 30);
        new SetImage().setImageButton(btnReset, "src/CoffeeManagement/image/3a4a6aea2a19c76c632a9092e7fd9a3f.png");
        btnResetActionPerformed(null);
        tblModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        tblModel.addColumn("Mã thẻ");
        tblModel.addColumn("Số CMND");
        tblModel.addColumn("Họ và Tên");
        tblModel.addColumn("Ngày đăng ký");
        tblModel.addColumn("SĐT");
        tblModel.addColumn("Email");
        tblModel.addColumn("Số ly");
        tblModel.addColumn("Chiết khấu");
        tblCus.setModel(tblModel);
        ReloadTable();
        RdOffActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGr = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnInfomation = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbDis = new javax.swing.JLabel();
        lbQuantity = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lbLoiCMND = new javax.swing.JLabel();
        lbLoiName = new javax.swing.JLabel();
        lbLoiSDT = new javax.swing.JLabel();
        lbLoiEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCus = new javax.swing.JTable();
        RdOff = new javax.swing.JRadioButton();
        RdOn = new javax.swing.JRadioButton();
        lbSL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý thành viên");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Thẻ căn cước/CMND:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Họ và Tên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Thông tin thành viên");

        pnInfomation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Mã thẻ:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ngày đăng ký:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Số ly đã dùng:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Chiết khấu:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Thông tin thêm:");

        lbID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbID.setText("trống");

        lbDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDate.setText("trống");

        lbDis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDis.setText("trống");

        lbQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQuantity.setText("trống");

        javax.swing.GroupLayout pnInfomationLayout = new javax.swing.GroupLayout(pnInfomation);
        pnInfomation.setLayout(pnInfomationLayout);
        pnInfomationLayout.setHorizontalGroup(
            pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfomationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfomationLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQuantity))
                    .addGroup(pnInfomationLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDis))
                    .addComponent(jLabel12)
                    .addGroup(pnInfomationLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbID))
                    .addGroup(pnInfomationLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDate)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        pnInfomationLayout.setVerticalGroup(
            pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfomationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbDis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDel.setText("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel14.setText("Điều kiện Thêm/Cập nhật/Xóa: Thẻ căn cước/CMND gốc.");

        lbLoiCMND.setForeground(new java.awt.Color(255, 0, 0));

        lbLoiName.setForeground(new java.awt.Color(255, 0, 0));

        lbLoiSDT.setForeground(new java.awt.Color(255, 0, 0));

        lbLoiEmail.setForeground(new java.awt.Color(255, 0, 0));

        tblCus.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCus.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCus);

        btnGr.add(RdOff);
        RdOff.setSelected(true);
        RdOff.setText("Ẩn");
        RdOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdOffActionPerformed(evt);
            }
        });

        btnGr.add(RdOn);
        RdOn.setText("Hiện");
        RdOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdOnActionPerformed(evt);
            }
        });

        lbSL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSL.setText("(0 thành viên)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Bảng thành viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnInfomation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lbLoiCMND))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCMND))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbLoiName))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbLoiSDT)
                                            .addComponent(lbLoiEmail)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(6, 6, 6)
                                .addComponent(btnUpdate)
                                .addGap(6, 6, 6)
                                .addComponent(btnDel)
                                .addGap(6, 6, 6)
                                .addComponent(btnReset)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(lbSL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RdOn)
                        .addGap(18, 18, 18)
                        .addComponent(RdOff))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbSL)
                            .addComponent(RdOn)
                            .addComponent(RdOff))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(lbLoiCMND)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLoiName)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(lbLoiSDT)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbLoiEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDel)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnInfomation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCMND.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtCMND.setEnabled(true);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtEmail.setEnabled(false);
        pnInfomation.setVisible(false);
        lbID.setText("trống");
        lbDate.setText("trống");
        lbQuantity.setText("trống");
        lbDis.setText("trống");
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDel.setEnabled(false);
        lbLoiCMND.setText("");
        lbLoiName.setText("");
        lbLoiSDT.setText("");
        lbLoiEmail.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        while (true) {
            if (txtCMND.getText().trim().equals("")) {
                lbLoiCMND.setText("Số thẻ căn cước/CMND không được bỏ trống.");
                txtCMND.grabFocus();
                return;
            } else if (!txtCMND.getText().trim().matches("[0-9]+") || txtCMND.getText().trim().length() > 12 || txtCMND.getText().trim().length() < 9) {
                lbLoiCMND.setText("Số thẻ căn cước/CMND gồm 9-12 số.");
                txtCMND.grabFocus();
                return;
            } else {
                lbLoiCMND.setText("");
                break;
            }
        }
        try {
            ps = con.prepareStatement("select * from Customer where IdentityCard=?");
            ps.setString(1, txtCMND.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                lbLoiCMND.setText("");
                lbLoiName.setText("");
                lbLoiSDT.setText("");
                lbLoiEmail.setText("");
                txtName.setEnabled(false);
                txtCMND.setEnabled(false);
                txtPhone.setEnabled(true);
                txtEmail.setEnabled(true);
                txtCMND.setText(rs.getString(2));
                txtName.setText(rs.getString(3));
                txtPhone.setText(rs.getString(5));
                txtEmail.setText(rs.getString(6));

                lbID.setText(rs.getString(1));
                lbDate.setText(rs.getString(4));
                lbQuantity.setText(rs.getString(7) + " ly");
                lbDis.setText(rs.getString(8) + "%");

                btnAdd.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnDel.setEnabled(true);
                pnInfomation.setVisible(true);
            } else {
                txtCMND.setEnabled(true);
                txtName.setEnabled(true);
                txtPhone.setEnabled(true);
                txtEmail.setEnabled(true);
                String Name = txtName.getText().replaceAll("\\s+", " ");
                while (true) {
                    if (txtName.getText().trim().equals("")) {
                        lbLoiName.setText("Họ và tên không được bỏ trống.");
                        txtName.grabFocus();
                        return;
                    } else if (Name.length() > 30) {
                        lbLoiName.setText("Họ và tên chứa tối đa 30 kí tự.");
                        txtName.grabFocus();
                        return;
                    } else {
                        lbLoiName.setText("");
                        break;
                    }
                }
                while (true) {
                    if (txtPhone.getText().trim().equals("")) {
                        lbLoiSDT.setText("SĐT không được bỏ trống.");
                        txtPhone.grabFocus();
                        return;
                    } else if (txtPhone.getText().trim().length() > 11 || txtPhone.getText().trim().length() < 10) {
                        lbLoiSDT.setText("SĐT chứa từ 10-11 số.");
                        txtPhone.grabFocus();
                        return;
                    } else if (!txtPhone.getText().trim().matches("0[1-9]{1}\\d{8,9}")) {
                        lbLoiSDT.setText("SĐT chưa đúng định dạng.");
                        txtPhone.grabFocus();
                        return;
                    } else {
                        lbLoiSDT.setText("");
                        break;
                    }
                }
                while (true) {
                    if (txtEmail.getText().trim().equals("")) {
                        lbLoiEmail.setText("Email không được bỏ trống.");
                        txtEmail.grabFocus();
                        return;
                    } else if (!txtEmail.getText().trim().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                        lbLoiEmail.setText("Email chưa đúng định dạng.");
                        txtEmail.grabFocus();
                        return;
                    } else {
                        lbLoiEmail.setText("");
                        break;
                    }
                }
                ps = con.prepareStatement("Insert into Customer values(?,?,convert(varchar(20),getdate(),103),?,?,?,?)");
                ps.setString(1, txtCMND.getText().trim());
                ps.setString(2, Name);
                ps.setString(3, txtPhone.getText().trim());
                ps.setString(4, txtEmail.getText().trim());
                ps.setInt(5, 0);
                ps.setInt(6, 0);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Thêm thành viên thành công.");
                    btnAddActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thành viên thất bại.");
                }
                ReloadTable();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void RdOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdOnActionPerformed
        tblCus.setVisible(true);
    }//GEN-LAST:event_RdOnActionPerformed

    private void RdOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdOffActionPerformed
        tblCus.setVisible(false);
    }//GEN-LAST:event_RdOffActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        while (true) {
            if (txtPhone.getText().trim().equals("")) {
                lbLoiSDT.setText("SĐT không được bỏ trống.");
                txtPhone.grabFocus();
                return;
            } else if (txtPhone.getText().trim().length() > 11 || txtPhone.getText().trim().length() < 10) {
                lbLoiSDT.setText("SĐT chứa từ 10-11 số.");
                txtPhone.grabFocus();
                return;
            } else if (!txtPhone.getText().trim().matches("0[1-9]{1}\\d{8,9}")) {
                lbLoiSDT.setText("SĐT chưa đúng định dạng.");
                txtPhone.grabFocus();
                return;
            } else {
                lbLoiSDT.setText("");
                break;
            }
        }
        while (true) {
            if (txtEmail.getText().trim().equals("")) {
                lbLoiEmail.setText("Email không được bỏ trống.");
                txtEmail.grabFocus();
                return;
            } else if (!txtEmail.getText().trim().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                lbLoiEmail.setText("Email chưa đúng định dạng.");
                txtEmail.grabFocus();
                return;
            } else {
                lbLoiEmail.setText("");
                break;
            }
        }
        try {
            ps = con.prepareStatement("Update Customer set Phone=?,Email=? where IDCus=?");
            ps.setString(1, txtPhone.getText().trim());
            ps.setString(2, txtEmail.getText().trim());
            ps.setString(3, lbID.getText());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành viên thành công.");
                txtCMND.setEnabled(false);
                txtName.setEnabled(false);
                txtPhone.setEnabled(true);
                txtEmail.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thành viên thất bại.");
            }
            ReloadTable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn xóa thành viên này?");
        if (click == 0) {
            try {
                ps = con.prepareStatement("Delete from Customer where IDCus=?");
                ps.setString(1, lbID.getText());
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Xóa thành viên thành công.");
                    btnResetActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thành viên thất bại.");
                }
                ReloadTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
            }
        }
    }//GEN-LAST:event_btnDelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdOff;
    private javax.swing.JRadioButton RdOn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.ButtonGroup btnGr;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDis;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLoiCMND;
    private javax.swing.JLabel lbLoiEmail;
    private javax.swing.JLabel lbLoiName;
    private javax.swing.JLabel lbLoiSDT;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbSL;
    private javax.swing.JPanel pnInfomation;
    private javax.swing.JTable tblCus;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    private void ReloadTable() {
        con = db.getCon();
        tblModel.getDataVector().removeAllElements();
        try {
            ps = con.prepareStatement("select * from Customer order by IDCus DESC");
            rs = ps.executeQuery();
            while (rs.next()) {
                row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5));
                row.add(rs.getString(6));
                row.add(rs.getString(7));
                row.add(rs.getString(8));
                tblModel.addRow(row);
            }
            tblCus.setModel(tblModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
        }
        lbSL.setText("(" + tblCus.getRowCount() + " thành viên)");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_giaodien;

import b_chucnang.sanPhamBus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import qlsanpham.myStore5;

/**
 *
 * @author graze
 */
public class addDetailForm extends javax.swing.JFrame {

    public sanPhamBus getBus() {
        return bus;
    }

    public addHOADONPHIEUNHAP getAdd() {
        return add;
    }

    public addCT getCt() {
        return ct;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnAddEdit() {
        return btnAddEdit;
    }

    public JButton getBtnDel() {
        return btnDel;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnRefesh() {
        return btnRefesh;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JButton getBtnShowAll() {
        return btnShowAll;
    }

    public JButton getBtnTong() {
        return btnTong;
    }

    public JButton getBtnXoa() {
        return btnXoa;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JComboBox<String> getCbbCell1() {
        return cbbCell1;
    }

    public JComboBox<String> getCbbCell2() {
        return cbbCell2;
    }

    public JComboBox<String> getCbbCell3() {
        return cbbCell3;
    }

    public JCheckBox getCbxEdit() {
        return cbxEdit;
    }

    public JCheckBox getCbxOK() {
        return cbxOK;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JLabel getLblCell1() {
        return lblCell1;
    }

    public JLabel getLblCell10() {
        return lblCell10;
    }

    public JLabel getLblCell11() {
        return lblCell11;
    }

    public JLabel getLblCell12() {
        return lblCell12;
    }

    public JLabel getLblCell13() {
        return lblCell13;
    }

    public JLabel getLblCell14() {
        return lblCell14;
    }

    public JLabel getLblCell15() {
        return lblCell15;
    }

    public JLabel getLblCell16() {
        return lblCell16;
    }

    public JLabel getLblCell17() {
        return lblCell17;
    }

    public JLabel getLblCell2() {
        return lblCell2;
    }

    public JLabel getLblCell3() {
        return lblCell3;
    }

    public JLabel getLblCell4() {
        return lblCell4;
    }

    public JLabel getLblCell5() {
        return lblCell5;
    }

    public JLabel getLblCell6() {
        return lblCell6;
    }

    public JLabel getLblCell7() {
        return lblCell7;
    }

    public JLabel getLblCell8() {
        return lblCell8;
    }

    public JLabel getLblCell9() {
        return lblCell9;
    }

    public JLabel getLblInfo1() {
        return lblInfo1;
    }

    public JLabel getLblInfo2() {
        return lblInfo2;
    }

    public JLabel getLblTableName() {
        return lblTableName;
    }

    public JPanel getPnlCenter() {
        return pnlCenter;
    }

    public JPanel getPnlCenter1() {
        return pnlCenter1;
    }

    public JPanel getPnlCenter2() {
        return pnlCenter2;
    }

    public JRadioButton getRadChoose1() {
        return radChoose1;
    }

    public JRadioButton getRadChoose2() {
        return radChoose2;
    }

    public JRadioButton getRadChoose3() {
        return radChoose3;
    }

    public JRadioButton getRadChoose4() {
        return radChoose4;
    }

    public JTable getTblDetail() {
        return tblDetail;
    }

    public JTable getTblTable() {
        return tblTable;
    }

    public JTextField getTxfCell1() {
        return txfCell1;
    }

    public JTextField getTxfCell10() {
        return txfCell10;
    }

    public JTextField getTxfCell11() {
        return txfCell11;
    }

    public JTextField getTxfCell12() {
        return txfCell12;
    }

    public JTextField getTxfCell13() {
        return txfCell13;
    }

    public JTextField getTxfCell14() {
        return txfCell14;
    }

    public JTextField getTxfCell2() {
        return txfCell2;
    }

    public JTextField getTxfCell3() {
        return txfCell3;
    }

    public JTextField getTxfCell4() {
        return txfCell4;
    }

    public JTextField getTxfCell5() {
        return txfCell5;
    }

    public JTextField getTxfCell6() {
        return txfCell6;
    }

    public JTextField getTxfCell7() {
        return txfCell7;
    }

    public JTextField getTxfCell8() {
        return txfCell8;
    }

    public JTextField getTxfCell9() {
        return txfCell9;
    }

    public JTextField getTxfSearch() {
        return txfSearch;
    }

    /**
     * Creates new form addDetailForm
     */
    sanPhamBus bus = new sanPhamBus();
    addHOADONPHIEUNHAP add = new addHOADONPHIEUNHAP();
    addCT ct = new addCT();

    public addDetailForm() {
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setLocation(160, 10);
        radChoose1.setSelected(true);
        txfCell13.setEditable(false);
        txfCell14.setEditable(false);
        cbxOK.setSelected(false);

        add.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (add.getLblTable().getText().equals("hoadon") || add.getLblTable().getText().equals("phieunhap")) {
                    if (bus.IsNumber(add.getTxfCell5().getText()) && bus.IsDate(add.getTxfCell4().getText())) {
                        if (bus.checkDate(add.getTxfCell4().getText())) {
                            myStore5 obj = new myStore5(bus.autoInsertCode(add.getLblTable().getText()), add.getCbbMa1().getSelectedItem().toString(), add.getCbbMa2().getSelectedItem().toString(), bus.getDate(add.getTxfCell4().getText()), add.getTxfCell5().getText());
                            bus.insertForFive(add.getLblTable().getText(), obj);
                        }
                    } else if (!bus.IsDate(add.getTxfCell4().getText())) {
                        JOptionPane.showMessageDialog(null, "NGÀY nhập sai cú pháp, vui lòng nhập theo dạng yyyy-MM-dd ...");
                    } else if (!bus.IsNumber(add.getTxfCell5().getText())) {
                        JOptionPane.showMessageDialog(null, "TỔNG TIỀN sai cú pháp, xin vui lòng nhập lại...");
                    }
                }
                tblTable.setModel(bus.docDuLieu(add.getLblTable().getText()));
                cbbCell1.setModel(bus.themOption(tblTable, 0));
            }
        });

        ct.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //myStore5 obj = new myStore5(ct.getCbbMA().getSelectedItem().toString(), ct.getCbbMASP().getSelectedItem().toString(), ct.getSpnSoLuong().getValue().toString(), ct.getTxfGia().getText(), ct.getTxfTotal().getText());
                String total = "";
                if (lblTableName.getText().equals("HÓA ĐƠN")) {
                    myStore5 obj = new myStore5(ct.getCbbMA().getSelectedItem().toString(), ct.getCbbMASP().getSelectedItem().toString(), ct.getSpnSoLuong().getValue().toString(), ct.getTxfGia().getText(), ct.getTxfTotal().getText());
                    bus.insertForFive("ct_hoadon", obj);
                    total = bus.getTotalPrice(ct.getLblTableName().getText(), ct.getCbbMA().getSelectedItem().toString(), 1);
                    bus.countTotalPrice(ct.getLblTableName().getText(), total, ct.getCbbMA().getSelectedItem().toString());
                    tblTable.setModel(bus.docDuLieu("hoadon"));

                } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
                    myStore5 obj = new myStore5(ct.getCbbMA().getSelectedItem().toString(), ct.getCbbMASP().getSelectedItem().toString(), ct.getSpnSoLuong().getValue().toString(), ct.getTxfGia().getText(), ct.getTxfTotal().getText());
                    bus.insertForFive("ct_phieunhap", obj);
                    total = bus.getTotalPrice(ct.getLblTableName().getText(), ct.getCbbMA().getSelectedItem().toString(), 2);
                    bus.countTotalPrice(ct.getLblTableName().getText(), total, ct.getCbbMA().getSelectedItem().toString());
                    tblTable.setModel(bus.docDuLieu("phieunhap"));
                }
                tblDetail.setModel(bus.search(ct.getLblTableName().getText(), ct.getCbbMA().getSelectedItem().toString()));
            }
        });

        ct.getBtnEdit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!ct.getCbxEdit().isSelected()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhấn chọn 'Chỉnh sửa' để thực hiện chức năng này...!");
                } else {
                    if (ct.getTxfGia().getText().equals("0") || ct.getTxfTotal().getText().equals("0") || ct.getSpnSoLuong().getValue().toString().equals("0")) {
                        JOptionPane.showMessageDialog(null, "Nội dung không được để không, vui lòng cập nhật dữ liệu mới.");
                    } else if (ct.getLblTableName().getText().equals("ct_hoadon")) {
                        myStore5 obj = new myStore5(ct.getCbbMA().getSelectedItem().toString(), ct.getCbbMASP().getSelectedItem().toString(), ct.getSpnSoLuong().getValue().toString(), ct.getTxfGia().getText(), ct.getTxfTotal().getText());
                        bus.editForFive("ct_hoadon", obj);
                    } else {
                        myStore5 obj = new myStore5(ct.getCbbMA().getSelectedItem().toString(), ct.getCbbMASP().getSelectedItem().toString(), ct.getSpnSoLuong().getValue().toString(), ct.getTxfGia().getText(), ct.getTxfTotal().getText());
                        bus.editForFive("ct_phieunhap", obj);
                    }
                    tblDetail.setModel(bus.search(ct.getLblTableName().getText(), ct.getCbbMA().getSelectedItem().toString()));
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTableName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCell9 = new javax.swing.JLabel();
        lblCell10 = new javax.swing.JLabel();
        lblCell11 = new javax.swing.JLabel();
        lblCell12 = new javax.swing.JLabel();
        lblCell13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        radChoose1 = new javax.swing.JRadioButton();
        radChoose2 = new javax.swing.JRadioButton();
        radChoose3 = new javax.swing.JRadioButton();
        radChoose4 = new javax.swing.JRadioButton();
        txfCell13 = new javax.swing.JTextField();
        txfCell14 = new javax.swing.JTextField();
        cbbCell1 = new javax.swing.JComboBox<>();
        cbbCell2 = new javax.swing.JComboBox<>();
        cbbCell3 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        cbxEdit = new javax.swing.JCheckBox();
        btnTong = new javax.swing.JButton();
        cbxOK = new javax.swing.JCheckBox();
        pnlCenter = new javax.swing.JPanel();
        lblCell5 = new javax.swing.JLabel();
        lblCell6 = new javax.swing.JLabel();
        txfCell5 = new javax.swing.JTextField();
        txfCell6 = new javax.swing.JTextField();
        lblCell7 = new javax.swing.JLabel();
        txfCell7 = new javax.swing.JTextField();
        lblCell8 = new javax.swing.JLabel();
        txfCell8 = new javax.swing.JTextField();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnAddEdit = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        pnlCenter1 = new javax.swing.JPanel();
        lblCell14 = new javax.swing.JLabel();
        lblCell15 = new javax.swing.JLabel();
        lblCell16 = new javax.swing.JLabel();
        lblCell17 = new javax.swing.JLabel();
        txfCell9 = new javax.swing.JTextField();
        txfCell10 = new javax.swing.JTextField();
        txfCell11 = new javax.swing.JTextField();
        txfCell12 = new javax.swing.JTextField();
        pnlCenter2 = new javax.swing.JPanel();
        lblCell1 = new javax.swing.JLabel();
        lblCell2 = new javax.swing.JLabel();
        lblCell3 = new javax.swing.JLabel();
        lblCell4 = new javax.swing.JLabel();
        txfCell1 = new javax.swing.JTextField();
        txfCell3 = new javax.swing.JTextField();
        txfCell2 = new javax.swing.JTextField();
        txfCell4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDetail);

        jLabel5.setBackground(new java.awt.Color(102, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("DANH SÁCH BẢNG");

        jLabel6.setBackground(new java.awt.Color(102, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText(" NỘI DUNG CHI TIẾT");

        lblTableName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTableName.setForeground(new java.awt.Color(153, 0, 0));
        lblTableName.setText("HÓA ĐƠN");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCell9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell9.setText("MÃ HÓA ĐƠN");

        lblCell10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell10.setText("MÃ NHÂN VIÊN");

        lblCell11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell11.setText("MÃ NHÀ SX");

        lblCell12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell12.setText("NGÀY BÁN");

        lblCell13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell13.setText("TỔNG TIỀN");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("TÌM KIẾM");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        btnSearch.setText("TÌM KIẾM");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(radChoose1);
        radChoose1.setText("THEO MÃ HĐ");

        buttonGroup1.add(radChoose2);
        radChoose2.setText("THEO MÃ NV");

        buttonGroup1.add(radChoose3);
        radChoose3.setText("THEO MÃ NSX");

        buttonGroup1.add(radChoose4);
        radChoose4.setText("THEO NGÀY");

        cbbCell1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbCell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCell1ActionPerformed(evt);
            }
        });

        cbbCell2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbCell3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ADD.png"))); // NOI18N
        btnAdd.setText("THÊM MỚI");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.setText("SỬA ĐỔI");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.png"))); // NOI18N
        btnDel.setText("XÓA BỎ");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ref.png"))); // NOI18N
        btnRefesh.setText("CẬP NHẬT");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        cbxEdit.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cbxEdit.setText("Chỉnh sửa nội dung");
        cbxEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEditActionPerformed(evt);
            }
        });

        btnTong.setBackground(new java.awt.Color(204, 204, 204));
        btnTong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTong.setForeground(new java.awt.Color(153, 0, 0));
        btnTong.setText("TÍNH TỔNG");
        btnTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongActionPerformed(evt);
            }
        });

        cbxOK.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cbxOK.setText("Xác nhận đơn hàng");
        cbxOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSearch)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radChoose1)
                                .addGap(18, 18, 18)
                                .addComponent(radChoose2)
                                .addGap(18, 18, 18)
                                .addComponent(radChoose3)
                                .addGap(18, 18, 18)
                                .addComponent(radChoose4)
                                .addGap(0, 102, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCell13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfCell14))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCell12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfCell13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCell9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbCell1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCell11)
                                            .addComponent(lblCell10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbCell2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbCell3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTong, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefesh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDel))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDel, btnEdit});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCell10, lblCell11, lblCell12, lblCell13, lblCell9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radChoose1, radChoose2, radChoose3, radChoose4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbbCell1, cbbCell2, cbbCell3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radChoose1)
                    .addComponent(radChoose2)
                    .addComponent(radChoose3)
                    .addComponent(radChoose4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbCell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEdit)
                    .addComponent(btnRefesh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbCell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(cbbCell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell12)
                    .addComponent(txfCell13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell13)
                    .addComponent(txfCell14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel)
                    .addComponent(btnTong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnTong, cbbCell1, cbbCell2, cbbCell3, jLabel19, lblCell11, lblCell12, lblCell13, txfCell13, txfCell14, txfSearch});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRefesh, lblCell9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDel, btnEdit});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radChoose1, radChoose2, radChoose3, radChoose4});

        pnlCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCell5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell5.setText("MÃ SẢN PHẨM");

        lblCell6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell6.setText("TÊN SẢN PHẨM");

        txfCell5.setEditable(false);

        txfCell6.setEditable(false);

        lblCell7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell7.setText("SỐ LƯỢNG");

        txfCell7.setEditable(false);

        lblCell8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell8.setText("ĐƠN GIÁ");

        txfCell8.setEditable(false);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCell5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCell6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCell7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCell8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfCell6)
                    .addComponent(txfCell7)
                    .addComponent(txfCell5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCell8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );

        pnlCenterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCell5, lblCell6, lblCell7, lblCell8});

        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCenterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCell5, lblCell6, lblCell7, lblCell8, txfCell5, txfCell6, txfCell7, txfCell8});

        lblInfo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo1.setForeground(new java.awt.Color(153, 0, 0));
        lblInfo1.setText("THÔNG TIN KHÁCH HÀNG");

        lblInfo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo2.setForeground(new java.awt.Color(153, 0, 0));
        lblInfo2.setText("THÔNG TIN SẢN PHẨM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quit.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAddEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddEdit.setForeground(new java.awt.Color(0, 0, 153));
        btnAddEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detail.png"))); // NOI18N
        btnAddEdit.setText("CHỈNH SỬA/THÊM MỚI CHI TIẾT");
        btnAddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnShowAll.setText("Hiện tất cả");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        pnlCenter1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCell14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell14.setText("MÃ NHÂN VIÊN");

        lblCell15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell15.setText("TÊN NHÂN VIÊN");

        lblCell16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell16.setText("ĐỊA CHỈ");

        lblCell17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell17.setText("SĐT");

        txfCell9.setEditable(false);

        txfCell10.setEditable(false);

        txfCell11.setEditable(false);

        txfCell12.setEditable(false);

        javax.swing.GroupLayout pnlCenter1Layout = new javax.swing.GroupLayout(pnlCenter1);
        pnlCenter1.setLayout(pnlCenter1Layout);
        pnlCenter1Layout.setHorizontalGroup(
            pnlCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenter1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCell16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCell15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCell14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lblCell17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfCell10)
                    .addComponent(txfCell11)
                    .addComponent(txfCell9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCell12, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        pnlCenter1Layout.setVerticalGroup(
            pnlCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenter1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenter1Layout.createSequentialGroup()
                        .addComponent(txfCell9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenter1Layout.createSequentialGroup()
                        .addComponent(lblCell14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCenter1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCell14, lblCell15, lblCell16, lblCell17, txfCell10, txfCell11, txfCell12, txfCell9});

        pnlCenter2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCell1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell1.setText("MÃ SẢN PHẨM");

        lblCell2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell2.setText("TÊN SẢN PHẨM");

        lblCell3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell3.setText("SỐ LƯỢNG");

        lblCell4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell4.setText("ĐƠN GIÁ");

        txfCell1.setEditable(false);

        txfCell3.setEditable(false);

        txfCell2.setEditable(false);

        txfCell4.setEditable(false);

        javax.swing.GroupLayout pnlCenter2Layout = new javax.swing.GroupLayout(pnlCenter2);
        pnlCenter2.setLayout(pnlCenter2Layout);
        pnlCenter2Layout.setHorizontalGroup(
            pnlCenter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenter2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCell2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lblCell3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCell4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCell1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfCell2)
                    .addComponent(txfCell3)
                    .addComponent(txfCell1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCell4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        pnlCenter2Layout.setVerticalGroup(
            pnlCenter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenter2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenter2Layout.createSequentialGroup()
                        .addComponent(txfCell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCell4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenter2Layout.createSequentialGroup()
                        .addComponent(lblCell1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlCenter2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCell1, lblCell2, lblCell3, lblCell4, txfCell1, txfCell2, txfCell3, txfCell4});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddEdit))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(lblInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCenter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCenter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCenter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCenter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblInfo1, lblTableName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnShowAll, jLabel6, lblInfo2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (!cbxEdit.isSelected()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhấn chọn 'Chỉnh sửa' để thực hiện chức năng này...!");
        } else if (txfCell13.getText().equals("") || txfCell14.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ dữ liệu ! Vui lòng cập nhật...");

        } else if (bus.IsNumber(txfCell14.getText()) && bus.IsDate(txfCell13.getText())) {

            if (lblTableName.getText().equals("HÓA ĐƠN")) {
                myStore5 obj = new myStore5(cbbCell1.getSelectedItem().toString(), cbbCell2.getSelectedItem().toString(), cbbCell3.getSelectedItem().toString(), bus.getDate(txfCell13.getText()), txfCell14.getText());
                bus.editForFive("hoadon", obj);
                tblTable.setModel(bus.docDuLieu("hoadon"));

            }

            if (lblTableName.getText().equals("PHIẾU NHẬP")) {
                myStore5 obj = new myStore5(cbbCell1.getSelectedItem().toString(), cbbCell2.getSelectedItem().toString(), cbbCell3.getSelectedItem().toString(), bus.getDate(txfCell13.getText()), txfCell14.getText());
                bus.editForFive("phieunhap", obj);
                tblTable.setModel(bus.docDuLieu("phieunhap"));
            }

        } else if (!bus.IsDate(txfCell13.getText())) {
            JOptionPane.showMessageDialog(null, "NGÀY nhập sai cú pháp, vui lòng nhập theo dạng yyyy-MM-dd ...");

        } else if (!bus.IsNumber(txfCell3.getText())) {
            JOptionPane.showMessageDialog(null, "TỔNG TIỀN sai cú pháp, xin vui lòng nhập lại...");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String lbl = "";
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            lbl = "hoadon";
        } else {
            lbl = "phieunhap";
        }

        if (radChoose1.isSelected()) {
            tblTable.setModel(bus.search(lbl, txfSearch, 1));
        } else if (radChoose2.isSelected()) {
            tblTable.setModel(bus.search(lbl, txfSearch, 2));
        } else if (radChoose3.isSelected()) {
            tblTable.setModel(bus.search(lbl, txfSearch, 3));
        } else if (radChoose4.isSelected()) {
            tblTable.setModel(bus.search(lbl, txfSearch, 4));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbxEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEditActionPerformed
        // TODO add your handling code here:
        if (cbxEdit.isSelected()) {
            txfCell13.setEditable(true);
            txfCell14.setEditable(true);
        } else {
            txfCell13.setEditable(false);
            txfCell14.setEditable(false);
        }
    }//GEN-LAST:event_cbxEditActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            if (tblTable.getValueAt(tblTable.getSelectedRow(), 5).toString().equals("OK")) {
                cbxOK.setSelected(true);
            } else {
                cbxOK.setSelected(false);
            }
        }
        bus.getDataFromMainTable(tblDetail, lblTableName.getText(), tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString());
        cbbCell1.setSelectedItem(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0));
        cbbCell2.setSelectedItem(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 1));
        cbbCell3.setSelectedItem(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 2));
        txfCell13.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 3).toString());
        txfCell14.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 4).toString());


    }//GEN-LAST:event_tblTableMouseClicked

    private void tblDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailMouseClicked
        // TODO add your handling code here:
        String maNSX_KH = bus.getInfoForTableDetail(lblTableName.getText(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 0).toString(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 1).toString()).getValueAt(0, 0).toString();
        String maSP = bus.getInfoForTableDetail(lblTableName.getText(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 0).toString(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 1).toString()).getValueAt(0, 1).toString();
        String maNV = bus.getInfoForTableDetail(lblTableName.getText(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 0).toString(), tblDetail.getValueAt(tblDetail.getSelectedRow(), 1).toString()).getValueAt(0, 2).toString();

        //Thêm vào b?ng thông tin khách hàng ho?c nhà s?n xu?t
        bus.getDataForTextField(lblTableName.getText(), maNSX_KH, txfCell1, 2, 0);
        bus.getDataForTextField(lblTableName.getText(), maNSX_KH, txfCell2, 2, 1);
        bus.getDataForTextField(lblTableName.getText(), maNSX_KH, txfCell3, 2, 2);
        bus.getDataForTextField(lblTableName.getText(), maNSX_KH, txfCell4, 2, 3);
        //Thêm vào b?ng thông tin s?n ph?m
        bus.getDataForTextField(lblTableName.getText(), maSP, txfCell5, 1, 0);
        bus.getDataForTextField(lblTableName.getText(), maSP, txfCell6, 1, 1);
        bus.getDataForTextField(lblTableName.getText(), maSP, txfCell7, 1, 3);
        bus.getDataForTextField(lblTableName.getText(), maSP, txfCell8, 1, 4);
        //Thêm vào b?ng thông tin nhân viên
        bus.getDataForTextField(lblTableName.getText(), maNV, txfCell9, 3, 0);
        bus.getDataForTextField(lblTableName.getText(), maNV, txfCell10, 3, 1);
        bus.getDataForTextField(lblTableName.getText(), maNV, txfCell11, 3, 3);
        bus.getDataForTextField(lblTableName.getText(), maNV, txfCell12, 3, 4);

    }//GEN-LAST:event_tblDetailMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            tblTable.setModel(bus.docDuLieu("hoadon"));
            cbbCell1.setModel(bus.themOption(tblTable, 0));
        } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
            tblTable.setModel(bus.docDuLieu("phieunhap"));
            cbbCell1.setModel(bus.themOption(tblTable, 0));
        }
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (lblTableName.getText().equals("PHIẾU NHẬP")) {
            add.getLblCell2().setText("MÃ NHÂN VIÊN");
            add.getLblCell3().setText("MÃ NHÀ SX");
            add.getLblCell4().setText("NGÀY NHẬP");
            add.getLblCell5().setText("TỔNG TIỀN");
            add.getLblTable().setText("phieunhap");
            bus.themOptionAdvances(add.getCbbMa1(), "nhanvien");
            bus.themOptionAdvances(add.getCbbMa2(), "nhasanxuat");
            add.setVisible(true);

        } else if (lblTableName.getText().equals("HÓA ĐƠN")) {
            add.getLblCell2().setText("MÃ NHÂN VIÊN");
            add.getLblCell3().setText("MÃ KHÁCH HÀNG");
            add.getLblCell4().setText("NGÀY BÁN");
            add.getLblCell5().setText("TỔNG TIỀN");
            add.getLblTable().setText("hoadon");
            bus.themOptionAdvances(add.getCbbMa1(), "nhanvien");
            bus.themOptionAdvances(add.getCbbMa2(), "khachhang");
            add.setVisible(true);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        try {
            if (tblDetail.getRowCount() == 0) {
                if (lblTableName.getText().equals("HÓA ĐƠN")) {
                    bus.delete("hoadon", tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString());
                    tblTable.setModel(bus.docDuLieu("hoadon"));
                } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
                    bus.delete("phieunhap", tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString());
                    tblTable.setModel(bus.docDuLieu("phieunhap"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hãy xóa sạch bảng chi tiết trước khi thực hiện...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bảng hiện tại đã rỗng...");
        }

    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditActionPerformed
        // TODO add your handling code here:
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            ct.getLblMa().setText("MÃ HÓA ĐƠN");
            ct.getLblTableName().setText("ct_hoadon");
            ct.getLblGia().setText("GIÁ BÁN");
            ct.getTxfGia().setText("0");
            ct.getTxfTotal().setText("0");
            bus.themOptionAdvances(ct.getCbbMA(), "hoadon");
            bus.themOptionAdvances(ct.getCbbMASP(), "sanpham");

        } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
            ct.getLblMa().setText("MÃ PHIẾU NHẬP");
            ct.getLblTableName().setText("ct_phieunhap");
            ct.getLblGia().setText("GIÁ NHẬP");
            ct.getTxfGia().setText("0");
            ct.getTxfTotal().setText("0");
            bus.themOptionAdvances(ct.getCbbMA(), "phieunhap");
            bus.themOptionAdvances(ct.getCbbMASP(), "sanpham");
        }
        ct.setVisible(true);


    }//GEN-LAST:event_btnAddEditActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            if (lblTableName.getText().equals("HÓA ĐƠN")) {
                bus.delete("ct_hoadon", tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(), 0).toString(), tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(), 1).toString());
                tblDetail.setModel(bus.docDuLieu("ct_hoadon"));
            } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
                bus.delete("ct_phieunhap", tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(), 0).toString(), tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(), 1).toString());
                tblDetail.setModel(bus.docDuLieu("ct_phieunhap"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bảng hiện tại đã rỗng...");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // TODO add your handling code here:
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            //bus.delete("ct_hoadon", tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(),0).toString(), tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(),1).toString());
            tblDetail.setModel(bus.docDuLieu("ct_hoadon"));
        } else if (lblTableName.getText().equals("PHIẾU NHẬP")) {
            //bus.delete("ct_phieunhap", tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(),0).toString(),tblDetail.getModel().getValueAt(tblDetail.getSelectedRow(),1).toString());
            tblDetail.setModel(bus.docDuLieu("ct_phieunhap"));
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongActionPerformed
        // TODO add your handling code here:
        if (tblDetail.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Danh sách bảng chi tiết rỗng, vui lòng cập nhật...");
        } else if (lblTableName.getText().equals("HÓA ĐƠN")) {
            txfCell14.setText(bus.getTotalPrice("ct_hoadon", cbbCell1.getSelectedItem().toString(), 1));
        } else {
            txfCell14.setText(bus.getTotalPrice("ct_phieunhap", cbbCell1.getSelectedItem().toString(), 2));
        }
    }//GEN-LAST:event_btnTongActionPerformed

    private void cbbCell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCell1ActionPerformed
        // TODO add your handling code here:
        if (lblTableName.getText().equals("HÓA ĐƠN")) {
            bus.docDuLieuCombobox(cbbCell1, "hoadon", cbbCell2, 1);
            bus.docDuLieuCombobox(cbbCell1, "hoadon", cbbCell3, 2);
            bus.docDuLieuCombobox(cbbCell1, "hoadon", txfCell13, 3);
            bus.docDuLieuCombobox(cbbCell1, "hoadon", txfCell14, 4);
        } else {
            bus.docDuLieuCombobox(cbbCell1, "phieunhap", cbbCell2, 1);
            bus.docDuLieuCombobox(cbbCell1, "phieunhap", cbbCell3, 2);
            bus.docDuLieuCombobox(cbbCell1, "phieunhap", txfCell13, 3);
            bus.docDuLieuCombobox(cbbCell1, "phieunhap", txfCell14, 4);
        }
    }//GEN-LAST:event_cbbCell1ActionPerformed

    private void cbxOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOKActionPerformed
        // TODO add your handling code here:  
        if (cbxOK.isSelected()) {
            int question = JOptionPane.showConfirmDialog(null, "Xác nhận đơn hàng ?", "Xác nhận đơn hàng", JOptionPane.YES_NO_OPTION);
            if (question == JOptionPane.YES_OPTION) {

                if (tblDetail.getRowCount() > 0) {
                    cbxOK.setSelected(true);
                    bus.editStateOfBill(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString(), "OK");
                    for (int i = 0; i < tblDetail.getRowCount(); i++) {
                        String mahd = tblDetail.getModel().getValueAt(i, 0).toString();
                        String masp = tblDetail.getModel().getValueAt(i, 1).toString();
                        bus.setTheNewNumberForProduct(mahd, masp, i, bus.NEW);
                    }
                    tblTable.setModel(bus.docDuLieu("hoadon"));

                } else {
                    JOptionPane.showMessageDialog(null, "Danh sách chi tiết đang rỗng, vui lòng cập nhật dữ liệu trước...");
                    cbxOK.setSelected(false);
                }

            } else {
                cbxOK.setSelected(false);
                tblTable.setModel(bus.docDuLieu("hoadon"));
            }

        } else if (!cbxOK.isSelected()) {

            int question = JOptionPane.showConfirmDialog(null, "Hủy xác nhận đơn hàng ?", "Xác nhận đơn hàng", JOptionPane.YES_NO_OPTION);
            if (question == JOptionPane.YES_OPTION) {
                cbxOK.setSelected(false);
                bus.editStateOfBill(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString(), "-----");

                for (int i = 0; i < tblDetail.getRowCount(); i++) {
                    String mahd = tblDetail.getModel().getValueAt(i, 0).toString();
                    String masp = tblDetail.getModel().getValueAt(i, 1).toString();
                    bus.setTheNewNumberForProduct(mahd, masp, i, bus.OLD);
                }

                tblTable.setModel(bus.docDuLieu("hoadon"));
            } else {
                cbxOK.setSelected(true);
                tblTable.setModel(bus.docDuLieu("hoadon"));
            }
        }
    }//GEN-LAST:event_cbxOKActionPerformed

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
            java.util.logging.Logger.getLogger(addDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDetailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddEdit;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnTong;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbCell1;
    private javax.swing.JComboBox<String> cbbCell2;
    private javax.swing.JComboBox<String> cbbCell3;
    private javax.swing.JCheckBox cbxEdit;
    private javax.swing.JCheckBox cbxOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCell1;
    private javax.swing.JLabel lblCell10;
    private javax.swing.JLabel lblCell11;
    private javax.swing.JLabel lblCell12;
    private javax.swing.JLabel lblCell13;
    private javax.swing.JLabel lblCell14;
    private javax.swing.JLabel lblCell15;
    private javax.swing.JLabel lblCell16;
    private javax.swing.JLabel lblCell17;
    private javax.swing.JLabel lblCell2;
    private javax.swing.JLabel lblCell3;
    private javax.swing.JLabel lblCell4;
    private javax.swing.JLabel lblCell5;
    private javax.swing.JLabel lblCell6;
    private javax.swing.JLabel lblCell7;
    private javax.swing.JLabel lblCell8;
    private javax.swing.JLabel lblCell9;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblTableName;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCenter1;
    private javax.swing.JPanel pnlCenter2;
    private javax.swing.JRadioButton radChoose1;
    private javax.swing.JRadioButton radChoose2;
    private javax.swing.JRadioButton radChoose3;
    private javax.swing.JRadioButton radChoose4;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txfCell1;
    private javax.swing.JTextField txfCell10;
    private javax.swing.JTextField txfCell11;
    private javax.swing.JTextField txfCell12;
    private javax.swing.JTextField txfCell13;
    private javax.swing.JTextField txfCell14;
    private javax.swing.JTextField txfCell2;
    private javax.swing.JTextField txfCell3;
    private javax.swing.JTextField txfCell4;
    private javax.swing.JTextField txfCell5;
    private javax.swing.JTextField txfCell6;
    private javax.swing.JTextField txfCell7;
    private javax.swing.JTextField txfCell8;
    private javax.swing.JTextField txfCell9;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}

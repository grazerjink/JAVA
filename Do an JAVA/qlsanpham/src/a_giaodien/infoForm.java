/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_giaodien;

import b_chucnang.sanPhamBus;
import c_csdl.sanPhamDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import qlsanpham.myStore4;
import qlsanpham.myStore5;

/**
 *
 * @author graze
 */
public class infoForm extends javax.swing.JFrame {

    /**
     * Creates new form infoForm
     */
    sanPhamDAO dao = new sanPhamDAO();
    sanPhamBus bus = new sanPhamBus();
    addProductForm add = new addProductForm();
    addProductForm2 add2 = new addProductForm2();
    addDetailForm chitiet = new addDetailForm();
    tkeForm tk = new tkeForm();
    tkeFormByDate tkDate = new tkeFormByDate();
    tkeChiThuForm tkCT = new tkeChiThuForm();
    tkeLaiLo lailo = new tkeLaiLo();
    saveForm save = new saveForm();

    public infoForm() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(150, 0);
        setTitle("PHẦN MỀM QUẢN LÍ BÁN HÀNG - MADE BY KAIJUN");
        setResizable(false);

        radTKHD1.setSelected(true);
        radChoose1.setSelected(true);
        cbxEdit.setSelected(false);
        txfCell2.setEditable(false);
        txfCell3.setEditable(false);
        txfCell4.setEditable(false);
        txfCell5.setEditable(false);

        //Hàm tạo chức năng thêm cho addProductForm
        add.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (add.getTxfCell2().getText().equals("") || add.getTxfCell3().getText().equals("") || add.getTxfCell4().getText().equals("") || add.getTxfCell5().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ dữ liệu ! Vui lòng cập nhật...");
                } else {
                    //Hàm kiểm tra đầu vào
                    if (add.getLblTable().getText().equals("sanpham")) {

                        if (bus.IsNumber(add.getTxfCell4().getText()) && bus.IsNumber(add.getTxfCell5().getText())) {
                            myStore5 obj = new myStore5(bus.autoInsertCode(lblTable.getText()), add.getTxfCell2().getText(), add.getTxfCell3().getText(), add.getTxfCell4().getText(), add.getTxfCell5().getText());
                            bus.insertForFive(lblTable.getText(), obj);
                        } else {
                            JOptionPane.showMessageDialog(null, "SỐ LƯỢNG hoặc ĐƠN GIÁ sai cú pháp, xin vui lòng nhập lại...");
                        }
                    }

                    //Hàm kiểm tra đầu vào
                    if (lblTable.getText().equals("nhanvien")) {

                        if (bus.IsPhoneNumber(add.getTxfCell5().getText()) && bus.IsDate(add.getTxfCell3().getText())) {
                            if (bus.checkDate(add.getTxfCell3().getText())) {
                                myStore5 obj = new myStore5(bus.autoInsertCode(lblTable.getText()), add.getTxfCell2().getText(), bus.getDate(add.getTxfCell3().getText()), add.getTxfCell4().getText(), add.getTxfCell5().getText());
                                bus.insertForFive(lblTable.getText(), obj);
                            }
                        } else if (!bus.IsDate(add.getTxfCell3().getText())) {
                            JOptionPane.showMessageDialog(null, "NGÀY SINH sai cú pháp, vui lòng nhập theo dạng yyyy-MM-dd ...");
                        } else if (!bus.IsPhoneNumber(add.getTxfCell5().getText())) {
                            JOptionPane.showMessageDialog(null, "SĐT không đúng hoặc sai cú pháp, xin vui lòng nhập lại...");
                        }
                    }
                }
                tblTable.setModel(bus.docDuLieu(lblTable.getText()));
                cbbMa.setModel(bus.themOption(tblTable, 0));
            }
        });

        add2.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (add2.getTxfCell2().getText().equals("") || add2.getTxfCell3().getText().equals("") || add2.getTxfCell4().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ dữ liệu ! Vui lòng cập nhật...");

                } else if (bus.IsPhoneNumber(add2.getTxfCell4().getText())) {
                    myStore4 obj = new myStore4(bus.autoInsertCode(lblTable.getText()), add2.getTxfCell2().getText(), add2.getTxfCell3().getText(), add2.getTxfCell4().getText());
                    bus.insertForFour(lblTable.getText(), obj);
                } else {
                    JOptionPane.showMessageDialog(null, "SĐT không đúng hoặc sai cú pháp, xin vui lòng nhập lại...");
                }

                tblTable.setModel(bus.docDuLieu(lblTable.getText()));
                cbbMa.setModel(bus.themOption(tblTable, 0));
            }
        });
    }

    public JTable getTblTable() {
        return tblTable;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnProduct = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnBusiness = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTable = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        radTKHD1 = new javax.swing.JRadioButton();
        radTKHD2 = new javax.swing.JRadioButton();
        radTKHD3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        radTKCTV1 = new javax.swing.JRadioButton();
        radTKCTV2 = new javax.swing.JRadioButton();
        radTKCTV3 = new javax.swing.JRadioButton();
        radTKHD4 = new javax.swing.JRadioButton();
        btnHoaDon = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblCell1 = new javax.swing.JLabel();
        lblCell2 = new javax.swing.JLabel();
        lblCell3 = new javax.swing.JLabel();
        lblCell4 = new javax.swing.JLabel();
        lblCell5 = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        radChoose2 = new javax.swing.JRadioButton();
        radChoose3 = new javax.swing.JRadioButton();
        radChoose4 = new javax.swing.JRadioButton();
        radChoose1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txfSearch = new javax.swing.JTextField();
        txfCell2 = new javax.swing.JTextField();
        txfCell3 = new javax.swing.JTextField();
        txfCell4 = new javax.swing.JTextField();
        txfCell5 = new javax.swing.JTextField();
        cbbMa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxEdit = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nen1.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pro2.png"))); // NOI18N
        btnProduct.setText("SẢN PHẨM");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/im.png"))); // NOI18N
        btnEmployee.setText("NHÂN VIÊN");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/piu.png"))); // NOI18N
        btnPhieuNhap.setText("PHIẾU NHẬP");
        btnPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuNhapActionPerformed(evt);
            }
        });

        btnBusiness.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/com.png"))); // NOI18N
        btnBusiness.setText("NHÀ SẢN XUẤT");
        btnBusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quit.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Hiện đang ở danh sách bảng :");

        lblTable.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblTable.setForeground(new java.awt.Color(0, 0, 153));
        lblTable.setText("sanpham");

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart.png"))); // NOI18N
        btnThongKe.setText("Thống kế");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("THỐNG KÊ TỔNG TIỀN HÓA ĐƠN THEO : ");

        buttonGroup2.add(radTKHD1);
        radTKHD1.setText("DANH SÁCH SẢN PHẨM");

        buttonGroup2.add(radTKHD2);
        radTKHD2.setText("DANH SÁCH KHÁCH HÀNG");

        buttonGroup2.add(radTKHD3);
        radTKHD3.setText("DANH SÁCH NHÂN VIÊN");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("THỐNG KÊ TỔNG CHI/THU VỐN THEO : ");

        buttonGroup2.add(radTKCTV1);
        radTKCTV1.setText("TỔNG VỐN ĐÃ CHI MUA SẢN PHẨM ");

        buttonGroup2.add(radTKCTV2);
        radTKCTV2.setText("TỔNG VỐN THU ĐƯỢC TỪ SẢN PHẨM");

        buttonGroup2.add(radTKCTV3);
        radTKCTV3.setText("TỔNG LÃI / LỖ TRONG THÁNG");

        buttonGroup2.add(radTKHD4);
        radTKHD4.setText("DANH SÁCH NGÀY BÁN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radTKHD1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(radTKHD4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radTKHD3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radTKHD2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(radTKCTV1)
                            .addComponent(radTKCTV2)
                            .addComponent(radTKCTV3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTKHD1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTKHD2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTKHD3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTKHD4)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTKCTV1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTKCTV2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTKCTV3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hoadon.png"))); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cus.png"))); // NOI18N
        btnCustomer.setText("KHÁCH HÀNG");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBusiness, btnCustomer, btnEmployee, btnPhieuNhap, btnProduct, btnThongKe});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusiness))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployee)
                    .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHoaDon)
                    .addComponent(btnCustomer))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTable)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThongKe)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBusiness, btnCustomer, btnEmployee, btnHoaDon, btnPhieuNhap, btnProduct});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, lblTable});

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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCell1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell1.setText("MÃ SẢN PHẨM");

        lblCell2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell2.setText("TÊN SẢN PHẨM");

        lblCell3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell3.setText("XUẤT SỨ");

        lblCell4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell4.setText("SỐ LƯỢNG");

        lblCell5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCell5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCell5.setText("ĐƠN GIÁ");

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ref.png"))); // NOI18N
        btnRefesh.setText("Cập Nhật");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ADD.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.setText("Sửa đổi");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.png"))); // NOI18N
        btnDelete.setText("Xóa bỏ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radChoose2);
        radChoose2.setText("THEO TÊN");

        buttonGroup1.add(radChoose3);
        radChoose3.setText("THEO SĐT");

        buttonGroup1.add(radChoose4);
        radChoose4.setText("THEO NGÀY");

        buttonGroup1.add(radChoose1);
        radChoose1.setText("THEO MÃ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("TÌM KIẾM");

        cbbMa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- CHỌN ---" }));
        cbbMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHỈNH SỬA NỘI DUNG DANH SÁCH THEO MÃ ĐI KÈM");

        cbxEdit.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cbxEdit.setText("Chỉnh sửa nội dung");
        cbxEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEditActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radChoose3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radChoose4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txfSearch)
                                .addGap(18, 18, 18)))
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCell2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(lblCell3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCell4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCell5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCell1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfCell4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addComponent(txfCell3)
                                .addComponent(txfCell2)
                                .addComponent(txfCell5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefesh, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnEdit, btnRefesh, btnSearch});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radChoose1, radChoose2, radChoose3, radChoose4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radChoose1)
                            .addComponent(radChoose2)
                            .addComponent(radChoose3)
                            .addComponent(radChoose4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCell5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, txfSearch});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnDelete, btnEdit, btnRefesh, cbbMa, jLabel3, lblCell1, lblCell2, lblCell3, lblCell4, lblCell5, txfCell2, txfCell3, txfCell4, txfCell5});

        jMenu1.setText("Xuất file");
        jMenu1.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jMenuItem1.setText("Lưu ra tệp tin .xls ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.png"))); // NOI18N
        jMenuItem2.setText("Thoát ứng dụng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
        // TODO bus your handling code here:
        chitiet.setVisible(true);

        chitiet.getLblTableName().setText("PHIẾU NHẬP");
        chitiet.getLblInfo1().setText("THÔNG TIN NHÀ SX");
        chitiet.getLblCell1().setText("MÃ NHÀ SX");
        chitiet.getLblCell2().setText("TÊN NHÀ SX");
        chitiet.getLblCell3().setText("ĐỊA CHỈ");
        chitiet.getLblCell4().setText("SĐT");

        chitiet.getLblCell9().setText("MÃ PHIẾU NHẬP");
        chitiet.getLblCell10().setText("MÃ NHÂN VIÊN");
        chitiet.getLblCell11().setText("MÃ NHÀ SX");
        chitiet.getLblCell12().setText("NGÀY NHẬP");
        chitiet.getLblCell13().setText("TỔNG TIỀN");

        chitiet.getCbxOK().setVisible(false);

        bus.themOptionAdvances(chitiet.getCbbCell2(), "nhanvien");
        bus.themOptionAdvances(chitiet.getCbbCell3(), "nhasanxuat");

        chitiet.getCbxEdit().setSelected(false);

        chitiet.getRadChoose1().setText("THEO MÃ PN");
        chitiet.getRadChoose2().setText("THEO MÃ NV");
        chitiet.getRadChoose3().setText("THEO MÃ NSX");
        chitiet.getRadChoose4().setText("THEO NGÀY");
        chitiet.getRadChoose3().setVisible(true);
        chitiet.getRadChoose4().setVisible(true);

        chitiet.getTxfCell1().setText("");
        chitiet.getTxfCell2().setText("");
        chitiet.getTxfCell3().setText("");
        chitiet.getTxfCell4().setText("");
        chitiet.getTxfCell5().setText("");
        chitiet.getTxfCell6().setText("");
        chitiet.getTxfCell7().setText("");
        chitiet.getTxfCell8().setText("");
        chitiet.getTxfCell9().setText("");
        chitiet.getTxfCell10().setText("");
        chitiet.getTxfCell11().setText("");
        chitiet.getTxfCell12().setText("");

        //Đọc dữ liệu
        chitiet.getTblTable().setModel(bus.docDuLieu("phieunhap"));

        //Thêm thành phần cho combobox
        chitiet.getCbbCell1().setModel(bus.themOption(chitiet.getTblTable(), 0));

        DefaultTableModel model = new DefaultTableModel();
        chitiet.getTblDetail().setModel(model);
    }//GEN-LAST:event_btnPhieuNhapActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO bus your handling code here:
        cbxEdit.setSelected(false);
        lblTable.setText("nhanvien");
        lblCell1.setText("MÃ NHÂN VIÊN");
        lblCell2.setText("TÊN NHÂN VIÊN");
        lblCell3.setText("NGÀY SINH");
        lblCell4.setText("ĐỊA CHỈ");
        lblCell5.setText("SĐT");
        lblCell5.setVisible(true);
        txfCell5.setVisible(true);

        radChoose1.setVisible(true);
        radChoose2.setVisible(true);
        radChoose3.setVisible(true);
        radChoose4.setVisible(false);
        radChoose1.setText("THEO MÃ NV");
        radChoose2.setText("THEO TÊN NV");
        radChoose3.setText("THEO SĐT");

        txfCell2.setText("");
        txfCell3.setText("");
        txfCell4.setText("");
        txfCell5.setText("");

        //Đọc dữ liệu
        tblTable.setModel(bus.docDuLieu(lblTable.getText()));

        //Thêm thành phần cho combobox
        cbbMa.setModel(bus.themOption(tblTable, 0));
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO bus your handling code here:

        cbxEdit.setSelected(false);

        lblTable.setText("sanpham");
        lblCell1.setText("MÃ SẢN PHẨM");
        lblCell2.setText("TÊN SẢN PHẨM");
        lblCell3.setText("XUẤT SỨ");
        lblCell4.setText("SỐ LƯỢNG");
        lblCell5.setText("ĐƠN GIÁ");
        lblCell5.setVisible(true);
        txfCell5.setVisible(true);

        radChoose1.setVisible(true);
        radChoose2.setVisible(true);
        radChoose3.setVisible(false);
        radChoose4.setVisible(false);
        radChoose1.setText("THEO MÃ SP");
        radChoose2.setText("THEO TÊN SP");

        txfCell2.setText("");
        txfCell3.setText("");
        txfCell4.setText("");
        txfCell5.setText("");

        //Đọc dữ liệu
        tblTable.setModel(bus.docDuLieu(lblTable.getText()));

        //Thêm thành phần cho combobox
        cbbMa.setModel(bus.themOption(tblTable, 0));
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO bus your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO bus your handling code here:
        chitiet.setVisible(true);

        chitiet.getLblTableName().setText("HÓA ĐƠN");
        chitiet.getLblInfo1().setText("THÔNG TIN KHÁCH HÀNG");
        chitiet.getLblCell1().setText("MÃ KHÁCH HÀNG");
        chitiet.getLblCell2().setText("TÊN KHÁCH HÀNG");
        chitiet.getLblCell3().setText("ĐỊA CHỈ");
        chitiet.getLblCell4().setText("SĐT");

        chitiet.getLblCell9().setText("MÃ HÓA ĐƠN");
        chitiet.getLblCell10().setText("MÃ NHÂN VIÊN");
        chitiet.getLblCell11().setText("MÃ KHÁCH HÀNG");
        chitiet.getLblCell12().setText("NGÀY BÁN");
        chitiet.getLblCell13().setText("TỔNG TIỀN");

        chitiet.getCbxOK().setVisible(true);

        bus.themOptionAdvances(chitiet.getCbbCell2(), "nhanvien");
        bus.themOptionAdvances(chitiet.getCbbCell3(), "khachhang");

        chitiet.getCbxEdit().setSelected(false);

        chitiet.getRadChoose1().setText("THEO MÃ HĐ");
        chitiet.getRadChoose2().setText("THEO MÃ NV");
        chitiet.getRadChoose3().setText("THEO MÃ KH");
        chitiet.getRadChoose4().setText("THEO NGÀY");
        chitiet.getRadChoose3().setVisible(true);
        chitiet.getRadChoose4().setVisible(true);

        chitiet.getTxfCell1().setText("");
        chitiet.getTxfCell2().setText("");
        chitiet.getTxfCell3().setText("");
        chitiet.getTxfCell4().setText("");
        chitiet.getTxfCell5().setText("");
        chitiet.getTxfCell6().setText("");
        chitiet.getTxfCell7().setText("");
        chitiet.getTxfCell8().setText("");
        chitiet.getTxfCell9().setText("");
        chitiet.getTxfCell10().setText("");
        chitiet.getTxfCell11().setText("");
        chitiet.getTxfCell12().setText("");

        //Đọc dữ liệu
        chitiet.getTblTable().setModel(bus.docDuLieu("hoadon"));

        //Thêm thành phần cho combobox
        chitiet.getCbbCell1().setModel(bus.themOption(chitiet.getTblTable(), 0));

        DefaultTableModel model = new DefaultTableModel();
        chitiet.getTblDetail().setModel(model);
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO bus your handling code here:
        cbxEdit.setSelected(false);
        lblTable.setText("khachhang");
        lblCell1.setText("MÃ KHÁCH HÀNG");
        lblCell2.setText("TÊN KHÁCH HÀNG");
        lblCell3.setText("ĐỊA CHỈ");
        lblCell4.setText("SĐT");
        lblCell5.setVisible(false);
        txfCell5.setVisible(false);

        radChoose1.setVisible(true);
        radChoose2.setVisible(true);
        radChoose3.setVisible(true);
        radChoose4.setVisible(false);
        radChoose1.setText("THEO MÃ KH");
        radChoose2.setText("THEO TÊN KH");
        radChoose3.setText("THEO SĐT");

        txfCell2.setText("");
        txfCell3.setText("");
        txfCell4.setText("");
        txfCell5.setText("");

        //Đọc dữ liệu
        tblTable.setModel(bus.docDuLieu(lblTable.getText()));

        //Thêm thành phần cho combobox
        cbbMa.setModel(bus.themOption(tblTable, 0));
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnBusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusinessActionPerformed
        // TODO bus your handling code here:
        cbxEdit.setSelected(false);
        lblTable.setText("nhasanxuat");
        lblCell1.setText("MÃ NHÀ SX");
        lblCell2.setText("TÊN NHÀ SX");
        lblCell3.setText("ĐỊA CHỈ");
        lblCell4.setText("SĐT");
        lblCell5.setVisible(false);
        txfCell5.setVisible(false);

        radChoose1.setVisible(true);
        radChoose2.setVisible(true);
        radChoose3.setVisible(true);
        radChoose4.setVisible(false);
        radChoose1.setText("THEO MÃ SX");
        radChoose2.setText("THEO TÊN SX");
        radChoose3.setText("THEO SĐT");

        txfCell2.setText("");
        txfCell3.setText("");
        txfCell4.setText("");
        txfCell5.setText("");

        //Đọc dữ liệu
        tblTable.setModel(bus.docDuLieu(lblTable.getText()));

        //Thêm thành phần cho combobox
        cbbMa.setModel(bus.themOption(tblTable, 0));
    }//GEN-LAST:event_btnBusinessActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:     
        DefaultTableModel model = new DefaultTableModel();
        if (radTKHD1.isSelected()) {
            tk.setVisible(true);
            tk.getLblTableName().setText("SANPHAM");
            tk.getLblMa().setText("Chọn MASP cần tính tổng :");
            bus.themOptionAdvances(tk.getCbbMa(), "sanpham");
            tk.getTblTable().setModel(model);

        } else if (radTKHD2.isSelected()) {
            tk.setVisible(true);
            tk.getLblTableName().setText("KHACHHANG");
            tk.getLblMa().setText("Chọn MAKH cần tính tổng :");
            bus.themOptionAdvances(tk.getCbbMa(), "khachhang");
            tk.getTblTable().setModel(model);

        } else if (radTKHD3.isSelected()) {
            tk.setVisible(true);
            tk.getLblTableName().setText("NHANVIEN");
            tk.getLblMa().setText("Chọn MANV cần tính tổng :");
            bus.themOptionAdvances(tk.getCbbMa(), "nhanvien");
            tk.getTblTable().setModel(model);

        } else if (radTKHD4.isSelected()) {
            tkDate.setVisible(true);
            tkDate.getLblTableNgay().setText("NGAYBAN");
            tkDate.getTblTable().setModel(model);

        } else if (radTKCTV1.isSelected()) {
            tkCT.setVisible(true);
            tkCT.getLblTieuDe().setText("THỐNG KÊ TỔNG VỐN ĐÃ CHI MUA SẢN PHẨM TRONG THÁNG");
            tkCT.getLblTableName().setText("Tổng chi vốn theo :");
            tkCT.getTblTable().setModel(model);

        } else if (radTKCTV2.isSelected()) {
            tkCT.setVisible(true);
            tkCT.getLblTieuDe().setText("THỐNG KÊ TỔNG VỐN ĐÃ THU ĐƯỢC TỪ SẢN PHẨM TRONG THÁNG");
            tkCT.getLblTableName().setText("Tổng chi thu theo :");
            tkCT.getTblTable().setModel(model);

        } else if (radTKCTV3.isSelected()) {
            lailo.setVisible(true);
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO bus your handling code here:
        if (radChoose1.isSelected()) {
            tblTable.setModel(bus.search(lblTable.getText(), txfSearch, 1));
        } else if (radChoose2.isSelected()) {
            tblTable.setModel(bus.search(lblTable.getText(), txfSearch, 2));
        } else if (radChoose3.isSelected()) {
            tblTable.setModel(bus.search(lblTable.getText(), txfSearch, 3));
        } else if (radChoose4.isSelected()) {
            tblTable.setModel(bus.search(lblTable.getText(), txfSearch, 4));
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO bus your handling code here:

        //Đọc dữ liệu
        tblTable.setModel(bus.docDuLieu(lblTable.getText()));
        cbbMa.setModel(bus.themOption(tblTable, 0));
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            bus.delete(lblTable.getText(), tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0).toString());
            tblTable.setModel(bus.docDuLieu(lblTable.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bảng hiện tại đã rỗng...");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here
        add.getTxfCell2().setText("");
        add.getTxfCell3().setText("");
        add.getTxfCell4().setText("");
        add.getTxfCell5().setText("");

        add2.getTxfCell2().setText("");
        add2.getTxfCell3().setText("");
        add2.getTxfCell4().setText("");

        if (lblTable.getText().equals("sanpham")) {
            add.getLblCell2().setText("TÊN SẢN PHẨM");
            add.getLblCell3().setText("XUẤT SỨ");
            add.getLblCell4().setText("SỐ LƯỢNG");
            add.getLblCell5().setText("ĐƠN GIÁ");
            add.getLblTable().setText("sanpham");
            add.setVisible(true);
        } else if (lblTable.getText().equals("nhanvien")) {
            add.getLblCell2().setText("TÊN NHÂN VIÊN");
            add.getLblCell3().setText("NGÀY SINH");
            add.getLblCell4().setText("ĐỊA CHỈ");
            add.getLblCell5().setText("SĐT");
            add.getLblTable().setText("nhanvien");
            add.setVisible(true);
        } else if (lblTable.getText().equals("khachhang")) {
            add2.getLblCell2().setText("TÊN KHÁCH HÀNG");
            add2.getLblCell3().setText("ĐỊA CHỈ");
            add2.getLblCell4().setText("SĐT");
            add2.getLblTable().setText("khachhang");
            add2.setVisible(true);
        } else if (lblTable.getText().equals("nhasanxuat")) {
            add2.getLblCell2().setText("TÊN NHÀ SX");
            add2.getLblCell3().setText("ĐỊA CHỈ");
            add2.getLblCell4().setText("SĐT");
            add2.getLblTable().setText("nhasanxuat");
            add2.setVisible(true);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here
        if (!cbxEdit.isSelected()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhấn chọn 'Chỉnh sửa' để thực hiện chức năng này...!");
        } else {
            if (txfCell2.getText().equals("") || txfCell3.getText().equals("") || txfCell4.getText().equals("")) {

                if (lblTable.getText().equals("khachhang") || lblTable.getText().equals("nhasanxuat")) {
                    JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ dữ liệu ! Vui lòng cập nhật...");
                } else if (!lblTable.getText().equals("khachhang") || !lblTable.getText().equals("nhasanxuat") && txfCell5.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ dữ liệu ! Vui lòng cập nhật...");
                }

            } else if (lblTable.getText().equals("khachhang") || lblTable.getText().equals("nhasanxuat")) {
                if (bus.IsPhoneNumber(txfCell4.getText())) {
                    myStore4 obj = new myStore4(cbbMa.getSelectedItem().toString(), txfCell2.getText(), txfCell3.getText(), txfCell4.getText());
                    bus.editForFour(lblTable.getText(), obj);
                } else {
                    JOptionPane.showMessageDialog(null, "SĐT không đúng hoặc sai cú pháp, xin vui lòng nhập lại...");
                }
            } else {
                //Viết thêm hàm kiểm tra đầu vào
                if (lblTable.getText().equals("sanpham")) {
                    if (bus.IsNumber(txfCell4.getText()) && bus.IsNumber(txfCell5.getText())) {
                        myStore5 obj = new myStore5(cbbMa.getSelectedItem().toString(), txfCell2.getText(), txfCell3.getText(), txfCell4.getText(), txfCell5.getText());
                        bus.editForFive(lblTable.getText(), obj);
                    } else {
                        JOptionPane.showMessageDialog(null, "SỐ LƯỢNG hoặc ĐƠN GIÁ sai cú pháp, xin vui lòng nhập lại...");
                    }
                }

                if (lblTable.getText().equals("nhanvien")) {

                    if (bus.IsPhoneNumber(txfCell5.getText()) && bus.IsDate(txfCell3.getText())) {
                        if (bus.checkDate(txfCell3.getText())) {
                            myStore5 obj = new myStore5(cbbMa.getSelectedItem().toString(), txfCell2.getText(), bus.getDate(txfCell3.getText()), txfCell4.getText(), txfCell5.getText());
                            bus.editForFive(lblTable.getText(), obj);
                        }
                    } else if (!bus.IsDate(txfCell3.getText())) {
                        JOptionPane.showMessageDialog(null, "NGÀY SINH sai cú pháp, vui lòng nhập theo dạng yyyy-MM-dd ...");
                    } else if (!bus.IsPhoneNumber(txfCell5.getText())) {
                        JOptionPane.showMessageDialog(null, "SĐT sai cú pháp, xin vui lòng nhập lại...");
                    }
                }

            }
            tblTable.setModel(bus.docDuLieu(lblTable.getText()));
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cbxEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEditActionPerformed
        // TODO add your handling code here:
        if (!cbxEdit.isSelected()) {
            txfCell2.setEditable(false);
            txfCell3.setEditable(false);
            txfCell4.setEditable(false);
            txfCell5.setEditable(false);
        } else {
            txfCell2.setEditable(true);
            txfCell3.setEditable(true);
            txfCell4.setEditable(true);
            txfCell5.setEditable(true);
        }
    }//GEN-LAST:event_cbxEditActionPerformed

    private void cbbMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaActionPerformed
        // TODO add your handling code here:
        if (lblTable.getText().equals("khachhang") || lblTable.getText().equals("nhasanxuat")) {
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell2, 1);
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell3, 2);
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell4, 3);
        } else {
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell2, 1);
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell3, 2);
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell4, 3);
            bus.docDuLieuCombobox(cbbMa, lblTable.getText(), txfCell5, 4);
        }
    }//GEN-LAST:event_cbbMaActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        if (!lblTable.getText().equals("nhasanxuat") && !lblTable.getText().equals("khachhang")) {
            cbbMa.setSelectedItem(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0));
            txfCell2.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 1).toString());
            txfCell3.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 2).toString());
            txfCell4.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 3).toString());
            txfCell5.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 4).toString());
        } else {
            cbbMa.setSelectedItem(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 0));
            txfCell2.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 1).toString());
            txfCell3.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 2).toString());
            txfCell4.setText(tblTable.getModel().getValueAt(tblTable.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        save.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(infoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBusiness;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThongKe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbMa;
    private javax.swing.JCheckBox cbxEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCell1;
    private javax.swing.JLabel lblCell2;
    private javax.swing.JLabel lblCell3;
    private javax.swing.JLabel lblCell4;
    private javax.swing.JLabel lblCell5;
    private javax.swing.JLabel lblTable;
    private javax.swing.JRadioButton radChoose1;
    private javax.swing.JRadioButton radChoose2;
    private javax.swing.JRadioButton radChoose3;
    private javax.swing.JRadioButton radChoose4;
    private javax.swing.JRadioButton radTKCTV1;
    private javax.swing.JRadioButton radTKCTV2;
    private javax.swing.JRadioButton radTKCTV3;
    private javax.swing.JRadioButton radTKHD1;
    private javax.swing.JRadioButton radTKHD2;
    private javax.swing.JRadioButton radTKHD3;
    private javax.swing.JRadioButton radTKHD4;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txfCell2;
    private javax.swing.JTextField txfCell3;
    private javax.swing.JTextField txfCell4;
    private javax.swing.JTextField txfCell5;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}

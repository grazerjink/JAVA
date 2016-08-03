/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_chucnang;

import c_csdl.sanPhamDAO;
import c_csdl.sqlConnet;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import java.util.Date;
import qlsanpham.*;

/**
 *
 * @author graze
 */
public class sanPhamBus {

    sqlConnet connect = new sqlConnet();
    sanPhamDAO dao = new sanPhamDAO();
    public static final int NEW = 1;
    public static final int OLD = 0;

    //Hàm kiểm tra đầu vào trong main đăng nhập
    public void ketNoiCSDL(JFrame fm) {
        if (connect.getConnect()) {
            JOptionPane.showMessageDialog(null, "Đã kết nối thành công", "CONNECT SUCCEEDED", JOptionPane.INFORMATION_MESSAGE);
            fm.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Hệ thống chưa được mở, xui lòng kiểm tra lại", "CONNECT FAILED", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Hàm hiển thị dữ liệu cho table
    public DefaultTableModel docDuLieu(String tablename) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showData(model, tablename);
        return model;
    }

    //Hàm hiển thị danh sách bảng có trong DATABASE
    public void getListTable(JComboBox cbb) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showListTable(model);
        for (int i = 0; i < model.getRowCount(); i++) {
            cbb.addItem(model.getValueAt(i, 0));
        }

    }

    //Hàm thêm thông tin cho combobox dựa vào table
    public DefaultComboBoxModel themOption(JTable tbl, int index) {
        DefaultComboBoxModel cbxModel = new DefaultComboBoxModel();
        for (int i = 0; i < tbl.getRowCount(); i++) {
            cbxModel.addElement(tbl.getModel().getValueAt(i, index));
        }
        return cbxModel;
    }

    //Hàm thêm item cho combobox theo table
    public void themOptionAdvances(JComboBox cbb, String tablename) {
        DefaultComboBoxModel cbxModel = new DefaultComboBoxModel();
        DefaultTableModel model = new DefaultTableModel();
        dao.showData(model, tablename);
        for (int j = 0; j < model.getRowCount(); j++) {
            cbxModel.addElement(model.getValueAt(j, 0));
        }
        cbb.setModel(cbxModel);
    }

    //Hàm thêm item cho một Combobox con nhưng dựa vào một item của combobox cha đã được chọn
    //Dành cho chức năng xuất file EXCEL 
    public void addItemForCombobox(JComboBox cbbTabelName, JComboBox cbbDetail) {
        DefaultTableModel model = new DefaultTableModel();
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        if (cbbTabelName.getSelectedItem().toString().equals("ct_phieunhap")) {
            dao.showData(model, "phieunhap");
        } else if (cbbTabelName.getSelectedItem().toString().equals("ct_hoadon")) {
            dao.showData(model, "hoadon");
        }
        cbbModel.addElement("Tất cả");
        for (int i = 0; i < model.getRowCount(); i++) {
            cbbModel.addElement(model.getValueAt(i, 0));
        }
        cbbDetail.setModel(cbbModel);
    }

    //Hàm tìm kiếm dựa vào chọn item Combobox rồi chèn vào TEXTFIELD
    public void docDuLieuCombobox(JComboBox cbb, String lbl, JTextField txf, int i) {
        DefaultTableModel model = new DefaultTableModel();
        if (lbl.equals("sanpham")) {
            dao.sqlSearch(model, lbl, "MASP", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhanvien")) {
            dao.sqlSearch(model, lbl, "MANV", cbb.getSelectedItem().toString());
        } else if (lbl.equals("khachhang")) {
            dao.sqlSearch(model, lbl, "MAKH", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhasanxuat")) {
            dao.sqlSearch(model, lbl, "MANSX", cbb.getSelectedItem().toString());
        } else if (lbl.equals("phieunhap")) {
            dao.sqlSearch(model, lbl, "MAPN", cbb.getSelectedItem().toString());
        } else if (lbl.equals("hoadon")) {
            dao.sqlSearch(model, lbl, "MAHD", cbb.getSelectedItem().toString());
        }
        txf.setText(model.getValueAt(0, i).toString());
    }

    //Hàm tìm kiếm dựa vào chọn item Combobox rồi chèn vào SPINNER
    public void docDuLieuCombobox(JComboBox cbb, String lbl, JSpinner spn, int i) {
        DefaultTableModel model = new DefaultTableModel();
        if (lbl.equals("sanpham")) {
            dao.sqlSearch(model, lbl, "MASP", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhanvien")) {
            dao.sqlSearch(model, lbl, "MANV", cbb.getSelectedItem().toString());
        } else if (lbl.equals("khachhang")) {
            dao.sqlSearch(model, lbl, "MAKH", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhasanxuat")) {
            dao.sqlSearch(model, lbl, "MANSX", cbb.getSelectedItem().toString());
        } else if (lbl.equals("phieunhap")) {
            dao.sqlSearch(model, lbl, "MAPN", cbb.getSelectedItem().toString());
        } else if (lbl.equals("hoadon")) {
            dao.sqlSearch(model, lbl, "MAHD", cbb.getSelectedItem().toString());
        }
        spn.setValue(Integer.parseInt(model.getValueAt(0, i).toString()));
    }

    //Hàm tìm kiếm dựa vào chọn item Combobox rồi chèn vào một Combobox thứ 2
    public void docDuLieuCombobox(JComboBox cbb, String lbl, JComboBox cbb2, int i) {
        DefaultTableModel model = new DefaultTableModel();
        if (lbl.equals("sanpham")) {
            dao.sqlSearch(model, lbl, "MASP", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhanvien")) {
            dao.sqlSearch(model, lbl, "MANV", cbb.getSelectedItem().toString());
        } else if (lbl.equals("khachhang")) {
            dao.sqlSearch(model, lbl, "MAKH", cbb.getSelectedItem().toString());
        } else if (lbl.equals("nhasanxuat")) {
            dao.sqlSearch(model, lbl, "MANSX", cbb.getSelectedItem().toString());
        } else if (lbl.equals("phieunhap")) {
            dao.sqlSearch(model, lbl, "MAPN", cbb.getSelectedItem().toString());
        } else if (lbl.equals("hoadon")) {
            dao.sqlSearch(model, lbl, "MAHD", cbb.getSelectedItem().toString());
        }
        cbb2.setSelectedItem(model.getValueAt(0, i));
    }

    //Hàm tìm kiếm một table danh sách có dựa vào Radio Button
    public DefaultTableModel search(String lbl, JTextField txf, int rad) {
        DefaultTableModel model = new DefaultTableModel();
        if (lbl.equals("sanpham")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MASP", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "TENSP", txf.getText());
            }
        } else if (lbl.equals("nhanvien")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MANV", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "TENNV", txf.getText());
            } else if (rad == 3) {
                dao.sqlSearch(model, lbl, "SDT", txf.getText());
            }
        } else if (lbl.equals("khachhang")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MAKH", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "TENKH", txf.getText());
            } else if (rad == 3) {
                dao.sqlSearch(model, lbl, "SDT", txf.getText());
            }
        } else if (lbl.equals("nhasanxuat")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MANSX", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "TENNSX", txf.getText());
            } else if (rad == 3) {
                dao.sqlSearch(model, lbl, "SDT", txf.getText());
            }
        } else if (lbl.equals("phieunhap")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MAPN", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "MANV", txf.getText());
            } else if (rad == 3) {
                dao.sqlSearch(model, lbl, "MANSX", txf.getText());
            } else {
                dao.sqlSearch(model, lbl, "NGAYNHAP", txf.getText());
            }
        } else if (lbl.equals("hoadon")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MAHD", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "MANV", txf.getText());
            } else if (rad == 3) {
                dao.sqlSearch(model, lbl, "MAKH", txf.getText());
            } else {
                dao.sqlSearch(model, lbl, "NGAYBAN", txf.getText());
            }
        } else if (lbl.equals("ct_hoadon")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MAHD", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "MASP", txf.getText());
            }
        } else if (lbl.equals("ct_phieunhap")) {
            if (rad == 1) {
                dao.sqlSearch(model, lbl, "MAPN", txf.getText());
            } else if (rad == 2) {
                dao.sqlSearch(model, lbl, "MASP", txf.getText());
            }
        }
        return model;
    }

    //Hàm tìm kiếm mã hóa đơn (phiếu nhập) rùi xuất ra table chỉ 1 loại dựa vào table 
    //cha là hóa đơn hay phiếu nhập
    public DefaultTableModel search(String lbl, String ma) {
        DefaultTableModel model = new DefaultTableModel();
        if (lbl.equals("ct_hoadon")) {
            dao.sqlSearch(model, lbl, "MAHD", ma);
        } else if (lbl.equals("ct_phieunhap")) {
            dao.sqlSearch(model, lbl, "MAPN", ma);
        }
        return model;
    }

    //Hàm lấy thông tin từ table chính (hóa đơn hay phiếu nhập) sang table chi tiết
    //Dùng trong DetailForm
    public void getDataFromMainTable(JTable vice, String tablename, String place) {
        DefaultTableModel model = new DefaultTableModel();
        if (tablename.equals("HÓA ĐƠN")) {
            dao.sqlSearch(model, "ct_hoadon", "MAHD", place);
        } else if (tablename.equals("PHIẾU NHẬP")) {
            dao.sqlSearch(model, "ct_phieunhap", "MAPN", place);
        }
        vice.setModel(model);
    }

    //Hàm lấy thông tin cho textfield từ một Table HÓA ĐƠN hay PHIẾU NHẬP
    public void getDataForTextField(String tablename, String place, JTextField txf, int index, int col) {
        DefaultTableModel model = new DefaultTableModel();
        if (tablename.equals("HÓA ĐƠN")) {
            if (index == 1) {
                dao.sqlSearch(model, "sanpham", "MASP", place);
            } else if (index == 2) {
                dao.sqlSearch(model, "khachhang", "MAKH", place);
            } else if (index == 3) {
                dao.sqlSearch(model, "nhanvien", "MANV", place);
            }
        } else if (tablename.equals("PHIẾU NHẬP")) {
            if (index == 1) {
                dao.sqlSearch(model, "sanpham", "MASP", place);
            } else if (index == 2) {
                dao.sqlSearch(model, "nhasanxuat", "MANSX", place);
            } else if (index == 3) {
                dao.sqlSearch(model, "nhanvien", "MANV", place);
            }
        }
        txf.setText(model.getValueAt(0, col).toString());
    }

    //Hàm trả về một model (đã tìm kiếm gợp 2 bảng ct vs hoadon(phieunhap)) để lấy dữ liệu từ cái model đó
    public DefaultTableModel getInfoForTableDetail(String table, String ma, String masp) {
        DefaultTableModel model = new DefaultTableModel();
        dao.sqlSearchToGetInfo(model, table, ma, masp);
        return model;
    }

    //Hàm sửa cho lớp có đối tượng 5 thuộc tính (myStore5)
    public void editForFive(String lbl, myStore5 obj) {
        dao.sqlEditForFive(lbl, obj);
    }

    //Hàm sửa cho lớp có đối tượng 4 thuộc tính (myStore4)
    public void editForFour(String lbl, myStore4 obj) {
        dao.sqlEditForFour(lbl, obj);
    }

    //Thay đổi cột TINHTRANG của HÓA ĐƠN (OK - -----)
    public void editStateOfBill(String mahd, String trangthai) {
        dao.updateStateOfBill(mahd, trangthai);
    }

    //Hàm tính tổng thành tiền của danh sách chi tiết rùi chỉnh sửa tổng tiền cho HÓA ĐƠN hay PHIẾU NHẬP
    public void countTotalPrice(String lbl, String totalPrice, String ma) {
        dao.sqlEditTotalPrice(lbl, totalPrice, ma);
    }

    //Hàm lấy tổng thành tiền của Hóa Đơn hay Phiếu Nhập (này trong form sẽ thêm vào TextField cho chỉnh sửa)
    public String getTotalPrice(String lbl, String place, int choose) {
        DefaultTableModel model = new DefaultTableModel();
        String tongtien = "";
        if (choose == 1) {
            dao.sqlSumPrice(model, lbl, "MAHD", place);
        } else if (choose == 2) {
            dao.sqlSumPrice(model, lbl, "MAPN", place);
        }
        tongtien = model.getValueAt(0, 0).toString();
        return tongtien;
    }

    //Hàm gán giá trị mới cho cột số lượng của bảng sản phẩm khi cột TINHTRANG hóa đơn có thay đổi
    public void setTheNewNumberForProduct(String mahd, String masp, int row, int trangthai) {
        DefaultTableModel hdmodel = new DefaultTableModel();
        DefaultTableModel spModel = new DefaultTableModel();
        int soLuongMoi = 0;

        //Lấy số lượng của bảng chi tiết hóa đơn
        dao.sqlSearch(hdmodel, "ct_hoadon", "MAHD", mahd); //Tìm trong bảng hóa đơn lấy số lượng có trong đó
        int sl_ct_hoadon = Integer.parseInt(hdmodel.getValueAt(row, 2).toString()); //gán vào cho 1 biến (cho dễ phân biệt) 

        //Lấy số lượng hiện có bảng sản phẩm       
        dao.sqlSearch(spModel, "sanpham", "MASP", masp); //Tìm trong bảng sản phẩm lấy số lượng có trong đó
        int sl_sanpham = Integer.parseInt(spModel.getValueAt(0, 3).toString()); //gán vào cho 1 biến (cho dễ phân biệt)

        if (trangthai == 1) //Lấy giá trị theo điều kiện xác nhận
        {
            soLuongMoi = sl_sanpham - sl_ct_hoadon; //Số lượng hiện có trong bảng sản phẩm sẽ giảm đi 
        } else if (trangthai == 0) //Lấy giá trị theo điều kiện hủy xác nhận
        {
            soLuongMoi = sl_sanpham + sl_ct_hoadon; //Số lượng hiện có trong bảng sản phẩm sẽ đc thêm vào lại
        }
        //Gán giá trị mới cho bảng sản phẩm
        dao.updateNumerOfProduct(masp, soLuongMoi);
    }

    //Tính tổng tiền cho bảng SANPHAM
    public void sumPriceByProduct(JTable tbl, String ma) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPriceByProduct(model, ma);
        tbl.setModel(model);
    }

    //Tính tổng tiền cho bảng KHACHHANG
    public void sumPriceByCustomer(JTable tbl, String ma) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPriceByCustomer(model, ma);
        tbl.setModel(model);
    }

    //Tính tổng tiền cho bảng NHANVIEN
    public void sumPriceByEmployee(JTable tbl, String ma) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPriceByEmployee(model, ma);
        tbl.setModel(model);
    }

    //Tính tổng tiền cho dựa vào khoảng NGÀY đã chọn
    public void sumPriceByDate(JTable tbl, String ngaybd, String ngaykt) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPriceByDate(model, ngaybd, ngaykt);
        tbl.setModel(model);
    }

    //Tính tổng tiền đã chi cho tất cả sản phẩm theo tháng đã chọn
    public void sumPriceChiVonAll(JTable tbl, String thang, String nam) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPrice_ChiVon(model, thang, nam);
        tbl.setModel(model);
    }

    //Tính tổng tiền đã chi cho một loại sản phẩm nào đó theo tháng đã chọn
    public void sumPriceChiVonOneByOne(JTable tbl, String thang, String nam, String masp) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showshowTotalPrice_ChiVonOneByOne(model, thang, nam, masp);
        tbl.setModel(model);
    }

    //Tính tổng tiền đã thu được cho tất cả sản phẩm nào đó theo tháng đã chọn
    public void sumPriceChiThuAll(JTable tbl, String thang, String nam) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPrice_ChiThu(model, thang, nam);
        tbl.setModel(model);
    }

    //Tính tổng tiền đã thu được cho một loại sản phẩm nào đó theo tháng đã chọn
    public void sumPriceChiThuOneByOne(JTable tbl, String thang, String nam, String masp) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showTotalPrice_ChiThuOneByOne(model, thang, nam, masp);
        tbl.setModel(model);
    }

    //Tính tổng lãi của công ty
    public void sumTongLai(JTable tbl, String thang, String nam) {
        DefaultTableModel model = new DefaultTableModel();
        dao.showLoLai(model, thang, nam);
        tbl.setModel(model);
    }

    //Hàm kiểm tra bảng thuộc loại nào thì thêm mã của loại đó
    public String kiemtradonvi(String lbl, String num, String code) {
        if (num.length() == 1) {
            if (lbl.equals("sanpham")) {
                code = "TV00" + num;
            } else if (lbl.equals("nhanvien")) {
                code = "NV00" + num;
            } else if (lbl.equals("nhasanxuat")) {
                code = "SX00" + num;
            } else if (lbl.equals("hoadon")) {
                code = "HD00" + num;
            } else if (lbl.equals("phieunhap")) {
                code = "PN00" + num;
            } else if (lbl.equals("khachhang")) {
                code = "KH00" + num;
            }
        } else if (num.length() == 2) {
            if (lbl.equals("sanpham")) {
                code = "TV0" + num;
            } else if (lbl.equals("nhanvien")) {
                code = "NV0" + num;
            } else if (lbl.equals("nhasanxuat")) {
                code = "SX0" + num;
            } else if (lbl.equals("hoadon")) {
                code = "HD0" + num;
            } else if (lbl.equals("phieunhap")) {
                code = "PN0" + num;
            } else if (lbl.equals("khachhang")) {
                code = "KH0" + num;
            }
        } else if (num.length() == 3) {
            if (lbl.equals("sanpham")) {
                code = "TV" + num;
            } else if (lbl.equals("nhanvien")) {
                code = "NV" + num;
            } else if (lbl.equals("nhasanxuat")) {
                code = "SX" + num;
            } else if (lbl.equals("hoadon")) {
                code = "HD" + num;
            } else if (lbl.equals("phieunhap")) {
                code = "PN" + num;
            } else if (lbl.equals("khachhang")) {
                code = "KH" + num;
            }
        }
        return code;
    }

    //Hàm tự động thêm mã cho từng loại table (như MASP, MAHD, MANV, ...)
    public String autoInsertCode(String lbl) {
        String code = new String();
        DefaultTableModel model = new DefaultTableModel();
        dao.showData(model, lbl.toString());
        String num = Integer.toString(model.getRowCount() + 1);
        return kiemtradonvi(lbl, num, code);
    }

    //Hàm thêm cho lớp 5 thuộc tính
    public void insertForFive(String lbl, myStore5 obj) {
        dao.sqlInsertForFive(lbl, obj);
    }

    //Hàm thêm cho lớp 4 thuộc tính
    public void insertForFour(String lbl, myStore4 obj) {
        dao.sqlInsertForFour(lbl, obj);
    }

    //Hàm xóa 1 danh sách với điều kiện đầu vào là một
    public void delete(String lbl, String ma) {
        dao.sqlDelete(lbl, ma);
    }

    //Hàm xóa 1 danh sách với điều kiện đầu vào là hai (danh cho bảng chi tiết phải có MAHD/MAPH rùi MASP)
    public void delete(String lbl, String ma, String masp) {
        dao.sqlDelete(lbl, ma, masp);
    }

    //Hàm kiểm tra có phải là số điện thoại hay không
    public boolean IsPhoneNumber(String num) {
        if (num.length() < 7 || num.length() > 13 || !num.matches("\\d+")) {
            return false;
        }
        return true;
    }

    //Hàm kiểm tra đầu vào có phải là 1 số
    public boolean IsNumber(String num) {
        return num.matches("\\d+");
    }

    //Hàm kiểm tra đầu phải có phải đúng cú pháp ??-??-??
    public boolean IsDate(String date) {
        int d = 0;
        String tokens[];
        String tmp = date.trim();
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '-') {
                d++;
            }
        }
        if (d == 2) {
            tokens = tmp.split("-");
            for (String token : tokens) {
                if (IsNumber(token)) {
                    continue;
                }
            }
            return true;
        }
        return false;
    }

    //Hàm ràng buộc ngày tháng nhập là hợp lệ
    public boolean checkDate(String date) {
        String tokens[];
        tokens = date.split("-");
        String dd = tokens[2];
        String MM = tokens[1];
        String yyyy = tokens[0];
        String tmp = "";
        
        if (Integer.parseInt(dd) > 31 || Integer.parseInt(dd) < 1) {
            JOptionPane.showMessageDialog(null, "Ngày mà bạn nhập không có, xin nhập lại...");
            return false;
        } else if (Integer.parseInt(MM) > 12 || Integer.parseInt(MM) < 1) {
            JOptionPane.showMessageDialog(null, "Tháng mà bạn nhập không có, xin nhập lại...");
            return false;
        } else if (Integer.parseInt(yyyy) > 9999 || Integer.parseInt(yyyy) < 1000) {
            JOptionPane.showMessageDialog(null, "Năm mà bạn nhập không phù hợp, xin nhập lại...");
            return false;
        } else if (Integer.parseInt(MM) == 2) {
            if (namNhuan(Integer.parseInt(yyyy))) {
                if (Integer.parseInt(dd) > 29) {
                    JOptionPane.showMessageDialog(null, "Không có ngày " + dd + " tháng " + MM + " trong năm " + yyyy + ". Xin vui lòng nhập lại...");
                    return false;
                } else {
                    return true;
                }
            } else if (Integer.parseInt(dd) > 28) {
                JOptionPane.showMessageDialog(null, "Không có ngày " + dd + " tháng " + MM + " trong năm " + yyyy + ". Xin vui lòng nhập lại...");
                return false;
            } else {
                return true;
            }
        } else if(Integer.parseInt(MM) == 4|| Integer.parseInt(MM) == 6 || Integer.parseInt(MM) == 9 || Integer.parseInt(MM) == 11 ) {
            if (Integer.parseInt(dd) == 31) {
                JOptionPane.showMessageDialog(null, "Không có ngày " + dd + " trong tháng " + MM+ ". Xin vui lòng nhập lại...");
                return false;
            } else {
                return true;
            }        
        }
        return true;
    }

    //Hàm lấy chuỗi date đã được tự động thêm bớt cho đúng định dạng yyyy-MM-dd
    public String getDate(String date) {
        String tokens[];
        tokens = date.split("-");
        String dd = tokens[2];
        String MM = tokens[1];
        String yyyy = tokens[0];
        String tmp = "";

        if (dd.length() == 1) {
            dd = "0" + dd;
        }

        if (MM.length() == 1) {
            MM = "0" + MM;
        }

        tmp = yyyy + "-" + MM + "-" + dd;
        return tmp;
    }

    //Hàm kiểm tra năm nhuận
    boolean namNhuan(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return true;
        }
        return false;
    }

    //Dễ hiểu thôi đọc cái tên hàm đi
    public void taoDuLieuNgayChoCombobox(JComboBox cbx) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 1; i <= 31; i++) {
            model.addElement(i);
        }
        cbx.setModel(model);
    }

    //Dễ hiểu thôi đọc cái tên hàm đi
    public void taoDuLieuThangChoCombobox(JComboBox cbx) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 1; i <= 12; i++) {
            model.addElement(i);
        }
        cbx.setModel(model);
    }

    //Dễ hiểu thôi đọc cái tên hàm đi
    public void taoDuLieuNamChoCombobox(JComboBox cbx) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 2000; i <= 2050; i++) {
            model.addElement(i);
        }
        cbx.setModel(model);
    }

    //Hàm lấy ngày tháng năm hiện giờ của hệ thống máy tính bạn
    public String getCurrentDate() {
        //Lấy thời gian hiện tại của hệ thống
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s = timeFormat.format(today.getTime());

        //Hàm tạo ra lại một chuỗi theo ngữ nghĩa tiếng việt
        //Ngày ?? Tháng ?? Năm ????
        String[] tmp = s.split("/");
        String date = "Ngày " + tmp[0] + " Tháng " + tmp[1] + " Năm " + tmp[2];
        return date;
    }

    //Hàm xuất file EXCEL
    public void xuatFileExcel(JTable tbl, JComboBox cbb) {
        String titleName = null;
        //Hàm tạo tiêu đề theo tên bảng
        if (cbb.getSelectedItem().toString().equals("sanpham")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH SẢN PHẨM";
        } else if (cbb.getSelectedItem().toString().equals("nhanvien")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH NHÂN VIÊN";
        } else if (cbb.getSelectedItem().toString().equals("nhasanxuat")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH NHÀ SẢN XUẤT";
        } else if (cbb.getSelectedItem().toString().equals("khachhang")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH KHÁCH HÀNG";
        } else if (cbb.getSelectedItem().toString().equals("hoadon")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH HÓA ĐƠN";
        } else if (cbb.getSelectedItem().toString().equals("phieunhap")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH PHIẾU NHẬP";
        } else if (cbb.getSelectedItem().toString().equals("ct_phieunhap")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH CHI TIẾT PHIẾU NHẬP";
        } else if (cbb.getSelectedItem().toString().equals("ct_hoadon")) {
            titleName = "BẢNG BÁO CÁO DANH SÁCH CHI TIẾT HÓA ĐƠN";
        }
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new File(path));
        int question = chooser.showSaveDialog(null);
        if (question == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            WritableWorkbook workbook;
            try {
                // tạo 1 workbook
                workbook = Workbook.createWorkbook(new File(file + ".xls"));
                // tạo một trang sheet
                WritableSheet sheet1 = workbook.createSheet("qlsanpham", 0);
                // tạo tiêu đề và thêm vào ô trong sheet
                sheet1.addCell(new Label(0, 0, titleName));
                sheet1.addCell(new Label(tbl.getColumnCount() - 1, tbl.getRowCount() + 4, getCurrentDate()));
                sheet1.addCell(new Label(tbl.getColumnCount() - 1, tbl.getRowCount() + 5, "Ký tên"));
                // dòng cột bắt đầu để ghi nội dung table
                int rowBegin = 3;
                int colBegin = 0;
                //Lấy tiêu đề
                for (int col = colBegin, i = 0; col < tbl.getColumnCount() + colBegin; col++, i++) {
                    sheet1.addCell(new Label(col, 2, tbl.getColumnName(i).toString()));
                }
                //Lấy dữ liệu dòng
                for (int row = rowBegin, i = 0; row < tbl.getRowCount() + rowBegin; row++, i++) {
                    for (int col = colBegin, j = 0; col < tbl.getColumnCount() + colBegin; col++, j++) {
                        sheet1.addCell(new Label(col, row, tbl.getValueAt(i, j).toString()));
                    }
                }
                // ghi file
                workbook.write();
                // đóng workbook
                workbook.close();
                //Thông báo
                JOptionPane.showMessageDialog(null, "Đã xuất tệp tin thành công...");
            } catch (IOException e) {
                System.out.println("Error create file\n" + e.toString());
            } catch (RowsExceededException e) {
                System.out.println("Error write file\n" + e.toString());
            } catch (WriteException e) {
                JOptionPane.showMessageDialog(null, "Quá trình ghi tệp tin thất bại...");
            }
        }
    }
}

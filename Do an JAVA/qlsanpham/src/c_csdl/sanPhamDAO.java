/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_csdl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlsanpham.myStore4;
import qlsanpham.myStore5;

/**
 *
 * @author graze
 */
public class sanPhamDAO {

    sqlConnet conn = new sqlConnet();
    Statement st;
    ResultSet rs;

    public void showData(DefaultTableModel model, String tbl) {
        String sql = "select * from " + tbl;
        executeShowData(sql, model);
    }

    public void showListTable(DefaultTableModel model) {
        String sql = "show tables";
        executeShowData(sql, model);
    }

    //Hàm tìm kiếm với điều kiện đầu vào là 1
    public void sqlSearch(DefaultTableModel model, String table, String where, String place) {
        String sql = "select * from " + table + " where " + where + " like '%" + place + "%'";
        executeShowData(sql, model);
    }

    //Hàm tìm kiếm với điều kiện đầu vào là 2
    public void sqlSearch2(DefaultTableModel model, String table, String where1, String place1, String where2, String place2) {
        String sql = "select * from " + table + " where " + where1 + "= '" + place1
                + "' and " + where2 + "= '" + place2 + "'";
        executeShowData(sql, model);
    }

    //Hàm tìm kiếm rồi show chi tiết của 1 bảng HÓA ÐON or PHIEU NHAP
    public void sqlSearchToGetInfo(DefaultTableModel model, String table, String ma, String masp) {
        String sqlpn = "select pn.MANSX, ct.MASP, pn.MANV from ct_phieunhap ct, phieunhap pn where ct.MAPN = pn.MAPN and ct.MAPN = '" + ma + "' and ct.MASP = '" + masp + "'";
        String sqlhd = "select hd.MAKH, ct.MASP, hd.MANV from ct_hoadon ct, hoadon hd where ct.MAHD = hd.MAHD and ct.MAHD = '" + ma + "' and ct.MASP = '" + masp + "'";
        if (table.equals("HÓA ĐƠN")) {
            executeShowData(sqlhd, model);
        } else if (table.equals("PHIẾU NHẬP")) {
            executeShowData(sqlpn, model);
        }
    }

    //Hàm tính tổng thành tiền
    public void sqlSumPrice(DefaultTableModel model, String table, String where, String place) {
        String sql = "select sum(THANHTIEN) from " + table + " where " + where + " = '" + place + "'";
        executeShowData(sql, model);
    }

    //Hàm sửa cột TONGTIEN (lưu ý đã tính tổng thành tiền rùi)
    public void sqlEditTotalPrice(String table, String totalPrice, String ma) {

        String sqlpn = "update phieunhap set TONGTIEN = '" + totalPrice + "'"
                + " where MAPN = '" + ma + "'";

        String sqlhd = "update hoadon set TONGTIEN = '" + totalPrice + "'"
                + " where MAHD = '" + ma + "'";

        if (table.equals("ct_hoadon")) {
            executeUpdateTotalPrice(sqlhd);
        } else if (table.equals("ct_phieunhap")) {
            executeUpdateTotalPrice(sqlpn);
        }
    }

    //Hàm sửa cho lớp 5 thuộc tính
    public void sqlEditForFive(String table, myStore5 obj) {

        String sqlsp = "update sanpham set TENSP = '" + obj.getCot2() + "'"
                + ", XUATSU = '" + obj.getCot3() + "'"
                + ", SOLUONG = '" + obj.getCot4() + "'"
                + ", DONGIA = '" + obj.getCot5() + "'"
                + " where MASP = '" + obj.getCot1() + "'";

        String sqlpn = "update phieunhap set MANV = '" + obj.getCot2() + "'"
                + ", MANSX = '" + obj.getCot3() + "'"
                + ", NGAYNHAP = '" + obj.getCot4() + "'"
                + ", TONGTIEN = '" + obj.getCot5() + "'"
                + " where MAPN = '" + obj.getCot1() + "'";

        String sqlnv = "update nhanvien set TENNV = '" + obj.getCot2() + "'"
                + ", NGAYSINH = '" + obj.getCot3() + "'"
                + ", DIACHI = '" + obj.getCot4() + "'"
                + ", SDT = '" + obj.getCot5() + "'"
                + " where MANV = '" + obj.getCot1() + "'";

        String sqlhd = "update hoadon set MANV = '" + obj.getCot2() + "'"
                + ", MAKH = '" + obj.getCot3() + "'"
                + ", NGAYBAN = '" + obj.getCot4() + "'"
                + ", TONGTIEN = '" + obj.getCot5() + "'"
                + " where MAHD = '" + obj.getCot1() + "'";

        String sqlctpn = "update ct_phieunhap set SOLUONG = '" + obj.getCot3() + "'"
                + ", DONGIA = '" + obj.getCot4() + "'"
                + ", THANHTIEN = '" + obj.getCot5() + "'"
                + " where MAPN = '" + obj.getCot1() + "' and"
                + " MASP = '" + obj.getCot2() + "'";

        String sqlcthd = "update ct_hoadon set SOLUONG = '" + obj.getCot3() + "'"
                + ", DONGIA = '" + obj.getCot4() + "'"
                + ", THANHTIEN = '" + obj.getCot5() + "'"
                + " where MAHD = '" + obj.getCot1() + "' and"
                + " MASP = '" + obj.getCot2() + "'";

        if (table.equals("sanpham")) {
            executeUpdate(sqlsp);
        } else if (table.equals("hoadon")) {
            executeUpdate(sqlhd);
        } else if (table.equals("phieunhap")) {
            executeUpdate(sqlpn);
        } else if (table.equals("ct_hoadon")) {
            executeUpdate(sqlcthd);
        } else if (table.equals("ct_phieunhap")) {
            executeUpdate(sqlctpn);
        } else if (table.equals("nhanvien")) {
            executeUpdate(sqlnv);
        }
    }

    //Hàm sửa cho lớp 4 thuộc tính
    public void sqlEditForFour(String table, myStore4 obj) {

        String sqlkh = "update khachhang set TENKH = '" + obj.getCot2() + "'"
                + ", DIACHI = '" + obj.getCot3() + "'"
                + ", SDT = '" + obj.getCot4() + "'"
                + " where MAKH = '" + obj.getCot1() + "'";

        String sqlnsx = "update nhasanxuat set TENNSX = '" + obj.getCot2() + "'"
                + ", DIACHI = '" + obj.getCot3() + "'"
                + ", SDT = '" + obj.getCot4() + "'"
                + " where MANSX = '" + obj.getCot1() + "'";

        if (table.equals("khachhang")) {
            executeUpdate(sqlkh);
        } else if (table.equals("nhasanxuat")) {
            executeUpdate(sqlnsx);
        }
    }

    //Hàm xóa với 1 điều kiện đầu vào
    public void sqlDelete(String table, String ma) {
        String sqlsp = "delete from " + table + " where MASP = '" + ma + "'";

        String sqlpn = "delete from " + table + " where MAPN = '" + ma + "'";

        String sqlnv = "delete from " + table + " where MANV = '" + ma + "'";

        String sqlhd = "delete from " + table + " where MAHD = '" + ma + "'";

        String sqlkh = "delete from " + table + " where MAKH = '" + ma + "'";

        String sqlnsx = "delete from " + table + " where MANSX = '" + ma + "'";

        if (table.equals("khachhang")) {
            executeDelete(sqlkh);
        } else if (table.equals("nhasanxuat")) {
            executeDelete(sqlnsx);
        } else if (table.equals("sanpham")) {
            executeDelete(sqlsp);
        } else if (table.equals("hoadon")) {
            executeDelete(sqlhd);
        } else if (table.equals("phieunhap")) {
            executeDelete(sqlpn);
        } else if (table.equals("nhanvien")) {
            executeDelete(sqlnv);
        }
    }

    //Hàm xóa với 2 điều kiện đầu vào
    public void sqlDelete(String table, String ma, String masp) {

        String sqlctpn = "delete from " + table + " where  MAPN = '" + ma + "' and MASP = '" + masp + "'";

        String sqlcthd = "delete from " + table + " where  MAHD = '" + ma + "' and MASP = '" + masp + "'";

        if (table.equals("ct_hoadon")) {
            executeDelete(sqlcthd);
        } else if (table.equals("ct_phieunhap")) {
            executeDelete(sqlctpn);
        }
    }

    //Hàm thêm cho lớp 5 thuộc tính
    public void sqlInsertForFive(String table, myStore5 obj) {
        String sqlsp = "insert into " + table + " (`MASP`, `TENSP`, `XUATSU`, `SOLUONG`, `DONGIA`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        String sqlpn = "insert into " + table + " (`MAPN`, `MANV`, `MANSX`, `NGAYNHAP`, `TONGTIEN`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        String sqlnv = "insert into " + table + " (`MANV`, `TENNV`, `NGAYSINH`, `DIACHI`, `SDT`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        String sqlhd = "insert into " + table + " (`MAHD`, `MANV`, `MAKH`, `NGAYBAN`, `TONGTIEN`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        String sqlcthd = "insert into " + table + " (`MAHD`, `MASP`, `SOLUONG`, `DONGIA`, `THANHTIEN`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        String sqlctpn = "insert into " + table + " (`MAPN`, `MASP`, `SOLUONG`, `DONGIA`, `THANHTIEN`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "','" + obj.getCot5() + "')";

        if (table.equals("sanpham")) {
            executeUpdate(sqlsp);
        } else if (table.equals("hoadon")) {
            executeUpdate(sqlhd);
        } else if (table.equals("phieunhap")) {
            executeUpdate(sqlpn);
        } else if (table.equals("ct_hoadon")) {
            executeUpdate(sqlcthd);
        } else if (table.equals("ct_phieunhap")) {
            executeUpdate(sqlctpn);
        } else if (table.equals("nhanvien")) {
            executeUpdate(sqlnv);
        }
    }

    //Hàm thêm cho lớp 4 thuộc tính
    public void sqlInsertForFour(String table, myStore4 obj) {

        String sqlkh = "insert into " + table + " (`MAKH`, `TENKH`, `DIACHI`, `SDT`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "')";

        String sqlnsx = "insert into " + table + " (`MANSX`, `TENNSX`, `DIACHI`, `SDT`) values ('" + obj.getCot1() + "','"
                + obj.getCot2() + "','" + obj.getCot3() + "','" + obj.getCot4() + "')";

        if (table.equals("khachhang")) {
            executeUpdate(sqlkh);
        } else if (table.equals("nhasanxuat")) {
            executeUpdate(sqlnsx);
        }
    }

    //Thống kê
    //Chọn theo mã sản phẩm
    public void showTotalPriceByProduct(DefaultTableModel model, String ma) {
        String sql = "SELECT sp.MASP, sp.TENSP, SUM(ct.THANHTIEN) AS TONG_TIEN_BAN_DUOC FROM sanpham sp, ct_hoadon ct WHERE  ct.MASP = sp.MASP and ct.MASP = '" + ma + "' GROUP BY ct.MASP";
        executeShowData(sql, model);
    }

    public void showTotalPriceByEmployee(DefaultTableModel model, String ma) {
        String sql = "SELECT nv.MANV, nv.TENNV, SUM(hd.TONGTIEN) AS TONG_TIEN_BAN_DUOC FROM nhanvien nv, hoadon hd WHERE nv.MANV = hd.MANV and hd.MANV = '" + ma + "' GROUP BY hd.MANV";
        executeShowData(sql, model);
    }

    public void showTotalPriceByCustomer(DefaultTableModel model, String ma) {
        String sql = "SELECT kh.MAKH, kh.TENKH, SUM(hd.TONGTIEN) AS TONG_TIEN_DA_MUA FROM khachhang kh, hoadon hd WHERE kh.MAKH = hd.MAKH and hd.MAKH = '" + ma + "' GROUP BY hd.MAKH";
        executeShowData(sql, model);
    }

    public void showTotalPriceByDate(DefaultTableModel model, String ngaybd, String ngaykt) {
        String sql = "SELECT '" + ngaybd + "' as NGAY_BATDAU, '" + ngaykt + "' as NGAY_KETTHUC, SUM(TONGTIEN) as TONG_TIEN_BAN_DUOC FROM hoadon WHERE NGAYBAN >= date('" + ngaybd + "') and NGAYBAN <= date('" + ngaykt + "')";
        executeShowData(sql, model);
    }

    public void showTotalPrice_ChiVon(DefaultTableModel model, String thang, String nam) {
        String sql = "SELECT MONTH(NGAYNHAP) as THANG, YEAR(NGAYNHAP) as NAM ,COUNT(MAPN) as SO_PHIEUNHAP, SUM(TONGTIEN) as VON_DA_CHI from phieunhap where MONTH(NGAYNHAP) = '" + thang + "' and YEAR(NGAYNHAP) = '" + nam + "'";
        executeShowData(sql, model);
    }

    public void showshowTotalPrice_ChiVonOneByOne(DefaultTableModel model, String thang, String nam, String masp) {
        String sql = "SELECT MONTH(pn.NGAYNHAP) as THANG, YEAR(pn.NGAYNHAP) as NAM, ct.MASP, COUNT(ct.MAPN) as SOLANNHAP, SUM(ct.SOLUONG) as TONGSL, ct.DONGIA, SUM(ct.THANHTIEN) as VON_DA_CHI from phieunhap pn , ct_phieunhap ct where pn.MAPN = ct.MAPN and MONTH(pn.NGAYNHAP) = '" + thang + "' and YEAR(pn.NGAYNHAP) = '" + nam + "' and ct.MASP = '" + masp + "'";
        executeShowData(sql, model);
    }

    public void showTotalPrice_ChiThu(DefaultTableModel model, String thang, String nam) {
        String sql = "SELECT MONTH(NGAYBAN) as THANG, YEAR(NGAYBAN) as NAM ,COUNT(MAHD) as SO_HOADON, SUM(TONGTIEN) as VON_THU_DUOC from hoadon where MONTH(NGAYBAN) = '" + thang + "' and YEAR(NGAYBAN) = '" + nam + "'";
        executeShowData(sql, model);
    }

    public void showTotalPrice_ChiThuOneByOne(DefaultTableModel model, String thang, String nam, String masp) {
        String sql = "SELECT MONTH(hd.NGAYBAN) as THANG, YEAR(hd.NGAYBAN) as NAM, ct.MASP, COUNT(ct.MAHD) as SOLANBAN, SUM(ct.SOLUONG) as TONGSL, ct.DONGIA, SUM(ct.THANHTIEN) as VON_THU_DUOC from hoadon hd , ct_hoadon ct where hd.MAHD = ct.MAHD and MONTH(hd.NGAYBAN) = '" + thang + "' and YEAR(hd.NGAYBAN) = '" + nam + "' and ct.MASP = '" + masp + "'";
        executeShowData(sql, model);
    }

    public void showLoLai(DefaultTableModel model, String thang, String nam) {
        String sql = "SELECT '" + thang + "' as THANG, '" + nam + "' as NAM, sum(hd.TONGTIEN) as THU_DUOC, SUM(pn.TONGTIEN) as DA_CHI FROM phieunhap pn , hoadon hd where MONTH(pn.NGAYNHAP) = '" + thang + "' and YEAR(pn.NGAYNHAP) = '" + nam + "' and MONTH(hd.NGAYBAN) = '" + thang + "' and YEAR(hd.NGAYBAN) = '" + nam + "'";
        executeShowData(sql, model);
    }

    //Cập nhật TINHTRANG của hóa đơn
    public void updateStateOfBill(String mahd, String trangthai) {
        String sql = "update hoadon set TINHTRANG = '" + trangthai + "' where MAHD = '" + mahd + "'";
        executeUpdate(sql);
    }

    //Cập nhật số lượng mới cho cột số lượng
    public void updateNumerOfProduct(String masp, int soluong) {
        String sql = "update sanpham set SOLUONG = '" + soluong + "' where MASP = '" + masp + "'";
        executeUpdate(sql);
    }

    public void executeUpdate(String sql) {
        try {
            if (conn.getConnect()) {
                st = conn.getConn().createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Đã thực hiện thành công", "OPERATION SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Truy vấn không được, vui lòng kiểm tra lại ...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void executeUpdateTotalPrice(String sql) {
        try {
            if (conn.getConnect()) {
                st = conn.getConn().createStatement();
                st.executeUpdate(sql);
                //JOptionPane.showMessageDialog(null, "Đã thực hiện thành công", "OPERATION SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Truy vấn không được, vui lòng kiểm tra lại ...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void executeDelete(String sql) {
        try {
            if (conn.getConnect()) {
                st = conn.getConn().createStatement();
                int question = JOptionPane.showConfirmDialog(null, "Chắc chắn muốn xóa danh sách này ?", "XÓA", JOptionPane.YES_NO_OPTION);
                if (question == JOptionPane.YES_OPTION) {
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Đã thực hiện thành công", "OPERATION SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hãy xóa bỏ 'SẢN PHẨM' khỏi các bảng 'HÓA ĐƠN' hay 'PHIẾU NHẬP'...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void executeShowData(String sql, DefaultTableModel model) {
        try {
            if (conn.getConnect()) {
                st = conn.getConn().createStatement();
                rs = st.executeQuery(sql);

                //Đọc dữ liệu tiêu đề của từng cột
                ResultSetMetaData meta = rs.getMetaData();
                int colCount = meta.getColumnCount();
                ArrayList<String> arrayCol = new ArrayList<String>();
                for (int i = 1; i <= colCount; i++) {
                    arrayCol.add(meta.getColumnName(i));
                }
                model.setColumnIdentifiers(arrayCol.toArray());

                //Đọc dữ liệu dòng.
                while (rs.next()) {
                    Vector row = new Vector();
                    for (int i = 1; i <= colCount; i++) {
                        row.add(rs.getString(i));
                    }
                    model.addRow(row);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không tải được dữ liệu, xin kiểm tra lại", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.printf("Chương trình gặp lỗi, không thực hiện được !");
        }
    }
}

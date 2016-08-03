--
-- Database: `qlsanpham2`
--

-- --------------------------------------------------------

--
-- Table structure for table `ct_hoadon`
--

CREATE TABLE `ct_hoadon` (
  `MAHD` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MASP` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `SOLUONG` int(10) UNSIGNED NOT NULL,
  `DONGIA` int(10) UNSIGNED NOT NULL,
  `THANHTIEN` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `ct_hoadon`
--

INSERT INTO `ct_hoadon` (`MAHD`, `MASP`, `SOLUONG`, `DONGIA`, `THANHTIEN`) VALUES
('HD001', 'TV001', 1, 7000000, 7000000),
('HD002', 'TV002', 1, 8000000, 8000000),
('HD003', 'TV004', 1, 9000000, 9000000),
('HD003', 'TV006', 1, 8000000, 8000000),
('HD004', 'TV003', 1, 7000000, 7000000),
('HD004', 'TV005', 1, 6000000, 6000000);

-- --------------------------------------------------------

--
-- Table structure for table `ct_phieunhap`
--

CREATE TABLE `ct_phieunhap` (
  `MAPN` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MASP` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `SOLUONG` int(10) UNSIGNED NOT NULL,
  `DONGIA` int(10) UNSIGNED NOT NULL,
  `THANHTIEN` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `ct_phieunhap`
--

INSERT INTO `ct_phieunhap` (`MAPN`, `MASP`, `SOLUONG`, `DONGIA`, `THANHTIEN`) VALUES
('PN001', 'TV001', 10, 6000000, 60000000),
('PN001', 'TV002', 10, 7000000, 70000000),
('PN002', 'TV003', 5, 6000000, 30000000),
('PN002', 'TV004', 10, 8000000, 80000000),
('PN003', 'TV005', 12, 5000000, 60000000),
('PN003', 'TV006', 10, 7000000, 70000000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MAHD` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MANV` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MAKH` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYBAN` date NOT NULL,
  `TONGTIEN` int(10) UNSIGNED NOT NULL,
  `TINHTRANG` varchar(5) COLLATE utf8_unicode_ci NOT NULL DEFAULT '-----'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MAHD`, `MANV`, `MAKH`, `NGAYBAN`, `TONGTIEN`, `TINHTRANG`) VALUES
('HD001', 'NV001', 'KH002', '2015-05-20', 7000000, 'OK'),
('HD002', 'NV003', 'KH001', '2015-05-29', 8000000, 'OK'),
('HD003', 'NV004', 'KH003', '2015-06-10', 17000000, '-----'),
('HD004', 'NV002', 'KH004', '2015-06-24', 13000000, '-----');

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MAKH` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TENKH` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `DIACHI` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(12) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MAKH`, `TENKH`, `DIACHI`, `SDT`) VALUES
('KH001', 'Phan Minh Tuấn', '322 Tôn Thất Hiệp, P10, Q11, TP HCM', '0122885155'),
('KH002', 'Đặng Đức Nghĩa', '45 Nguyễn Văn Luông, P15, Q6, TP HCM', '0982586825'),
('KH003', 'Mã Minh Mẫn', '22 Bình Thới, P10, Q11, TP HCM', '01211574811'),
('KH004', 'Steve Jobs', 'America, (^_^)', '4395958151');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TENNV` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYSINH` date NOT NULL,
  `DIACHI` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(12) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `NGAYSINH`, `DIACHI`, `SDT`) VALUES
('NV001', 'Lê Ngọc Trọng', '1990-01-20', '123 Nguyễn Chí Thanh, P12, Q11, TPHCM', '0905522990'),
('NV002', 'Nguyễn Phước Sang', '1990-08-23', '56 Bà Hạt, P12, Q11, TPHCM', '01228588528'),
('NV003', 'Nguyễn Hoàng Nhật', '1991-02-28', '76A Nguyễn Tri Phương, P12, Q11, TPHCM', '09035896828'),
('NV004', 'Mạc Khải Quân', '1992-05-20', '143 Lũy Bán Bích, Hòa Thạnh, Tân Phú, TPHCM', '0936982844');

-- --------------------------------------------------------

--
-- Table structure for table `nhasanxuat`
--

CREATE TABLE `nhasanxuat` (
  `MANSX` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TENNSX` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `DIACHI` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(12) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhasanxuat`
--

INSERT INTO `nhasanxuat` (`MANSX`, `TENNSX`, `DIACHI`, `SDT`) VALUES
('SX001', 'Công ty cổ phần điện máy ABC', '120 Trần Duy Hưng, P.Trung Hoà, Q.Cầu Giấy, Hà Nội', '08 8943 3462'),
('SX002', 'Công ty cổ phần điện máy XYZ', '20 Kim Đồng, Quảng Ninh, Việt Nam', '08 3234 5876'),
('SX003', 'Công ty điện máy Thành Công', 'Lô D chung cư Hùng Vương, Mạc Thiên Tích, phường 11, TPHCM', '08 8855 5662');

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MAPN` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MANV` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MANSX` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYNHAP` date NOT NULL,
  `TONGTIEN` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`MAPN`, `MANV`, `MANSX`, `NGAYNHAP`, `TONGTIEN`) VALUES
('PN001', 'NV001', 'SX002', '2015-03-20', 130000000),
('PN002', 'NV003', 'SX001', '2015-06-20', 110000000),
('PN003', 'NV002', 'SX002', '2016-01-21', 130000000);

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `MASP` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TENSP` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `XUATSU` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `SOLUONG` int(10) UNSIGNED NOT NULL,
  `DONGIA` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`MASP`, `TENSP`, `XUATSU`, `SOLUONG`, `DONGIA`) VALUES
('TV001', 'Tivi Samsung', 'Korea', 9, 7000000),
('TV002', 'Tivi Sony', 'Japan', 9, 8000000),
('TV003', 'Tivi Toshiba', 'Japan', 5, 7000000),
('TV004', 'Smart Tivi Letv', 'China', 10, 9000000),
('TV005', 'Tivi Panasonic', 'Japan', 12, 6000000),
('TV006', 'Tivi LG', 'Korea', 10, 8000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ct_hoadon`
--
ALTER TABLE `ct_hoadon`
  ADD PRIMARY KEY (`MAHD`,`MASP`),
  ADD KEY `MASP` (`MASP`);

--
-- Indexes for table `ct_phieunhap`
--
ALTER TABLE `ct_phieunhap`
  ADD PRIMARY KEY (`MAPN`,`MASP`),
  ADD KEY `MASP` (`MASP`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MAHD`,`MANV`,`MAKH`),
  ADD UNIQUE KEY `MAHD` (`MAHD`),
  ADD KEY `MAKH` (`MAKH`),
  ADD KEY `MANV` (`MANV`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MAKH`),
  ADD UNIQUE KEY `MAKH` (`MAKH`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`),
  ADD UNIQUE KEY `MANV` (`MANV`);

--
-- Indexes for table `nhasanxuat`
--
ALTER TABLE `nhasanxuat`
  ADD PRIMARY KEY (`MANSX`),
  ADD UNIQUE KEY `MANSX` (`MANSX`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MAPN`,`MANV`,`MANSX`),
  ADD UNIQUE KEY `MAPN` (`MAPN`),
  ADD KEY `phieunhap_ibfk_1` (`MANV`),
  ADD KEY `phieunhap_ibfk_2` (`MANSX`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MASP`),
  ADD UNIQUE KEY `MASP` (`MASP`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ct_hoadon`
--
ALTER TABLE `ct_hoadon`
  ADD CONSTRAINT `ct_hoadon_ibfk_1` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ct_hoadon_ibfk_2` FOREIGN KEY (`MAHD`) REFERENCES `hoadon` (`MAHD`) ON UPDATE CASCADE;

--
-- Constraints for table `ct_phieunhap`
--
ALTER TABLE `ct_phieunhap`
  ADD CONSTRAINT `ct_phieunhap_ibfk_1` FOREIGN KEY (`MAPN`) REFERENCES `phieunhap` (`MAPN`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ct_phieunhap_ibfk_2` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`) ON UPDATE CASCADE;

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MAKH`) REFERENCES `khachhang` (`MAKH`) ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`) ON UPDATE CASCADE;

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`) ON UPDATE CASCADE,
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MANSX`) REFERENCES `nhasanxuat` (`MANSX`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE DATABASE UPCOFFEE
GO
USE UPCOFFEE
GO 
--DROP DATABASE UPCOFFEE
CREATE TABLE NhanVien(
	ID_Nhanvien VARCHAR(10) PRIMARY KEY NOT NULL,
	TenNV NVARCHAR(50) NOT NULL,
	Gender BIT NOT NULL,
	Ngaysinh DATE NOT NULL,
	Diachi NVARCHAR(100),
	Email NVARCHAR(100),
	SDT VARCHAR(11),
	Username VARCHAR(50) NOT NULL,
	Pass VARCHAR(50) NOT NULL,
	Vaitro BIT DEFAULT 0,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)

GO 
CREATE TABLE HoaDon(
	ID_Hoadon INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	ID_Nhanvien VARCHAR(10) NOT NULL,
	Ngaytao DATETIME DEFAULT GETDATE(),
	Trangthai BIT DEFAULT 1,
	TTThanhtoan BIT DEFAULT 0,
	Thanhtien INT,
	Lydohuy NVARCHAR(100),
	Soluongsanphamhuy INT,
	ghichu NVARCHAR(100),
	SDT VARCHAR(11),
	Ten NVARCHAR(50),
	diaChi NVARCHAR(50),
	tenShip INT 
)
GO 
CREATE TABLE SanPham(
	ID_Sanpham VARCHAR(10) PRIMARY KEY NOT NULL,
	TenSP NVARCHAR(50) NOT NULL,
	Gia INT NOT NULL,
	ID_DonviSP VARCHAR(10) NOT NULL,
	ID_LoaiSP VARCHAR(10) NOT NULL,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)
GO 
CREATE TABLE LoaiSanPham(
	ID_LoaiSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenLoai NVARCHAR(20) NOT NULL,
)
GO 
CREATE TABLE DonViSanPham(
	ID_DonviSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenDonvi NVARCHAR(20) NOT NULL,
	Kichthuoc INT NOT NULL,
	ThemTien INT 
)
GO 
CREATE TABLE Ban(
	ID_Ban INT NOT NULL PRIMARY KEY,
	Trangthai BIT, -- Bàn ảo = 0 là dùng để tạo đơn mang về và bàn thật = 1
	Hoatdong BIT, 
	Soluongcho INT, -- Số lượng chỗ ngồi trong 1 bàn
)
GO 
CREATE TABLE BanChiTiet(
	ID_Ban INT NOT NULL,
	ID_Hoadon INT NOT NULL,
	Thoidiemconguoi TIME,
	Donchinh BIT -- =0 đơn phụ không thực hiện thao tác =1 là đơn chính thực hiện thao tác
)
GO 
CREATE TABLE HoaDonChiTiet(
	ID_HoaDon INT NOT NULL,
	ID_SanPham VARCHAR(10) NOT NULL,
	Soluong INT NOT NULL,
	Gia INT NOT NULL,
	TongGia INT NOT NULL,
	TTthanhtoan BIT DEFAULT 0,
	Lydohuy NVARCHAR(100),
	ghichu NVARCHAR(100)
	--trang thai thanh toan
)
GO 
CREATE TABLE BanDat(
	ID_Ban INT NOT NULL,
	ID_NhanVien VARCHAR(10) NOT NULL, 
	TenKH NVARCHAR(50) NOT NULL,
	SDT VARCHAR(11) NOT NULL,
	Thoigian TIME NOT NULL
)
GO 
CREATE TABLE GiamGia(
	Id_GiamGia INT IDENTITY(1,1) PRIMARY KEY,
	Tensukien NVARCHAR(100),
	ID_Nhanvien VARCHAR(10),
	Ngaybd DATETIME,
	ngaykt DATETIME,	
)
GO
CREATE TABLE Giamgiachitiet(
	Id_GiamGia INT,
	ID_Sanpham VARCHAR(10),
	Giam INT
)
GO 
--Foreign key
ALTER TABLE dbo.HoaDon ADD FOREIGN KEY(ID_Nhanvien) REFERENCES dbo.NhanVien(ID_Nhanvien) --Hoadon
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_HoaDon) REFERENCES dbo.HoaDon(ID_Hoadon) --Hoadonchitiet
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_SanPham) REFERENCES dbo.SanPham(ID_Sanpham) --Hoadonchitiet
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_DonviSP) REFERENCES dbo.DonViSanPham(ID_DonviSP) --Sanpham
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_LoaiSP) REFERENCES dbo.LoaiSanPham(ID_LoaiSP) --SanPham
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --BanDat
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_NhanVien) REFERENCES dbo.NhanVien(ID_Nhanvien) --BanDat
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --banchitiet
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Hoadon) REFERENCES dbo.HoaDon(ID_Hoadon) --banchitiet
ALTER TABLE dbo.GiamGia ADD FOREIGN KEY(ID_Nhanvien) REFERENCES dbo.NhanVien(ID_Nhanvien) --GiamGia
ALTER TABLE dbo.Giamgiachitiet ADD FOREIGN KEY(Id_GiamGia) REFERENCES dbo.GiamGia(Id_GiamGia) --Giamgiachitiet
ALTER TABLE dbo.Giamgiachitiet ADD FOREIGN KEY(ID_Sanpham) REFERENCES dbo.SanPham(ID_Sanpham) --Giamgiachitiet
--
------------------ PHẦN TRUY VẤN -------------------
select * from NhanVien
select * from HoaDon
select * from HoaDonChiTiet
select * from Ban
select * from BanChiTiet
select * from SanPham
select * from DonViSanPham
select * from LoaiSanPham
select * from GiamGia
select * from Giamgiachitiet
------------------ PHẦN INSERT---------------------
--Loaisanpham
INSERT dbo.LoaiSanPham VALUES('LSP1', N'Cà phê')
INSERT dbo.LoaiSanPham VALUES('LSP2', N'Sinh tố')
INSERT dbo.LoaiSanPham VALUES('LSP3', N'Nước ngọt')
INSERT dbo.LoaiSanPham VALUES('LSP4', N'Trà')
INSERT dbo.LoaiSanPham VALUES('LSP5', N'Sữa')
go
--Donvisanpham
INSERT dbo.DonViSanPham VALUES('DV1', N'M',250,0)
INSERT dbo.DonViSanPham VALUES('DV2', N'X',300,5000)
INSERT dbo.DonViSanPham VALUES('DV3', N'L',350,7000)
INSERT dbo.DonViSanPham VALUES('DV4', N'XL',400,10000)
go
--SanPham
INSERT dbo.SanPham VALUES ('SP1',N'Cà phê sữa',30000,'DV1','LSP1',1,N'') -- cà phê
INSERT dbo.SanPham VALUES ('SP2',N'Cà phê phin',35000,'DV1','LSP1',1,N'') -- cà phê
INSERT dbo.SanPham VALUES ('SP3',N'Sinh tố bơ',32000,'DV1','LSP2',1,N'') -- sinh tố
INSERT dbo.SanPham VALUES ('SP4',N'Sinh tố xoài',33000,'DV1','LSP2',1,N'') -- sinh tố
INSERT dbo.SanPham VALUES ('SP5',N'Coca Cola',10000,'DV1','LSP3',1,N'') -- nước ngọt
INSERT dbo.SanPham VALUES ('SP6',N'Pepsi',10000,'DV1','LSP3',1,N'') -- nước ngọt
INSERT dbo.SanPham VALUES ('SP7',N'Trà Đào',15000,'DV1','LSP4',1,N'') -- Trà
INSERT dbo.SanPham VALUES ('SP8',N'Trà Chanh',10000,'DV1','LSP4',1,N'') -- Trà
INSERT dbo.SanPham VALUES ('SP9',N'Sữa Milo',9000,'DV1','LSP5',1,N'') -- Sữa
INSERT dbo.SanPham VALUES ('SP10',N'TH True Milk',9000,'DV1','LSP5',1,N'') -- Sữa
go
--Nhanvien
INSERT dbo.NhanVien VALUES('NV1',N'Đào Gia Phong',1,'2000/10/11',N'Hà Nội',N'giaphong@gmail.com','0123456789','giaphong','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV2',N'Dương Văn Quốc',1,'2002/04/30',N'Hà Nội',N'duong.quoc304@gmail.com','0123456789','duongquoc','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV3',N'Lương Văn Sơn',1,'2000/10/11',N'Hà Nội',N'luongvanson@gmail.com','0123456789','son','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV4',N'Phạm Đức Hoàn',1,'1995/10/11',N'Hà Nội',N'phamduchoan@gmail.com','0123456789','hoan','123456',1, 1,N'')
INSERT dbo.NhanVien VALUES('NV5',N'Nhân Viên A',0,'2004/10/11',N'Hà Nội',N'nhanviena@gmail.com','0123456789','nhanviena','123456',0, 1,N'')
go
--Giam
INSERT dbo.GiamGia VALUES(N'Noel','NV1',GETDATE(),GETDATE())
INSERT dbo.GiamGia VALUES(N'Event','NV1','2002/10/11','2002/10/11')
INSERT dbo.GiamGia VALUES(N'Khai trương','NV1',GETDATE(),GETDATE())
go
--Giam chi tiết
--INSERT dbo.Giamgiachitiet VALUES(1,'SP1',20)
--INSERT dbo.Giamgiachitiet VALUES(2,'SP2',10)
--INSERT dbo.Giamgiachitiet VALUES(3,'SP3',30)

--Ban
--INSERT dbo.Ban VALUES(0,1,1,2)--TRang thai = 1 la mang ban su dung, Hoatdong = 1 la ban trong =0 la ban dang co nguoi
--INSERT dbo.Ban VALUES(15,0,1,2)
--SELECT * FROM dbo.Ban WHERE Trangthai = 1
--DELETE FROM dbo.HoaDon
--UPDATE dbo.Ban SET Hoatdong = 1 WHERE ID_Ban = 0
--HoaDon
--select*from HoaDon
--select*from HoaDonChiTiet
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,1) --Trangthai = 1 la hoatdong, Trangthai = 0 la huydon
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,0) --TTThanhtoan = 1 la da thanh toan = 0 chua thanh toan
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),0,0) --
--SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 0'
select * from hoadon
GO 
CREATE PROC chuyendon (@mahd int)
AS
BEGIN 
	DELETE FROM dbo.BanChiTiet WHERE ID_Hoadon = @mahd
	DELETE FROM dbo.HoaDon WHERE ID_Hoadon = @mahd
END 
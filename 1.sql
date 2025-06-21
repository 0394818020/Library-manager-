Create table Book (
	id INT primary key auto_increment,
    title VARCHAR (100),
    author VARCHAR (100),
    category VARCHAR (100),
    quantity INT,
    available boolean
);

create table Reader (
	id INT primary key auto_increment,
    name VARCHAR (100),
    yearOfBirth INT,
    email VARCHAR (100)
);
    
create table Loan (
	id INT primary key auto_increment,
    bookId INT,
    readerId INT,
    borrowDate Date,
    returnDate Date,
    status varchar(100),
    foreign key (bookId) references Book(id),
    foreign key (readerId) references Reader(id)
);

create table NhanVien (
	maNV varchar(100),
    name varchar(100),
    email varchar(100),
    yearOfBirth INT,
    number_phone varchar(10),
    ChucVu varchar(100)
    );

create table TaiKhoan (
	ChucVu varchar(100),
	maNV varchar(100),
    lg_name varchar(100),
    lg_pass varchar(100)
    );

-- Lấy dữ liệu cho phiếu mượn
SELECT l.id, b.title AS book_title, r.name AS reader_name, l.borrowDate, l.returnDate, l.status FROM Loan l
JOIN Book b ON l.bookId = b.id
JOIN Reader r ON l.readerId = r.id;

-- Sử lí trả sách
DELETE FROM Loan WHERE id = ?

-- Cộng 1 sách khi trả
UPDATE Book SET quantity = quantity + 1 WHERE id = ?

-- trừ 1 sách khi mượn
UPDATE Book SET quantity = quantity - 1 WHERE id = ? AND quantity > 0

-- Sử lí quá hạn trả
UPDATE Loan SET status = 'Quá hạn' WHERE status = 'Đang mượn' AND returnDate < CURDATE()
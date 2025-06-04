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

-- Lấy dữ liệu cho phiếu mượn
SELECT l.id, b.title AS book_title, r.name AS reader_name, l.borrowDate, l.returnDate, l.status FROM Loan l
JOIN Book b ON l.bookId = b.id
JOIN Reader r ON l.readerId = r.id;
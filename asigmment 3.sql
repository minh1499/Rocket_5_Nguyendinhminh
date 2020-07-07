USE qlbh;

INSERT INTO Department (DepartmentName) VALUES ('Kiem toan'),
('Nhan su'),
('Giam sat va Quan ly'),
('Marketing'),
('Creating content'),
('Ky thuat'),
('Sale'),
('Cong doan'),
('Ke toan'),
('Security');

INSERT INTO Position (PositionName) VALUES ('Chu tich hoi dong quan tri'),
('Pho chu tich'),
('Giam doc'),
('Truong phong'),
('Pho phong'),
('Quan ly'),
('Nhan vien chinh thuc'),
('Nhan vien hop dong'),
('Nhan vien thu viec'),
('Thuc tap sinh');

INSERT INTO `Account` (Email,Username,FullName,DepartmentID,PositionID,CreateDate) VALUES ('demo@gmail.com', 'Tran Trang','Tran Thao Trang','1','2','2020-01-01'),
('demo1@gmail.com', 'Dinh Minh','Ngueyn Dinh Minh','1','6','2020-01-01'),
('demo2@gmail.com', 'Tran Dung','Tran Van Dung','1','7','2020-01-01'),
('demo3@gmail.com', 'Nguyen Tung','Nguyen Van Tung','4','2','2020-01-05'),
('demo4@gmail.com', 'Cao Thao','Cao Minh Thao','4','7','2020-01-01'),
('demo5@gmail.com', 'Tran An','Tran Van An','5','2','2020-01-10'),
('demo6@gmail.com', 'Tran Cung','Tran Manh Cung','5','6','2020-01-01'),
('demo7@gmail.com', 'Phan Thang','Phan Huy Thang','5','7','2020-01-05'),
('demo8@gmail.com', 'Le Nhung','Le Thi Hong Nhung','5','10','2020-05-01'),
('demo9@gmail.com', 'Le Huy','Le Dang Huy','3','1','2020-01-01');

INSERT INTO Groupp (GroupName,CreatorID,CreateDate) VALUES ('Group phong ban Ke toan',1,'2020-01-05'),
('Group phong ban Nhan su',10,'2020-01-05'),
('Group phong ban Giam sat va Quan ly',10,'2020-01-05'),
('Group phong ban Marketing',4,'2020-01-05'),
('Group phong ban Creating Content',5,'2020-01-05'),
('Group phong ban Ky thuat',10,'2020-01-05'),
('Group phong ban Sale',10,'2020-01-05'),
('Group phong ban Cong doan',10,'2020-01-05'),
('Group phong ban Kiem toan',10,'2020-01-05'),
('Group phong ban Security',10,'2020-01-05');

INSERT INTO GroupAccount VALUES (1,1,'2020-01-05'),
(1,2,'2020-01-06'),
(1,3,'2020-01-20'),
(4,4,'2020-01-05'),
(4,5,'2020-01-07'),
(5,6,'2020-01-05'),
(5,7,'2020-01-05'),
(5,8,'2020-01-08'),
(5,9,'2020-01-28'),
(3,10,'2020-01-05');

INSERT INTO TypeQuestion VALUES (1,'Trac nghiem IQ'),
(2,'Trac nghiem nang luc'),
(3,'Trac nghiem dau vao'),
(4,'Tu luan chung'),
(5,'Danh gia sang tao'),
(6,'Danh gia dinh ky nhan vien');

INSERT INTO CategoryQuestion (CategoryName) VALUES ('Ve cong ty'),
('Ve ban than'),
('Kien thuc chung'),
('Kien thuc chuyen mon'),
('Su hieu biet ve nganh'),
('Danh gia tuong lai cua nganh'),
('Dinh huong ve nganh'),
('Cau hoi them'),
('Hieu biet xa hoi'),
('Nhung van de lien quan khac');

INSERT INTO Question (Content,CategoryID,TypeID,CreatorID,CreateDate) VALUES ('demo',1,3,10,'2020-05-01'),
('demo 1',2,3,10,'2020-05-01'),
('demo mot chut',4,3,10,'2020-05-05'),
('demo 2',8,1,10,'2020-05-06'),
('demo 3',10,6,10,'2020-05-01'),
('demo',2,6,10,'2020-05-01'),
('demo 1',2,6,10,'2020-05-10'),
('demo 2',10,6,10,'2020-05-01'),
('demo 2',10,5,10,'2020-06-01'),
('demo 2',1,1,10,'2020-05-03');

INSERT INTO Answer (Content,QuestionID,isCorrect) VALUES ('Demo',1,'Correct'),
('Demo',2,'Correct'),
('Demo1',3,'Correct'),
('Demo chut',4,'Wrong'),
('Demo',5,'Correct'),
('Demo',6,'Wrong'),
('Demo 2',7,'Correct'),
('Demo1',8,'Correct'),
('Demo',9,'Wrong'),
('Demo',10,'Correct');

INSERT INTO Exam (Codee,Title,CategoryID,Duration,CreatorID,CreateDate) VALUES (1,'Demo 1 chut',1,'2020-07-01 9:00:00',10,'2020-05-20'),
(1,'Demo',2,'2020-07-01 9:00:00',10,'2020-05-19'),
(1,'Demo',4,'2020-07-01 9:00:00',10,'2020-05-20'),
(2,'Demo',7,'2020-07-02 14:00:00',10,'2020-05-21'),
(2,'Demo',3,'2020-07-02 14:00:00',10,'2020-05-22'),
(1,'Demo',3,'2020-07-01 9:00:00',10,'2020-05-23'),
(3,'Demo',4,'2020-07-05 9:00:00',10,'2020-06-24'),
(3,'Demo',8,'2020-07-05 9:00:00',10,'2020-06-25'),
(1,'Demo',6,'2020-07-01 9:00:00',10,'2020-06-26'),
(2,'Demo',1,'2020-07-03 9:00:00',10,'2020-05-27');

INSERT INTO ExamQuestion VALUES (1,1),
(1,4),
(2,3),
(2,7),
(1,7),
(3,7),
(5,5),
(6,8),
(8,9),
(10,4);

/* cau 2 */
SELECT 
    *
FROM
    Department;
    
/* cau 3 */
SELECT 
    DepartmentID, DepartmentName
FROM
    Department
WHERE
    DepartmentName = 'Sale';
    
/* cau 4 */
SELECT 
    *
FROM
    `Account`
WHERE
    FullName = (SELECT 
            MAX(FullName)
        FROM
            `Account`);

/* cau 5 */
SELECT 
    *
FROM
    `Account`
WHERE
    FullName = (SELECT 
            MAX(FullName)
        FROM
            `Account`)
        AND DepartmentID = 3;

/* cau 6 */
SELECT 
    GroupName, CreateDate
FROM
    `Groupp`
WHERE
    CreateDate < '2019-12-20';
    
    /* cau 7 */
SELECT 
    GroupName, CreateDate
FROM
    `Groupp`
WHERE
    CreateDate < '2019-12-20';
      /* cau 8 */
      /* cau 9 */
SELECT 
    ExamID, CreateDate
FROM
    Exam
WHERE
    CreateDate < '2019-12-20';
    /* duration */
    
    /*cau10*/
    SELECT 
    COUNT(*)
FROM
    `Account`
WHERE
    DepartmentID = 2;
    
    
     /*cau11 */
    SELECT 
    FullName
FROM
    `Account`
WHERE
    FullName LIKE ('D%O');
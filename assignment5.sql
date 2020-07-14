/*Tạo view có chứa danh sách nhân viên thuộc phòng ban sale*/
CREATE OR REPLACE VIEW bai1 AS
    SELECT 
        accountid, fullname
    FROM
        department d
            JOIN
        `account` a ON d.departmentid = a.departmentid
    WHERE
        departmentname = 'sale';
        
/* Tạo view có chứa thông tin các account tham gia vào nhiều group nhất */

CREATE OR REPLACE VIEW bai2 AS
SELECT 
    accountid, COUNT(groupid) AS solan
FROM
    groupaccount
GROUP BY accountid
HAVING solan = (SELECT 
        MAX(b)
    FROM
        (SELECT 
            COUNT(groupid) AS b
        FROM
            groupaccount
        GROUP BY accountid) AS a)
ORDER BY accountid;

/* Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
được coi là quá dài) và xóa nó đi */
create or replace view bai3 as
select questionid,length(content) from question
where length(content)>=30;

select questionid from bai3;

/* Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất */
CREATE OR REPLACE VIEW bai4 AS
    SELECT 
        departmentname, COUNT(a.departmentid) AS soluong
    FROM
        department d
            JOIN
        `account` a ON d.departmentid = a.departmentid
    GROUP BY d.departmentid
    HAVING COUNT(a.departmentid) = (SELECT 
            MAX(b)
        FROM
            (SELECT 
                COUNT(a.departmentid) AS b
            FROM
                department d
            JOIN `account` a ON d.departmentid = a.departmentid
            GROUP BY d.departmentid) AS a);
            
/* Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo a */
CREATE OR REPLACE VIEW bai5 AS
    SELECT 
        fullname, questionid
    FROM
        `account` a
            JOIN
        question q ON a.accountid = q.creatorid
    WHERE
        fullname LIKE 'Nguyen%';
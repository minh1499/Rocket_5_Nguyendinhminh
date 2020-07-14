/*  Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó  */
delimiter $$
create procedure q1(in department1 VARCHAR(30))
begin
	SELECT 
   a.*
FROM
    department d
        JOIN
    account a ON d.departmentid = a.departmentid
WHERE
    d.departmentName = department1;
end $$
delimiter ;

call q1('Marketing');

iNSERT INTO `Account`(Email								, Username			, FullName				, DepartmentID	, PositionID, CreateDate)
VALUES 				('haidang29productions@gmail.coma'	, 'dangblacka'		,'Nguyen Hai Danga'		,   '1'			,   '1'		,'2020-03-05');

/*Tạo store để in ra số lượng account trong mỗi group  */
drop procedure q2
delimiter $$
create procedure q2(in idgroup VARCHAR(30))
begin
	declare sl1 int;
	SELECT 
    COUNT(groupid) as soluong into sl1
FROM
    groupaccount
    where groupid=idgroup
GROUP BY groupid;
	select sl1;

end $$
delimiter ;

call q2('1');

/* Tạo store để trả ra id của type question có nhiều câu hỏi nhất  */
select tq.typeid,typename,count(*)as a
from typequestion tq
left join question q
on tq.typeid=q.typeid
group by tq.typeid
having count(*)=(select max(b) from (select count(questionid)as b from typequestion tq
left join question q
on tq.typeid=q.typeid
group by tq.typeid)as c ); 

delimiter $$
create procedure q4()
begin
	select tq.typeid,typename,count(*)as a
from typequestion tq
left join question q
on tq.typeid=q.typeid
group by tq.typeid
having count(*)=(select max(b) from (select count(questionid)as b from typequestion tq
left join question q
on tq.typeid=q.typeid
group by tq.typeid)as c ); 


end $$
delimiter ;

call q4();

/* Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào  */
select GroupName
from `Group`
where groupname like '%a%';

select username
from `account`
where username like '%a%';

delimiter $$
create procedure q6(chuoinhap varchar(30))
begin
select GroupName
from `Group`
where groupname like '% chuoinhap %';

select username
from `account`
where username like '%chuoinhap%';

end $$
delimiter ;

call q6('a')


	
    
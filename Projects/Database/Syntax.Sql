create database university;
show databases;
use university;
show tables;

create table Unistud
(
studId int auto_increment,
studName varchar(20) not null,
studDOB date,
studMOB varchar(10) unique,
studDept varchar(10) not null,
studYear varchar(4) not null,
studAVG varchar(3) not null,
primary key(studId)
);

desc Unistud;

insert into Unistud (studName, studDOB, studMOB, studDept, studYear, studAVG)
values('Nikita','1997-02-04','9878665534','Computer','BE',85),
('Snehal','1998-04-03','8087645533','IT','TE',90),
('Diksha','1999-12-12','9878600004','IT','TE',88),
('Supriya','1997-11-11','9845675533','IT','BE',80),
('Raj','1996-09-04','7866057866','EXTC','TE',89),
('Vrisha','1998-12-01','8087897744','Civil','BE',87),
('Tanishka','2000-03-05','9856332200','Computer','TE',70),
('Priyansh','1995-02-11','9112365534','Mechanical','BE',80),
('Aarti','1994-08-24','9877554427','IT','FE',80),
('Bhavika','1998-04-14','9119674553','Mechanical','TE',80);

select * from Unistud;

UPDATE Unistud
SET studDept = 'IT', studDOB= '1997-09-22'
WHERE studId = 6;

select * from Unistud;

create table UniStaff
(
staffId int ,
staffName varchar(20) not null,
staffMOB varchar(20) unique,
staffDesg varchar(25),
staffDept varchar(10) not null,
staffSalary int not null,
primary key (staffId)
);

insert into Unistaff values
(1,'Shalini',8756904762,'Teaching','IT',89000),
(2,'Nikhil',8756504762,'Teaching','Mech',450000),
(3,'Jasreen',7469047902,'Teaching','Extc',787000),
(4,'Janvhi',7455604761,'Teaching','IT',900000),
(5,'Tushar',8269047617,'Teaching','CS',679000),
(6,'Sheetal',7653904987,'Teaching','Commun',760000),
(7,'Mike',7187904760,'Teaching','Civil',979000),
(8,'Gaurav',9875904764,'Teaching','Aero',560000),
(9,'Girish',9875904701,'Teaching','IT',900000);
select * from Unistaff;


select studName from Unistud where studAVG < 85;
select sum(studAVG) from Unistud where studAVG < 90;
select max(studAVG) from Unistud where studYear = 'TE';
select * from Unistud where studDept like '%a%';
select staffName from Unistaff where staffDept='IT' and staffSalary= 600000<80000;
select staffMOB from Unistaff;
select * from Unistaff where staffName like '%u%';

create table people
(
pplId int ,
primary key (pplId)
);
show tables;
alter table people add area varchar(45);
alter table people add address varchar(45);
alter table people add mail varchar(45);
alter table people drop address;
alter table people drop mail;
alter table people modify mail varchar(25);
alter table people rename column mail to email;
desc people;

drop table people;
show tables;

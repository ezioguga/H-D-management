create table income(
IncomeID integer primary key,
IncomeAmount integer,
Descriptions varchar(50),
dates date);

create table expense(
ExpenseID integer primary key,
ExpenseAmount integer,
Descriptions date,
dates date);

create table profit(
IncomeID integer,
ExpenseID integer,
constraint pk primary key(IncomeID,ExpenseID),
constraint fk1 foreign key(IncomeID) references income(IncomeID),
constraint fk2 foreign key(ExpenseID) references expense(ExpenseID) on delete cascade);


create table employee(
EmpID integer primary key,
name varchar(20),
address varchar(30),
salary integer,
nic varchar(10),
PhoneNO integer,
gender varchar(10),
email varchar(20),
UserName varchar(20),
Password varchar(20));

create table project(
ProjectID integer primary key,
name varchar(20),
Descriptions varchar(50),
StartDate date,
EndDate date,
advance integer)

create table emp_pro(
EmpID integer,
ProjectID integer,
constraint pkr primary key(EmpID,ProjectID),
constraint fkr1 foreign key(EmpID) references employee(EmpID),
constraint fkr2 foreign key(ProjectID) references project(ProjectID) on delete cascade);

create table customer(
CusID integer primary key,
name varchar(20),
address varchar(30),
nic varchar(10),
PhoneNO integer,
gender varchar(10),
email varchar(20));

create table inventory(
InventoryID integer primary key,
name varchar(20),
quantity integer);

select * from employee
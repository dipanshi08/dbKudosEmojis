create database kudos_emoji;
use kudos_emoji;

create table emp(email_id varchar(100), name varchar(100) not null, dept varchar(100), position varchar(100), bio varchar(255), kudos_points int default 0, primary key(email_id));
describe emp;

create table badge(badge_id varchar(100), badge_name varchar(100) not null, badge_cost int default 0, primary key(badge_id));
describe badge;

create table mapping_table(email_id varchar(100), badge_id varchar(100), badges_count int default 0, primary key(email_id, badge_id), FOREIGN KEY (badge_id) REFERENCES badge(badge_id), FOREIGN KEY (email_id) REFERENCES emp(email_id));
describe badge;

insert into emp values('gakshat1999@gmail.com', 'Akshat Goel','Software Development', 'Software Engineer', 'blah blah blah whatever', 1000);
insert into emp values('a1@gmail.com', 'a1','Corporate bank', 'Associate', 'Nobody cares', 300);
insert into emp values('a2@gmail.com', 'a2','Corporate bank', 'Associate', 'Nobody cares', 400);
insert into emp values('a3@gmail.com', 'a3','Corporate bank', 'Associate', 'Nobody cares', 500);
insert into emp values('a4@gmail.com', 'a4','Corporate bank', 'Associate', 'Nobody cares', 600);
insert into emp values('a5@gmail.com', 'a5','Corporate bank', 'Associate', 'Nobody cares', 100);
insert into emp values('a6@gmail.com', 'a6','Corporate bank', 'Associate', 'Nobody cares', 250);
insert into emp values('a7@gmail.com', 'a7','Corporate bank', 'Associate', 'Nobody cares', 750);
insert into emp values('a8@gmail.com', 'a8','Corporate bank', 'Associate', 'Nobody cares', 500);
insert into emp values('a9@gmail.com', 'a9','Corporate bank', 'Associate', 'Nobody cares', 600);
insert into emp values('a0@gmail.com', 'a0','Corporate bank', 'Associate', 'Nobody cares', 1500);
select * from emp; 

insert into badge values("Red","Red",100);
insert into badge values("Blue","Blue",300);
insert into badge values("Black","Black",10);
insert into badge values("Pink","Pink",100);
insert into badge values("Gold","Gold",1000);
insert into badge values("Green","Green",50);
select * from badge;

insert into mapping_table values("a1@gmail.com","Blue",2);
insert into mapping_table values("a1@gmail.com","Black",4);
insert into mapping_table values("a2@gmail.com","Gold",1);
insert into mapping_table values("a2@gmail.com","Red",2);
insert into mapping_table values("a3@gmail.com","Blue",1);
insert into mapping_table values("a4@gmail.com","Green",2);
select * from mapping_table;

use kudos_emoji;
show tables;
describe emp;
describe badge;
describe mapping_table;

select * from emp; 
select * from badge;
select * from mapping_table;

-- create database kudos_emoji;
-- use kudos_emoji;

-- create table emp(email_id varchar(100), name varchar(100) not null, dept varchar(100), position varchar(100), bio varchar(255), kudos_points int default 0, primary key(email_id));
-- describe emp;
-- insert into emp values('gakshat1999@gmail.com', 'Akshat Goel','Software Development', 'Software Engineer', 'blah blah blah whatever', 1000);
-- insert into emp values('a1@gmail.com', 'a1','Corporate bank', 'Associate', 'Nobody cares', 300);
-- insert into emp values('a2@gmail.com', 'a2','Corporate bank', 'Associate', 'Nobody cares', 400);
-- insert into emp values('a3@gmail.com', 'a3','Corporate bank', 'Associate', 'Nobody cares', 500);
-- insert into emp values('a4@gmail.com', 'a4','Corporate bank', 'Associate', 'Nobody cares', 600);
-- insert into emp values('a5@gmail.com', 'a5','Corporate bank', 'Associate', 'Nobody cares', 100);
-- insert into emp values('a6@gmail.com', 'a6','Corporate bank', 'Associate', 'Nobody cares', 250);
-- insert into emp values('a7@gmail.com', 'a7','Corporate bank', 'Associate', 'Nobody cares', 750);
-- insert into emp values('a8@gmail.com', 'a8','Corporate bank', 'Associate', 'Nobody cares', 500);
-- insert into emp values('a9@gmail.com', 'a9','Corporate bank', 'Associate', 'Nobody cares', 600);
-- insert into emp values('a0@gmail.com', 'a0','Corporate bank', 'Associate', 'Nobody cares', 1500);
-- select * from emp; 

-- create table badge(badge_id varchar(100), badge_name varchar(100) not null, badge_cost int default 0, primary key(badge_id));
-- describe badge;

-- create table mapping_table
-- (email_id varchar(100), badge_id varchar(100), badges_count int default 0,
-- primary key(email_id, badge_id),
-- FOREIGN KEY (badge_id) REFERENCES badge(badge_id),
-- FOREIGN KEY (email_id) REFERENCES emp(email_id)
-- );
-- describe badge;


show tables;
describe emp;
describe badge;
describe mapping_table;



-- select * from mapping_id where email_id = string;
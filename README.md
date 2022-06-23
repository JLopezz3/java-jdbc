# java-jdbc instructions
cd /usr/local/mysql-8.0.19-macos10.15-x86_64/bin/

./mysql -u root -p

show databases;

create database University;

use University;

create table EngineeringStudents(
Student_ID INT NOT NULL,
Department VARCHAR(25),
First_Name VARCHAR(25),
Last_Name VARCHAR(25),
PassOutYear INT NOT NULL,
UniversityRank INT NOT NULL,
PRIMARY KEY ( Student_ID )
);

INSERT INTO EngineeringStudents VALUES (10201, 'CSE', 'Kiran', 'Acharya', 2018, 1272);

INSERT INTO EngineeringStudents VALUES (10202, 'ISE', 'Sowmya', 'Kumari', 2019, 721);

INSERT INTO EngineeringStudents VALUES (10203, 'ISE', 'Jayson', 'Robert', 2020, 2275);

INSERT INTO EngineeringStudents VALUES (10204, 'ESE', 'Praveen', 'Kumar', 2021, 1249);

INSERT INTO EngineeringStudents VALUES (10205, 'CSE', 'Rajath', 'Kumar', 2018, 2218);


select * from EngineeringStudents;

select Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank from EngineeringStudents where Student_ID = 10202;


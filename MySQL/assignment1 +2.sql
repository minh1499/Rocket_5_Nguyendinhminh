CREATE DATABASE QLBH;
USE QLBH;

CREATE TABLE Department (

	DepartmentID INT,
    DepartmentName VARCHAR (50)
    );
    
CREATE TABLE Position (

	PositionID VARCHAR (50),
    PositionName VARCHAR (50)
    );
    
CREATE TABLE Account (

	AccountID VARCHAR (50),
    Email VARCHAR (50),
    Username VARCHAR (50),
    FullName VARCHAR (50),
    DepartmentID VARCHAR (10),
    PosittionID VARCHAR (50),
    CreateDate DATE
    
    );

CREATE TABLE Groupp (

	GroupID VARCHAR (50),
    GroupName varchar(50),
    CreatorID VARCHAR(50),
    CreateDate DATE
    );
    
CREATE TABLE GroupAccount (

	GroupID VARCHAR (50),
    AccountID VARCHAR(50),
    JoinDate DATE
    );
CREATE TABLE TypeQuestion (

	TypeID VARCHAR (50),
    TypeName VARCHAR (50)
    );
CREATE TABLE CategoryQuestion (

	CategoryID VARCHAR(50),
    CategoryName VARCHAR (50)
    );
CREATE TABLE Question (

	QuestionID VARCHAR(50),
    Content VARCHAR (50),
    CategoryID VARCHAR(50),
    TypeID VARCHAR(50),
    CreatorID VARCHAR(50),
    CreateDate DATE
    );
CREATE TABLE Answer (

	AnswerID VARCHAR(50),
    Content VARCHAR (50),
    QuestionID VARCHAR(50),
    isCorrect BOOL
    );
CREATE TABLE Exam (

	ExamID VARCHAR(50),
    Codee VARCHAR(50),
    Title VARCHAR(50),
    CategoryID VARCHAR(50),
    Duration TIME,
    CreatorID VARCHAR(50),
    CreateDate DATE
    );
CREATE TABLE ExamQuestion (

	ExamID VARCHAR(50),
    QuestionID VARCHAR(50)
    );
    
    
    

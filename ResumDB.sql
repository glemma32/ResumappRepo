create schema ResumeDB;
Create table PersonalInfo(PersonalID int auto_increment primary key, FirstName varchar(50), LastName varchar(50),EmailAddress varchar(255));
create table Educationl(Degree varchar(50), Major varchar(500), UniversityGraduated varchar(500), YearGraduated year(4));
						
create table Experience(PersonalID int,Title varchar(500), CompanyName varchar(255), StartDate year(4), EndDate year(4),Duty text);
								 
create table Skills(SFields varchar(255), Rating varchar(255)); 

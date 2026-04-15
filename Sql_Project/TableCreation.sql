
create table Patients( patient_id int primary key,
name varchar(100),
age int,
gender varchar(10));


create table Doctors(
doctor_id int primary key,
name varchar(100),
specialization varchar(100));


create table Appointments(
appointment_id int primary key,
patient_id int,
doctor_id int,
date DATE,
foreign key(patient_id) references patients(patient_id),
foreign key(doctor_id) references Doctors(doctor_id));


create table Treatments(
treatment_id int primary key,
patient_id int,
diagnosis varchar(255),
cost decimal(10,2),
treatment_date DATE,
foreign key (patient_id) references Patients(patient_id));

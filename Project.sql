/*show all databases in mysql*/
show databases;
/* creating database*/
create database employee;
/* use database*/
use employee;
/*creating table*/
create table employee(
emp_id int Primary key,
emp_name varchar(255),
job_name varchar(255),
manager_id Int,
hire_date Date,
salary decimal(10,2),
commission decimal(10,2),
dep_id int
); 

/*Inserting details in employee databases*/
INSERT INTO employee (emp_id, emp_name, job_name, manager_id, hire_date, salary, commission, dep_id)
VALUES
    (68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001),
    (66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001),
    (67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001),
    (65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001),
    (67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001),
    (69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001),
    (63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001),
    (64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001),
    (65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001),
    (66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001),
    (68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001),
    (68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001),
    (69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001),
    (69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);
    
/*Question*/    

	/*1.From the following table return complete information about the employees.*/
    select * from employee;
    
    /*2.From the following table, write a SQL query to find the salaries of all employees. Return salary*/
    select salary from employee;
    
    /*3.From the following table, write a SQL query to find the unique designations of the employees. Return job name.*/
    select distinct job_name from employee;
    
    /*4.From the following table, write a SQL query to list the employees’ name, increased their salary by 15%, and expressed as number of Dollars*/
    UPDATE employee set salary = salary+(salary* 1.15); 

	/*5.From the following table, write a SQL query to list the employee's name and job name as a format of "Employee & Job".*/
    select concat (emp_name, ' & ', job_name) AS employee_and_job from employee;
    
    /*6.Write a query in SQL to produce the output of employees as follows.Employee*/
    select emp_name AS Employee from employee;
    
    /*7.From the following table, write a SQL query to find those employees with hire date in the format like February 22, 1991. Return employee ID, employee name, salary, hire date*/
    select emp_id, emp_name,salary, DATE_FORMAT (hire_date, '%M %d, %Y') AS formatted_hire_date from employee;
    
    /*8.From the following table, write a SQL query to count the number of characters except the spaces for each employee name. Return employee name length.*/
    select emp_name, LENGTH(REPLACE(emp_name, '  ', '')) AS length_count from employee;
    
    /*9.From the following table, write a SQL query to find the employee ID, salary, and commission of all the employees*/
    select emp_id, salary, commission from employee;
    
    /*10.From the following table, write a SQL query to find the unique department with jobs. Return department ID, Job name.*/
    select DISTINCT dep_id, job_name from employee;
    
    /*11.From the following table, write a SQL query to find those employees who do not belong to the department 2001. Return complete information about the employees.*/
    select * from employee Where dep_id != 2001;
    
    /*12.From the following table, write a SQL query to find those employees who joined before 1991. Return complete information about the employees*/
    select * from employee WHERE EXTRACT(YEAR FROM hire_date) < 1991;

	/*13.From the following table, write a SQL query to calculate the average salary of employees who work as analysts. Return average salary*/
    SELECT AVG(salary) AS avg_salary from employee WHERE job_name = 'ANALYST';
    
	/*14.From the following table, write a SQL query to find the details of the employee ‘BLAZE’.*/
    select * from employee WHERE emp_name = 'BLAZE';
    
    /*15.From the following table, write a SQL query to identify employees whose commissions exceed their salaries. Return complete information about the employees.*/
    select * from employee where commission > salary;
    
    /*16.From the following table, write a SQL query to identify those employees whose salaries exceed 3000 after receiving a 25% salary increase. Return complete information about the employees.*/
    select * from employee WHERE salary * 1.25 > 3000;

	/*17.From the following table, write a SQL query to find the names of the employees whose length is six. Return employee name.*/
    select emp_name FROM employee WHERE LENGTH(emp_name) = 6;

	/*18.From the following table, write a SQL query to find out which employees joined in the month of January. Return complete information about the employees.*/
    select * from employee WHERE EXTRACT(MONTH FROM hire_date) = 1;
    
	/*19.From the following table, write a SQL query to separate the names of employees and their managers by the string 'works for'.*/
    select concat(e.emp_name, ' works for ', m.emp_name) AS relationship FROM employee e LEFT JOIN employee m ON e.manager_id = m.emp_id;

	/*20.From the following table, write a SQL query to find those employees whose designation is ‘CLERK’. Return complete information about the employees*/
	select * from employee where job_name = 'CLERK';




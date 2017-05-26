select Max(Salary) from database123.employeedetails
where salary not in(select max(Salary) from database123.employeedetails);

/* Write your PL/SQL query statement below */
select unique_id, name from Employees e
left join EmployeeUni euni On e.id = euni.id
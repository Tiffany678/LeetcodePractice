/* Write your PL/SQL query statement below */
select name, bonus from employee e
left join Bonus b on e.empId = b.empId
Where b.bonus < 1000 OR b.bonus is null
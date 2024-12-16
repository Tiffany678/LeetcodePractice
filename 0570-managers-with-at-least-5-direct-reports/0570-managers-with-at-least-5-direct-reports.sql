/* Write your PL/SQL query statement below */
select e.name from Employee e join
(SELECT managerId from Employee Where managerId IS NOT NULL group by managerId having count(managerId)>=5) m on m.managerId = e.id
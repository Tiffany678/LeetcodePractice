DELETE  FROM Person 
where id NOT IN
(SELECT Min(id) from Person 
GROUP BY email)
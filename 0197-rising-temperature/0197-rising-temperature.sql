/* Write your PL/SQL query statement below */
SELECT w1.id FROM Weather w1
Join Weather w2
on w1.recordDate = w2.recordDate+1
where w1.temperature > w2.temperature;
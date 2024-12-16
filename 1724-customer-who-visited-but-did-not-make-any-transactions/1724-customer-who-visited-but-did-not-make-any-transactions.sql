/* Write your PL/SQL query statement below */
SELECT customer_id, count(v.visit_id) AS count_no_trans from Visits v
left join Transactions t on v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
Group by customer_id

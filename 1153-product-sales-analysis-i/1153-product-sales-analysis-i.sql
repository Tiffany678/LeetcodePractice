/* Write your PL/SQL query statement below */
SELECT Product_name, year, price from sales s
left join Product p on s.product_id = p.product_id
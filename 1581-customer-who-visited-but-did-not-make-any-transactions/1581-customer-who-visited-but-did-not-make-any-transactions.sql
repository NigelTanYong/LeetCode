# Write your MySQL query statement below
SELECT customer_id, COUNT(*) AS count_no_trans
FROM visits
WHERE visit_id NOT IN (select visit_id from transactions)
GROUP BY customer_id

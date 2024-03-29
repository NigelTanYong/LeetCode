# # Write your MySQL query statement below
# SELECT customer_id, COUNT(*) AS count_no_trans
# FROM visits
# WHERE visit_id NOT IN (select visit_id from transactions)
# GROUP BY customer_id
SELECT v.customer_id, COUNT(v.customer_id) AS count_no_trans
FROM visits v
LEFT JOIN transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;

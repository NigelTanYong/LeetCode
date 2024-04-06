# Write your MySQL query statement below
SELECT user_id, 
       CONCAT(UCASE(LEFT(name, 1)), LCASE(RIGHT(name, LENGTH(name) - 1))) AS name
FROM Users
ORDER BY user_id;

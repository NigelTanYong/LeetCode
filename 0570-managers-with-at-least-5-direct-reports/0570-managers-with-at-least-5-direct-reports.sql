# Write your MySQL query statement below
SELECT e.name 
FROM Employee AS e
JOIN (
    SELECT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING COUNT(id) >= 5
) AS e2 ON e.id = e2.managerId;
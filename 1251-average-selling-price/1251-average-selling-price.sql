# Write your MySQL query statement below
SELECT
    p.product_id,
    CASE 
        WHEN SUM(us.units) > 0 THEN ROUND(SUM(p.price * us.units) / SUM(us.units), 2)
        ELSE 0.00
    END AS average_price
FROM
    Prices p
LEFT JOIN
    UnitsSold us ON us.product_id = p.product_id AND us.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY
    p.product_id;

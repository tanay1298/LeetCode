SELECT product_id, product_name from Product
WHERE product_id NOT IN (
                          SELECT product_id FROM Sales
                          WHERE sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31'
                        )
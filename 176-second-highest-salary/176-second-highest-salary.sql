# IFNULL takes 2 args, returns first value if not null, else second arg

select IFNULL 
(
    (
        select distinct(salary) from Employee
        order by salary desc 
        limit 1,1
    ), null
) as SecondHighestSalary
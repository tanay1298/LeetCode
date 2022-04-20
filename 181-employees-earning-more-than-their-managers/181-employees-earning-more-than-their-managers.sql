select e.name as Employee from Employee e
where e.salary > ( select salary from Employee m where e.managerId = m.id )
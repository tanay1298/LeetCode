select activity_date as day, count(distinct(user_id)) as active_users
from Activity 
group by day
having day > ( SELECT SUBDATE('2019-07-27', INTERVAL 30 DAY) )
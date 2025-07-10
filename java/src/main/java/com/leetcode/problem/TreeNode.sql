select id,
       case
           when Tree.p_id is null then 'Root'
           when Tree.id in (select p_id from Tree) then 'Inner'
           else 'Leaf'
           end as type
from Tree;
select e.nome as estado, c.nome as cidade, regiao as regiao from estados e, cidade c
where e.id = c.estado_id;

select 
    e.nome as estado, 
    c.nome as cidade, 
    regiao as regiao 
from estados e
inner Join cidade c
    on e.id = c.estado_id
SELECT
    regiao as 'Regiao',
    sum(populacao) as Total
    FROM estados 
    GROUP BY regiao
    order by Total desc
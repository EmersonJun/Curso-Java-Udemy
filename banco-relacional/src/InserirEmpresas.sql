insert into empresas(nome, cnpj)
values
    ('bradesco', 76786876786),
    ('vale', 778678686866),
    ('tesla', 78877877897897);


alter table empresas modify cnpj varchar(14);

desc empresas;

insert into empresas_unidades(empresa_id, cidade_id, sede)
value
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0);

select * from cidade;
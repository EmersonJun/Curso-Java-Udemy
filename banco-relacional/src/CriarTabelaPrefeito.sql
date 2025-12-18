create table if not exists prefeitos (
    id int UNSIGNED not null auto_increment,
    nome varchar(255) not null,
    cidade_id int UNSIGNED,
    primary key(id),
    unique key(cidade_id),
    foreign key(cidade_id) references cidade(id)
);
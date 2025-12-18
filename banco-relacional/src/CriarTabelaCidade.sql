create table IF NOT EXISTS cidade(
    id int UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id int UNSIGNED NOT NULL,
    area DECIMAL(10, 2),
    PRIMARY KEY(id),
    FOREIGN KEY(estado_id) references estados (id)
);

create table IF NOT EXISTS teste(
    id int UNSIGNED NOT NULL AUTO_INCREMENT Primary key
);

drop table if exists cidade;
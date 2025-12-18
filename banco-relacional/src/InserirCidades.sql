INSERT INTO cidade (nome, area, estado_id)
VALUES ('campinas', 795, 1);

INSERT INTO cidade (nome, area, estado_id)
VALUES ('niteroi', 133.3, 40);

INSERT INTO cidade (nome, area, estado_id)
VALUES (
  'caruaru',
  122,
  (SELECT id FROM estados WHERE sigla = 'PE')
);
SELECT * FROM estados;

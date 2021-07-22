/* INÍCIO ATVIDADE 1 */
CREATE DATABASE db_recursos;

USE db_recursos;

CREATE TABLE tbl_funcionario (
  id_funcionario int unsigned not null auto_increment,
  nome varchar(100) not null,
  idade int not null,
  endereco varchar(255),
  funcao varchar(255) not null,
  telefone varchar(20),
  salario decimal(7,2),
  PRIMARY KEY (id_funcionario)
);

INSERT INTO tbl_funcionario (nome,idade,endereco,funcao,telefone,salario) values('Carlos',27,'Caetano de Campos','Desenvolvedor','11977784949',10000.00);
INSERT INTO tbl_funcionario (nome,idade,endereco,funcao,telefone,salario) values('Joao',30,'Avenida Paulista','Enfermeiro','11974984949',7000.00);
INSERT INTO tbl_funcionario (nome,idade,endereco,funcao,telefone,salario) values('Maria',25,'Osvaldo Goeldi','Médica','11977784779',15000.00);
INSERT INTO tbl_funcionario (nome,idade,endereco,funcao,telefone,salario) values('Henrique',27,'Rua das Flores','Publicitário','11977784981',12000.00);
INSERT INTO tbl_funcionario (nome,idade,endereco,funcao,telefone,salario) values('Tamires',27,'Rua do Ouvidor','Gerente','11987784949',18000.00);

SELECT * FROM tbl_funcionario
WHERE salario > 2000;

SELECT * FROM tbl_funcionario
WHERE salario < 2000;

UPDATE tbl_funcionario
SET endereco = 'Rua Apucarana', funcao = 'Arquiteto Java', salario = 30000.00
WHERE id_funcionario = 1;
/* FIM ATVIDADE 1 */


/* INÍCIO ATVIDADE 2 */
CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_produtos (
  id_produto int not null auto_increment,
  nome       varchar(100) not null,
  tipo       varchar(100) not null,
  marca      varchar(100),
  peso       float,
  preco      decimal(7,2),
  PRIMARY KEY (id_produto)
);

INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Shampoo', 'Higiene', 'Monange', 200.0, 15.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Chuteira', 'Calçados', 'Nike', 250.0, 150.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Celular', 'Eletrônico', 'Samsung', 300.0, 900.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Notebook', 'Eletrônico', 'Acer', 1500.0, 3000.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Televisao', 'Eletrônico', 'LG', 15000.0, 3500.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Mesa', 'Móveis', 'MadeiraMadeira', 30000.0, 600.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Guarda-roupa', 'Móveis', 'MadeiraMadeira', 50000.0, 800.00);
INSERT INTO db_ecommerce.tb_produtos (nome, tipo, marca, peso, preco) VALUES ('Bola', 'Esportes', 'Adidas', 800.0, 25.00);

SELECT * FROM tb_produtos
WHERE preco > 500;

SELECT * FROM tb_produtos
WHERE preco < 500;

UPDATE tb_produtos
SET preco = 500.00
WHERE id_produto = 7;
/* FIM ATVIDADE 2 */

/* INÍCIO ATVIDADE 3 */
CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_alunos (
  id_aluno int not null auto_increment,
  nome       varchar(100) not null,
  sala       varchar(10),
  RA         varchar(5) not null,
  materia    varchar(50)not null,
  nota       float not null,
  PRIMARY KEY (id_aluno)
);

INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Carlos', '8º ano', '16167', 'Matemática', 9.0);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Marcela', '8º ano', '14867', 'Matemática', 9.5);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Eduardo', '9º ano', '17117', 'História', 1.0);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Stephanie', '7º ano', '16514', 'Inglês', 8.0);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Michele', '9º ano', '17138', 'Matemática', 8.9);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('César', '8º ano', '11876', 'Geografia', 6.99);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('Marcos', '4º ano', '61871', 'Ed. Física', 7.0);
INSERT INTO db_escola.tb_alunos (nome, sala, RA, materia, nota) VALUES ('João', '8º ano', '18871', 'Literatura', 7.01);



SELECT * FROM tb_alunos
WHERE nota > 7;

SELECT * FROM tb_alunos
WHERE nota < 7;

UPDATE tb_alunos
SET nota = 9.00
WHERE id_aluno = 7;
/* FIM ATVIDADE 3 */

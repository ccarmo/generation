create database carloshenrique;

use carloshenrique;

create table tbl_funcionario (
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

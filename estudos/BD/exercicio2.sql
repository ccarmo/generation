-- Inicio Atividade 1 --
/* Tentei fazer uma simulação de um jogo que gosto chamado Valorant.
Inclui algumas brincadeiras feitas com meus amigos que também jogam */

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_personagem (
  id_personagem                INT NOT NULL AUTO_INCREMENT,
  fk_classe                    INT NOT NULL,
  nome_personagem              VARCHAR(100) NOT NULL,
  nacionalidade                VARCHAR(100),
  skill_barato                 INT UNSIGNED NOT NULL,
  pontos_ultimate              INT UNSIGNED NOT NULL,
  arma_preferida               VARCHAR(50),
  PRIMARY KEY (id_personagem)
);

CREATE TABLE tb_classe (
  id_classe     INT NOT NULL AUTO_INCREMENT,
  nome_classe   varchar(100) NOT NULL,
  tipo          varchar(100) NOT NULL,
  poder_ataque  int NOT NULL,
  poder_defesa  int NOT NULL,
  PRIMARY KEY (id_classe)
);

ALTER TABLE tb_personagem ADD FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe);

INSERT INTO db_generation_game_online.tb_classe
(nome_classe, tipo, poder_ataque, poder_defesa)
VALUES
('Duelista', 'Ofensivo', 5000, 2000),
('Sentinela', 'Defensivo', 2000, 5000),
('Iniciadores', 'Preparador', 3500, 2000),
('Controladores', 'Suporte', 3500, 2500),
('Batatas', 'Nerdolas', 1500, 500);

INSERT INTO db_generation_game_online.tb_personagem
(fk_classe, nome_personagem, nacionalidade, skill_barato, pontos_ultimate, arma_preferida)
VALUES
(1,'Jett','Coréia do Sul', 200, 5, 'Classic'),
(5,'Mudki','Brasileiro', 100, 8, 'Bucky'),
(2,'Sage','China', 250, 6, 'Spectre'),
(4,'Brimstone','Estados Unidos', 150, 5, 'Judge'),
(3,'Breach','Suecia', 230, 7, 'Operator'),
(5,'Pateta Kill','Brasileiro', 200, 5, 'Ares'),
(2,'Killjoy','Alemanha', 210, 6, 'Frenzy'),
(1,'Reyna','México', 240, 5, 'Vandal');

-- Poder de ataque maior que 2000 --
SELECT tb_personagem.nome_personagem, tb_classe.poder_ataque
FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id_classe = tb_personagem.fk_classe
WHERE tb_classe.poder_ataque > 2000;

-- Poder de defesa entre 1000 e 2000 --
SELECT tb_personagem.nome_personagem, tb_classe.poder_defesa
FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id_classe = tb_personagem.fk_classe
WHERE tb_classe.poder_defesa >= 1000 and tb_classe.poder_defesa <= 2000;

-- Inner joint entre personagens e classe --
SELECT tb_personagem.nome_personagem, tb_classe.poder_defesa
FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id_classe = tb_personagem.fk_classe;

-- Like buscando os personagens com a letra C --
SELECT * FROM tb_personagem
WHERE nome_personagem LIKE "C%";

-- Personagens da classe Duelista --
SELECT tb_classe.nome_classe, tb_personagem.nome_personagem
FROM tb_classe
INNER JOIN tb_personagem  ON tb_classe.id_classe = tb_personagem.fk_classe
WHERE tb_classe.nome_classe = 'Duelista';

-- Fim Atividade 1 --

-- Inicio Atividade 2 --

CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_pizza (
  id_pizza                INT NOT NULL AUTO_INCREMENT,
  fk_categoria            INT NOT NULL,
  nome_pizza              VARCHAR(100) NOT NULL,
  preco                   DECIMAL(5,2) NOT NULL,
  nome_pizzaiolo          VARCHAR(100),
  borda                   VARCHAR(255),
  tem_azeitona            TINYINT(0) DEFAULT 0, -- Quando for 0 não tem azeitona. Quando for 1 terá --
  PRIMARY KEY (id_pizza)
);

CREATE TABLE tb_categoria (
  id_categoria  INT NOT NULL AUTO_INCREMENT,
  tipo                    VARCHAR(100),
  tamanho                 VARCHAR(100),
  ingrediente_principal   VARCHAR(255),
  PRIMARY KEY (id_categoria)
);

ALTER TABLE tb_pizza ADD FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria);

INSERT INTO db_pizzaria_legal.tb_categoria
(tipo, tamanho, ingrediente_principal)
VALUES
('Salgada', 'Broto', 'Mussarela'),
('Doce', 'Grande', 'Chocolate'),
('Especial', 'Broto', 'Cogumelos'),
('Doce', 'Normal', 'Leite condesado'),
('Doce', 'Broto', 'Doce de leite');

INSERT INTO db_pizzaria_legal.tb_pizza
(fk_categoria, nome_pizza, preco, nome_pizzaiolo, borda, tem_azeitona)
VALUES
(1,'Mussarela',40.00, 'Carlos', 'Catupiry', 1),
(4,'Doce de leite', 50.00, 'Maria',NULL,DEFAULT),
(2,'Floresta Negra', 65.00, 'Maria','Chocolate',DEFAULT),
(3,'Francesa', 70.00, 'Joao',NULL, 1),
(3,'Uruguaia',70.00, 'Joao',NULL, 1),
(1,'Mussarela com Bacon', 50.00, 'Carlos', NULL, 1),
(4,'Carolina',55.00, 'Maria', NULL, DEFAULT),
(2,'Mousse de Chocolate', 60.00, 'Maria', NULL, DEFAULT);

-- Pizza maior que 45.00 reais --
SELECT tb_pizza.nome_pizza
FROM tb_pizza
WHERE preco > 45.00;

-- Pizza maior que 29.00 reais menor que 60.00 --
SELECT tb_pizza.nome_pizza, tb_pizza.preco
FROM tb_pizza
WHERE preco > 29.00 and preco < 60.00;

-- Pizza que começa com C --
SELECT * FROM  tb_pizza
WHERE nome_pizza LIKE "C%";

-- Inner Join --
SELECT *
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria;

-- Pizza que é da categoria Doce --
SELECT tb_pizza.nome_pizza, tb_categoria.tipo
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria;
WHERE tb_categoria.tipo_categoria = 'Doce';

-- Fim Atividade 2 --

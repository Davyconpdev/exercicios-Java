CREATE SCHEMA IF NOT EXISTS dados;
USE dados;

CREATE TABLE IF NOT EXISTS Profissional (
  idProfissional INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(15) NOT NULL,
  sobrenome VARCHAR(35) NOT NULL,
  profissao VARCHAR(30) NOT NULL,
  area_atuacao VARCHAR(35) NOT NULL,
  tipo_contrato VARCHAR(3) NOT NULL,
  experiencia VARCHAR(7) NULL,
  salario DOUBLE UNSIGNED NOT NULL,
  email VARCHAR(45) NOT NULL
  );

SELECT * FROM Profissional;

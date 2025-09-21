CREATE DATABASE EstqoeuHardware;

USE EstqoeuHardware;

CREATE TABLE produto (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo_produto INT,
nome VARCHAR(100) NOT NULL,
marca VARCHAR(50)
memoria INT,
quantidade INT
);
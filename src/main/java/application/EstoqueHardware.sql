CREATE DATABASE IF NOT EXISTS EstoqueHardware;
USE EstoqueHardware;

CREATE TABLE IF NOT EXISTS produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    imagem BLOB,
    tipo_produto INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    marca VARCHAR(50),
    memoria INT DEFAULT 0,
    quantidade INT NOT NULL CHECK (quantidade >= 1)
    );

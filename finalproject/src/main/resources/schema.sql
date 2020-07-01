DROP TABLE IF EXISTS movie;

    CREATE TABLE movie (
        id_movie BIGINT AUTO_INCREMENT NOT NULL,
        name VARCHAR(255) NULL,
        launch INT NULL,
        director VARCHAR(255) NULL,
        category VARCHAR(255) NULL,
        synopsis VARCHAR(255) NULL,
        PRIMARY KEY (id_movie));


DROP TABLE IF EXISTS client;

    CREATE TABLE client (
        id_client BIGINT AUTO_INCREMENT NOT NULL,
        name VARCHAR(255) NULL,
        age INT NULL,
        email VARCHAR(255) NULL,
        phone VARCHAR(255) NULL,
        address VARCHAR(255) NULL,
        PRIMARY KEY (id_client));
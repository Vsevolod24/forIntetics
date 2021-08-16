CREATE TABLE IF NOT EXISTS travellers
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    user        VARCHAR(50)   NOT NULL,
    country     VARCHAR(100)  NOT NULL,
    description VARCHAR(1000) NOT NULL,
    year        VARCHAR(100)  NOT NULL

);

INSERT INTO travellers
VALUES (1, 'Roman', 'Ukraine', 'Good', '2015');

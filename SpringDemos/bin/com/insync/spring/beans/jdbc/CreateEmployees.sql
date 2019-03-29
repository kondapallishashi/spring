CREATE TABLE IF NOT EXISTS employee (
    id INT(10) AUTO_INCREMENT,
    firstname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20),
    age INT(3),
    PRIMARY KEY (id)
)  ENGINE=INNODB;
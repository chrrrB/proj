CREATE DATABASE local;
CREATE TABLE FOODS (
	FOODID INT AUTO_INCREMENT PRIMARY KEY,
    FOODNAME VARCHAR(100),
    CALORIES INT,
    PROTEIN INT
    );
INSERT INTO food (FOODNAME, CALORIES, PROTEIN)
VALUES
	('brand chicken', '230', '40'),
    ('other brand chicken', '200', '400'),
	('super pulled pork', '2000', '30');
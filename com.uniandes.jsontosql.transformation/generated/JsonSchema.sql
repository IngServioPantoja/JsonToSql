			
CREATE DATABASE databaseTest;
	
	
CREATE TABLE "puntajes" (
		_id int PRIMARY KEY,
		type var(255),
		score decimal,
		student int,
	
)
CREATE TABLE "student" (
		_id int PRIMARY KEY,
		nombre var(255),
		puntajes int,
	
)

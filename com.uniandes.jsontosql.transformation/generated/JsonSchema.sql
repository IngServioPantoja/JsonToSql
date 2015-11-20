			
CREATE DATABASE databaseTest;
	
	
CREATE TABLE puntaje (
		id_puntaje int PRIMARY KEY,
		type var(255) 
   ,
		score decimal 
   ,
		student_id int 
	
);


CREATE TABLE student (
		id_student int PRIMARY KEY,
		nombre var(255) 
   ,
		puntajes int 
	
);


ALTER TABLE puntajes
	ADD FOREIGN KEY (student_id)
  		REFERENCES student(id_puntaje)
	  		 ON DELETE CASCADE;

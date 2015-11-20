			
CREATE DATABASE databaseTest;
	
	
CREATE TABLE puntajes (
		_id INT PRIMARY KEY,
		type TEXT 
   ,
		score TINYINT(1) 
   ,
		student_id INT 
	
);


CREATE TABLE student (
		_id INT PRIMARY KEY,
		nombre TEXT 
   ,
		puntajes INT 
	
);


ALTER TABLE puntajes
	ADD CONSTRAINT `fk_puntajes_student`
		FOREIGN KEY (student_id)
  		REFERENCES student(_id)
	  		 ON DELETE CASCADE;

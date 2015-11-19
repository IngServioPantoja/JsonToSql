			
CREATE DATABASE databaseTest;
	
	
CREATE TABLE "puntajes" (
		_id int PRIMARY KEY,
		type var(255) 
   ,
		score decimal 
   ,
		student_id int 
		,
		FOREIGN KEY (student_id)
      		REFERENCES student(_id)
      			 ON DELETE CASCADE
	
)
CREATE TABLE "student" (
		_id int PRIMARY KEY,
		nombre var(255) 
   ,
		puntajes int 
	
)

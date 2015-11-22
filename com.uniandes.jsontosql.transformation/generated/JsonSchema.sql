			
CREATE DATABASE databaseTest;
	
	
CREATE TABLE grades (
		_id INT PRIMARY KEY
	   ,
		grade TEXT 
   ,
		score INT 
   ,
		restaurant_id INT 
	
);


CREATE TABLE restaurant (
		_id TEXT PRIMARY KEY
	   ,
		address TEXT 
   ,
		borough TEXT 
   ,
		cuisine TEXT 
   ,
		nombre TEXT 
	
);


ALTER TABLE grades
	ADD CONSTRAINT `fk_grades_restaurant`
		FOREIGN KEY (restaurant_id)
  		REFERENCES restaurant(_id)
	  		 ON DELETE CASCADE;

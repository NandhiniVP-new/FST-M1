---Activity 1
drop table salesman;
CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar(20) NOT NULL, salesman_city varchar(20), commission int);
desc salesman;

----ACtivity 2
INSERT all
    INTO salesman VALUES (5001 , 'James Hoog', 'New York ', 150)
    INTO salesman VALUES (5002 , 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES (5005 , 'Pit Alex','London', 11)
    INTO salesman VALUES (5006 , 'McLyon', 'Paris', 14)
    INTO salesman VALUES (5007 , 'Paul Adam', 'Rome ', 13)
    INTO salesman VALUES (5003 , 'Lauson Hen', 'San Jose ', 12)
select 1 from dual;
SELECT * FROM salesman;

---Activity 3
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';


--Activity 4
-- Add the grade column
ALTER TABLE salesman ADD grade int;

-- Update the values in the grade column
UPDATE salesman SET grade=100;

-- Display data
SELECT * FROM salesman;


---Activity 5
-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;
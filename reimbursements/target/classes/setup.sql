DROP TYPE IF EXISTS user_role CASCADE;
CREATE TYPE user_role AS ENUM('Admin', 'Employee', 'Manager');
CREATE TYPE status AS ENUM('Pending', 'Approved', 'Rejected');

DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users (
	
	id SERIAL PRIMARY KEY,
	username VARCHAR(50) NOT NULL UNIQUE,
	pwd VARCHAR(50) NOT NULL,
	user_role_name user_role NOT NULL,
);

DROP TABLE IF EXISTS tickets CASCADE;
CREATE TABLE tickets (
	id SERIAL PRIMARY KEY,
	user_id INTEGER NOT NULL,
	description VARCHAR(500) NOT NULL,
	amount INTEGER NOT NULL,
	status VARCHAR(50) NOT NULL DEFAULT 'pending',
	active BOOLEAN NOT NULL DEFAULT TRUE,
	updated_by INTEGER DEFAULT NULL,
	date_submitted DATE NOT NULL DEFAULT CURRENT_DATE
);

INSERT INTO users (username, pwd, user_role_name)
        VALUES ('Larry', 'secret', 'Employee'),
	       ('Marry', '1234', 'Admin'),
	       ('Barry', 'pass', 'Manager');



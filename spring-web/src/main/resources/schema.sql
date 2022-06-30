CREATE TABLE users (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    full_name VARCHAR,
    email VARCHAR,
    phone VARCHAR,
    address VARCHAR,
    date_of_birth DATE
);
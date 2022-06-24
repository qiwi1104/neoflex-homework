CREATE TABLE authors (
    id BIGINT PRIMARY KEY NOT NULL,
    name VARCHAR
);

CREATE TABLE books (
    id BIGINT PRIMARY KEY NOT NULL,
    title VARCHAR,
    price DOUBLE
);

CREATE TABLE authors_books (
    author_id BIGINT NOT NULL,
    book_id BIGINT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(id),
    FOREIGN KEY (book_id) REFERENCES books(id),
    UNIQUE (author_id, book_id)
);
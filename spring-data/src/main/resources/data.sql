INSERT INTO
    authors (id, name)
VALUES
    (1, 'Turgenev'),
    (2, 'Tolstoy'),
    (3, 'Dreiser'),
    (4, 'Shakespeare');

INSERT INTO
    books (id, title, price)
VALUES
    (1, 'Asya', 2500),
    (2, 'War and Piece', 2800),
    (3, 'Anna Karenina', 1700),
    (4, 'The Titan', 2200),
    (5, 'The Financier', 2100),
    (6, 'An American Tragedy', 2050),
    (7, 'Romeo and Juliet', 2600),
    (8, 'Fathers and Sons', 2100),
    (9, 'Rudin', 2050);

INSERT INTO
    authors_books (author_id, book_id)
VALUES
    (1, 1),
    (2, 2),
    (2, 3),
    (3, 4),
    (3, 5),
    (3, 6),
    (4, 7),
    (1, 8),
    (1, 9);
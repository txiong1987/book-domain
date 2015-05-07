CREATE TABLE author (
  id BIGSERIAL PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(200),
  book_id BIGINT,

  FOREIGN KEY (book_id) REFERENCES book(id)
);

CREATE TABLE book (
  id BIGSERIAL PRIMARY KEY,
  title VARCHAR(100)
);

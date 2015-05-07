CREATE TABLE author (
  id BIGSERIAL PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(200)

);

CREATE TABLE book (
  id BIGSERIAL PRIMARY KEY,
  title VARCHAR(100),
  author_id BIGINT,
  
    FOREIGN KEY (author_id) REFERENCES author(id)
);

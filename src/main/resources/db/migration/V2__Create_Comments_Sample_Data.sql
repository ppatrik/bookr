CREATE TABLE COMMENT(
    ID IDENTITY,
    BOOK_ID INTEGER NOT NULL,
    COMMENT VARCHAR(512) NOT NULL,
    RATING INTEGER NOT NULL
);

INSERT INTO COMMENT VALUES(1, 0, 'awesome', 5)
INSERT INTO COMMENT VALUES(2, 0, 'bad', 1)
INSERT INTO COMMENT VALUES(3, 0, 'good', 4)
INSERT INTO COMMENT VALUES(4, 1, 'maybe', 3)
INSERT INTO COMMENT VALUES(5, 1, 'nope', 2)
INSERT INTO COMMENT VALUES(6, 2, 'terrible', 1)
INSERT INTO COMMENT VALUES(7, 3, 'could be better', 2)
INSERT INTO COMMENT VALUES(8, 3, 'try again', 1)
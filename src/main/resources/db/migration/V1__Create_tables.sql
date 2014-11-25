create table book(
    id identity,
    title varchar(255) not null,
    path varchar(512) not null,
    publisher_id integer not null
);

create table publisher (
    id identity,
    name varchar(255) not null,
    web varchar(512)
)
DROP TABLE IF EXISTS AUTHORITIES;
DROP TABLE IF EXISTS USERS;

create table users(
username varchar (50) not null primary key,
password varchar (50) not null,
enabled boolean not null
);

create table authorities(
username varchar (50) not null,
authority varchar (50) not null,
constraint fk_authorities_users
foreign key (username)references users(username)
);


insert into users(username,password,enabled)values ("Miroslav","13071979",true);

insert into authorities(username,authority)values ("Miroslav","ROLE_USER");
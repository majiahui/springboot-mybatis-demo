drop table if exists city;

create table city (id int primary key auto_increment, name varchar, state varchar, country varchar);

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');


drop table if exists task;

create table task (id int primary key auto_increment, status varchar, name varchar);

insert into task (status, name) values ('1', 'task1');
insert into task (status, name) values ('1', 'task2');
insert into task (status, name) values ('1', 'task3');
insert into task (status, name) values ('1', 'task4');
insert into task (status, name) values ('1', 'task5');
insert into task (status, name) values ('1', 'task6');
insert into task (status, name) values ('1', 'task7');
insert into task (status, name) values ('1', 'task8');
insert into task (status, name) values ('1', 'task9');
insert into task (status, name) values ('1', 'task10');
insert into task (status, name) values ('1', 'task11');
insert into task (status, name) values ('1', 'task12');
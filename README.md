# Spring-Boot-Profile-Application-dev-prod-qa-local-Environment
Spring Boot Application For Profiles
================================
Required Files are
-----------------------
1. User.java   --> @Entity
2. UserRepo.java   --> @Repository
3. UserService.java    --> @Service
4. UserController.java   --> @RestController
5. application.properties  --> local server  --Default server
      a) application-dev.properties    -->  dev server
       b) application-prod.properties   --> production  server
	c) application-qa.properties   --> qa  server

6. Application.java    --> @SpringBootApplication

--------------------------
Reuired Jars Are
-----------------------
1. Spring Web
2. Spring Dev Tools
3. Spring Data JPA
4. MySql Driver
===================================================================================
create database local;
use local;

create table user(id int(10),name varchar(40));

insert into user values(1,'loacl1');
insert into user values(2,'loacl2');
insert into user values(3,'loacl3');

create database dev;
use dev;

create table user(id int(10),name varchar(40));

insert into user values(1,'dev1');
insert into user values(2,'dev2');
insert into user values(3,'dev3');
insert into user values(4,'dev4');


create database prod;
use prod;

create table user(id int(10),name varchar(40));

insert into user values(1,'prod1');
insert into user values(2,'prod2');
insert into user values(3,'prod3');
insert into user values(4,'prod4');



create database qa;
use qa;

create table user(id int(10),name varchar(40));

insert into user values(1,'qa1');
insert into user values(2,'qa2');
insert into user values(3,'qa3');
insert into user values(4,'qa4');

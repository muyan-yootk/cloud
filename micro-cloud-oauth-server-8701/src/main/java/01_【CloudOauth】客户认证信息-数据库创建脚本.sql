DROP DATABASE IF EXISTS mldn;
CREATE DATABASE mldn CHARACTER SET UTF8 ;
USE mldn ;
CREATE TABLE client(
   clientid                  varchar(50) not null,
   clientsecret                 varchar(30),
   scope               varchar(32),
   locked               int,
   authorizedgranttypes  varchar(50) ,
   CONSTRAINT pk_mid PRIMARY KEY (clientid)
) engine='innodb';
CREATE TABLE authorities(
	authoid      varchar(50) ,
	title       varchar(50) ,
	CONSTRAINT pk_authoid PRIMARY KEY(authoid)
)engine='innodb' ;

CREATE TABLE client_authorities(
	clientid     varchar(50) ,
	authoid   varchar(50) 
) engine='innodb';

INSERT INTO client(clientid,clientsecret,scope,locked,authorizedgranttypes) VALUES ('cadmin','chello','webapp',0,'authorization_code') ;
INSERT INTO client(clientid,clientsecret,scope,locked,authorizedgranttypes) VALUES ('cmldn','cjava','webapp',0,'authorization_code' );
INSERT INTO authorities (authoid,title) VALUES ('CLIENT','访问客户') ;
INSERT INTO client_authorities(clientid,authoid) VALUES ('cadmin','CLIENT') ;
INSERT INTO client_authorities(clientid,authoid) VALUES ('cmldn','CLIENT') ;



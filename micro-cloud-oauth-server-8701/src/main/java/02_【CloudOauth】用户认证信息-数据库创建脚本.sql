-- DROP DATABASE IF EXISTS mldn;
-- CREATE DATABASE mldn CHARACTER SET UTF8 ;
-- USE mldn ;

CREATE TABLE member(
   mid                  varchar(50) not null,
   name                 varchar(30),
   password             varchar(32),
   locked               int,
   CONSTRAINT pk_mid PRIMARY KEY (mid)
) engine='innodb';
CREATE TABLE role(
	rid           varchar(50) ,
	title	     varchar(200) ,
	CONSTRAINT pk_rid PRIMARY KEY(rid)
) engine='innodb' ;
CREATE TABLE member_role(
	mid	      varchar(50) ,
	rid    varchar(50) ,
	CONSTRAINT fk_mid2 FOREIGN KEY(mid) REFERENCES member(mid),
	CONSTRAINT fk_rid2 FOREIGN KEY(rid) REFERENCES role(rid)
) engine='innodb' ;
-- 0表示活跃、1表示锁定
INSERT INTO member(mid,name,password,locked) VALUES ('admin','管理员','hello',0) ;
INSERT INTO member(mid,name,password,locked) VALUES ('mldn','普通人','hello',0) ;
INSERT INTO member(mid,name,password,locked) VALUES ('mermaid','美人鱼','hello',1) ;
-- 定义角色信息
INSERT INTO role(rid,title) VALUES ('USER','普通用户') ;
INSERT INTO role(rid,title) VALUES ('ADMIN','管理员') ;
INSERT INTO role(rid,title) VALUES ('GUEST','临时用户') ;
-- 定义用户与角色的关系
INSERT INTO member_role(mid,rid) VALUES ('admin','USER') ;
INSERT INTO member_role(mid,rid) VALUES ('admin','ADMIN') ;
INSERT INTO member_role(mid,rid) VALUES ('admin','GUEST') ;
INSERT INTO member_role(mid,rid) VALUES ('mldn','USER') ;
INSERT INTO member_role(mid,rid) VALUES ('mldn','GUEST') ;
INSERT INTO member_role(mid,rid) VALUES ('mermaid','GUEST') ;

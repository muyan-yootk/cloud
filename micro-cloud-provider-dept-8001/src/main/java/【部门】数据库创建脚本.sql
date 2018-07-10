DROP DATABASE dept8001 ;
CREATE DATABASE dept8001 CHARACTER SET UTF8 ;
USE dept8001 ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) engine=innodb ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8001】财务部','北京') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8001】开发部','石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8001】销售部','上海') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8001】产品部','广州') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8001】人事部','深圳') ;
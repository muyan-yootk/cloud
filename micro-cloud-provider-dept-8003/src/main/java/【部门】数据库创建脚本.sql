DROP DATABASE dept8003 ;
CREATE DATABASE dept8003 CHARACTER SET UTF8 ;
USE dept8003 ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) engine=innodb ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8003】财务部','北京') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8003】开发部','石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8003】销售部','上海') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8003】产品部','广州') ;
INSERT INTO dept(dname,loc) VALUES ('【dept-8003】人事部','深圳') ;
create table t_user (
    id int primary key auto_increment,
    name varchar(100),
    created_day datetime default CURRENT_TIMESTAMP ,
    isdeleted int default 0,
    finalExcuteTime datetime default null);

create table t_permission(
    id int primary key auto_increment,
    name varchar(100),
    value int);

create table t_role(
    id int primary key auto_increment,
    permission_value int,
    description varchar(100));

create table t_user_rule(
    id int primary key auto_increment,
    user_id int,
    role_id int,
    foreign key (user_id) references t_user(id),
    foreign key (role_id) references t_role(id)
    );

####################插入user表数据##################
insert into t_user(name) values ("zhang");
insert into t_user(name) values ("wang");
insert into t_user(name) values ("li");
insert into t_user(name) values ("zhao");

########################插入权限表数据####################
insert into t_permission(name,value) values("add",1);
insert into t_permission(name,value) values("delete",2);
insert into t_permission(name,value) values("update",4);
insert into t_permission(name,value) values("select",8);

########################插入角色表数据####################
insert into t_role(permission_value,description) values(0,"");
insert into t_role(permission_value,description) values(1,"1");
insert into t_role(permission_value,description) values(2,"2");
insert into t_role(permission_value,description) values(3,"1-2");
insert into t_role(permission_value,description) values(4,"3");
insert into t_role(permission_value,description) values(5,"1-3");
insert into t_role(permission_value,description) values(6,"2-3");
insert into t_role(permission_value,description) values(7,"1-2-3");
insert into t_role(permission_value,description) values(8,"4");
insert into t_role(permission_value,description) values(9,"1-4");
insert into t_role(permission_value,description) values(10,"2-4");
insert into t_role(permission_value,description) values(11,"1-2-4");
insert into t_role(permission_value,description) values(12,"3-4");
insert into t_role(permission_value,description) values(13,"1-3-4");
insert into t_role(permission_value,description) values(14,"2-3-4");
insert into t_role(permission_value,description) values(15,"1-2-3-4");


#########################插入  用户_角色表  数据##############################
insert into t_user_rule(user_id,role_id) values(4,3);
insert into t_user_rule(user_id,role_id) values(2,13);
insert into t_user_rule(user_id,role_id) values(1,10);
insert into t_user_rule(user_id,role_id) values(3,8);





create table t_user (
    id int primary key auto_increment,
    name varchar(100),
    created_day datetime default CURRENT_TIMESTAMP ,
    isdeleted int default 0,
    finalExcuteTime datetime default null);


create table t_role(
    id int primary key auto_increment,
    name varchar(100),
    description varchar(100) default null);

create table t_user_role(
    id int primary key auto_increment,
    user_id int ;
    role_id int ;
    foreign key (user_id) references t_user(id),
    foreign key (role_id) references t_role(id)
    );

create table t_res(
    id int primary key auto_increment,
    url varchar(50),
    name varchar(100)
    );

create table t_role_res(
    id int primary key auto_increment,
    role_id  int ,
    res_id  int,
    foreign key (role_id) references t_role(id),
    foreign key (res_id) references t_res(id)
    );

####################插入user表数据##################
insert into t_user(name) values ("zhang");
insert into t_user(name) values ("wang");
insert into t_user(name) values ("li");
insert into t_user(name) values ("zhao");


########################插入角色表数据####################
insert into t_role(name,description) values("admin","manage all");
insert into t_role(name,description) values("guest","read some res");
insert into t_role(name,description) values("VIP","read all");





#########################插入  用户_角色表  数据##############################
insert into t_user_role(user_id,role_id) values(4,2);
insert into t_user_role(user_id,role_id) values(2,1);
insert into t_user_role(user_id,role_id) values(1,3);
insert into t_user_role(user_id,role_id) values(3,2);





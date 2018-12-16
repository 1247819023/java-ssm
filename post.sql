create table P_author(
	author_id int auto_increment primary key,
	author_name varchar(20),
	author_sex varchar(10),
	author_phone varchar(20),
	author_address varchar(30)
);
create table P_post(
	post_id int auto_increment primary key,
	author_id int references Author(author_id),
	post_caption varchar(20),
	post_content varchar(1200),
	post_time datetime
);

alter table p_post modify post_time datetime default now(); 

insert into P_author values(0,'陈政华','男','18463947235','某地'),
(0,'黄雨欣','女','18739274953','某地'),
(0,'旭宇','男','13406830574','某地');

insert into P_post values
(0,1,'烽火戏诸侯','渡劫的诋毁和本地化近段时间','2017-07-10'),
(0,2,'月光下的银匠','活动分别代表那是','2017-02-20'),
(0,3,'诗书并健 德艺双馨','阿卡isU盾化验室搞丢as滴啊上给偶加','2018-06-15')
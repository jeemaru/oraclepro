drop table person; --테이블제거
drop view  seq_person_id; --시퀸스제거

--테이블 생성
create table person(
    person_id number(5),
    name varchar2(30) not null,
    hp varchar2(20),
    company varchar2(20),
    primary key(person_id)
);

--시퀸스 생성
create sequence seq_person_id
increment by 1
start with 1
nocache;

select *
from person;

--인설트
insert into person
values(seq_person_id.nextval, '이효리', '010-1111-1111', '02-1111-1111');

insert into person
values(seq_person_id.nextval, '정우성', '010-2222-2222', '02-2222-2222');

insert into person
values(seq_person_id.nextval, '유재석', '010-3333-3333', '02-3333-3333');

insert into person
values(seq_person_id.nextval, '유정재', '010-4444-4444', '02-4444-4444');

insert into person
values(seq_person_id.nextval, '서장훈', '010-5555-5555', '02-5555-5555');


--셀렉트
select  person_id,
        name,
        hp,
        company
from person;

--업데이트
update person
set name = '강호동',
    hp = '010-6666-6666',
    company = '02-6666-6666';
where person_id = 6; 

--데이터 삭제
delete from person
where person_id = '2';


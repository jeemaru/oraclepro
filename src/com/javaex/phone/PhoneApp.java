package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneDao phoneDao = new PhoneDao();
		
		while(true) {
			System.out.println("**********************************");
			System.out.println("*         전화번호 관리 프로그램          *");
			System.out.println("**********************************");
			System.out.println(" ");
			System.out.println("1. 리스트 2.등록 3.수정 4.삭제 5.검색 6.종료");
			System.out.println("-----------------------------------");
			System.out.print("메뉴번호:");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("<1.리스트>");
				List<PersonVo> personList = phoneDao.personSelect();
				
				for(int i=0; i<personList.size(); i++) {
					int pId = personList.get(i).getPerson_id();
					String pName = personList.get(i).getName();
					String pHp= personList.get(i).getHp();
					String pCom = personList.get(i).getCompany();
					
					System.out.println(pId+".  " + pName + "  " + pHp + "  " + pCom);
				}
							
			}
			if(num == 2) {
				System.out.println("<2.등록>");
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.println(" ");
				System.out.print("휴대전화 > ");
				String hp = sc.nextLine();
				System.out.println(" ");
				System.out.print("회사번호 > ");
				String company = sc.nextLine();
				System.out.println("1건이 등록되었습니다.");
				
				PersonVo personVo = new PersonVo(name, hp, company); 
				phoneDao.personInsert(personVo);
				
			}
			if(num == 3) {
				System.out.println("<3.수정>");
				System.out.print("번호 > ");
				int personId = sc.nextInt();
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("휴대전화 > ");
				String hp = sc.nextLine();
				System.out.print("회사번호 > ");
				String company = sc.nextLine();
				System.out.println("1건이 수정되었습니다.");
				
				PersonVo personVo = new PersonVo(personId ,name, hp, company);
				phoneDao.personUpdate(personVo);
				
			}
			if(num == 4) {
				System.out.println("<4.삭제>");
				System.out.print("번호 > ");
				int personId = sc.nextInt();
				System.out.println("1건이 삭제되었습니다.");
				phoneDao.PersonDelete(personId);
				
			}
			if(num == 5) {
				System.out.println("<5.검색>");
			}
			if(num == 6) {
				System.out.println("<6.종료>");
				System.out.println("**************************************");
				System.out.println("**             감사합니다               **");
				System.out.println("**************************************");
				break;	
			}
			sc.close();
		}
		

	}

}

/*
 * drop table person; --테이블제거
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

 */

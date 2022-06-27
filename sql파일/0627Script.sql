SELECT  name, 2012-YEAR_emp FROM PROFESSOR 

SELECT * FROM STUDENT 

SELECT * FROM  DEPARTMENT 

SELECT * FROM STUDENT.NAME , DEPARTMENT WHERE student.DEPT_ID  = department.DEPT_ID

SELECT  student.NAME, student.STU_ID , department.DEPT_NAME 
FROM STUDENT , DEPARTMENT 
WHERE  student.DEPT_ID  = department.DEPT_ID 

SELECT student.STU_ID 
FROM STUDENT , DEPARTMENT 
WHERE  student.DEPT_ID = department.DEPT_ID  AND  student.YEAR = 3 AND department.DEPT_NAME ='컴퓨터공학과'

SELECT  NAME ,STU_ID 
FROM STUDENT 
WHERE  YEAR = 3 OR YEAR =4
ORDER BY name,STU_ID 

SELECT  name, stu_id
FROM STUDENT 
WHERE  YEAR = 3 OR YEAR =4


SELECT *
FROM STUDENT 
WHERE YEAR =3 OR YEAR =4
ORDER BY NAME DESC , STU_ID 

SELECT  ADDRESS 
FROM STUDENT 
WHERE NAME ='김광식'

SELECT s2.name
FROM STUDENT s1, STUDENT s2
WHERE s1.ADDRESS  = s2.ADDRESS AND s1.NAME ='김광식'


SELECT  name 이름, POSITION AS 직위, 2022-YEAR_emp 재직연수
FROM PROFESSOR

SELECT*
FROM STUDENT 
WHERE NAME LIKE '김%'

SELECT * FROM STUDENT  WHERE RESIDENT_ID LIKE '-------------------2%'

SELECT * FROM STUDENT WHERE RESIDENT_ID LIKE '8%'

SELECT  name FROM STUDENT 
UNION all
SELECT name FROM PROFESSOR 

SELECT s.stu_id 
FROM STUDENT s , DEPARTMENT d , TAKES t
WHERE  s.DEPT_ID  = d.DEPT_ID 
AND t.STU_ID = s.STU_ID  
AND dept_name='컴퓨터공학과'AND grade = 'A+'

SELECT  * FROM  TAKES t 

SELECT stu_id
FROM STUDENT s ,DEPARTMENT d 
WHERE  s.DEPT_ID =d.DEPT_ID AND dept_name = '컴퓨터공학과'
INTERSECT 
SELECT STU_ID 
FROM TAKES 
WHERE grade = 'A+'

SELECT stu_id
FROM STUDENT s ,DEPARTMENT d 
WHERE  s.DEPT_ID = d.DEPT_ID AND dept_name = '산업공학과'
MINUS 
SELECT STU_ID 
FROM TAKES 
WHERE grade = 'A+'

SELECT title, credit, YEAR , semester
FROM COURSE , CLASS 
WHERE course.COURSE_ID =class.COURSE_ID 

SELECT title,credit, YEAR, semester
FROM COURSE LEFT OUTER JOIN CLASS 
using(COURSE_id)

SELECT title, credit, YEAR,semester
FROM COURSE RIGHT OUTER JOIN CLASS 
USING (COURSE_id)

SELECT title,credit,YEAR,semester
FROM COURSE,CLASS 
WHERE course.COURSE_ID(+) = class.COURSE_ID

SELECT title,credit,YEAR,semester
FROM COURSE FULL OUTER JOIN CLASS 
USING (COURSE_id)

SELECT count(*)
FROM STUDENT 
WHERE YEAR = 3

SELECT * FROM EMP 

SELECT count(dept_id)
FROM STUDENT

SELECT count(DISTINCT dept_id)
FROM STUDENT 

SELECT count(*)
FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID =d.DEPT_ID  AND d.dept_name = '컴퓨터공학과'

SELECT SUM(2022-YEAR_emp)
FROM PROFESSOR

SELECT sum(sal)
FROM EMP e 

SELECT SUM(sal)
FROM EMP e 
WHERE  JOB ='ANALYST'

SELECT  SUM(sal)
FROM EMP e ,DEPT d 
WHERE  e.DEPTNO  = d.DEPTNO  AND dname = 'RESEARCH'

SELECT DISTINCT job FROM EMP
--각각 직업들의 합
SELECT SUM(sal) FROM EMP WHERE  JOB ='CLERK' 

SELECT SUM(sal) FROM EMP WHERE  JOB ='SALESMAN'

SELECT SUM(sal) FROM EMP WHERE  JOB ='MANAGER'

SELECT SUM(sal) FROM EMP WHERE  JOB ='ANALYST' 

SELECT SUM(sal) FROM EMP WHERE  JOB ='PRESIDENT' 


SELECT SUM(sal)
FROM EMP e 
WHERE e.

--평균 재직연수
SELECT AVG(2022-YEAR_emp) 평균재직연수 FROM PROFESSOR 


--부서 이름이 accounting 인 직원들 중에서 최대 급여가 얼마인지 출력
SELECT MAX(sal) FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT MIN(SAL) FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT MIN(SAL),MIN(SAL), AVG(SAL)  FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT * FROM STUDENT 

--STUDENT 테이블에서 학과번호 별로 레코드의 개수를 출력
SELECT dept_id,COUNT(*) 
FROM STUDENT 
GROUP BY DEPT_ID 

-- 학과 번호 대신 department 테이블과 조인하여 학과 이름이 출력되도록 수정
SELECT  dept_name,COUNT(*) 
FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID  = d.DEPT_ID 
GROUP BY dept_name

-- emp,dept 테이블에서 부서별 직원수, 평균급여, 최대급여,최소급여를 출력
SELECT  dname, COUNT(*), AVG(sal), MAX(sal), MIN(sal)
FROM EMP e , DEPT d 
WHERE e.DEPTNO  = d.DEPTNO 
GROUP BY dname

--학사 데이터 베이스에서 학과별 교수 숫자와 평균 재직연수, 최대 재직연수를 출력
SELECT dept_name, COUNT(*), AVG(2022-year_emp),max(2022-YEAR_emp)
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID  = d.DEPT_ID 
GROUP BY DEPT_name

--HAVING  그룹에 대한 조건을 명시할때 사용 

SELECT dept_name, COUNT(*),AVG(2022-YEAR_emp),MAX(2022-YEAR_emp)  
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID AND AVG(2012-YEAR_EMP)>=10
GROUP BY dept_name

--HAVING 절을 이용하여 다시 작성

SELECT dept_name, COUNT(*),AVG(2012-YEAR_emp),MAX(2012-YEAR_emp)  
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID  = d.DEPT_ID 
GROUP BY dept_name
HAVING   AVG(2012-YEAR_EMP)>=10 

--having직원 숫자가 5명 이상인 부서에 대해서 부서별 직원수, 평균 급여 최대급여 최소급여를 출력
SELECT dname,COUNT(*), AVG(sal),MAX(sal),MIN(sal)
FROM EMP e ,DEPT d 
WHERE e.DEPTNO =d.DEPTNO 
GROUP BY dname
HAVING COUNT(*)>=5 

--NULL 
SELECT * FROM emp WHERE COMM IS NULL 

SELECT * FROM emp WHERE COMM IS NOT NULL 

--NULL 의 처리 takes 테이블에서 학점이 a+가 아닌 학생들의 학번을 검색

SELECT  stu_id
FROM TAKES 
WHERE GRADE <>'A+'


--in 301호 강의실에서 개설된 강좌의 과목명을 출력

SELECT  title
FROM COURSE 
WHERE COURSE_ID IN 
(SELECT DISTINCT COURSE_ID
FROM CLASS 
WHERE classroom='301호')

SELECT DISTINCT title
FROM COURSE c1,CLASS c2 
WHERE c1.COURSE_ID =c2.COURSE_ID AND classroom = '301호'

SELECT title
FROM COURSE 
WHERE COURSE_ID  NOT IN (SELECT DISTINCT COURSE_ID
FROM CLASS 
WHERE YEAR = 2012 AND SEMESTER=2)

--view 보기
SELECT * FROM V_TAKES 

--VIEW 생성
CREATE OR REPLACE VIEW v_takes AS
SELECT stu_id,class_id
FROM takes

CREATE OR REPLACE VIEW cs_student AS
SELECT s.stu_id, s.resident_id, s.name, s.YEAR, s.address,s.dept_id
FROM student s, department d
WHERE s.dept_id = d.DEPT_ID AND d.DEPT_NAME ='컴퓨터공학과'



SELECT * FROM cs_student

SELECT * FROM TAKES 

SELECT *FROM v_takes

INSERT INTO v_takes
VALUEs ('1292502','C101-01')

--view 삭제
DROP VIEW V_TAKES 


CREATE OR REPLACE VIEW v_takes AS
SELECT stu_id, class_id
FROM takes
WITH READ ONLY


--읽기 전용 view에 insert 시도하기(에러)
INSERT INTO V_TAKES 
value ('1292502', 'c101-01')
INSERT INTO V_TAKES 

--조회된 결과에 일종의 별명을 부여해서 칼럼 레이블을 변경할 수 있다.
SELECT deptno AS 부서코드, dname AS 부서명, loc AS 지역
FROM dept;

SELECT deptno 부서코드, dname 부서명, loc 지역
FROM dept;

--문자와 문자를 연결하는 기능
SELECT empno, ename || '(' || job ||')'employee
FROM emp;

--emp 테이블의 모든 직원들의 1달 급여를 구하여라
SELECT ename, ROUND(sal/12, 1), TRUNC(sal/12, 1)  
FROM emp;


-- 날짜형 함수
SELECT SYSDATE, EXTRACT(MONTH FROM sysdate),
extract(DAY FROM sysdate)
from dual;

SELECT ename, hiredate,
TO_CHAR(hiredate, 'YYYY') 입사년도,
TO_CHAR(hiredate, 'MM') 월,
TO_CHAR(hiredate, 'DD')일
FROM EMP

--변환형 함수

SELECT sysdate FROM dual;

SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') 날짜,
TO_CHAR(SYSDATE, 'YYYY.MON.DAY') 문자형
FROM dual;

--case 표현
 SELECT ename,sal FROM EMP;

SELECT ename, CASE WHEN sal>2000
THEN sal
ELSE 2000
end revised_salary
FROM EMP

--예제) 부서 정보(dept)에서 부서 위치를 미국의 동부 , 중부, 서부로 구분하라
SELECT * FROM dept;

SELECT loc,
CASE loc
when'NEW YORK' THEN 'EAST'
WHEN 'BOSTON' THEN 'EAST'
WHEN 'CHICAGO' THEN 'CENTER'
WHEN 'DALLAS' THEN 'CENTER'
ELSE 'ETC'
END AS AREA
FROM dept;

SELECT loc,
DECODE(loc,
'NEW YORK', 'EAST',
'BOSTON', 'EAST',
'DALLAS', 'CENTER',
'CHICAGO', 'CENTER', 'ETC'
)AREA
FROM dept;

--예제) 사원 정보에서 급여가 3000이상이면 상등급으로 1000이상이면 중등급으로 1000미만이면 하등급으로 분류하라
SELECT  ename,
CASE WHEN sal>=3000 THEN 'high'
WHEN sal>=1000 THEN 'mid'
ELSE 'low'
END AS salary_grade
FROM emp;

--null 관련 함수
SELECT empno, ename, sal, nvl(comm,0) FROM EMP

SELECT empno, ename,sal, 
CASE WHEN comm IS NULL
THEN 0 
ELSE comm END AS commision
FROM EMP 

--NULL 필드와 null아닌 필드 구분하는 쿼리문
SELECT * FROM EMP 
WHERE comm IS NULL;

SELECT * FROM EMP 
WHERE COMM IS NOT NULL ;

-- select 절에 의해 추출되는 데이터에 붙은 순번 <,<=,=1를 이용하여 비교(>,>=,=2는 동작하지 않음)
SELECT * FROM EMP 
WHERE rownum<=5;

SELECT ename, sal, comm, sal+nvl(comm, 0) salsum FROM EMP ORDER BY 4 DESC; 

SELECT *
FROM (
SELECT ename, sal, comm, sal+nvl(comm, 0) salsum FROM EMP ORDER BY 4 DESC) 
WHERE rownum<=5

--BETWEEN  emp 테이블의 직원 중, 급여가 1500 이상이면서 2500이하인 직원을 구하시오
SELECT * FROM EMP 
WHERE sal BETWEEN  1500 AND 2500

--GROUP FUNCTION  일반적인 group by 절 사용 

SELECT dname, job, COUNT(*) "Total Emp1" ,
SUM(sal) "Total Sal"
FROM emp, DEPT WHERE dept.DEPTNO = emp.DEPTNO 
GROUP BY dname, job

-- GROUP by 절 +order by 절

SELECT dname, job, COUNT(*) "total emp1",
SUM(sal) "Total Sal"
FROM EMP , DEPT 
WHERE dept.DEPTNO  = emp.DEPTNO 
GROUP  BY dname, JOB 
ORDER BY dname, job

--Rollup 함수 사용
SELECT dname, job,
COUNT(*) "Total Emp1",
SUM(sal) "Total Sal" 
FROM emp, DEPT 
WHERE dept.DEPTNO = emp.DEPTNO 
GROUP BY ROLLUP (dname, job)
ORDER BY dname, JOB 


SELECT Max(Deptno) FROM DEPT 


CREATE TABLE LOGIN (
ID VARCHAR2(30),
PASSWORD VARCHAR2(30),
CONSTRAINT PK_ID PRIMARY KEY(ID)
)

SELECT *FROM LOGIN

INSERT INTO LOGIN VALUES('green', 'green1234');


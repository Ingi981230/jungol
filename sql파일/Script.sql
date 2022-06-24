SELECT  name, 2012-YEAR_emp FROM PROFESSOR 

SELECT * FROM STUDENT 

SELECT * FROM  DEPARTMENT 

SELECT * FROM STUDENT.NAME , DEPARTMENT WHERE student.DEPT_ID  = department.DEPT_ID

SELECT  student.NAME, student.STU_ID , department.DEPT_NAME 
FROM STUDENT , DEPARTMENT 
WHERE  student.DEPT_ID  = department.DEPT_ID 

SELECT student.STU_ID 
FROM STUDENT , DEPARTMENT 
WHERE  student.DEPT_ID = department.DEPT_ID  AND  student.YEAR = 3 AND department.DEPT_NAME ='��ǻ�Ͱ��а�'

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
WHERE NAME ='�豤��'

SELECT s2.name
FROM STUDENT s1, STUDENT s2
WHERE s1.ADDRESS  = s2.ADDRESS AND s1.NAME ='�豤��'


SELECT  name �̸�, POSITION AS ����, 2022-YEAR_emp ��������
FROM PROFESSOR

SELECT*
FROM STUDENT 
WHERE NAME LIKE '��%'

SELECT * FROM STUDENT  WHERE RESIDENT_ID LIKE '-------------------2%'

SELECT * FROM STUDENT WHERE RESIDENT_ID LIKE '8%'

SELECT  name FROM STUDENT 
UNION all
SELECT name FROM PROFESSOR 

SELECT s.stu_id 
FROM STUDENT s , DEPARTMENT d , TAKES t
WHERE  s.DEPT_ID  = d.DEPT_ID 
AND t.STU_ID = s.STU_ID  
AND dept_name='��ǻ�Ͱ��а�'AND grade = 'A+'

SELECT  * FROM  TAKES t 

SELECT stu_id
FROM STUDENT s ,DEPARTMENT d 
WHERE  s.DEPT_ID =d.DEPT_ID AND dept_name = '��ǻ�Ͱ��а�'
INTERSECT 
SELECT STU_ID 
FROM TAKES 
WHERE grade = 'A+'

SELECT stu_id
FROM STUDENT s ,DEPARTMENT d 
WHERE  s.DEPT_ID = d.DEPT_ID AND dept_name = '������а�'
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
WHERE s.DEPT_ID =d.DEPT_ID  AND d.dept_name = '��ǻ�Ͱ��а�'

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
--���� �������� ��
SELECT SUM(sal) FROM EMP WHERE  JOB ='CLERK' 

SELECT SUM(sal) FROM EMP WHERE  JOB ='SALESMAN'

SELECT SUM(sal) FROM EMP WHERE  JOB ='MANAGER'

SELECT SUM(sal) FROM EMP WHERE  JOB ='ANALYST' 

SELECT SUM(sal) FROM EMP WHERE  JOB ='PRESIDENT' 


SELECT SUM(sal)
FROM EMP e 
WHERE e.

--��� ��������
SELECT AVG(2022-YEAR_emp) ����������� FROM PROFESSOR 


--�μ� �̸��� accounting �� ������ �߿��� �ִ� �޿��� ������ ���
SELECT MAX(sal) FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT MIN(SAL) FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT MIN(SAL),MIN(SAL), AVG(SAL)  FROM EMP e ,DEPT d  WHERE e.DEPTNO =d.DEPTNO AND dname = 'ACCOUNTING'

SELECT * FROM STUDENT 

--STUDENT ���̺��� �а���ȣ ���� ���ڵ��� ������ ���
SELECT dept_id,COUNT(*) 
FROM STUDENT 
GROUP BY DEPT_ID 

-- �а� ��ȣ ��� department ���̺�� �����Ͽ� �а� �̸��� ��µǵ��� ����
SELECT  dept_name,COUNT(*) 
FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID  = d.DEPT_ID 
GROUP BY dept_name

-- emp,dept ���̺��� �μ��� ������, ��ձ޿�, �ִ�޿�,�ּұ޿��� ���
SELECT  dname, COUNT(*), AVG(sal), MAX(sal), MIN(sal)
FROM EMP e , DEPT d 
WHERE e.DEPTNO  = d.DEPTNO 
GROUP BY dname

--�л� ������ ���̽����� �а��� ���� ���ڿ� ��� ��������, �ִ� ���������� ���
SELECT dept_name, COUNT(*), AVG(2022-year_emp),max(2022-YEAR_emp)
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID  = d.DEPT_ID 
GROUP BY DEPT_name

--HAVING  �׷쿡 ���� ������ ����Ҷ� ��� 

SELECT dept_name, COUNT(*),AVG(2022-YEAR_emp),MAX(2022-YEAR_emp)  
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID AND AVG(2012-YEAR_EMP)>=10
GROUP BY dept_name

--HAVING ���� �̿��Ͽ� �ٽ� �ۼ�

SELECT dept_name, COUNT(*),AVG(2012-YEAR_emp),MAX(2012-YEAR_emp)  
FROM PROFESSOR p ,DEPARTMENT d 
WHERE p.DEPT_ID  = d.DEPT_ID 
GROUP BY dept_name
HAVING   AVG(2012-YEAR_EMP)>=10 

--having���� ���ڰ� 5�� �̻��� �μ��� ���ؼ� �μ��� ������, ��� �޿� �ִ�޿� �ּұ޿��� ���
SELECT dname,COUNT(*), AVG(sal),MAX(sal),MIN(sal)
FROM EMP e ,DEPT d 
WHERE e.DEPTNO =d.DEPTNO 
GROUP BY dname
HAVING COUNT(*)>=5 

--NULL 
SELECT * FROM emp WHERE COMM IS NULL 

SELECT * FROM emp WHERE COMM IS NOT NULL 

--NULL �� ó�� takes ���̺��� ������ a+�� �ƴ� �л����� �й��� �˻�

SELECT  stu_id
FROM TAKES 
WHERE GRADE <>'A+'


--in 301ȣ ���ǽǿ��� ������ ������ ������� ���

SELECT  title
FROM COURSE 
WHERE COURSE_ID IN 
(SELECT DISTINCT COURSE_ID
FROM CLASS 
WHERE classroom='301ȣ')

SELECT DISTINCT title
FROM COURSE c1,CLASS c2 
WHERE c1.COURSE_ID =c2.COURSE_ID AND classroom = '301ȣ'

SELECT title
FROM COURSE 
WHERE COURSE_ID  NOT IN (SELECT DISTINCT COURSE_ID
FROM CLASS 
WHERE YEAR = 2012 AND SEMESTER=2)

--view ����
SELECT * FROM V_TAKES 

--VIEW ����
CREATE OR REPLACE VIEW v_takes AS
SELECT stu_id,class_id
FROM takes

CREATE OR REPLACE VIEW cs_student AS
SELECT s.stu_id, s.resident_id, s.name, s.YEAR, s.address,s.dept_id
FROM student s, department d
WHERE s.dept_id = d.DEPT_ID AND d.DEPT_NAME ='��ǻ�Ͱ��а�'



SELECT * FROM cs_student

SELECT * FROM TAKES 

SELECT *FROM v_takes

INSERT INTO v_takes
VALUEs ('1292502','C101-01')

--view ����
DROP VIEW V_TAKES 


CREATE OR REPLACE VIEW v_takes AS
SELECT stu_id, class_id
FROM takes
WITH READ ONLY


--�б� ���� view�� insert �õ��ϱ�(����)
INSERT INTO V_TAKES 
value ('1292502', 'c101-01')
INSERT INTO V_TAKES 







declare 

v_empno test_pl.empno%type;
v_ename test_pl.ename%type;
v_sal test_pl.sal%type;
v_mgr test_pl.mgr%type;

begin 

insert into test_pl
select *
from (select rownum, empno, ename, sal, mgr
from emp
where emp.ename ='king');

select empno, ename, sal, mgr
into v_empno, v_ename, v_sal, v_mgr
from emp
where emp.ename ='king';

dbms_output.put_line(v_empno ||v_ename||v_sal||nvl(v_mgr,0)); 


end;
/

drop procedure if exists sp_nuevo_trabajador;

delimiter &&
create procedure sp_nuevo_trabajador(in idtra CHAR(10),in tnom VARCHAR(50),in tapell VARCHAR(50),in tfn date,in tdir VARCHAR(100),in tsex CHAR(1),in tdni CHAR(8),in test CHAR(1))
begin
insert into trabajador(IdTrabajador, Tnombre, Tapellido, TFnac, Tdirec, Tsexo, Tdni, TestadoCiv) values (idtra,tnom,tapell,tfn,tdir,tsex,tdni,test);
end&&
delimiter ;

drop procedure if exists sp_nuevo_DM;

delimiter &&
create procedure sp_nuevo_DM(in iddm CHAR(6),in finicio VARCHAR(10),in ffin VARCHAR(10),in diagnostico Varchar(250),
								in centrosalud VARCHAR(100),in medico VARCHAR(200),in dcmp CHAR(6),in idtrabajador CHAR(10))
begin
insert into descanso(IdDescanso, DFinicio, DFfin, Ddiagnostico, DCentroSalud, DMedico, DCMP, IdTrabajador) 
values (iddm,finicio,ffin,diagnostico,centrosalud,medico,dcmp,idtrabajador);
end&&
delimiter ;


drop procedure if exists sp_consultar_DM;

delimiter &&
create procedure sp_consultar_DM()
begin
select * from descanso;
end&&
delimiter ;

call sp_consultar_DM();

create user 'usuario01'@'localhost' identified by '12345678';grant all privileges on *.* to 'usuario01'@'localhost';

drop procedure if exists sp_listar_trabajadores;
delimiter &&
create procedure sp_listar_trabajadores()
begin
select * from trabajador;
end&&
delimiter ;

call sp_listar_trabajadores();
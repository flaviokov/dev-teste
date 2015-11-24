create database dev;

use dev;

create table usuario (
	id int not null auto_increment,
    nome varchar(255),
    primary key(id)
);

create table email (
	id int not null auto_increment,
    email varchar(255),
    usuario_id int,
    primary key(id),
    constraint fk_email_usuario foreign key(usuario_id)
    references usuario(id)
);

create table compra(
  id int not null auto_increment,
  valor decimal(10,2),
  dataDaCompra datetime,
  usuario_id int,
  primary key(id),
  constraint fk_compra_usuario foreign key(usuario_id)
  references usuario(id)
);

insert into usuario (nome) 
values ("Carlos"),("Juca"),("Maria");
insert into email (email,usuario_id)
values ("carlos@gmail.com",1),("juca@gmail.com",2),("maria@gmail.com",3);
insert into compra (valor,dataDaCompra,usuario_id)
values (250,'2015-10-25',1),(50,'2015-10-26',1),(25,'2015-10-24',1),(300,'2015-10-25',2)
,(500,'2015-10-20',2),(20,'2015-10-25',3),(500,'2015-11-23',1); 

select sum(valor) as total ,count(u.id) as vezes, u.nome,c.dataDaCompra 
from compra c inner join usuario u on u.id = c.usuario_id 
where dataDaCompra between curdate() - interval 30 day and curdate() 
group by u.id;

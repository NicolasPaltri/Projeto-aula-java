create database db_agenda;

use db_agenda;



create table tb_usuario(
id INT primary key auto_increment,
nome varchar(40) not null,
usuario varchar(10) not null,
senha varchar(20) not null
);

INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Administrador', 'admin', '12345');

select * From tb_usuario;
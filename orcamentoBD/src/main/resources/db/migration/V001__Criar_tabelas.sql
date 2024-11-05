create table cliente(
    id bigint not null primary key auto_increment,
    nome varchar(100),
    endereco varchar(120),
    numero varchar(100),
    bairro varchar (50),
    telefone varchar (30),
    celular varchar (30),
    id_municipio int not null
);
create table lancamento(
    id bigint not null primary key auto_increment,
    id_cliente bigint not null,
    tipo_lancamento varchar (10),
    valor_lancamento decimal(12,2)
);
create table municipio(
    id int not null primary key auto_increment,
    nome varchar (100),
    estado char (2)
);
alter table cliente add constraint FK_municipio_cliente foreign key (id_municipio) references municipio(id);
alter table lancamento add constraint FK_cliente_lancamento foreign key (id_cliente) references cliente(id);
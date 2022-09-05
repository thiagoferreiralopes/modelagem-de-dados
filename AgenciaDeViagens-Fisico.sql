create database AgenciaDeViagens;

use AgenciaDeViagens;

CREATE TABLE Permissoes (
    Id_Permissao INTEGER PRIMARY KEY auto_increment,
    Tipo_Permissao VARCHAR(20)
);

CREATE TABLE Cliente (
    Id_Cliente INTEGER PRIMARY KEY auto_increment,
    Senha_Cliente INTEGER,
    Nome VARCHAR (60),
    Email VARCHAR(60),
    Id_Permissao INTEGER,
    foreign key (id_Permissao) references Permissoes (id_permissao)
);

CREATE TABLE Compra (
    Id_Compra INTEGER PRIMARY KEY auto_increment,
    Data_Compra DATE,
    Valor_compra DECIMAL,
    Id_Cliente INTEGER,
    foreign key (Id_Cliente) references Cliente (Id_Cliente)
);

CREATE TABLE TipoCompra (
	Id_Tipo_Compra integer primary key auto_increment,
    Quantidade INTEGER,
    Id_Compra integer,
    foreign key (Id_Compra) references Compra (Id_Compra)
);

CREATE TABLE Pacotes (
    Id_Pacote INTEGER PRIMARY KEY auto_increment,
    Valor_Pacote DECIMAL(5,2),
    Quant_Dias_Viagem INTEGER,
    Destino_Pacote VARCHAR(40),
    Id_Tipo_Compra integer,
    foreign key (Id_Tipo_Compra) references TipoCompra (Id_Tipo_Compra)
);

CREATE TABLE Viagem (
    Id_Viagem INTEGER PRIMARY KEY auto_increment,
    Destino_Viagem VARCHAR(40),
    Data_Viagem DATE,
    Valor_Viagem DECIMAL (5,2),
    Id_Tipo_Compra integer,
    foreign key (Id_Tipo_Compra) references TipoCompra (Id_Tipo_Compra)
);

CREATE TABLE Hotel (
    Id_Hotel INTEGER PRIMARY KEY,
    Valor_Hotel DECIMAL (5,2),
    Data_Check DATE,
    Destino_Hotel VARCHAR(40),
    Id_Tipo_Compra integer,
    foreign key (Id_Tipo_Compra) references TipoCompra (Id_Tipo_Compra)
);
 

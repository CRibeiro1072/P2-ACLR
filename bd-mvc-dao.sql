create database aclr;

use aclr;

-- Cria a tabela usuario
create table usuario(
    usuarioCodigo int primary key not null auto_increment,
    usuarioNome varchar(50),
    usuarioEmail varchar(50),
    usuarioSenha varchar(50),
    usuarioAdministrador boolean
);
-- Popula a tabela usuario
insert into usuario (usuarioNome, usuarioEmail, usuarioSenha, usuarioAdministrador) values ('Arai', 'arai@gmail.com', '123456', true);
insert into usuario (usuarioNome, usuarioEmail, usuarioSenha, usuarioAdministrador) values ('Claudinei', 'claudinei@gmail.com', '123456', false);
insert into usuario (usuarioNome, usuarioEmail, usuarioSenha, usuarioAdministrador) values ('Lorival', 'lorival@gmail.com', '123456', false);
insert into usuario (usuarioNome, usuarioEmail, usuarioSenha, usuarioAdministrador) values ('Romildo', 'romildo@gmail.com', '123456', true);

-- Cria a tabela categoria
create table categoria(
    categoriaCodigo int primary key not null auto_increment,
    categoriaDescricao varchar(50)
);
-- Popula a tabela categoria
insert into categoria (categoriaDescricao) values ('Categoria 1');
insert into categoria (categoriaDescricao) values ('Categoria 2');
insert into categoria (categoriaDescricao) values ('Categoria 3');
insert into categoria (categoriaDescricao) values ('Categoria 4');
insert into categoria (categoriaDescricao) values ('Categoria 5');

-- Cria a tabela marca
create table marca(
    marcaCodigo int primary key not null auto_increment,
    marcaDescricao varchar(50)
);
-- Popula a tabela marca
insert into marca (marcaDescricao) values ('Marca 1');
insert into marca (marcaDescricao) values ('Marca 2');
insert into marca (marcaDescricao) values ('Marca 3');
insert into marca (marcaDescricao) values ('Marca 4');
insert into marca (marcaDescricao) values ('Marca 5');

-- Cria a tabela situacao
create table situacao(
    situacaoCodigo int primary key not null auto_increment,
    situacaoDescricao varchar(50)
);
-- Popula a tabela situacao
insert into situacao (situacaoDescricao) values ('Situacao 1');
insert into situacao (situacaoDescricao) values ('Situacao 2');
insert into situacao (situacaoDescricao) values ('Situacao 3');
insert into situacao (situacaoDescricao) values ('Situacao 4');
insert into situacao (situacaoDescricao) values ('Situacao 5');

-- Cria a tabela produto
create table produto(
    produtoCodigo int primary key not null auto_increment,
    produtoDescricao varchar(50), 
    produtoQuantidade varchar(10),
    produtoValor float,
    produtoCategoria int not null,
    produtoMarca int not null,
    constraint fk_pro_categoria foreign key(produtoCategoria) REFERENCES categoria(categoriaCodigo),
    constraint fk_pro_marca foreign key(produtoMarca) REFERENCES marca(marcaCodigo)
);
-- Popula a tabela produto
insert into produto (produtoDescricao, produtoQuantidade, produtoValor, produtoCategoria, produtoMarca) values ('Produto 1', '10', 10.00, 1, 2);
insert into produto (produtoDescricao, produtoQuantidade, produtoValor, produtoCategoria, produtoMarca) values ('Produto 2', '50', 1.00, 3, 5);
insert into produto (produtoDescricao, produtoQuantidade, produtoValor, produtoCategoria, produtoMarca) values ('Produto 3', '10', 15.00, 4, 3);
insert into produto (produtoDescricao, produtoQuantidade, produtoValor, produtoCategoria, produtoMarca) values ('Produto 4', '15', 20.00, 2, 1);
insert into produto (produtoDescricao, produtoQuantidade, produtoValor, produtoCategoria, produtoMarca) values ('Produto 5', '10', 5.00, 5, 4);

-- Cria a tabela cliente
create table cliente(
    clienteCodigo int primary key not null auto_increment,
    clienteNome varchar(100), 
    clienteCpf varchar(15),
    clienteTelefone varchar(15),
    clienteCeleular varchar(15),
    clienteEmail varchar(100),
    clienteSenha varchar(50),
    clienteDtNascimento varchar(15)
);
-- Popula a tabela cliente
insert into cliente (clienteNome, clienteCpf, clienteTelefone, clienteCeleular, clienteEmail, clienteSenha, clienteDtNascimento ) values ('Cliente 1', '111.111.111-11', '(11)11111-11111', '(11)11111-1111', 'Cliente1@gmail.com', '111111', '01/01/2020');
insert into cliente (clienteNome, clienteCpf, clienteTelefone, clienteCeleular, clienteEmail, clienteSenha, clienteDtNascimento ) values ('Cliente 2', '111.111.111-11', '(11)11111-11111', '(11)11111-1111', 'Cliente2@gmail.com', '111111', '02/02/2020');
insert into cliente (clienteNome, clienteCpf, clienteTelefone, clienteCeleular, clienteEmail, clienteSenha, clienteDtNascimento ) values ('Cliente 3', '111.111.111-11', '(11)11111-11111', '(11)11111-1111', 'Cliente3@gmail.com', '111111', '03/03/2020');
insert into cliente (clienteNome, clienteCpf, clienteTelefone, clienteCeleular, clienteEmail, clienteSenha, clienteDtNascimento ) values ('Cliente 4', '111.111.111-11', '(11)11111-11111', '(11)11111-1111', 'Cliente4@gmail.com', '111111', '04/04/2020');
insert into cliente (clienteNome, clienteCpf, clienteTelefone, clienteCeleular, clienteEmail, clienteSenha, clienteDtNascimento ) values ('Cliente 5', '111.111.111-11', '(11)11111-11111', '(11)11111-1111', 'Cliente5@gmail.com', '111111', '05/05/2020');

-- Cria a tabela endereco
create table endereco(
    enderecoCodigo int primary key not null auto_increment,
    enderecoCliente int not null, 
    enderecoDescricao varchar(100),
    enderecoLogradouro varchar(100),
    enderecoNumero varchar(5),
    enderecoComplemento varchar(100),
    enderecoCep varchar(10),
    enderecoBairro varchar(50),
    enderecoCidade varchar(50),
    enderecoUf varchar(2),
    constraint fk_end_cliente foreign key(enderecoCliente) REFERENCES cliente(clienteCodigo)
);
-- Popula a tabela endereco
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (1, 'Descricao 1', 'Logradouro 1', 'Num 1', 'Complemento 1', '11.111-111', 'Bairro 1', 'Cidade 1', 'GO');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (1, 'Descricao 2', 'Logradouro 2', 'Num 2', 'Complemento 2', '22.222-222', 'Bairro 2', 'Cidade 2', 'MT');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (2, 'Descricao 1', 'Logradouro 1', 'Num 1', 'Complemento 1', '11.111-111', 'Bairro 1', 'Cidade 1', 'GO');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (2, 'Descricao 2', 'Logradouro 2', 'Num 2', 'Complemento 2', '22.222-222', 'Bairro 2', 'Cidade 2', 'MT');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (3, 'Descricao 1', 'Logradouro 1', 'Num 1', 'Complemento 1', '11.111-111', 'Bairro 1', 'Cidade 1', 'GO');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (3, 'Descricao 2', 'Logradouro 2', 'Num 2', 'Complemento 2', '22.222-222', 'Bairro 2', 'Cidade 2', 'MT');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (4, 'Descricao 1', 'Logradouro 1', 'Num 1', 'Complemento 1', '11.111-111', 'Bairro 1', 'Cidade 1', 'GO');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (4, 'Descricao 2', 'Logradouro 2', 'Num 2', 'Complemento 2', '22.222-222', 'Bairro 2', 'Cidade 2', 'MT');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (5, 'Descricao 1', 'Logradouro 1', 'Num 1', 'Complemento 1', '11.111-111', 'Bairro 1', 'Cidade 1', 'GO');
insert into endereco (enderecoCliente, enderecoDescricao, enderecoLogradouro, enderecoNumero, enderecoComplemento, enderecoCep, enderecoBairro, enderecoCidade, enderecoUf) values (5, 'Descricao 2', 'Logradouro 2', 'Num 2', 'Complemento 2', '22.222-222', 'Bairro 2', 'Cidade 2', 'MT');

-- Cria a tabela venda
create table venda(
    vendaCodigo int primary key not null auto_increment,
    vendaCliente int not null,
    vendaDataVenda varchar(15),
    vendaSituacao int not null,
    vendaEnderecoEntrega int not null, 
    constraint fk_nom_cliente foreign key(vendaCliente) REFERENCES cliente(clienteCodigo),
    constraint fk_end_entrega_cliente foreign key(vendaEnderecoEntrega) REFERENCES endereco(enderecoCodigo)
);
-- Popula tabela venda
insert into venda (vendaCliente, vendaDataVenda, vendaSituacao, vendaEnderecoEntrega) values (1, '01/01/2020', 2, 3);
insert into venda (vendaCliente, vendaDataVenda, vendaSituacao, vendaEnderecoEntrega) values (3, '05/02/2020', 5, 1);
insert into venda (vendaCliente, vendaDataVenda, vendaSituacao, vendaEnderecoEntrega) values (2, '10/03/2020', 3, 4);
insert into venda (vendaCliente, vendaDataVenda, vendaSituacao, vendaEnderecoEntrega) values (5, '11/04/2020', 1, 2);
insert into venda (vendaCliente, vendaDataVenda, vendaSituacao, vendaEnderecoEntrega) values (4, '23/05/2020', 4, 5);

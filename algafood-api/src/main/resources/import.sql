insert into cozinha (nome) values ('Brasileira');
insert into cozinha (nome) values ('Indiana');
insert into cozinha (nome) values ('Tailandesa');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Maria Fumaça', 10.00, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tia Lu', 5.00,2);

insert into forma_pagamento (descricao) values ('Boleto Bancario');
insert into forma_pagamento (descricao) values ('Cartão de Crédito');
insert into forma_pagamento (descricao) values ('Cartão de Débito');

insert into permissao (nome, descricao) values ('Acessar Produtos', 'Permite acessar a tela de produtos');
insert into permissao (nome, descricao) values ('Acessar Cadastro de Produtos', 'Permite cadastrar produtos');
insert into permissao (nome, descricao) values ('Acessar Estoque', 'Permite acessar a tela de estoque');

insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Rio de Janeiro');
insert into estado (nome) values ('Santa Catarina');
insert into estado (nome) values ('Paraná');

insert into cidade (nome, estado_id) values ('São Paulo', 1);
insert into cidade (nome, estado_id) values ('Rio de Janeiro', 2);
insert into cidade (nome, estado_id) values ('Florianópolis', 3);
insert into cidade (nome, estado_id) values ('Curitiba', 4);

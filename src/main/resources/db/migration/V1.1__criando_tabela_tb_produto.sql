CREATE TABLE produtos(
    id_produto BIGINT not null,
    descricao VARCHAR(40) not null,
    qtd_produto INT not null,
    ean BIGINT not null,
    preco_custo NUMERIC(10, 2) not null,
    preco_venda NUMERIC(10, 2) not null,
    validade DATE,

    primary key (id_produto)

);
--- Criar a tabela tb_stock
CREATE TABLE public.tb_stock (
    id numeric(9) NOT NULL,
    "date" date NOT NULL,
    "name" varchar(100) NOT NULL,
    price numeric(8,2) NOT NULL,
    variation numeric(5,2) NOT NULL,
    CONSTRAINT tb_stock_pkey PRIMARY KEY (id)
 );

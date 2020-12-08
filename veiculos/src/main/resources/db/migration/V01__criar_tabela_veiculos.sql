CREATE TABLE
        veiculo
        (
                codigo    INT NOT NULL generated always AS identity (START WITH 1 increment BY 1),
                veiculo   VARCHAR(30)                                                            ,
                marca     VARCHAR(30)                                                            ,
                ano       INT                                                                    ,
                descricao text                                                                   ,
                vendido   BOOLEAN                                                                ,
                created   TIMESTAMP                                                              ,
                updated   TIMESTAMP
        );
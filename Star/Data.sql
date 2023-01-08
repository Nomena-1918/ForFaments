CREATE DATABASE star;
\c star;

CREATE TABLE composant(
idcomposant varchar(10) primary key,
nomcomposant varchar(50)
);

CREATE TABLE composition(
idcomposant varchar(10) primary key,
idproduit varchar(10) references composition(idcomposant),
quatiter decimal,
prix decimal
);

insert into composant values ('L1','Limonade');
insert into composant values ('E1','Eau gazeuse');
insert into composant values ('S1','Sucre');
insert into composant values ('E2','Eau');
insert into composant values ('E3','Gaz');
insert into composant values ('F1','Fanta Orange');
insert into composant values ('C1','Colorant');
insert into composant values ('H1','Haromes');
insert into composant values ('B1','Biere');
insert into composant values ('A1','Alcool');
insert into composant values ('O1','Orge');
insert into composant values ('F1','Farine Mais');

INSERT INTO composition(idproduit,idcomposant) VALUES ('L1','E1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('L1','S1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('F1','E1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('F1','S1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('F1','C1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('F1','H1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('B1','E1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('B1','A1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('B1','O1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('E1','E2');
INSERT INTO composition(idproduit,idcomposant) VALUES ('E1','E3');
INSERT INTO composition(idproduit,idcomposant) VALUES ('O1','F1');
INSERT INTO composition(idproduit,idcomposant) VALUES ('O1','S1');

WITH RECURSIVE composition AS (
    select idcomposant , idproduit
    from composition
    where idproduit is null
    union all
    select a.idcomposant , a.idproduit
    from composition a
    inner join composition b on a.idproduit = b.idcomposant
)select * from composition;
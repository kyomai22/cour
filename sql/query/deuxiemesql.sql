CREATE TABLE fournisseurs (
    four_num CHAR(5) PRIMARY KEY,
    four_nom VARCHAR(25) NOT NULL UNIQUE,
    four_adresse VARCHAR(50),
    four_cp SMALLINT CHECK (four_cp > 0),
    four_date DATE CHECK (four_date <= SYSDATE())
);
INSERT INTO fournisseurs VALUES('F0001','Dubois SA', 'rue du puits perdu, 58', 4020, '1950/01/01');
INSERT INTO fournisseurs VALUES('F0002','les libraires réunis', 'avenue de la boule, 54', 1000, '1978/08/15');
INSERT INTO fournisseurs VALUES('F0003','IMPRIMAT', 'rue du pont, 45', 4400, '1995/09/02');
INSERT INTO fournisseurs VALUES('F0004','Mac Gregor', 'rue haute, 54', 1000, '1987/08/01');
INSERT INTO fournisseurs VALUES('F0005','Bureautique 2000', 'rue du bassin, 254', 4000, '1996/01/01');
create table articles (art_num char(8) primary key,art_nom varchar(30) not null,art_coul varchar(20),
art_stock integer,art_seuil integer,art_pa integer not null,art_four char(5) references fournisseurs, index(art_four));
INSERT INTO articles VALUES('A01','agrafeuse','ROUGE',10,2,229,'F0004');
INSERT INTO articles VALUES('A02','calculatrice','NOIR',5,20,635,'F0001');
INSERT INTO articles VALUES('A03','perforatrice','BLANC',3,2,230,'F0004');
INSERT INTO articles VALUES('A04','lampe de bureau', 'ROUGE',3,10,349,'F0005');
INSERT INTO articles VALUES('A05','Stylo','BLANC',30,20,39,'F0005');
INSERT INTO articles VALUES('A06','STYLO','BLEU',30,10,49,'F0005');
INSERT INTO articles VALUES('A07','3 stylos','VERT',19,10,99,'F0005');
INSERT INTO articles VALUES('A08','bloc de feuilles quadrillées', default,7,12,70,'F0003');
INSERT INTO articles VALUES('A09','bloc de feuilles lignées',default,11,11,85,'F0003');
INSERT INTO articles VALUES('A10','classeur 10 cm','GRIS',21,30,50,'F0002');
INSERT INTO articles VALUES('A11','classeur 5 cm','Noir',19,30,50,'F0002');
INSERT INTO articles VALUES('A12','crayon','ROUGE',95,10,35,'F0002');
INSERT INTO articles VALUES('A13','marqueur','VERT',90,10,35,'F0002');
INSERT INTO articles VALUES('A14','marqueur','BLEU',80,10,35,'F0002');
INSERT INTO articles VALUES('A15','crayon','NOIR',45,10,35,'F0002');

select * from articles;
select * from fournisseurs;
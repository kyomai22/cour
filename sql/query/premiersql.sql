use introprog2021c;
/*
*/
CREATE TABLE formations (
    for_code INTEGER PRIMARY KEY AUTO_INCREMENT,
    for_nom VARCHAR(50) NOT NULL,
    for_annee YEAR(4) NOT NULL CHECK (for_annee > 2000),
    UNIQUE (for_nom , for_annee)
);
SELECT 
    *
FROM
    formations;
insert into formations (for_code, for_nom, for_annee) 
values (default,'intro prog',2021);
insert into formations (for_nom, for_annee) 
values ('intro prog',2020);
insert into formations (for_nom, for_annee) 
values ('intro prog',2022);
insert into formations (for_nom, for_annee) 
values ('java',2021);
insert into formations (for_nom, for_annee) 
values ('java',2022);
update formations set for_nom='Web dev' where for_code = 4;
delete from formations where for_code=4;

CREATE TABLE stagiaires (
    sta_code INTEGER PRIMARY KEY AUTO_INCREMENT,
    sta_nom VARCHAR(30) NOT NULL CHECK (TRIM(sta_nom) <> ''),
    sta_prenom VARCHAR(30) NOT NULL CHECK (TRIM(sta_prenom) <> ''),
    sta_ddn DATE,
    sta_fk_formations INTEGER NULL,
    INDEX (sta_fk_formations),
    FOREIGN KEY (sta_fk_formations)
        REFERENCES formations (for_code)
);
insert into stagiaires values (default, 'Kevin', 'Calcul', '1999-05-12',7);
SELECT 
    *
FROM
    stagiaires;
    
    SELECT 
    *
FROM
    stagiaires,
    formations
WHERE
    sta_fk_formations = for_code;

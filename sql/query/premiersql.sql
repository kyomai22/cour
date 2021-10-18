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
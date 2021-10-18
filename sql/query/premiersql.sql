use introprog2021c;
/*
*/
CREATE TABLE formations (
    for_code INTEGER PRIMARY KEY AUTO_INCREMENT,
    for_nom VARCHAR(50) NOT NULL,
    for_annee YEAR(4) NOT NULL CHECK (for_annee > 2000),
    UNIQUE (for_nom , for_annee)
);
use introprog2021c;
/*
*/
create table formations(for_code integer primary key auto_increment,
for_nom varchar(50) not null,
for_annee year(4) not null,
unique(for_nom,for_annee));
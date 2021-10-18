use introprog2021c;
/*
*/
create table formations(for_code integer primary key auto_increment,
for_nom varchar(50) not null,
for_annee year(4) not null check(for_annee>2000),
unique(for_nom,for_annee));
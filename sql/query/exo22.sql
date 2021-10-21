create table Localite(loc_ville char(30) , loc_cp smallint,loc_repres smallint check (loc_repres =1 or loc_repres =2));
insert into localite values( 'Liège', 4000, 1);
insert into localite values( 'Bruxelles', 1000, 2);
insert into localite values( 'Herstal', 4400, 1);
insert into localite values( 'Visé', 4600, 1);
insert into localite values( 'Zaventem', 1039, 2);
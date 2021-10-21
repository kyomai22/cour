select concat(art_nom,art_coul), loc_repres
from articles
JOIN
    localite ON loc_repres
WHERE
    loc_repres = 1;
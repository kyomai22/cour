SELECT DISTINCT
    four_nom, four_adresse, loc_Ville
FROM
    fournisseurs
        JOIN
    localite ON loc_cp = four_cp
WHERE
    loc_repres = 1;
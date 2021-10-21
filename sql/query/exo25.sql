SELECT 
    loc_ville, loc_cp, four_nom
FROM
    localite
        LEFT OUTER JOIN
    fournisseurs ON loc_cp = four_cp;
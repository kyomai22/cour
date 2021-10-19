SELECT 
    four_nom, four_adresse
FROM
    fournisseurs
WHERE
    four_adresse LIKE '% 54'
ORDER BY four_nom asc;
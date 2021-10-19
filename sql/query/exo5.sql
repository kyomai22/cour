SELECT 
    four_nom, four_cp
FROM
    fournisseurs
WHERE
    four_nom LIKE '%e%e%' AND four_cp = 1000;
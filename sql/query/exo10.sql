SELECT 
    four_num, four_nom, four_adresse, four_cp, four_date
FROM
    fournisseurs
WHERE
    four_date < '1990-01-01'
        AND four_cp != 1000
        AND four_cp != 4000; 
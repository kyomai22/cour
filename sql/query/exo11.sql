SELECT 
    CONCAT(UPPER(LEFT(art_nom, 1)),
            LOWER(SUBSTR(art_nom, 2)),
            ' de couleur ',
            LOWER(art_coul)) AS art_conca
FROM
    articles
WHERE
    art_coul IS NOT NULL


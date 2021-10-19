SELECT 
    art_coul
FROM
    articles
WHERE
    art_nom LIKE 'Stylo'
        OR art_nom LIKE 'STYLO'
        OR art_nom LIKE '%stylos';
SELECT 
    art_nom, art_coul, art_pa
FROM
    articles
WHERE
    art_coul IS NULL
        OR art_coul = 'ROUGE' AND art_pa < 75
ORDER BY art_num ASC;
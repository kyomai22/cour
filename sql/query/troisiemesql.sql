SELECT 
    art_num, art_nom, art_coul, art_pa
FROM
    articles
WHERE
    art_pa BETWEEN 10 AND 100
        AND NOT art_coul <> 'VERT'
ORDER BY art_nom DESC , art_num ASC;

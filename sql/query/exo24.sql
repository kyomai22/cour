SELECT DISTINCT
    art_nom, art_pa
FROM
    articles
WHERE
    art_pa < (SELECT 
            AVG(art_pa)
        FROM
            articles
        WHERE
            art_coul = 'rouge')
ORDER BY art_nom ASC , art_pa DESC;
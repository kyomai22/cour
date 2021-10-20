SELECT 
    (art_nom),
    (MIN(art_pa)) AS 'prix min',
    (MAX(art_pa)) AS 'prix max',
    (AVG(art_pa)) AS 'prix moyen',
    COUNT(DISTINCT art_coul) AS 'nombre de couleur dispo'
FROM
    articles
GROUP BY art_nom
HAVING COUNT(*) > 1;
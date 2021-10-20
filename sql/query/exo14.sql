SELECT
    art_nom, SUM(art_stock)
FROM
    articles
GROUP BY art_nom;
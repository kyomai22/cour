SELECT 
    f.four_nom, COUNT(a.art_num)
FROM
    fournisseurs f
        INNER JOIN
    articles a ON f.four_num = art_four
GROUP BY f.four_nom ;
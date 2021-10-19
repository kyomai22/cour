SELECT 
    art_nom, art_seuil - art_stock AS art_dif
FROM
    articles
WHERE
    art_stock < art_seuil
ORDER BY art_num;
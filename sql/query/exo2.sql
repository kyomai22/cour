SELECT 
    art_num, art_nom, art_stock, art_seuil
FROM
    articles
WHERE
    art_seuil > art_stock;

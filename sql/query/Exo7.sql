SELECT 
    art_coul, art_nom
FROM
    articles
WHERE
    art_coul = 'ROUGE'
        AND art_stock > art_seuil
        AND art_nom NOT LIKE '%C%';
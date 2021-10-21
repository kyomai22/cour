SELECT 
    four_nom, COUNT(art_num)
FROM
    articles
        JOIN
    fournisseurs ON four_num = art_four
WHERE
    four_nom = 'Bureautique 2000';
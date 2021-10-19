SELECT 
    art_nom, art_four
FROM
    articles
WHERE
    art_four LIKE 'F0001'
        OR art_four LIKE 'F0002'
        OR art_four LIKE 'F0003';
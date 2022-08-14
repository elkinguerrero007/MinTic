SELECT nombre, inventario FROM productos WHERE precio >= 9000 ORDER BY nombre;
SELECT AVG(precio) AS promedio FROM productos;
SELECT nombre, precio FROM productos WHERE nombre LIKE "A%" OR nombre LIKE "P%" ORDER BY nombre;
SELECT COUNT(nombre) AS total FROM productos WHERE precio > 3000 AND precio < 10000;
SELECT SUM(precio * inventario) AS total_inventario FROM productos;

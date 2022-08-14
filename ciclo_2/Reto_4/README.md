# Enunciado
## Reto 4: Realizando consultas a nuestra base de datos

En este reto continuaremos trabajando con el sistema de inventario para la cafetería de la Sergio Arboleda desarrollado en el Reto 2 y 3. Nuestro objetivo es realizar consultas SQL a una base datos que contiene la información de los productos disponibles en la cafetería. A continuación, se presenta nuevamente el contexto del problema.

Una de las cafeterías de la Sergio Arboleda vende frutas, dulces y algunas bebidas. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, la universidad decide construir una aplicación en Java que le permita almacenar la información de los productos y calcular algunas estadísticas sobre el inventario. En este momento la aplicación tiene una base de datos que cuenta con una tabla llamada Productos. La información disponible en la tabla se presenta a continuación.


Tabla: Productos.

### Tabla 1: productos.

| Codigo                 | Nombre                                    |  precio| Inventario |
|--------------------- | ------------------------------------------- | ------ | ---------- |
| 1                    |               Manzanas                      | 5000.0 |25          |
| 2                    |               Limones                       | 2300.0 |15          |
| 3                    |               Peras                         | 2700.0 |33          |
| 4                    |               Arandalos                     | 9300.0 |5           |
| 5                    |               Tomates                       | 2100.0 |42          |
| 6                    |               Fresas                        | 4100.0 |3           |
| 7                    |               Helados                       | 4500.0 |41          |
| 8                    |               Galletas                      | 500.0  |8           |
| 9                    |               Chocolates                    | 3500.0 |80          |
| 10                   |               Jamon                         | 15000.0|10          |

Con el fin de verificar el correcto funcionamiento de la base de datos, usted debe construir consultas SQL para obtener la siguiente información. (NOTA: Para este caso solo se utilizará consultas de tipo SELECT).

>> * 1. Obtener el nombre y el inventario de los productos con un precio mayor o igual a 9000 en orden ascendente por nombre.

>> * 2. Obtener el promedio de precios de todos los productos en la tabla. Utilice el alias 'promedio' para la respuesta obtenida.

>> * 3. Obtener el nombre y el precio de todos los productos que comienzan con 'A' o con 'P' en orden ascendente.

>> * 4. Obtener el numero total de productos cuyos precios están entre 3000 y 10000. Utilice el alias 'total' para la respuesta obtenida.

>> * 5. Obtener valor total del inventario. Este valor se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados. Utilice el alias 'total_inventario' para la respuesta obtenida.

## Instrucciones
## Instrucciones para la calificación automática

    Para este reto todas las consultas son de tipo SELECT.
    Para aquellas consultas que requieren un alias verifique se sea exactamente el indicado.
    Si necesita ordenar los resultados de la consulta recuerde que puede utilizar la instrucción ORDER BY.
    La base de datos ya se encuentra creada. Solo debe crear la consulta para obtener la información requerida.
    Coloque todas las consultas en el orden solicitado.
    Las consultas deben terminar con un punto y coma ";".
ok

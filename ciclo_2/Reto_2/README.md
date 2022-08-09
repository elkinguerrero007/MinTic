# Enunciado
## Reto 2. Una aplicación para la cafetería de la Sergio Arboleda

>> * Una de las cafeterías de la Sergio Arboleda vende frutas, dulces y algunas bebidas. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, la universidad decide construir una aplicación en Java que le permita almacenar la información de los productos y calcular algunas estadísticas sobre el inventario. Con el propósito detener una especificación más clara sobre lo que debería hacer la aplicación, el administrador de la tienda construyen el siguiente diagrama de casos de uso:
>> * Usted es contratado por la universidad para desarrollar el sistema de inventario con las funcionalidades presentadas en el diagrama de casos de uso en el lenguaje de programación Java. Debido a que esta es una etapa inicial en el desarrollo de la aplicación, la base de datos será representada temporalmente mediante un HashMap llamado listaProductos que tendrá por llave el código del producto y por valor una instancia de la clase Producto que tendrá como atributos código, nombre, precio e inventario. La Tabla 1 presenta los productos disponibles a la fecha en la cafetería.

>> * código	nombre	precio	inventario
1	Manzanas	5000.0	25
2	Limones	2300.0	15
3	Peras	2700.0	33
4	Arandanos	9300.0	5
5	Tomates	2100.0	42
6	Fresas	4100.0	3
7	Helado	4500.0	41
8	Galletas	500.0	8
9	Chocolates	3500.0	80
10	Jamon	15000.0	10

## Tabla 1: Productos disponibles en la tienda

>> * Nota: observe que los nombres de los productos no llevan tildes. Esto se hace a propósito y tiene que ver con el proceso de calificación automática. Evite colocar tildes en los nombres de los productos en su código.

Su misión es implementar todas las funcionalidades presentadas en el diagrama de casos de uso. Para esto es necesario construir 3 métodos que representen las operaciones de agregar, actualizar y eliminar. Estas funciones deben implementarse en una clase con el nombre BaseDatosProductos que contenga el HashMap listaProductos.

Adicionalmente, el dueño del almacén desea generar un informe que contenga el valor total del inventario a la fecha. Este se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados. Este método debe llamarse generarInforme e implementarse en la clase BaseDatosProductos.

Por ejemplo, al generar el informe con los datos disponibles en la Tabla 1 obtendríamos:

    Valor del inventario: 1014100.0

Para evitar errores a la hora de agregar, actualizar y borrar productos, se debe implementar un método llamado verificarExistencia que permitirá comprobar si el producto existe o no en la base de datos. Este método debe implementarse en la clase BaseDatosProductos.

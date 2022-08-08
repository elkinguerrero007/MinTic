# Manejo de Archivos
# Enunciado
Crear un programa llamado personas.py que lea los datos de un archivo de texto y que transforme cada fila en un diccionario y lo añada a una lista llamada personas.
Luego recorre las personas de la lista y para cada una muestra de forma amigable todos sus campos.

Se debe crear el archivo personas.txt que contenga la siguiente información:
1;Carlos;Pérez;05/01/1989
2;Manuel;Hernandez;26/12/1983
3;Rosa;Campos;12/06/1971
4;David;García;25/07/2006
Los campos del diccionario serán por orden: id, nombre, apellido y nacimiento.

# Instrucciones
Para solucionar este problema, el usuario debe crear en una misma carpeta dos archivos, uno llamado personas.txt que será el archivo con la información para procesar y el archivo personas.py que será el archivo donde se escribe el programa.
Al leer el archivo con Python, es posible que halla errores de codificación al mostrar algunos caracteres.
Se puede indicar la codificación del archivo manualmente durante la apertura como argumento en el open, por ejemplo con UTF-8: open(..., encoding="utf8")
Después de leer el archivo guarde la información en un diccionario y realice el procesamiento planteado.
# Enunciado
## Detección de fallas en una línea de producción.

En una fabrica de baldosas de cerámica se producen por día una gran cantidad de este producto. Es importante hacer control de calidad sobre el producto. Este control consiste en revisar si en un lote de N baldosas hay baldosas defectuosas (puede variar la textura o el color). La solicitud del gerente de la planta es que se construya un programa en Python que pueda detectar la cantidad de baldosas defectuosas en una de las líneas de producción de la fabrica.

Para detectar si una baldosa es diferente a otra, un sensor escanea las baldosas y si hay alguna diferencia, guarda un registro en la memoria. La memoria del sensor esta limitada por la cantidad de baldosas que se producen en un intervalo de tiempo determinado.

## Entrada	La entrada estará formada por dos líneas:

    La primera línea aparecerá dos números N y K que indican el número de baldosas a revisar y el número de baldosas que el sensor es capaz de guardar (1≤N≤1000,1≤K≤1000)
    La segunda línea contiene M números (entre 1 y 100) separados por espacios que representan las baldosas revisadas por el sensor
    Las baldosas se consideran defectuosas si están representados por el mismo número

## Salida 	El programa imprimirá tres números separados por un espacio.

    El primero representará el número total de fallas detectadas
    El segundo representará la cantidad de fallas detectadas por el sensor considerando que al revisar una baldosa solo es capaz de guardar las K baldosas anteriores
    El tercero representa la cantidad de baldosas revisadas por el sensor



## Casos de prueba:

## Entrada	Salida Esperada
5 1

1 2 3 1 2	2 0 5
------**---------
5 2

1 2 3 1 2	2 0 5
------**----------
5 3

1 2 3 1 2	2 2 5

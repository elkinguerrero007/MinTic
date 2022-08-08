# Manejo de Excepciones
# Enunciado
Realizar una función llamada agregar_una_vez() que reciba una lista y un elemento.
La función debe añadir el elemento al final de la lista con la condición de no repetir ningún elemento. Además, si este elemento ya se encuentra en la lista se debe invocar un error de tipo ValueError que debe capturar y mostrar este mensaje en su lugar:
Error: Imposible añadir elementos duplicados => [elemento].
Utilice la lista de elemento elementos = [1, 5, -2]

# Instrucciones
Para solucionar este problema, el usuario debe crear una funciona llamada agregar_una_vez() que reciba como parámetros una lista.
Se puede definir como: elementos = [1, 5, -2] y un numero llamado (el). Capturar el error usando ValueError y mostrar el mensaje

"Error: Imposible añadir elementos duplicados"
Como ejemplo utilice los siguiente llamados a la función:

agregar_una_vez(elementos, 10)
agregar_una_vez(elementos, -2)
agregar_una_vez(elementos, "Hola")
print(elementos)
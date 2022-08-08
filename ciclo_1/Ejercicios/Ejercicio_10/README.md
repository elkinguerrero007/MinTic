# Manejo de Diccionarios
# Enunciado
Durante el desarrollo de un pequeño videojuego hay que configurar y balancear cada clase de personaje jugable. Partiendo que la estadística base es 2, debe cumplir las siguientes condiciones:

El caballero tiene el doble de vida y defensa que un guerrero.
El guerrero tiene el doble de ataque y alcance que un caballero.
El arquero tiene la misma vida y ataque que un guerrero, pero la mitad de su defensa y el doble de su alcance.

Escribir un programa que muestre como quedan las propiedades de los tres personajes.
Utilice los siguientes diccionarios:
caballero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
guerrero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
arquero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }

# Instrucciones
Para solucionar este problema, se requiere que el usuario escriba los siguientes diccionarios

caballero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
guerrero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
arquero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }

Para hacer el balanceo, se debe asignar los valores según la descripción el personaje.

Ejemplo:
caballero['vida'] = guerrero['vida'] * 2

Al final imprima el resultado después de operar los personajes
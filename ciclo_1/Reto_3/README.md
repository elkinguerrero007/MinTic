# Enunciado
Una de las fortalezas deportivas que tiene Colombia y que más glorias le ha dado al país es el ciclismo. En Colombia las dificultades de la topografía han forjado a nuestros escarabajos que entrenaban en arcaicas bicicletas. La competencia internacional implica competir sobre bicicletas que día a día tienen más tecnología y menos peso. En las competencias se definen por reglamento las dimensiones de las bicicletas, las cuales se espera que unifiquen las condiciones de los ciclistas. La Unión de Ciclismo Internacional (UCI) define un reglamento técnico en el cual se encuentran las especificaciones de la bicicleta. Sin embargo, la mayoría de diseños suelen establecer algunos detalles por fuera de las medidas reglamentarias. Las medidas que menos se respetan son:

    El eje pedalier debe ubicarse entre 240 y 300 cm del piso.
    Las bielas deben medir máximo 180 mm y mínimo 160 mm.
    La longitud del sillín debe ser mínimo 240 mm y máximo 275mm
    El manilar debe tener máximo 50 cm de ancho.

Por tal razón, le han encomendado a usted la selección de los diseños que cumplen con las condiciones del reglamento, así que debe construir el software que procesará los datos de las bases de datos donde reposan los diseños en el sistema.Su misión es crear un programa en Python que permita mostrarle a los equipos ciclisticos la lista de las bicicletas que cumplen con los requerimientos y por supuesto el valor de las mismas para su consideración.

# Entrada	La entrada estará conformada por N + 1 líneas:

    La primera línea recibirá un número N que equivale a la cantidad de registros en la base de datos. Cada registro representa el diseño de cada bicicleta.
    Cada una de las siguientes N líneas estará formada por 5 números separados por espacios que representan las diferentes características de una bicicleta. Por ejemplo,la fila 250 170 258 48 12000 representa una bicicleta con 250 mm de distancia entre el suelo y el eje pedalier, 170mm miden sus bielas, el sillín mide 258mm y el manilar mide 48 centímetrosy cuesta 12000 dólares.

## Salida 	

    El programa imprimirá el precio de cada una de las bicicletas de la base de datos que cumplen con los criterios del reglamento
    Si no existe ningún registro en la base de datos que cumpla los criterios del reglamento, el programa imprimirá 'NO DISPONIBLE'



# Casos de prueba:

## Entrada	Salida Esperada
5
280 190 275 55 1045
235 165 280 55 820
235 145 250 45 895
225 190 245 50 1050
240 150 265 45 825 	NO DISPONIBLE


6
220 190 255 50 970
255 155 235 55 1045
225 150 265 45 885
285 165 270 45 1195
300 190 230 55 890
265 150 235 55 895	1195


3
270 165 275 40 1195
275 180 230 50 1045
225 180 225 55 1120	1195

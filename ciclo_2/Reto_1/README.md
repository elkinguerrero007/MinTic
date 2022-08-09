# Enunciado
Reto 1: Índice de masa corporal (IMC)

Andrés, un estudiante de primer semestre de Medicina quiere calcular el nivel de riesgo que tiene sus familiares de sufrir problemas del corazón. Una persona puede estar en riesgo de sufrir estas enfermedades dependiendo de su edad y su índice de masa corporal (IMC). La siguiente tabla presenta los diferentes niveles de riesgo

Edad < 45 Edad ≥ 45

IMC < 22 Bajo Medio

IMC ≥ 22 Medio Alto

Para calcular el índice de masa corporal (IMC) calculamos el cociente entre el peso del individuo en kilos y el cuadrado de su altura en metros.

Debido a que se requiere analizar la información de varias personas, la mejor alternativa es construir un programa que realice los cálculos de forma automática. Andrés le pide ayuda a su hermana que es ingeniera de software y entre ambos logran definir los requerimientos del programa utilizando las siguientes historias de usuario.
# Historias de usuario Nro1
>> * Titulo : Ingresar valores de masa,altura y edad
### Descripcion
>> * Como: Usuario
>> * Quiero:Ingresar los valires de masa,altura y edad
>> * Para : Poder calcular el IMC
#### Criterios de aceptacion
>> * Los valores de masa deben ingresarse en kilogramos
>> * Los valores de altura deben ingresarse en metros
>> * Los valores de edad deben ingresarce en años
>> * Los valores de peso,altura y edad deben ingresarse en una sola linea separada por un espacio
# Historia de usuario Nro.2
>> * Titulo : Calcular IMC y el nivel de riesgo
### Descripcion
>> * Como: Usuario
>> * Quiero : Poder calcular el IMC de los valores de peso,altura y edad disponibles
>> * Para : Poder conocer el riesgo de una persona
### Criterios de aceptacion
>> * El IMC debe imprimirce con un numero decimal
>> * Los valores de masa permitidos estan entre 0 y 150
>> * Los valores de altura permitidosestan entre 0.1 y 2.5
>> * Los valores de años permitidos estan entre 0 y 110
>> Si alguno de los valores esta fuera del rango permitido se debe imprimir un mensaje de error
>> 
Usted es contratado por camilo para construir un programa en Java que cumpla las funcionalidades requeridas por Camilo teniendo como referencia las historias de usuario presentadas previamente.
### Entrada:
>> * Cada caso de prueba estará formado por una línea formada por 3 valores separados por un espacio
>> * La masa de la persona en kilogramos
>> * La altura de la persona en metros
>> * La edad de la persona en Años
### Salida:
>> * El programa imprimirá una línea con dos valores:
>> * El IMC calculado con un número decimal
>> * El nivel de riesgo actual.
>> * En caso de ingresar algún valor de masa, altura o edad fuera de los rangos permitidos se debe imprimir la palabra 'ERROR'
### Casos de prueba:
>> * ENTRADA: 73.1 1.65 35 >> SALIDA 26.9 Medio
>> * ENTRADA: 190 1.60 100 >> SALIDA ERROR

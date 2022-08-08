# Herencia
# Enunciado
Crear un programa con la siguiente estructura:

Crear una clase Vehículo con las siguientes propiedades: num_matricula y peso. Los métodos son:
impuestoBase(): Depende del peso, y se calcula con la siguiente fórmula: 0,45*peso.

Existen dos clases que heredan de Vehículo: Eléctrico y Combustión. El objeto Eléctrico tiene como propiedad precio, y el objeto Combustión la propiedad cilindrada. Los vehículos eléctricos tributan un 9% de su precio más el impuesto base, mientras que los vehículos de combustión tributan el triple de su cilindrada más el impuesto base.

Implementar un método en ambas subclases que calculen el impuesto total en ambos casos.

Crea una clase main donde se instancien dos vehículos de cada tipo y mostrar el impuesto que se paga por cada uno de ellos.

# Instrucciones
Para la solución del ejercicio se debe considerar cuatro archivos. Un archivo llamado main.java en donde estará la clase main, la cual se encarga de la instancia las clases Eléctrico y Combustión. Un archivo con la clase vehículo que contenga los atributos y métodos indicados. Se debe imprimir por pantalla la información de los vehículos con el valor del precio y el valor del impuesto
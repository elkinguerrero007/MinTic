# Enunciado
# RETO 1

>> * Para el primer reto, se deberá hacer uso de la creación de la plataforma Oracle DatabaseActions, en la cual se deberá implementar el modelo de ejemplo de base de datos con los datos de prueba. Así mismo se debe hacer el despliegue de servicios REST a través de la plataforma DatabaseActions con el fin de gestionar estos datos en las operaciones básicas de creación, lectura, actualización y borrado (CRUD). **Es importante para el proceso de prueba que las tablas inicien con datos vacíos.**.

>> * Una vez desplegados los servicios REST a través de un Cliente REST (como Postman o Advanced REST Client) realizar los llamados a cada servicio, enviando la información de prueba. No se debe olvidar que al terminar las pruebas, la tabla debe quedar vacía para que MasterTech pueda realizar las pruebas automáticas.

El desarrollo de este reto, implica estar muy atento a la URL que generaremos en cada servicio. Si hacemos bien el ejercicio tendremos finalmente una URL de la forma: https://xxxxxxxx.oraclecloudapps.com/ords/admin/modulo/plantilla.

Para que nuestra prueba sea exitosa, nos aseguraremos de nombrar el modulo y la plantilla de la misma manera, haciendo que la url del módulo sea cinema/ las plantillas serán cinema/ y cinema/:id.

Esta segunda plantilla será utilizada para acceder a la información detallada de cada cinema.

Es importante crear un archivo con las consultas sql que utilicemos en cada servicio, este servicio lo subiremos como evidencia en el momento de hacer la prueba automática, de otro modo NO SE REALIZARÁN las pruebas y no se podrá evaluar.

En la URL que la plataforma oraclecloudapps.com nos entrega, identificaremos como BASE_URL justo aquella parte que va hasta .com. Así en el ejemplo anterior, el BASE_URL correspondería https://xxxxxxxx.oraclecloudapps.com. Para acceder a los servicios de cinema, Mastertech automáticamente completará la url con /ords/admin/cinema/cinema. Mientras el módulo y la plantilla tengan por url cinema, la URL estará correcta.


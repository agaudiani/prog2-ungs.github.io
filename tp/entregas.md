# Entrega de TPs

Todos las entregas se realizan por correo electrónico a la dirección de la materia: `ungs.programacion2@gmail.com`.

Todas las entregas constan de _uno o dos_ archivos adjuntos:

  1. un archivo **ZIP** con el código

  2. un informe en formato **PDF** (solo si lo pide la consigna)

El archivo ZIP debe contener todos los archivos _.java_ que compongan la entrega, sin ningún código compilado _(\*.class)_ ni bibliotecas _(\*.jar)_.

Se puede usar la funcionalidad _Export_ de Eclipse para crear el archivo a enviar. Lo más expeditivo es exportar el _paquete_ que contiene el código, haciendo click secundario en el nombre del paquete y la opción _Export → General → Archive:_

![Export package](exportpkg.png)
![Export to zip](exportzip.png)


## Asunto

El asunto del correo debe incluir nombre de la entrega, comisión, apellido y número de padrón; por ejemplo:

    Asunto: TP COM1 - López, 12345/2015
    Asunto: TP COM2 - Giménez, 67890/2014

En el caso de entregas grupales se incluye la información de los dos estudiantes:

    Asunto: TP COM3 - Campos, 22334/2016 - Alfonso, 44556/2017

## Requisitos de la entrega

Es requisito indispensable que el código entregado compile sin errores. **No se aceptarán entregas con errores de compilación.**.

Asimismo, si la consigna incluye casos de prueba en formato [JUnit](junit.md), la entrega debe cumplir con su especificación.

## Colaboración y detección de copias

En todo entorno académico se valora y promueve la colaboración entre alumnos. No obstante, esa colaboración debe detenerse en el momento de _componer_ un trabajo propio (sea código o, en otras ocasiones, monografías, reportes, o similares).

Es válido:

  - conversar con otros estudantes sobre cómo resolver un problema o trabajo práctico (qué algoritmo, diseño o estrategia convienen)

No se permite:

  - Pedir, ofrecer, proporcionar o leer el código de otros estudiantes 

Todo el código entregado se somete a un programa de detección de copias. Los resultados son revisados a mano por los docentes y resultarán en acción disciplinaria cuando proceda.

A tener en cuenta: se someten a detección de copias, de manera conjunta, todas las entregas del cuatrimestre actual _y_ cuatrimestres anteriores.

## Preguntas frecuentes

**¿Qué estructura debe tener el ZIP entregado?**

De los archivos _*.java_ entregados importa:

  - el nombre (debe corresponder al nombre de la clase)
  - el paquete (debe ser consistente con lo especificado en la consigna)

No es importante:

  - la estructura de directorios (todos los archivos se compilan de manera conjunta)

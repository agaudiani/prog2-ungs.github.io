# Práctica 2: estructuras hash

## Eliminar duplicados

Se pide implementar la clase pública `EliminarDuplicados` con los siguientes métodos estáticos:

### elimDuplicados()

Recibe un lista enlazada de cadenas y devuelve una nueva lista sin elementos repetidos:

    public static LinkedList<String>
        elimDuplicados(LinkedList<String lista) ...

Complejidad: $$\mathcal{O}(n)$$.

La función debe preservar el orden original, quedándose con la primer aparición de cada elemento. Así­:

    elimDuplicados([X, Z, A, Z, B, Y, B]) -> [X, Z, A, B, Y]


### elimDuplicadosIzq()

Similar a la anterior, pero ahora se retiene la _última_ ocurrencia de cada elemento:

    elimDuplicadosIzq([X, Z, A, Z, B, Y, B]) -> [X, A, Z, Y, B]

Además, se trabajará con arreglos dinámicos esta vez:

    public static ArrayList<String>
        elimDuplicadosIzq(ArrayList<String> lista) ...

Complejidad: $$\mathcal{O}(n)$$.

Ayuda: Usar un diccionario para llevar la cuenta de apariciones, y recorrer la lista una segunda vez para determinar el orden de inserción. Evitar `ArrayList.addFirst()`, pues no es $$\mathcal{O}(1)$$.

## Cómputos agregados

Se pide implementar en una clase pública `Agregados` los siguientes métodos estáticos:

### ganadorLiga()

Se tiene una clase `Partido` en el archivo [Partido.java](./Partido.java):

```
public class Partido {
    String equipo1;  int goles1;
    String equipo2;  int goles2;

    public Partido(...)  // Constructor con 4 parámetros.
}
```

Se desea calcular, dada una lista de partidos, el ganador de la liga:

    public static String ganadorLiga(List<Partidos> l) ...

Complejidad: $$\mathcal{O}(n)$$, siendo $$n$$ el número de partidos.

Reglas de puntaje de la liga:

  - el equipo ganador de un partido recibe 2 puntos y el perdedor 0 puntos; en caso de empate en el partido, cada uno de los dos equipos recibe 1 punto.

  - en caso de empate en la liga, devolver el nombre de cualquiera de los equipos empatados.


### agruparCumple()

Se tiene una clase `Persona` en el archivo [Persona.java](./Persona.java):

```
public class Persona {
    String nombre;
    String fechaNac;  // Siempre en formato DD/MM/YYYY

    public Persona(String nom, String nac) ...
}
```

Dada una lista de personas, se pide agrupar a aquellas que celebran su cumpleaños el mismo día (mes y año). Por ejemplo:

```
Agrupar:

Juan   : 27/05/1993
Alicia : 30/11/1990
Elena  : 27/05/1985

Resultado:

30/11 : Alicia
27/05 : Juan, Elena
```

Complejidad: $$\mathcal{O}(n)$$, siendo $$n$$ el número de personas.

El resultado se debe devolver en un diccionario:

    public static Map<String, List<String>>
        agruparCumple(List<Persona> l) ...

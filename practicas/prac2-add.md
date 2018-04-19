# PrÃ¡ctica 2: estructuras hash
{:.no_toc}

## Ãndice
{:.no_toc}

* TOC
{:toc}


## Eliminar duplicados

Se pide implementar la clase pÃºblica `EliminarDuplicados` con los siguientes mÃ©todos estÃ¡ticos:

### elimDuplicados()

Recibe un lista enlazada de cadenas y devuelve una nueva lista sin elementos repetidos:

    public static LinkedList<String>
        elimDuplicados(LinkedList<String lista) ...

Complejidad: $$\mathcal{O}(n)$$.

La funciÃ³n debe preservar el orden original, quedÃ¡ndose con la primera apariciÃ³n de cada elemento. AsÃ­:

    elimDuplicados([X, Z, A, Z, B, Y, B]) -> [X, Z, A, B, Y]

Pruebas automÃ¡ticas: [TestEliminarDuplicados.java].

[TestEliminarDuplicados.java]: ../src/prog2/prac2/test/TestEliminarDuplicados.java


### elimDuplicadosIzq()

Similar a la anterior, pero ahora se retiene la _Ãºltima_ ocurrencia de cada elemento:

    elimDuplicadosIzq([X, Z, A, Z, B, Y, B]) -> [X, A, Z, Y, B]

AdemÃ¡s, se trabajarÃ¡ con arreglos dinÃ¡micos esta vez:

    public static ArrayList<String>
        elimDuplicadosIzq(ArrayList<String> lista) ...

Complejidad: $$\mathcal{O}(n)$$.

Ayuda: Usar un diccionario para llevar la cuenta de apariciones, y recorrer la lista una segunda vez para determinar el orden de inserciÃ³n. Evitar `ArrayList.addFirst()`, pues no es $$\mathcal{O}(1)$$.

Pruebas automÃ¡ticas: [TestEliminarDuplicados.java].

[TestEliminarDuplicados.java]: ../src/prog2/prac2/test/TestEliminarDuplicados.java


## CÃ³mputos agregados

Se pide implementar en una clase pÃºblica `Agregados` los siguientes mÃ©todos estÃ¡ticos:

### ganadorLiga()

Se tiene una clase `Partido` en el archivo [Partido.java](../src/prog2/prac2/Partido.java):

```
public class Partido {
    String equipo1;  int goles1;
    String equipo2;  int goles2;

    public Partido(...)  // Constructor con 4 parÃ¡metros.
}
```

Se desea calcular, dada una lista de partidos, el ganador de la liga:

    public static String ganadorLiga(List<Partidos> l) ...

Complejidad: $$\mathcal{O}(n)$$, siendo $$n$$ el nÃºmero de partidos.

Reglas de puntaje de la liga:

  - el equipo ganador de un partido recibe 2 puntos y el perdedor 0 puntos; en caso de empate en el partido, cada uno de los dos equipos recibe 1 punto.

  - en caso de empate en la liga, devolver el nombre de cualquiera de los equipos empatados.

Pruebas automÃ¡ticas: [TestGanadorLiga.java].

[TestGanadorLiga.java]: ../src/prog2/prac2/test/TestGanadorLiga.java


### agruparCumple()

Se tiene una clase `Persona` en el archivo [Persona.java](../src/prog2/prac2/Persona.java):

```
public class Persona {
    String nombre;
    String fechaNac;  // Siempre en formato DD/MM/YYYY

    public Persona(String nom, String nac) ...
}
```

Dada una lista de personas, se pide agrupar a aquellas que celebran su cumpleaÃ±os el mismo dÃ­a (mes y aÃ±o). Por ejemplo:

```
Agrupar:

Juan   : 27/05/1993
Alicia : 30/11/1990
Elena  : 27/05/1985

Resultado:

30/11 : Alicia
27/05 : Juan, Elena
```

Complejidad: $$\mathcal{O}(n)$$, siendo $$n$$ el nÃºmero de personas.

El resultado se debe devolver en un diccionario:

    public static Map<String, List<String>>
        agruparCumple(List<Persona> l) ...

Pruebas automÃ¡ticas: [TestAgruparCumple.java].

[TestAgruparCumple.java]: ../src/prog2/prac2/test/TestAgruparCumple.java



{% include math.html %}

{::options toc_levels="2" /}

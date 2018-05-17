Mono
-Lleva la dinámica del juego, tira el dado, mueve jugadores y aplica reglas.
-Tiene un tablero, jugadores y reglas.

Tablero
-Tiene un arreglo estático de casillas y métodos para operar con ellas (ver y setear dueño y valores)

Reglas
creo reglas con el porcentaje del alquiler, otra solución posible es no usar un TAD aparte y hacer un método "aplicarReglas" dentro de mono, lo importante es que se use algo y no se hagan todas las comprobaciones dentro del método jugar().

-Se crea con el porcentaje del alquiler
-aplica regla (comprar, pagar alquiler)

Jugador
-Tiene el dinero y las propiedades del jugador
-Tiene la posición del jugador

Casilla
-Precio
-Dueño

--------------
un poco de pseudocódigo
--------------
Mono:

private tablero tab;
private jugador jug1
private jugador jug2
private reglas reg

Mono(int cant){
   tablero = new tablero(cant)
   jug1 = new jugador(1000) 
   jug2 = new jugador(1000)
   reg = new reglas(1) 
}

void agregarCasilla(int casilla, int valor){
  tab.agregarCasilla(casilla, valor)
}

void Jugar(){
   int resDado = número random de 1 a 5
   jug1.setPos(jug1.getPos()+resDado % tablero.tamaño)
   reglas.aplicarReglas(jug1, tablero)

   resDado = número random de 1 a 5
   jug2.setPos(jug2.getPos()+resDado % tablero.tamaño)
   reglas.aplicarReglas(jug2, tablero)
}

string ganador(){
//pregunta saldo a jugador1, si es <0 gana jugador2
//pregunta saldo a jugador2, si es <0 gana jugador1
}

Ver(){
---
}

IREP= 
--------------
Tablero
private casilla[] casillas

tablero(int tam){
  casillas = new casilla[tam]
}
int tamaño(){
  return casillas.length()
}
void agregarCasilla(int casilla, double valor){
  casillas[casilla].setValor(valor)
}
void getValor(int casilla){
  casillas[casilla].getValor(valor)
}
void setDueño(int casilla, jugador jug){
  casillas[casilla].setDueño(jug)
}
boolean tieneDueño(int casilla){...}
jugador getDueño(int casilla){...}


IREP= 
--------------

Jugador
private int dinero
private arrayList<int> propiedades
private int posicion

jugador(int monto){
   dinero = monto
   posición = 0
   propiedades = NULL
}

int getDinero(){...}
void setDinero(){...}
int getPos(){...}
void setPos(int newPos){...}
bool esDueño(int pos){...}
void comprar(int pos, double valor){
   // miramos si tenemos la posicion
   //si no la tenemos la agregamos a la lista y descontamos el dinero
}
IREP:...
--------------
Reglas
private int costoAlquiler

reglas(int costoAlquiler){...}

aplicar(jugador jug1, tablero tab){
int pos = jug1.getPos()

if (tab.tieneDueño(pos)){
   if(tab.getDueño =! jug1){ ///le cobramos alquiler a jug1
      ... 
      }
}
else { //compra si no es dueño o no hace nada si es dueño
   jug1.comprar(pos, tablero[pos].getValor()))
   tab.setDueño(pos, jug1)
   }
}

IREP=...

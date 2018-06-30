#FpInfor #DawMp03Uf01 #DawMp03Uf02 #Programació

Grand Prix sobre taula
================================
El motociclisme de velocitat és una modalitat de motociclisme consistent a disputar curses de circuit en què els pilots han de completar un nombre determinat de voltes en el mínim temps possible. 

![Grand Prix](https://raw.githubusercontent.com/utrescu/utrescu.github.io/master/images/circuit2.png "Grand Prix")

Però sembla que darrerament la fama d'aquestes carreres està baixant. Per evitar-ho els organitzadors han decidit que crearan un joc de taula sobre les carreres! 

El joc consisteix en veure quin dels jugadors aconsegueix donar les voltes al circuit del tauler més ràpidament. 

![Tauler](https://raw.githubusercontent.com/utrescu/utrescu.github.io/master/images/circuit.png "Tauler")

Regles del joc:
-----------------------
Les regles del joc són senzilles: 

* Cada jugador té una fitxa en forma de moto d'un color que abans de començar la carrera posen a la casella de sortida.
* Abans de començar el joc els jugadors es posen d'acord en el número de voltes que s'han de fer per acabar la carrera.
* Els jugadors tiren un dau i mouen la seva fitxa el número de caselles que ha sortit en el dau (ex. 2 = avança dos caselles)
    * Si un jugador acaba en una casella on hi ha "sorra", es queda un torn sense tirar
* La carrera acaba quan com a mínim un dels jugadors ha aconseguit completar totes les voltes.
    * En cas de que hi hagi més d'un jugador que en la mateixa ronda aconsegueixi passar la línia de meta, el guanyador és el que hagi arribat més lluny
    * Si arriben a la meta més d'un corredor i van a parar a la mateixa casella es declara que tots ells han guanyat.

Activitat
------------------
1. Feu un programa que simuli el funcionament del joc de tauler 
    * S'ha de poder determinar quina llargada té el circuit i quins corredors hi participen
    * Al iniciar el programa s'emplenen automàticament, de forma aleatòria, en quines caselles 
hi ha sorra

> Millor que el programa funcioni sol, sense demanar als jugadors que tirin ... 

El programa ha d'anar informant de què està passant en la carrera. 

Per exemple una carrera d'una volta entre “vermell”, “verd”, “blau” en un circuit de 10 caselles


     RONDA 1
    ---------------------------------
    Jugador vermell a casella 5  (0 voltes)
    Jugador verd a casella 5  (0 voltes)
    Jugador blau a casella 4  (0 voltes)
    ---------------------------------
     RONDA 2
    ---------------------------------
    Jugador verd a casella 0  (1 voltes)
    Jugador blau a casella 7 SORRA! (0 voltes)
    Jugador vermell a casella 6  (0 voltes)
    ---------------------------------
    GUANYADOR Jugador verd a casella 0  (1 voltes)

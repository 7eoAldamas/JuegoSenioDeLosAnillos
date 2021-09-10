package juego;

import personajes.Personaje;
import personajes.bestias.Bestias;
import personajes.heroes.Heroes;

public class Pelea {
//--- Tatakae

    private int numHeroes;
    private int numBestias;

    //--- Constructor de Pelea
    public Pelea() { }

    //--- Método Controlador de Pelea
    public void peleaSAnillos(Personaje[] heroes, Personaje[] bestias) {
        int indice;


        numHeroes = 5;
        numBestias = 5;

        Datos.mostrarMensaje("\n*-* Inicio del Combate Epico *-*\n");
        do {
            indice = 0;
            do {

                if (heroes[indice] != null && bestias[indice] != null) {
                    bestias[indice].recibirAtaque(heroes[indice]);

                    if (bestias[indice].getVida() > 0) {
                        heroes[indice].recibirAtaque(bestias[indice]);

                        if (heroes[indice].getVida() <= 0) {
                            jugadorMuerto(heroes, indice);
                        }

                    } else {
                        jugadorMuerto(bestias, indice);
                    }
                }
                indice++;
            } while (indice < heroes.length);
        } while (numHeroes > 0 && numBestias > 0);

        if (numHeroes > 0) {
            Datos.mostrarMensaje("\n\t* Ejercito Heroes ganan la batalla *\n");
        } else {
            Datos.mostrarMensaje("\n\t* Ejercito Bestias ganan la batalla *\n");
        }
        Datos.mostrarMensaje("\n\n\t* Encelal y Pulil *");
    }

    //---
    public void jugadorMuerto(Personaje[] ejercito, int inicio) {
        if (ejercito[0] instanceof Heroes) {
            for (int i = inicio; i < numHeroes - 1; i++) {
                ejercito[i] = ejercito[i + 1];
            }
            numHeroes--;
            ejercito[numHeroes] = null;
        }

        if (ejercito[0] instanceof Bestias) {
            for (int i = inicio; i < numBestias - 1; i++) {
                ejercito[i] = ejercito[i + 1];
            }
            numBestias--;
            ejercito[numBestias] = null;
        }
    }

}

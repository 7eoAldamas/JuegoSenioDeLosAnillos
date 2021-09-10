package juego;

import personajes.bestias.*;
import personajes.heroes.*;

public class Juego {
//---

    private final Pelea pelea =  new Pelea();

//--- Constructor Juego
    public Juego(String nombre){
        System.out.println(nombre+"\n");
        initJuego();
    }

    //--- Método Juego Señor de los Anillos
    private void initJuego() {
        Bestias[] bestias = new Bestias[6];
        bestias[0] = new Orcos("Reiner");
        bestias[1] = new Trasgos("Bertolt");
        bestias[2] = new Orcos("Zeke");
        bestias[3] = new Trasgos("Porco");
        bestias[4] = new Orcos("Marcel");
        bestias[5] = new Trasgos("Falco");

        Heroes[] heroes = new Heroes[6];
        heroes[0] = new Elfos("Connie");
        heroes[1] = new Hobbits("Erwin");
        heroes[2] = new Humanos("Armin");
        heroes[3] = new Elfos("Eren");
        heroes[4] = new Hobbits("Levi");
        heroes[5] = new Humanos("Jean");

        //--- Mostrar Bestias
        Datos.mostrarMensaje("Ejercito de Bestias\n");
        for (int i = 0; i < 6; i++) {
            Datos.mostrarMensaje(bestias[i].toString()+"\n");
        }

        //--- Mostrar Héroes
        Datos.mostrarMensaje("\nEjercito de Heroes\n");
        for (int i = 0; i < 6; i++) {
            Datos.mostrarMensaje(heroes[i].toString()+"\n");
        }
        pelea.peleaSAnillos(heroes, bestias);
    }

}

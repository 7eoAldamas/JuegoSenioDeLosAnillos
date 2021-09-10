package personajes.heroes;

import juego.Datos;
import personajes.Personaje;
import personajes.bestias.Bestias;

public class Heroes extends Personaje {
//---

    //--- Constructor Heroes - Heredado (Personaje)
    public Heroes(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    //--- Método de Ataque
    public void setAtaque() {
        int ataque1 = valorAtaque(100);
        int ataque2 = valorAtaque(100);

        if (ataque1 >= ataque2){
            this.ataque = ataque1;
        }else {
            this.ataque = ataque2;
        }
    }

}

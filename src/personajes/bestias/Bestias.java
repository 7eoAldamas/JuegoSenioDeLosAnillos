package personajes.bestias;

import personajes.Personaje;

public class Bestias extends Personaje {
//---

    //--- Constructor de Bestias - Heredado (Personaje)
    public Bestias(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    //--- Método de Ataque
    public void setAtaque() {
        this.ataque = valorAtaque(90);
    }

}

package personajes.heroes;

import juego.Datos;
import personajes.Personaje;
import personajes.bestias.Orcos;

public class Elfos extends Heroes {
//---

    //--- Constructor Elfos - Heredado (Heroes)
    public Elfos(String nombre) {
        super(nombre, 250, 50);
    }

    //--- Método de Ataque Especial
    @Override
    public int getAtaque(Personaje defensor) {
        if (defensor instanceof Orcos){
            Datos.mostrarMensaje("\n\t* Activacion de Rabia Elfica ");
            return this.ataque += 10;
        }
        return this.ataque;
    }

    //--- Presentación Elfos
    @Override
    public String toString() {
        return "Elfo{ "+getNombre()+
                " *- Vida: "+getVida()+
                " *- Armadura: "+getArmadura()+
                "}";
    }

}

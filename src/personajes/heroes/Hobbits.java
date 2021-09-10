package personajes.heroes;

public class Hobbits extends Heroes {
//---

    //--- Constructor Hobbits - Heredado (Heroes)
    public Hobbits(String nombre) {
        super(nombre, 200, 60);
    }

    //--- Presentación Hobbits
    @Override
    public String toString() {
        return "Hobbit{ " + getNombre() +
                " *- Vida: " + getVida() +
                " *- Armadura: " + getArmadura() +
                "}";
    }

}

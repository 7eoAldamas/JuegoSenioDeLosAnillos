package personajes.heroes;

public class Humanos extends Heroes {
//---

    //--- Constructor Humanos - Heredado (Heroes)
    public Humanos(String nombre) {
        super(nombre, 180, 45);
    }

    //--- Presentación Humanos
    @Override
    public String toString() {
        return "Humano{ " + getNombre() +
                " *- Vida: " + getVida() +
                " *- Armadura: " + getArmadura() +
                "}";
    }

}

package personajes.bestias;

public class Orcos extends Bestias {
//---

    //--- Constructor Orcos
    public Orcos(String nombre) {
        super(nombre, 300, 65);
    }

    //--- Presentación Orcos
    @Override
    public String toString() {
        return "Orco{ " + getNombre() +
                " *- Vida: " + getVida() +
                " *- Armadura: " + getArmadura() +
                "}";
    }

}

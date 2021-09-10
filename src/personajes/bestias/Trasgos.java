package personajes.bestias;

public class Trasgos extends Bestias {
//---

    //--- Constructor Trasgos - Heredado (Bestias)
    public Trasgos(String nombre) {
        super(nombre, 300, 70);
    }

    //--- Presentación Trasgos
    @Override
    public String toString() {
        return "Trasgo{ "+getNombre()+
                " *- Vida: "+getVida()+
                " *- Armadura: "+getArmadura()+
                "}";
    }

}

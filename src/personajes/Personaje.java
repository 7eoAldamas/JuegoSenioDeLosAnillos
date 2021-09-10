package personajes;

import juego.Datos;
import personajes.bestias.Bestias;
import personajes.bestias.Orcos;
import personajes.heroes.Heroes;

public class Personaje {
//---

    protected String nombre;
    protected int vida;
    protected int armadura;
    protected int ataque;

    //--- Constructor Personaje
    public Personaje(String nombre, int vida, int armadura) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
    }

    //--- Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void disminuirVida(int ataque) {
        this.vida -= ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public int valorAtaque(int rangoAtaque) {
        return (int)(Math.random() * rangoAtaque) + 1;
    }

    public int getAtaque(Personaje defensor) {
        return this.ataque;
    }

    //--- Método de Ataque
    public void recibirAtaque(Personaje atacante) {
        Datos.mostrarMensaje("\n* Ataque de "+atacante.toString()+" - Hacia - "+this+"\n");
        if (atacante instanceof Heroes){
            ((Heroes) atacante).setAtaque();
        }else if (atacante instanceof Bestias){
            ((Bestias) atacante).setAtaque();
        }

        int ataque = atacante.getAtaque(this);
        Datos.mostrarMensaje("\t\t Ataque Efectuado - "+ataque+"\n");

        if (atacante instanceof Orcos){
            Datos.mostrarMensaje("\n\t\t Fuerza Desmesurada - Armadura Enemiga Disminuida ");
            if (ataque > (this.armadura -10)){
                ataque -= (this.armadura-10);
                this.disminuirVida(ataque);
            }else {
                Datos.mostrarMensaje("\n\t\t Ataque Fallido :o ");
            }
        }else {
            if (ataque > this.armadura){
                ataque -= this.armadura;
                this.disminuirVida(ataque);
            }else {
                Datos.mostrarMensaje("\n\t\t Ataque Fallido :o ");
            }
        }
        Datos.mostrarMensaje("\n* Fin ataque de "+ atacante +" - Hacia - "+this+"\n\n");
    }

    //--- Presentación
    @Override
    public String toString() {
        return "Personaje{" +
                "* Nombre: " + nombre +
                " *- Vida: " + vida +
                " *- Armadura: " + armadura +
                '}';
    }

}

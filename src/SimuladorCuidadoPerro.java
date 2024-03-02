class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private boolean estaHambriento;
    private boolean estaSediento;
    private boolean estaCansado;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.estaCansado = false;
        this.estaHambriento = false;
        this.estaSediento = false;
    }

    public void alimentar() {
        this.estaHambriento = false;
        System.out.println(this.nombre + " ya fue alimentado.");
    }

    public void tomar_agua() {
        this.estaSediento = false;
        System.out.println(this.nombre + " ha tomado agua.");
    }

    public void dormir() {
        this.estaCansado = false;
        System.out.println(this.nombre + " se fue a Zzz");
    }

    public void ladrar() {
        System.out.println(this.nombre + " dice: Guau! Guau!");
    }

    public void setHambre(boolean hambriento) {
        this.estaHambriento = hambriento;
    }

    public void setSed(boolean sediento) {
        this.estaSediento = sediento;
    }

    public void setCansado(boolean cansado) {
        this.estaCansado = cansado;
    }

    public void validarEstado() {
        String estado = this.nombre + " (" + this.raza + ") esta ";
        if (this.estaHambriento) {
            estado += "hambriento, ";
        }
        if (this.estaSediento) {
            estado += "sediento, ";
        }
        if (this.estaCansado) {
            estado += "cansado, ";
        }
        if (!this.estaSediento && !this.estaCansado && !this.estaHambriento) {
            estado += "sintiendose chevere!";
        } else {
            estado = estado.substring(0, estado.length() - 2) + ".";
        }

        System.out.println(estado);
    }
}

public class SimuladorCuidadoPerro {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", "Tinaquero", 5);

        firulais.setHambre(true);
        firulais.setSed(true);
        firulais.setCansado(true);

        firulais.validarEstado();

        firulais.alimentar();
        firulais.tomar_agua();
        firulais.dormir();

        firulais.validarEstado();
    }
}

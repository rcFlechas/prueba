
package prueba;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    private String marca;
    private String modelo;
    private int km;

    public Carro() {
    }

    public Carro(String marca, String modelo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.marca);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + this.km;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.km != other.km) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", km=" + km + '}';
    }    

//    @Override
//    public int compareTo(Carro c) {
//        return c.getKm() - this.km;
//    }
    
//    @Override
//    public int compareTo(Carro c) {
//        return this.modelo.compareTo(c.getModelo());
//    }
    
    @Override
    public int compareTo(Carro c) {
        return this.marca.compareTo(c.getMarca());
    }
}
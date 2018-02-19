
package prueba;

public enum Mes {
    
    ENERO("Enero",31),
    FEBRERO("Febrero",28),
    MARZO("Marzo",31),
    ABRIL("Abril",30),
    MAYO("Mayo",31),
    JUNIO("Junio",30),
    JULIO("Julio",31),
    AGOSTO("Agosto",31),
    SEPTIEMBRE("Septiembre",30),
    OCTUBRE("Octubre",31),
    NOVIEMBRE("Noviembre",30),
    DICIEMBRE("Diciembre",31);
    
    private final String nombreMes;
    private final int dias;

    private Mes(String nombreMes, int dias) {
        this.nombreMes = nombreMes;
        this.dias = dias;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public int getDias() {
        return dias;
    } 
}
package posnet;

public class Ticket {
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCouta;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCouta) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCouta = montoPorCouta;
    }

    @Override
    public String toString() {
        return "\n\t\tTicket: " + "\nnombre y Apellido: " + nombreApellido + "\nmontoTotal: " + montoTotal + "\nmontoPorCouta: " + montoPorCouta ;
    }
    
}


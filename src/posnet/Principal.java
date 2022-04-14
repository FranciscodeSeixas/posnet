
package posnet;

public class Principal {
      public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona titular = new Persona("44444", "Francisco", "de Seixas", "362557467", "fdeseixas@hotmail.com");
        TarjetaDeCredito tarjetaDeCredito= new TarjetaDeCredito("BBVA","5555", 15000, titular, EntidadFinanciera.VISA);
        
          System.out.println(titular);
          System.out.println(tarjetaDeCredito);
          Ticket ticket = posnet.efectuarPago(tarjetaDeCredito, 10000, 5);
          
          //luego del descuento
          System.out.println(tarjetaDeCredito);
          System.out.println(ticket);
      }
}

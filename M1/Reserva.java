import java.util.Arrays;

public class Reserva{
  private String dataEntrada;
  private String dataSaida;
  private Quarto quarto;
  private Hospede[] hospede;

  public Reserva (String dataEntrada, String dataSaida, Quarto quarto, Hospede[] hospede) {
    this.dataEntrada = dataEntrada;
    this.dataSaida = dataSaida;
    this.quarto = quarto;
    this.hospede = hospede;
  }

  public void checkIn(Hospede[] hospedes){
    System.out.println("Os hospedes " + Arrays.toString(hospedes) + " podem se dirigir ao quarto " + this.quarto.toString() + "." + "\n" + "Data de entrada: " + this.dataEntrada);
  }

  public void checkOut(Reserva reserva){
    System.out.println("Check Out feito em: " + this.dataSaida);
    reserva = null;
    System.gc();
  } 
      

public void cancelar(Reserva reserva, Hospede[] hospedes){
  System.out.println("A reserva do quarto " + this.quarto.toString() + " para os hospedes " + Arrays.toString(hospedes) + " foi cancelada.");
  reserva = null;
  System.gc();
}

  //public boolean checkIn(String dataEntrada, Quarto quarto) {
  //  if(quarto) {
  //    System.out.println("Quarto já possui uma reserva");
  //    return false;
  //  } else {
  //    this.quarto = quarto;
  //    this.dataEntrada = dataEntrada;
  //    return true;
  //  }
}



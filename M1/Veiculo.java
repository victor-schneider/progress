public class Veiculo {
  private String placa;
  private String modelo;
  private Reserva reserva;

  public Veiculo (String placa, String modelo, Reserva reserva) {
    this.placa = placa;
    this.modelo = modelo;
    this.reserva = reserva;
  }
}

public class Quarto{
  private int numero;
  private int andar;
  private Hotel hotel;

  public Quarto(int numero, int andar, Hotel hotel){
    this.numero = numero;
    this.andar = andar;
    this.hotel = hotel;
  }

  @Override
  public String toString(){
    return "numero " + this.numero;
  }
}


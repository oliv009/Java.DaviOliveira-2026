
package polimorfismo;


public class moto extends veiculo{
    int cilindrada;

    public moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularconsumo() {
      return 30-(cilindrada/100);
    }
    
}

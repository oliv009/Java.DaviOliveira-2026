/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Aluno CA
 */
public class carro extends veiculo{
double cilindrada;
    
    public carro(String marca, String modelo, double cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularconsumo() {
         return 15-(cilindrada/200);
    }
    
}

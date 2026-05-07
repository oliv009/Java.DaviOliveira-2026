/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Aluno CA
 */
public class caminhao extends veiculo{
double capacidadedecarga;
    
    public caminhao(String marca, String modelo, double capacidadedecarga) {
        super(marca, modelo);
        this.capacidadedecarga=capacidadedecarga;
        
    }
    
    @Override
    public double calcularconsumo() {
        return 5.0 - (capacidadedecarga/1000);
    }
    
}

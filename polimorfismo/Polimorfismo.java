/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Aluno CA
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carro a = new carro("chevrolet", "onix", 100);
        a.exibirinformações();
        System.out.println(a.calcularconsumo());
        
        moto b = new moto("kawasaki", "ninja",300);
        b.exibirinformações();
        System.out.println(b.calcularconsumo());
        
        caminhao c = new caminhao("volvo", "FH 540",15000);
        c.exibirinformações();
        System.out.println(c.calcularconsumo());
    }
    
}

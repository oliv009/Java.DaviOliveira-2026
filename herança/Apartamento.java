/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author Aluno CA
 */
public class Apartamento extends imovel {
    private int andar;
    public Apartamento(int idImovel, String endereço, double valor,int andar) {
        super(idImovel, endereço, valor);
        this.andar = andar;
    }
    
    @Override
    
    public void getinfo(){
        super.getinfo();
        System.out.println("Andar:" + andar);
    }
    
}

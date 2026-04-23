/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author Aluno CA
 */
public class imovel {
    private int idImovel;
    private String endereço;
    private double valor;
    
    public imovel(int idImovel,String endereço,double valor){
        this.idImovel = idImovel;
        this.endereço = endereço;
        this.valor = valor;
        
    }
    public void getinfo(){
        System.out.println("ID:" + idImovel);
        System.out.println("Endereço:" + endereço);
        System.out.println("valor:" + valor);
    }
}

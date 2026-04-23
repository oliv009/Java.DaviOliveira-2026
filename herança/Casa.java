/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author Aluno CA
 */
public class Casa extends imovel {
    private int areaTerreno;
    public Casa(int idImovel, String endereço, double valor,int areaTerreno) {
        super(idImovel, endereço, valor);
        this.areaTerreno = areaTerreno;
    }
@Override

    public void getinfo(){
        super.getinfo();
        System.out.println("area Terreno" + areaTerreno);
    }
}

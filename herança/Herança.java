/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança;

/**
 *
 * @author Aluno CA
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa a = new Casa(1,"rua x", 500,200);
        a.getinfo();
        
        Casa b = new Casa(1,"rua a",500,200);
        b.getinfo();
        
        Apartamento c = new Apartamento(3,"rua b",2000,3);
        c.getinfo();
        
    }
    
}


package polimorfismo;


public abstract class veiculo {
    String marca;
    String modelo;
    public veiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public abstract double calcularconsumo();
    void exibirinformações(){
        System.out.println("marca:"+ marca + "modelo:"+modelo);
    }
    public String getmarca(){
        return marca;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
}

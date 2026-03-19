/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno CA
 */
public class pessoa {
    int idade;
    String nome;
    String cpf;
    boolean vivo;
    
    void recuperanome(){
        System.out.println("nome do cara é:" + nome);
    }
    void alteranome(String nome2){
        
        nome = nome2;
    }
    
    void recuperaidade(){
        System.out.println("a idade dele é:" + idade);
    }
    void alteraidade(int idade2){
         idade = idade2;
    }
    
    
    void recuperacpf(){
        System.out.println("o cpf dele é:" + cpf);
    }
    void alteracpf(String cpf2){
        cpf = cpf2;
    }
    
    void recuperaestado(){
        System.out.println("Ele está vivo:" + vivo);
    }
    void alteraestado(boolean vivo2){
       vivo = vivo2;
    }
         
    }


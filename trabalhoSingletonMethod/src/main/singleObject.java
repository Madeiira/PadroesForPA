package main;

public class singleObject 
{ 
    public static void main(String args[]) 
    { 

        Singleton Aluno1 = Singleton.getInstance(); 
  
        
        Singleton Aluno2 = Singleton.getInstance(); 

        
        Aluno1.s = (Aluno1.s).toUpperCase(); //trocando o tipo de caixa do construtor
  
        System.out.println("Fala do Aluno1:" + '"'+Aluno1.s+'"'); 
        System.out.println("Fala do Aluno2:" +'"'+ Aluno2.s+'"'); 
        System.out.println(Aluno1.hashCode());
        System.out.println(Aluno2.hashCode());
        
        System.out.println("\n"); 
  
        
        Aluno2.s = (Aluno2.s).toLowerCase(); // trocando o tipo de caixa do construtor
        
        System.out.println("Fala do Aluno1:" + '"'+Aluno1.s+'"'); 
        System.out.println("Fala do Aluno2:" +'"'+ Aluno2.s+'"'); 
        
    } 
} 

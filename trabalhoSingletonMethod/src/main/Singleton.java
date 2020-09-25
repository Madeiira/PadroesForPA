package main;

public class Singleton 
{ 
    //  variavel statica instancia_unica do tipo Singleton
    private static Singleton single_instance = null; 
  
    //  variavel do tipo String
    public String s; 
  
    //  construtor private restrigindo para si
    private Singleton() 
    { 
        s = "Sou uma string da classe Singleton"; 
    } 
  
    // metodo statico para criar a instancia unica do Singleton variação Laze
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
} 
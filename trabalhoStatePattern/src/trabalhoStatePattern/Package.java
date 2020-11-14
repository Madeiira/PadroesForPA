package trabalhoStatePattern;

public class Package {
	  private String name;
	  private enum PackageStateEnum {
		    CURA,
		    LIVRE,
		    PARALASIA
		  };
		  private PackageStateEnum state = PackageStateEnum.PARALASIA;
		  
		  public Package(String name) {
			    this.name = name;    
			  }
		  
		  public void previousState() {
			    switch(state) {
			      case LIVRE: 
			        System.out.println("SISTEMA: Você está livre");        
			        break;
			      case PARALASIA: 
			        System.out.println("SISTEMA: Você está afetado por um veneno de paralisia ");
			        state = PackageStateEnum.CURA;        
			        break;
			      case CURA: 
			        System.out.println("SISTEMA: Você está sendo curado");
			        state = PackageStateEnum.LIVRE;
			        break;
			    }
			  }
		    public void nextState() {
		        switch(state) {
		          case LIVRE: 
		            System.out.println("Você está sendo paralisado"); 
		            state = PackageStateEnum.PARALASIA;       
		            break;
		          case PARALASIA: 
		            System.out.println("Você está paralisado");   
		            break;

		        }
		      }
		    
		    public void printStatus() {
		        System.out.print( this.name + ": ");

		        if (state == PackageStateEnum.LIVRE) {
		          System.out.println("Curado");
		        }
		        else if (state == PackageStateEnum.PARALASIA) {
		          System.out.println("Foi atingido por um veneno de paralisia");
		        }
		        else if (state == PackageStateEnum.CURA) {
		          System.out.println("Magia de cura");
		        }
		      }
}

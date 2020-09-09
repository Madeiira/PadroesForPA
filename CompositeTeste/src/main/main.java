package main;

public class main {
	  public static void main(String[] args) 
	    {
		    {
		        try {
		    
		          Component component = new FolderItem("Root");
		  
		         
		          component.add(new Fileitem("HP", 300));
		          component.add(new Fileitem("HP", 450));

		  
		          Component subFolder = new FolderItem("subFolder");
		          component.add(subFolder);
		  
		          subFolder.add(new Fileitem("BOOK01", 400));
		          subFolder.add(new Fileitem("BOOK02", 250));
		          
		  
		       
		          float totalpages = component.getpages();
		          System.out.println("Total pages : " + totalpages);

		          ((FolderItem) component).list();
		        }
		        catch (Exception e) {
		          e.printStackTrace();
		        }
		    }
	    }
}

package main;

public class main {
	  public static void main(String[] args) 
	    {
		    {
		        try {
		          // Creating a component tree
		          Component component = new FolderItem("Root");
		  
		          // Adding all accounts of a customer to component
		          component.add(new FileItem("DA01", 100));
		          component.add(new FileItem("DA02", 150));

		          // Creating a component tree
		          Component subFolder = new FolderItem("subFolder");
		          component.add(subFolder);
		  
		          subFolder.add(new FileItem("FILE001", 200));
		          subFolder.add(new FileItem("FILE002", 100));
		          subFolder.add(new FileItem("FILE003", 300));
		  
		          // getting composite balance for the customer
		          float totalSize = component.getSize();
		          System.out.println("Total Size : " + totalSize);

		          ((FolderItem) component).list();
		        }
		        catch (Exception e) {
		          e.printStackTrace();
		        }
		    }
	    }
}

package main;

import java.util.ArrayList;
import java.util.List;

public  class FolderItem extends Component 
{
    protected List<Component> list = new ArrayList<>(); 
    
    public FolderItem(String name) {
        super(name);
    }
    
    public void add(Component g) {
        list.add(g);
    }
 
    public void remove(Component g) {
        list.remove(g);
    }
 
    public Component getChild(int i) {
        return (Component) list.get(i);
    }
    
    public float getpages() {
        float totalpages  = 0;
        for (Component f : list) {
            totalpages  = totalpages  + f.getpages();
        }
        return totalpages ;
    }

    public void list() {
      for (Component f : list) {
            ((FolderItem) f).list();
        }        
    }
}
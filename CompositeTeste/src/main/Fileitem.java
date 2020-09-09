package main;

public  class Fileitem extends Component 
{
    private float pages ;
     
    public Fileitem(String name, float pages ) {
        super(name);
        this.pages  = pages ;
    }
 
    public float getpages() {
        return pages ;
    }
}
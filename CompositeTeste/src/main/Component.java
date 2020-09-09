package main;

public abstract class Component 
{
    private String name;

    public Component(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public abstract float getpages();
 
    public void add(Component g) throws Exception {
        throw new Exception();
    }
 
    public void remove(Component g) throws Exception {
        throw new Exception();
    }
 
    public Component getChild(int i) throws Exception {
        throw new Exception();
    }
}
package fr.swingy.app;

public abstract class Existing
{
    protected int x;
    protected int y;

    protected String name;
    //protected Sprite (?);

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String getName()
    {
        return name;
    }
    
    protected Existing(int x, int y, String name/*, Sprite*/)
    {
        this.x = x;
        this.y = y;
        this.name = name;
    }
}
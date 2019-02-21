import java.io.*;
import java.util.*;
public class Item
{
    private String name;
    private int hp;
    public Item()
    {
        name = "Potion";
        hp = 10;
    }
    public String getName() {
        return name; 
    }   
    public int getHP(){
        return hp;
    }
}
import java.io.*;
import java.util.*;
public class Novice
{
    private int hp;
    private int exp;
    private int lv;
    public Novice()
    {
        hp = 100;
        exp = 0;
        lv = 1;
    }
    public void att() 
    {   
        exp = exp + 2;
        if (exp == 6)
        {   
            lv = lv + 1;
            hp = hp + 100;
            exp = 0;
        }
    }
    public void heal(int heal)
    {
        hp = hp + heal;
    }
    public void dead() 
    {
        hp = 0;
    }
    public int getHp()
    {
        return hp;
    }
    public int getExp()
    {
        return exp;
    }
    public int getLv()
    {
        return lv;
    }
}
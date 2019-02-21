import java.io.*;
import java.util.*;
public class Bag
{
    private ArrayList<Item> items;
    private int max;
    private int posionnum = 0;
    public Bag()
    {
        items = new ArrayList<Item>();
        max = 10;
    }
    public void getSizebag(){
        max = max+1;
    }
    private boolean isFull(){
        if(items.size() >= max ){
            return true;
        }
        return false;
    }
    public void getitem(){
        if(!isFull()) items.add(new Item());
        posionnum = posionnum + 1;
    }
    public void useItem(){ //ทำให้ไอเทมลดไม่ทันครับ
        posionnum = posionnum - 1;
    }
    public void showallinbag(){
            System.out.println("==================");
            System.out.println("=Posion X"+posionnum);
            System.out.println("==================");
    }
    public int usepotion(){
        int num = items.get(0).getHP();
        return num;
    }
}
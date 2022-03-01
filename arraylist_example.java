import java.util.*;

public class arraylist_example {
    public static void main(String[] args)  {
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("world");
        al.add("!");
        al.remove(al.size()-1);
        System.out.println(al);
        ArrayList<Integer> al_integer = new ArrayList<Integer>();
        al_integer.add(9);
        int i = al_integer.get(0);
        
        //ArrayList<int> al_integer = new ArrayList<int>();

        System.out.println(i);
       
    
}
}

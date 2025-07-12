import java.util.*;

public class interview {

    public static void main(String args[]){
    String s= "I love india";

    HashMap<Character,Integer> map = new HashMap<>();

    for (char c: s.toCharArray())
    {
        map.put(c,map.getOrDefault(c,0)+1);
    }

    for(char ch: map.keySet())
    {
        if(ch!=' ')
        System.out.print(ch+""+map.get(ch));
    }

}}

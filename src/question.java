import java.util.HashMap;

public class question {

    public static void main(String args[])
    {
        String s="aaaeeodjsdk sddshiii oooooaass";

        System.out.println(s.length());

        HashMap<Character,Integer> map=new HashMap<>();

        for (char ch: s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for( char key: map.keySet()){
            if(key=='a' || key=='e')
            {
                System.out.println(key+ " "+ map.get(key));
            }
        }
    }


}

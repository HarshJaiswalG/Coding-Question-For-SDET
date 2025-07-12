import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicate {


    public static ArrayList removeDuplicates(String str) {

        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList arrayList= new ArrayList<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char key: map.keySet())
        {
            if(map.get(key)==1){
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String s="Riya is good girl";

        System.out.println(removeDuplicates(s));
    }
}

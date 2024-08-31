import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxCharacter {
    public static void main(String[] args) {
        String x = "GOD_BLESS_SPIDERMAN";
        char y[] = x.toCharArray();
        int size = y.length;

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i =0;
        while(i != size){
            if(map.containsKey(y[i])== false){
                map.put(y[i],1);
            } else {
                int oldval = map.get(y[i]);
                int newval = oldval + 1;
                map.put(y[i],newval);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
        char maxkey = ' ';
        int maxval = 0;
        for(Map.Entry<Character, Integer> data : lhmap){
            if(data.getValue() > maxval){
                maxval = data.getValue();
                maxkey = data.getKey();
            }

        }
        System.out.print(maxkey);
        System.out.println(maxval);
    }
}

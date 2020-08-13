import java.lang.reflect.Array;
import java.util.*;

public class Helloword {
    public static void main(String args[]) {
        String[] ar = {"vip", "vip", "sa"};
        System.out.println(ar[1]);

//        convert array to set and list
        Set<String> set = new HashSet<>(Arrays.asList(ar));
        List<String> list = new ArrayList<>(Arrays.asList(ar));

//        convert set and list to array
        String[] ar1 = new String[set.size()];
        set.toArray(ar1);

        String[] ar2 = new String[list.size()];
        list.toArray(ar2);

        for (int i =0; i< ar1.length ; i++){
            System.out.println("convert set to array : "+ar1[i]);
        }
        for (int i =0; i< ar2.length ; i++){
            System.out.println("convert list to array :" +ar2[i]);
        }

        System.out.println(set);
        System.out.println(list);

        Map<Integer , String> map = new HashMap<Integer , String>();
        map.put(1, "vipi");
        map.put(2 , "sanan");
        map.put(3 , "ram");

        Set<Map.Entry<Integer , String>> set1 = map.entrySet();

        for (Map.Entry<Integer , String> mp:set1){
            System.out.println(mp.getKey() +"   :   " + mp.getValue());
        }
    }
}

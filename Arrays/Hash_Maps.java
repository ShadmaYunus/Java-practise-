import java.util.HashMap;
public class Hash_Maps{
    public static void main (String[] args){
        HashMap<Integer,String>map = new HashMap<>();

        map.put(6,"sky");
        map.put(7,"jacuzziii");

        if(map.containsKey(6)){
            System.out.println(map.get(6));
        }
    }
}

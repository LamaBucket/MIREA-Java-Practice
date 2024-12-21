package Task28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        var map = CreateMap();

        System.out.println(map.get("Банный"));

        System.out.println(GetSameFirstNameCount(map));
        System.out.println(GetSameLastNameCount(map));
    }

    public static Map<String, String> CreateMap(){
        var result = new HashMap<String, String>();

        result.put("Банный", "Глеб");
        result.put("Банный", "Юрий");
        result.put("Банный", "Роман");
        result.put("Васильков", "Глеб");
        result.put("Васильков", "Юрий");
        result.put("Васильков", "Роман");
        result.put("Вяжанский", "Павел");
        result.put("Макацуба", "Екатерина");
        result.put("Файзуллина", "Ильзира");
        result.put("Барабанов", "Румпельстильцкин");

        return result;
    }

    public static int GetSameFirstNameCount(Map<String, String> dict){
        return FindUniqueCount(dict.keySet());
    }

    public static int GetSameLastNameCount(Map<String, String> dict){
        return FindUniqueCount(dict.values());
    }

    public static int FindUniqueCount(Iterable<String> arr){
        int count = 0;
        ArrayList<String> toSkip = new ArrayList<String>();
        
        for (String obj1 : arr) {
            boolean flag = false;
            boolean flag2 = false;

            if(toSkip.contains(obj1)){
                continue;
            }

            for (String obj2 : arr) {
                if(obj1 == obj2){
                    
                    if(flag){
                        flag2 = true;
                        toSkip.add(obj1);
                        break;
                    }

                    flag = true;
                }
            }

            if(flag2){
                count += 1;
            }
        }
        
        return count;
    }
}

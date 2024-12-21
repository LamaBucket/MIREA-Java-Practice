package Task27;

public class Tester {
    public static void main(String[] args) {
        MyHashtab<Integer, Object> hasher = MyHashtab.HashInit();

        for(int i = 0; i < 10; i++){
            hasher.Add(i, i * 2 + 1);
        }

        System.out.println(hasher.Lookup(2));
        System.out.println(hasher.Lookup(20));

        hasher.Delete(2);
        System.out.println(hasher.Lookup(2));

        
    }
}

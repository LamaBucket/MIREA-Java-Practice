package Task8;


public class Tester {
    public static void main(String[] args) {
        Task1(4);
        System.out.println("----------------------");

        Task2(5);
        System.out.println("----------------------");

        Task3(4, 10);
        System.out.println("----------------------");

        Task3(10, 4);
    }

    public static void Task1(int n){
        if(n <= 0)
            return;

        n++;

        for(int i = 1; i < n; i++){
            for(int a = 0; a < i; a++){
                System.out.println(i);
            }
        }
    }

    public static void Task2(int n){
        if(n <= 0)
            return;

        n++;

        for(int i = 1; i < n; i++){
            System.out.println(i);
        }
    }

    public static void Task3(int a, int b){
        if(a < b){
            for(int i = a; i <= b; i++){
                System.out.println(i);
            }
        }
        else{
            for(int i = a; i >= b; i--){
                System.out.println(i);
            }
        }
    }
}

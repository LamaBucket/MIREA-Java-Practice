package Task29;

import java.util.Scanner;

public class CitiesAndRoads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        while(n < 0 || n > 100){
            System.out.println("Неправильное n. попробуйте еще раз. 0 <= N <= 100");
            n = sc.nextInt();
        }

        if(n == 0){
            System.out.println("В вашей империи нет городов, а следовательно нет дорог");
            sc.close();
            return;
        }

        if(n == 1){
            System.out.println("В вашей империи всего 1 город, с чем вы хотите его соединить?");
            sc.close();
            return;
        }

        boolean[][] arr = new boolean[n][n];

        for(int i = 0; i < n; i++){
            var str = sc.nextLine();
            var temp = str.split(" ");
            for(int b = 0; b < n; b++){
                arr[i][b] = Integer.parseInt(temp[b]) == 1;
            }
        }

        System.out.println("В вашей империи " + CountRoads(arr) + " дорог.");

        sc.close();
    }

    public static int CountRoads(boolean[][] roadmap){
        int counter = 0;
        
        for(int i = 0; i < roadmap.length; i++){
            for (int a = i; a < roadmap.length; a++){
                if(roadmap[i][a]){
                    counter += 1;
                }
            }
        }

        return counter;
    }
}

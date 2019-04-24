import java.util.Scanner;

public class VariantB {

    public  static void main(String[] args) {
        String str;
        Integer n;
        Integer m;
        Integer k;
        Integer a;
        Integer b;
        Integer c;

        String[] strarray;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input N - integer count and press Enter: ");
        n = in.nextInt();
        System.out.println("Please, input M - integer count and press Enter: ");
        m = in.nextInt();
        System.out.println("Please, input K -  count and press Enter: ");
        k = in.nextInt();
        task1(n,m,k);
        task2(n,k);
        System.out.println("Task 3 Quadratics equation Please, input a - integer count and press Enter: ");
        a = in.nextInt();
        System.out.println("Task 3 Quadratics equation Please, input B - integer count and press Enter: ");
        b = in.nextInt();
        System.out.println("Task 3 Quadratics equation Please, input C - integer count and press Enter: ");
        c = in.nextInt();
        task3(a,b,c);
        //System.out.println("Task 4 Month. Input integer count and press Enter: ");
        do {
            System.out.println("Task 4 Month. Input integer count and press Enter: ");
            while(!in.hasNextInt()){
                System.out.println("Please, input positive integer number!");
                in.next();
            }
            a = in.nextInt();
        } while (a<=1);
        task4(a);
    }

    public  static void task1(Integer n, Integer m,Integer k){

        if (k > n && k <= m){
            System.out.println("k in (n,m]");
        }
        if (k>= n && k< m){
            System.out.println("k in [n,m)");
        }
        if (k> n && k< m){
            System.out.println("k in (n,m)");
        }
        if (k>= n && k<= m){
            System.out.println("k in [n,m]");
        }
    }
    public  static void task2(Integer n, Integer k){
        System.out.println("Task2 Output array of counts from 1 to K");
        int [] [] arr = new int[n][n];
        for (int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
               arr[i][j] =  1+ (int) (java.lang.Math.random()*k);
            }
        }
        for (int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ") ;
            }
            System.out.println();
        }
    }
    public static void task3(Integer a, Integer b, Integer c){
        Double x1;
        Double x2;
        Double D  = java.lang.Math.pow(b,2) - 4*a*c;
        x1 = (b*(-1) + java.lang.Math.sqrt(D))/(2*a);
        x2 = (b*(-1) - java.lang.Math.sqrt(D))/(2*a);
        System.out.printf("x1= %.2f   x2 = %.2f", x1, x2);
    }
    public static void task4(Integer a){
        switch (a){
            case 1: System.out.printf("January"); break;
            case 2: System.out.printf("February"); break;
            case 3: System.out.printf("March"); break;
            case 4: System.out.printf("April"); break;
            case 5: System.out.printf("May"); break;
            case 6: System.out.printf("June"); break;
            case 7: System.out.printf("July"); break;
            case 8: System.out.printf("August"); break;
            case 9: System.out.printf("September"); break;
            case 10: System.out.printf("October"); break;
            case 11: System.out.printf("November"); break;
            case 12: System.out.printf("December"); break;
            default: System.out.printf("It is not a number of Month!");
        }

    }
}

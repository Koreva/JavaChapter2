import java.util.Arrays;
import java.util.Scanner;
public class VariantC {
    public static void main(String [] args)
    {
        int dimension;
        System.out.println("Please, input a dimension of a matrix");
        Scanner in = new Scanner(System.in);
        dimension = in.nextInt();
        int [] [] arr = new int[dimension] [dimension];
        for (int i = 0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                arr[i][j] =   (int) (java.lang.Math.random()*(dimension*2+1)-dimension);
            }
        }
        for (int i = 0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                System.out.print(arr[i][j] + " ") ;
            }
            System.out.println();
        }
        int k;
        System.out.println("Please, Input a number of a colomn:");
        k = in.nextInt();
        int tmp_arr [] = new int[dimension];
        Arrays.sort(arr,(x,y)-> x[k]-y[k]);
        /*for(int j = dimension-1; j>0;j-- ) {
            for (int i = 0; i < j; i++) {
                if (arr[i][k] < arr[i + 1][k]) {
                    for (int m = 0; m<dimension;m++)
                    {
                        tmp_arr[m] = arr[i][m];
                        arr[i][m] = arr[i+1][m];
                        arr[i+1][m] = tmp_arr[m];
                    }
                }
            }
        }*/
        for (int i = 0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                System.out.print(arr[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}



/**
 * Class {@chaptertwo Object} is the root of the class hierarchy.
 * Every class has {@chaptertwo Object} as a superclass. All objects,
 * including arrays, implement the methods of this class.
 *
 * @author Koreva AD
 * @see java.lang.Class
 * @since JDK11.0
 */



import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;


public class chaptertwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str;
        String[] strarray;
        System.out.println("Please, input array if integer counts with spase character: ");
        str = in.nextLine();
        strarray = str.split(" ");
        /*Integer[] arrayint = new Integer[strarray.length];
        for(int i = 0; i< strarray.length; i++)
        {
            arrayint[i] = Integer.parseInt(strarray[i]);
        }*/
        task1(strarray);
        task2(strarray);
        task3(strarray);
        task4(strarray);
        System.out.println("Koreva AD 22/04/2019");

    }
    public static void task1(String[] args)
    {
        Stream<String> numberStream = Stream.of(args);
        Optional<String> res = numberStream.reduce((x,y)->x.length()>y.length()? x:y);// самое длинное число
        System.out.println("MAX length = " +res.get() + " length =  " + res.get().length());
        Stream<String> number = Stream.of(args);
        Optional<String> minlen = number.reduce((x,y)->x.length()>y.length()? y:x); // самое короткое число
        System.out.println("MIN length = " +minlen.get() + " length = " + minlen.get().length());
    }
    public static void task2(String [] args)
    {
        for (int i = args.length-1; i>0; i--)
        {
            for (int j = 0; j<i;j++)
            {
                if(args[j].length()>args[j+1].length())
                {
                    String tmp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(args));
    }
    public static void task3(String[] args)
    {
       String [] a  = Arrays.copyOf(args, args.length + 1);
        Integer[] arrayint = new Integer[args.length];
        for(int i = 0; i< args.length; i++)
        {
            arrayint[i] = args[i].length();
        }
        int sum = Arrays.stream(arrayint).reduce(0,(x,y)-> x+y);
        double average  = sum/(arrayint.length);
        System.out.println("Counts with length more then average: " + average);
        for(int i = 0; i<args.length; i++)
        {
            //System.out.println(args[i] + " " + " length = " + args[i].length());
            if(args[i].length() >average)
            {
                System.out.print(args[i] + " " + " length = " + args[i].length());
            }
        }
    }
    public static void task4(String[] args){
        Integer[] arrayint = new Integer[args.length];
        for(int i=0; i<args.length; i++){
            int difcount = 0;
            if(args[i].length()>1) {
                String[] elem = args[i].split("");
                for (int j = elem.length-1; j >0; j--) {
                    if (elem[j].compareTo(elem[j - 1]) != 0) {
                        difcount++;
                    }
                }
            }
            arrayint[i] = difcount;
        }
        //System.out.println(Arrays.toString(arrayint));
        int min = 1000;
        int num  = 0;
        for(int i = 0; i<arrayint.length;i++)
        {
            if(arrayint[i]<min){
                min = arrayint[i];
                num = i;
            }
        }
        System.out.println("Number with min count of the same elements  = " + args[num]);
    }
}

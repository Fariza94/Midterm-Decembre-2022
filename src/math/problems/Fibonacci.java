package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n1=0;
        int n2=1;
        int count=40;
        int i;
        int n3;
        System.out.print("The 40 Fibonacci numbers are: ");
        System.out.print(n1+" "+n2);

        for(i=2;i<count ;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }


    }

}

